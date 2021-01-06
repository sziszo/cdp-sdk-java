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

package com.cloudera.cdp.audit.api;

import com.cloudera.cdp.client.CdpClientBuilder;

/**
* This class can be used to build a AuditClient object.
**/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-01-06T10:11:19.095-08:00")
public class AuditClientBuilder extends CdpClientBuilder<AuditClientBuilder> {

  private AuditClientBuilder() {
   super(AuditClient.SERVICE_NAME, true);
  }

  /**
   * Return the client with all the default configuration settings.
   * @return AuditClient
   */
  public static AuditClient defaultClient() {
    return defaultBuilder().build();
  }

  /**
   * Return a builder with all the default configuration settings. The settings can then be
   * customized as needed.
   * @return AuditClientBuilder
   */
  public static AuditClientBuilder defaultBuilder() {
    return new AuditClientBuilder();
  }

  /**
   * Return the client object with all the configurations provided.
   * @return AuditClient
   */
  public AuditClient build() {
    return new AuditClient(
        getCdpCredentials().getCredentials(),
        getCdpEndPoint(),
        getCdpClientConfiguration());
  }

  @Override
  public AuditClientBuilder self() {
    return this;
  }
}