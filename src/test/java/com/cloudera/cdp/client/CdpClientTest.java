/*
 * Copyright (c) 2018 Cloudera, Inc. All Rights Reserved.
 *
 * Portions Copyright (c) Copyright 2013-2018 Amazon.com, Inc. or its
 * affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.cdp.client;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.CdpHTTPException;
import com.cloudera.cdp.CdpServiceException;
import com.cloudera.cdp.authentication.credentials.BasicCdpCredentials;
import com.cloudera.cdp.http.ExponentialBackoffDelayPolicy;
import com.cloudera.cdp.http.HttpCodesRetryChecker;
import com.cloudera.cdp.http.SimpleRetryHandler;
import com.cloudera.cdp.util.CdpSDKTestUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.io.Resources;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

import org.junit.jupiter.api.Test;

public class CdpClientTest {

  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final List<Class<? extends CdpClientMiddleware>> TEST_EXTENSION = ImmutableList.of(TestRestClient.class);

  private Response mockResponse(int httpCode, @Nullable String requestId) {
    Response response = mock(Response.class);
    StatusType statusType = mock(StatusType.class);
    doReturn(httpCode).when(statusType).getStatusCode();
    doReturn(Response.Status.Family.familyOf(httpCode))
      .when(statusType).getFamily();
    doReturn(statusType).when(response).getStatusInfo();
    MultivaluedHashMap<String, Object> headers = new MultivaluedHashMap<>();
    if (requestId != null) {
      headers.put(CdpResponse.ALTUS_HEADER_REQUESTID,
                  ImmutableList.of(requestId));
    }
    doReturn(headers).when(response).getHeaders();
    return response;
  }

  private static class TestClient extends CdpClient {
    private final Response mockResponse;
    private final Consumer<CdpClientContext<?>> contextValidator;

    TestClient() {
      this(null, null);
    }

    TestClient(Response response) {
      this(response, null);
    }

    TestClient(Response response, Consumer<CdpClientContext<?>> contextValidator) {
      super(new BasicCdpCredentials("accessKeyID", CdpSDKTestUtils.getRSAPrivateKey()),
            "http://fake.endpoint",
            CdpClientConfigurationBuilder.defaultBuilder()
            .withRetryHandler(
              new SimpleRetryHandler(
                new HttpCodesRetryChecker(HttpCodesRetryChecker.DEFAULT_RETRY_CODES),
                new ExponentialBackoffDelayPolicy(1, Duration.ofMillis(1)),
                3))
            .build());
      this.mockResponse = response;
      this.contextValidator = contextValidator;
    }

    @Override
    public String getServiceName() {
      return "test";
    }

    protected <T extends BaseResponse> void invokeAPI(CdpClientContext<T> context, @Nullable List<Class<? extends CdpClientMiddleware>> extensions) {
      context.getProperties().put("MOCK_RESPONSE", mockResponse);
      context.getProperties().put("CONTEXT_VALIDATOR", contextValidator);
      super.invokeAPI(context, extensions);
    }
  }

  private static class TestRestClient extends CdpRestClient {
    public TestRestClient(CdpClientMiddleware next) {
      assertNotNull(next);
    }

    @Override
    Response getAPIResponse(CdpClientContext<?> context)
        throws CdpServiceException {
      assertNotNull(context);
      Object contextValidator = context.getProperties().get("CONTEXT_VALIDATOR");
      if (contextValidator != null) {
        ((Consumer<CdpClientContext<?>>) contextValidator).accept(context);
      }
      return (Response) context.getProperties().get("MOCK_RESPONSE");
    }
  }

  private static class TestCdpResponse extends CdpResponse {
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testSuccessfulResponse() {
    Response mockResponse = mockResponse(200, "requestId");
    TestCdpResponse cdpResponse = new TestCdpResponse();
    when(mockResponse.readEntity(any(GenericType.class))).thenReturn(cdpResponse);
    TestClient client = new TestClient(
        mockResponse,
        ctx -> {
          assertEquals("test", ctx.getServiceName());
          assertEquals("someOperation", ctx.getOperationName());
          assertEquals("somePath", ctx.getPath());
          assertEquals("POST", ctx.getMethod());
          assertTrue(ctx.getQueries().isEmpty());
          assertTrue(ctx.getHeaders().isEmpty());
          assertEquals("", ctx.getBody());
          assertFalse(ctx.getIsRestApi());
          assertEquals(TestCdpResponse.class, ctx.getResponseType().getRawType());
          assertNotNull(ctx.getRetryHandler());
          assertNotNull(ctx.getCredentials());
        });
    TestCdpResponse response =
        client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, TEST_EXTENSION);
    assertEquals("requestId", response.getRequestId());
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testRestResponse() {
    Response mockResponse = mockResponse(200, null);
    TestClient client = new TestClient(
        mockResponse,
        ctx -> {
          assertEquals("test", ctx.getServiceName());
          assertEquals("someOperation", ctx.getOperationName());
          assertEquals("somePath", ctx.getPath());
          assertEquals("GET", ctx.getMethod());
          assertTrue(ctx.getQueries().isEmpty());
          assertTrue(ctx.getHeaders().isEmpty());
          assertNull(ctx.getBody());
          assertTrue(ctx.getIsRestApi());
          assertEquals(RestResponse.class, ctx.getResponseType().getRawType());
          assertNotNull(ctx.getRetryHandler());
          assertNotNull(ctx.getCredentials());
        });
    RestResponse response =
        client.invokeAPI("someOperation", "GET", "somePath", Collections.emptyList(), Collections.emptyMap(), null, TEST_EXTENSION);
    assertEquals(200, response.getHttpCode());
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testNoExtension() {
    TestClient client = new TestClient();
    Throwable e = assertThrows(Exception.class, () -> {
      client.invokeAPI("someOperation", "/somePath", "", new GenericType<TestCdpResponse>(){}, CdpClient.NO_EXTENSION);
    });
    assertTrue(e.getMessage().contains("java.net.UnknownHostException: fake.endpoint"));
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testNullSuccessfulResponse() {
    Response mockResponse = mockResponse(200, "requestId");
    when(mockResponse.readEntity(any(GenericType.class))).thenReturn(null);
    TestClient client = new TestClient(mockResponse);
    Throwable e = assertThrows(CdpHTTPException.class, () -> {
      client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, TEST_EXTENSION);
    });
    assertEquals(String.format("200: Invalid response from server"), e.getMessage());
  }

  @Test
  public void testNonCdpHTTPError() throws Exception {
    String responseBody = Resources.toString(
        Resources.getResource("502.html"), Charsets.UTF_8);
    Response mockResponse = mockResponse(502, null);
    when(mockResponse.readEntity(String.class)).thenReturn(responseBody);
    TestClient client = new TestClient(mockResponse);
    Throwable e = assertThrows(CdpHTTPException.class, () -> {
      client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, TEST_EXTENSION);
    });
    assertEquals(String.format("502: %s", responseBody), e.getMessage());
  }

  @Test
  public void testCdpError() throws Exception {
    Map<String, String> error = Maps.newHashMap();
    error.put("code", "CODE");
    error.put("message", "message!");
    Response mockResponse = mockResponse(500, "requestId");
    when(mockResponse.readEntity(String.class)).thenReturn(
        MAPPER.writeValueAsString(error));
    TestClient client = new TestClient(mockResponse);
    try {
      client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, TEST_EXTENSION);
      fail();
    } catch (CdpServiceException e) {
      assertEquals(500, e.getHttpCode());
      assertEquals(
          "com.cloudera.cdp.CdpServiceException: 500: CODE: message! requestId",
          e.getMessage());
      assertEquals("requestId", e.getRequestId());
    }
  }

  @Test
  public void testCdpErrorMessages() throws Exception {
    Response mockResponse = mockResponse(500, null);
    MultivaluedHashMap<String, Object> headers = new MultivaluedHashMap<>();
    headers.put(CdpResponse.CDP_HEADER_REQUESTID, ImmutableList.of("requestId"));
    when(mockResponse.getHeaders()).thenReturn(headers);
    when(mockResponse.readEntity(String.class)).thenReturn("{\"errorMessages\": [\"foo\", \"bar\"]}");
    TestClient client = new TestClient(mockResponse);
    try {
      client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, TEST_EXTENSION);
      fail();
    } catch (CdpServiceException e) {
      assertEquals(500, e.getHttpCode());
      assertEquals(
          "com.cloudera.cdp.CdpServiceException: 500: unknown: foo bar requestId",
          e.getMessage());
      assertEquals("requestId", e.getRequestId());
    }
  }

  @Test
  public void testBadCdpErrors() throws Exception {
    // No body at all.
    Response mockResponse = mockResponse(500, "requestId");
    when(mockResponse.readEntity(String.class)).thenReturn(null);
    TestClient client = new TestClient(mockResponse);
    try {
      client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, TEST_EXTENSION);
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(500, e.getHttpCode());
      assertEquals("500: null", e.getMessage());
    }
    // A non-JSON body.
    when(mockResponse.readEntity(String.class)).thenReturn("NOT JSON!");
    client = new TestClient(mockResponse);
    try {
      client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, TEST_EXTENSION);
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(500, e.getHttpCode());
      assertEquals("500: NOT JSON!", e.getMessage());
    }
    // A JSON body with no content.
    Map<String, String> error = Maps.newHashMap();
    when(mockResponse.readEntity(String.class)).thenReturn(
        MAPPER.writeValueAsString(error));
    client = new TestClient(mockResponse);
    try {
      client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, TEST_EXTENSION);
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(500, e.getHttpCode());
      assertEquals("com.cloudera.cdp.CdpServiceException: 500: unknown: unknown requestId", e.getMessage());
    }
    // A JSON body with only the code.
    error.put("code", "CODE");
    when(mockResponse.readEntity(String.class)).thenReturn(
        MAPPER.writeValueAsString(error));
    client = new TestClient(mockResponse);
    try {
      client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, TEST_EXTENSION);
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(500, e.getHttpCode());
      assertEquals("com.cloudera.cdp.CdpServiceException: 500: CODE: unknown requestId", e.getMessage());
    }
    // A JSON body with only the message.
    error.clear();
    error.put("message", "MESSAGE!");
    when(mockResponse.readEntity(String.class)).thenReturn(
        MAPPER.writeValueAsString(error));
    client = new TestClient(mockResponse);
    try {
      client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, TEST_EXTENSION);
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(500, e.getHttpCode());
      assertEquals("com.cloudera.cdp.CdpServiceException: 500: unknown: MESSAGE! requestId", e.getMessage());
    }
    // A JSON error but no request ID.
    mockResponse = mockResponse(500, null);
    error.put("code", "CODE");
    error.put("message", "message!");
    when(mockResponse.readEntity(String.class)).thenReturn(
        MAPPER.writeValueAsString(error));
    client = new TestClient(mockResponse);
    try {
      client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, TEST_EXTENSION);
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(500, e.getHttpCode());
      assertEquals("com.cloudera.cdp.CdpServiceException: 500: CODE: message! unknown", e.getMessage());
    }
  }

  @Test
  public void testRetries() {
    Response mockResponse = mockResponse(503, null);
    TestClient client = new TestClient(mockResponse);
    try {
      client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, TEST_EXTENSION);
      fail();
    } catch (CdpHTTPException e) {
      assertEquals(503, e.getHttpCode());
      assertEquals("503: null", e.getMessage());
    }
  }

  @Test
  public void testCallAfterShutdown() {
    CdpClient client = new CdpClient(
        new BasicCdpCredentials("accessKeyID",
                                CdpSDKTestUtils.getRSAPrivateKey()),
        "endpoint",
        CdpClientConfigurationBuilder.defaultBuilder().build()) {
      @Override
      public String getServiceName() {
        return "test";
      }
    };
    client.shutdown();
    try {
      client.invokeAPI("someOperation", "somePath", "", new GenericType<TestCdpResponse>(){}, CdpClient.NO_EXTENSION);
      fail();
    } catch (CdpClientException e) {
      assertEquals("Client instance has been closed.", e.getMessage());
    }
  }

  @Test
  public void testShutdownTwice() {
    Response mockResponse = mockResponse(503, null);
    TestClient client = new TestClient(mockResponse);
    client.shutdown();
    client.shutdown();
  }

  @Test
  public void testUserAgent() throws Exception {
    CdpClientConfiguration config = CdpClientConfigurationBuilder.defaultBuilder().build();
    CdpClientContext<TestCdpResponse> context = new CdpClientContext<>(
        new ClientFactory().create(config),
        "test-service", "someOperation", false, new GenericType<TestCdpResponse>(){});
    context.setClientApplicationName(config.getClientApplicationName());
    context.setRetryHandler(config.getRetryHandler());
    context.setRequestContentType(MediaType.APPLICATION_JSON);
    context.setResponseContentType(MediaType.APPLICATION_JSON);
    context.setCredentials(new BasicCdpCredentials("Bearer A.B.C"));
    context.setMethod("POST");
    context.setPath("somePath");
    context.setBody("");
    CdpRestClient client = new CdpRestClient();
    MultivaluedMap<String, Object> headers = client.computeHeaders(context);
    assertTrue(headers.containsKey(HttpHeaders.USER_AGENT));
    assertEquals(1, headers.get(HttpHeaders.USER_AGENT).size());
    assertEquals(CdpRestClient.buildUserAgent(), headers.get(HttpHeaders.USER_AGENT).get(0));
  }

  @Test
  public void testApiKeyAuth() throws Exception {
    CdpClientConfiguration config = CdpClientConfigurationBuilder.defaultBuilder().build();
    CdpClientContext<TestCdpResponse> context = new CdpClientContext<>(
        new ClientFactory().create(config),
        "test-service", "someOperation", false, new GenericType<TestCdpResponse>(){});
    context.setClientApplicationName(config.getClientApplicationName());
    context.setRetryHandler(config.getRetryHandler());
    context.setRequestContentType(MediaType.APPLICATION_JSON);
    context.setResponseContentType(MediaType.APPLICATION_JSON);
    context.setCredentials(new BasicCdpCredentials("access-key-id", CdpSDKTestUtils.getRSAPrivateKey()));
    context.setMethod("POST");
    context.setPath("somePath");
    context.setBody("");
    CdpRestClient client = new CdpRestClient();
    MultivaluedMap<String, Object> headers = client.computeHeaders(context);
    assertTrue(headers.containsKey("x-altus-auth"));
    assertEquals(1, headers.get("x-altus-auth").size());
    assertTrue(headers.get("x-altus-auth").get(0).toString().length() > 0);
  }

  @Test
  public void testAccessTokenAuth() throws Exception {
    CdpClientConfiguration config = CdpClientConfigurationBuilder.defaultBuilder().build();
    CdpClientContext<TestCdpResponse> context = new CdpClientContext<>(
        new ClientFactory().create(config),
        "test-service", "someOperation", false, new GenericType<TestCdpResponse>(){});
    context.setClientApplicationName(config.getClientApplicationName());
    context.setRetryHandler(config.getRetryHandler());
    context.setRequestContentType(MediaType.APPLICATION_JSON);
    context.setResponseContentType(MediaType.APPLICATION_JSON);
    context.setCredentials(new BasicCdpCredentials("Bearer A.B.C"));
    context.setMethod("POST");
    context.setPath("somePath");
    context.setBody("");
    CdpRestClient client = new CdpRestClient();
    MultivaluedMap<String, Object> headers = client.computeHeaders(context);
    assertTrue(headers.containsKey(HttpHeaders.AUTHORIZATION));
    assertEquals(1, headers.get(HttpHeaders.AUTHORIZATION).size());
    assertEquals("Bearer A.B.C", headers.get(HttpHeaders.AUTHORIZATION).get(0));
  }

  @Test
  public void testComputeHeaders() throws Exception {
    CdpClientConfiguration config = CdpClientConfigurationBuilder.defaultBuilder().build();
    CdpClientContext<TestCdpResponse> context = new CdpClientContext<>(
        new ClientFactory().create(config),
        "test-service", "someOperation", false, new GenericType<TestCdpResponse>(){});
    context.setClientApplicationName(config.getClientApplicationName());
    context.setRetryHandler(config.getRetryHandler());
    context.setRequestContentType(MediaType.APPLICATION_JSON);
    context.setResponseContentType(MediaType.APPLICATION_JSON);
    context.setCredentials(new BasicCdpCredentials("access-key-id", CdpSDKTestUtils.getRSAPrivateKey()));
    context.setMethod("POST");
    context.setPath("/path");
    context.setBody("");
    CdpRestClient client = new CdpRestClient();
    MultivaluedMap<String, Object> headers = client.computeHeaders(context);
    assertArrayEquals(new Object[]{"application/json"}, headers.get("Content-Type").toArray());
    assertTrue(headers.containsKey("x-altus-date"));

    context = new CdpClientContext<>(
        new ClientFactory().create(config),
        "test-service", "someOperation", false, new GenericType<TestCdpResponse>(){});
    context.setClientApplicationName(config.getClientApplicationName());
    context.setRetryHandler(config.getRetryHandler());
    context.setRequestContentType(MediaType.APPLICATION_JSON);
    context.setResponseContentType(MediaType.APPLICATION_JSON);
    context.setCredentials(new BasicCdpCredentials("access-token"));
    context.setMethod("GET");
    context.setPath("/path");
    context.getHeaders().put("foo", "bar");
    client = new CdpRestClient();
    headers = client.computeHeaders(context);
    assertArrayEquals(new Object[]{"bar"}, headers.get("foo").toArray());
    assertFalse(headers.containsKey("Content-Type"));
  }

  @Test
  public void testParameterToString() throws Exception {
    TestClient client = new TestClient();
    assertEquals("", client.parameterToString(null));
    assertEquals("101", client.parameterToString("101"));
    assertEquals("?&=", client.parameterToString("?&="));
    assertEquals("101", client.parameterToString(101));
    assertEquals("1.01", client.parameterToString(1.01));
    assertEquals("true", client.parameterToString(true));
    assertEquals("false", client.parameterToString(false));
    assertEquals("2020-12-16T02:46:03.102Z", client.parameterToString(ZonedDateTime.parse("2020-12-15T18:46:03.102-08:00")));
    assertEquals("foo,bar", client.parameterToString(Arrays.asList("foo", "bar" )));
    assertEquals("101", client.parameterToString("101"));
  }

  @Test
  public void testParameterToPair() throws Exception {
    TestClient client = new TestClient();
    Pair pair;
    pair = client.parameterToPair("foo", "bar");
    assertEquals("foo", pair.getName());
    assertEquals("bar", pair.getValue());
    pair = client.parameterToPair("foo", 123);
    assertEquals("foo", pair.getName());
    assertEquals("123", pair.getValue());
    pair = client.parameterToPair("foo", null);
    assertEquals("foo", pair.getName());
    assertEquals("", pair.getValue());
  }

  @Test
  public void testParameterToPairs() throws Exception {
    TestClient client = new TestClient();
    List<Pair> pairs;

    pairs = client.parameterToPairs("multi", "name", null);
    assertTrue(pairs.isEmpty());

    pairs = client.parameterToPairs("multi", "name", Collections.emptyList());
    assertTrue(pairs.isEmpty());

    pairs = client.parameterToPairs("multi", "name", Arrays.asList("foo", "bar"));
    assertEquals(2, pairs.size());
    assertEquals("name", pairs.get(0).getName());
    assertEquals("foo", pairs.get(0).getValue());
    assertEquals("name", pairs.get(1).getName());
    assertEquals("bar", pairs.get(1).getValue());

    pairs = client.parameterToPairs("csv", "name", Arrays.asList("foo", "bar"));
    assertEquals(1, pairs.size());
    assertEquals("name", pairs.get(0).getName());
    assertEquals("foo,bar", pairs.get(0).getValue());

    pairs = client.parameterToPairs("", "name", Arrays.asList("foo", "bar"));
    assertEquals(1, pairs.size());
    assertEquals("name", pairs.get(0).getName());
    assertEquals("foo,bar", pairs.get(0).getValue());

    pairs = client.parameterToPairs("tsv", "name", Arrays.asList("foo", "bar"));
    assertEquals(1, pairs.size());
    assertEquals("name", pairs.get(0).getName());
    assertEquals("foo\tbar", pairs.get(0).getValue());

    pairs = client.parameterToPairs("ssv", "name", Arrays.asList("foo", "bar"));
    assertEquals(1, pairs.size());
    assertEquals("name", pairs.get(0).getName());
    assertEquals("foo bar", pairs.get(0).getValue());

    pairs = client.parameterToPairs("pipes", "name", Arrays.asList("foo", "bar"));
    assertEquals(1, pairs.size());
    assertEquals("name", pairs.get(0).getName());
    assertEquals("foo|bar", pairs.get(0).getValue());
  }
}
