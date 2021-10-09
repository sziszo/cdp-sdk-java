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

package com.cloudera.cdp.datalake.api;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.WorkloadApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.client.CdpRequestContext;
import com.cloudera.cdp.client.Pair;
import com.cloudera.cdp.client.RestResponse;
import com.cloudera.cdp.datalake.model.BackupDatalakeRequest;
import com.cloudera.cdp.datalake.model.BackupDatalakeResponse;
import com.cloudera.cdp.datalake.model.BackupDatalakeStatusRequest;
import com.cloudera.cdp.datalake.model.BackupDatalakeStatusResponse;
import com.cloudera.cdp.datalake.model.CancelDatalakeDiagnosticsRequest;
import com.cloudera.cdp.datalake.model.CancelDatalakeDiagnosticsResponse;
import com.cloudera.cdp.datalake.model.CollectCmDiagnosticsRequest;
import com.cloudera.cdp.datalake.model.CollectCmDiagnosticsResponse;
import com.cloudera.cdp.datalake.model.CollectDatalakeDiagnosticsRequest;
import com.cloudera.cdp.datalake.model.CollectDatalakeDiagnosticsResponse;
import com.cloudera.cdp.datalake.model.CreateAWSDatalakeRequest;
import com.cloudera.cdp.datalake.model.CreateAWSDatalakeResponse;
import com.cloudera.cdp.datalake.model.CreateAzureDatalakeRequest;
import com.cloudera.cdp.datalake.model.CreateAzureDatalakeResponse;
import com.cloudera.cdp.datalake.model.CreateGCPDatalakeRequest;
import com.cloudera.cdp.datalake.model.CreateGCPDatalakeResponse;
import com.cloudera.cdp.datalake.model.DeleteDatalakeRequest;
import com.cloudera.cdp.datalake.model.DeleteDatalakeResponse;
import com.cloudera.cdp.datalake.model.DescribeDatalakeRequest;
import com.cloudera.cdp.datalake.model.DescribeDatalakeResponse;
import com.cloudera.cdp.datalake.model.Error;
import com.cloudera.cdp.datalake.model.GetClusterHostStatusRequest;
import com.cloudera.cdp.datalake.model.GetClusterHostStatusResponse;
import com.cloudera.cdp.datalake.model.GetClusterServiceStatusRequest;
import com.cloudera.cdp.datalake.model.GetClusterServiceStatusResponse;
import com.cloudera.cdp.datalake.model.GetCmRolesRequest;
import com.cloudera.cdp.datalake.model.GetCmRolesResponse;
import com.cloudera.cdp.datalake.model.GetDatalakeLogDescriptorsRequest;
import com.cloudera.cdp.datalake.model.GetDatalakeLogDescriptorsResponse;
import com.cloudera.cdp.datalake.model.ListDatalakeBackupsRequest;
import com.cloudera.cdp.datalake.model.ListDatalakeBackupsResponse;
import com.cloudera.cdp.datalake.model.ListDatalakeDiagnosticsRequest;
import com.cloudera.cdp.datalake.model.ListDatalakeDiagnosticsResponse;
import com.cloudera.cdp.datalake.model.ListDatalakesRequest;
import com.cloudera.cdp.datalake.model.ListDatalakesResponse;
import com.cloudera.cdp.datalake.model.ListRuntimesRequest;
import com.cloudera.cdp.datalake.model.ListRuntimesResponse;
import com.cloudera.cdp.datalake.model.RenewCertificateRequest;
import com.cloudera.cdp.datalake.model.RenewCertificateResponse;
import com.cloudera.cdp.datalake.model.RepairDatalakeRequest;
import com.cloudera.cdp.datalake.model.RepairDatalakeResponse;
import com.cloudera.cdp.datalake.model.RestoreDatalakeRequest;
import com.cloudera.cdp.datalake.model.RestoreDatalakeResponse;
import com.cloudera.cdp.datalake.model.RestoreDatalakeStatusRequest;
import com.cloudera.cdp.datalake.model.RestoreDatalakeStatusResponse;
import com.cloudera.cdp.datalake.model.RetryDatalakeRequest;
import com.cloudera.cdp.datalake.model.RetryDatalakeResponse;
import com.cloudera.cdp.datalake.model.RotateAutoTlsCertificatesRequest;
import com.cloudera.cdp.datalake.model.RotateAutoTlsCertificatesResponse;
import com.cloudera.cdp.datalake.model.StartDatalakeRequest;
import com.cloudera.cdp.datalake.model.StartDatalakeResponse;
import com.cloudera.cdp.datalake.model.StopDatalakeRequest;
import com.cloudera.cdp.datalake.model.StopDatalakeResponse;
import com.cloudera.cdp.datalake.model.UpgradeDatalakeRequest;
import com.cloudera.cdp.datalake.model.UpgradeDatalakeResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-10-08T17:07:07.839-07:00")
public class DatalakeClient extends CdpClient {

  public static final String SERVICE_NAME = "datalake";

  public DatalakeClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  public DatalakeClient(CdpRequestContext<?> context) {
    super(context);
  }

  @Override
  protected String getServiceName() {
    return SERVICE_NAME;
  }

  @Override
  protected String getRequestContentType() {
    return "application/json";
  }

  @Override
  protected String getResponseContentType() {
    return "application/json";
  }

  /**
   * Create backup of datalake.
   * @param input
   * @return BackupDatalakeResponse
   */
  public BackupDatalakeResponse backupDatalake(BackupDatalakeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling backupDatalake");
    }

    return this.invokeAPI("backupDatalake", "/api/v1/datalake/backupDatalake", input, new GenericType<BackupDatalakeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Check the status of a datalake backup operation performed.
   * @param input
   * @return BackupDatalakeStatusResponse
   */
  public BackupDatalakeStatusResponse backupDatalakeStatus(BackupDatalakeStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling backupDatalakeStatus");
    }

    return this.invokeAPI("backupDatalakeStatus", "/api/v1/datalake/backupDatalakeStatus", input, new GenericType<BackupDatalakeStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * Cancel running Datalake diagnostics collections
   * @param input
   * @return CancelDatalakeDiagnosticsResponse
   */
  public CancelDatalakeDiagnosticsResponse cancelDatalakeDiagnostics(CancelDatalakeDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling cancelDatalakeDiagnostics");
    }

    return this.invokeAPI("cancelDatalakeDiagnostics", "/api/v1/datalake/cancelDatalakeDiagnostics", input, new GenericType<CancelDatalakeDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Start DataLake Cloudera Manager based diagnostics collection
   * @param input
   * @return CollectCmDiagnosticsResponse
   */
  public CollectCmDiagnosticsResponse collectCmDiagnostics(CollectCmDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling collectCmDiagnostics");
    }

    return this.invokeAPI("collectCmDiagnostics", "/api/v1/datalake/collectCmDiagnostics", input, new GenericType<CollectCmDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Start DataLake diagnostics collection
   * @param input
   * @return CollectDatalakeDiagnosticsResponse
   */
  public CollectDatalakeDiagnosticsResponse collectDatalakeDiagnostics(CollectDatalakeDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling collectDatalakeDiagnostics");
    }

    return this.invokeAPI("collectDatalakeDiagnostics", "/api/v1/datalake/collectDatalakeDiagnostics", input, new GenericType<CollectDatalakeDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates an AWS datalake.
   * @param input
   * @return CreateAWSDatalakeResponse
   */
  public CreateAWSDatalakeResponse createAWSDatalake(CreateAWSDatalakeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAWSDatalake");
    }

    return this.invokeAPI("createAWSDatalake", "/api/v1/datalake/createAWSDatalake", input, new GenericType<CreateAWSDatalakeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates an Azure datalake.
   * @param input
   * @return CreateAzureDatalakeResponse
   */
  public CreateAzureDatalakeResponse createAzureDatalake(CreateAzureDatalakeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createAzureDatalake");
    }

    return this.invokeAPI("createAzureDatalake", "/api/v1/datalake/createAzureDatalake", input, new GenericType<CreateAzureDatalakeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Creates an GCP Data Lake.
   * @param input
   * @return CreateGCPDatalakeResponse
   */
  public CreateGCPDatalakeResponse createGCPDatalake(CreateGCPDatalakeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling createGCPDatalake");
    }

    return this.invokeAPI("createGCPDatalake", "/api/v1/datalake/createGCPDatalake", input, new GenericType<CreateGCPDatalakeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Deletes a datalake.
   * @param input
   * @return DeleteDatalakeResponse
   */
  public DeleteDatalakeResponse deleteDatalake(DeleteDatalakeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling deleteDatalake");
    }

    return this.invokeAPI("deleteDatalake", "/api/v1/datalake/deleteDatalake", input, new GenericType<DeleteDatalakeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Describes a datalake.
   * @param input
   * @return DescribeDatalakeResponse
   */
  public DescribeDatalakeResponse describeDatalake(DescribeDatalakeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling describeDatalake");
    }

    return this.invokeAPI("describeDatalake", "/api/v1/datalake/describeDatalake", input, new GenericType<DescribeDatalakeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get cluster host status.
   * @param input
   * @return GetClusterHostStatusResponse
   */
  public GetClusterHostStatusResponse getClusterHostStatus(GetClusterHostStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getClusterHostStatus");
    }

    return this.invokeAPI("getClusterHostStatus", "/api/v1/datalake/getClusterHostStatus", input, new GenericType<GetClusterHostStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * Get cluster service status.
   * @param input
   * @return GetClusterServiceStatusResponse
   */
  public GetClusterServiceStatusResponse getClusterServiceStatus(GetClusterServiceStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getClusterServiceStatus");
    }

    return this.invokeAPI("getClusterServiceStatus", "/api/v1/datalake/getClusterServiceStatus", input, new GenericType<GetClusterServiceStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gather Cloudera Manager roles that can be used for filtering in CM based diagnostics collection.
   * @param input
   * @return GetCmRolesResponse
   */
  public GetCmRolesResponse getCmRoles(GetCmRolesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getCmRoles");
    }

    return this.invokeAPI("getCmRoles", "/api/v1/datalake/getCmRoles", input, new GenericType<GetCmRolesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Gather log descriptors that are used for diagnostics collection.
   * @param input
   * @return GetDatalakeLogDescriptorsResponse
   */
  public GetDatalakeLogDescriptorsResponse getDatalakeLogDescriptors(GetDatalakeLogDescriptorsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling getDatalakeLogDescriptors");
    }

    return this.invokeAPI("getDatalakeLogDescriptors", "/api/v1/datalake/getDatalakeLogDescriptors", input, new GenericType<GetDatalakeLogDescriptorsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List all the backup operations that were performed on the datalake.
   * @param input
   * @return ListDatalakeBackupsResponse
   */
  public ListDatalakeBackupsResponse listDatalakeBackups(ListDatalakeBackupsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDatalakeBackups");
    }

    return this.invokeAPI("listDatalakeBackups", "/api/v1/datalake/listDatalakeBackups", input, new GenericType<ListDatalakeBackupsResponse>(){}, NO_EXTENSION);
  }

  /**
   * List recent Datalake diagnostics collections
   * @param input
   * @return ListDatalakeDiagnosticsResponse
   */
  public ListDatalakeDiagnosticsResponse listDatalakeDiagnostics(ListDatalakeDiagnosticsRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDatalakeDiagnostics");
    }

    return this.invokeAPI("listDatalakeDiagnostics", "/api/v1/datalake/listDatalakeDiagnostics", input, new GenericType<ListDatalakeDiagnosticsResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists datalakes.
   * @param input
   * @return ListDatalakesResponse
   */
  public ListDatalakesResponse listDatalakes(ListDatalakesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listDatalakes");
    }

    return this.invokeAPI("listDatalakes", "/api/v1/datalake/listDatalakes", input, new GenericType<ListDatalakesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Lists the datalake versions.
   * @param input
   * @return ListRuntimesResponse
   */
  public ListRuntimesResponse listRuntimes(ListRuntimesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling listRuntimes");
    }

    return this.invokeAPI("listRuntimes", "/api/v1/datalake/listRuntimes", input, new GenericType<ListRuntimesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Renew certificate on Datalake cluster by name or CRN
   * @param input
   * @return RenewCertificateResponse
   */
  public RenewCertificateResponse renewCertificate(RenewCertificateRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling renewCertificate");
    }

    return this.invokeAPI("renewCertificate", "/api/v1/datalake/renewCertificate", input, new GenericType<RenewCertificateResponse>(){}, NO_EXTENSION);
  }

  /**
   * Repairs a datalake.
   * @param input
   * @return RepairDatalakeResponse
   */
  public RepairDatalakeResponse repairDatalake(RepairDatalakeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling repairDatalake");
    }

    return this.invokeAPI("repairDatalake", "/api/v1/datalake/repairDatalake", input, new GenericType<RepairDatalakeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Restore the datalake from backup taken.
   * @param input
   * @return RestoreDatalakeResponse
   */
  public RestoreDatalakeResponse restoreDatalake(RestoreDatalakeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling restoreDatalake");
    }

    return this.invokeAPI("restoreDatalake", "/api/v1/datalake/restoreDatalake", input, new GenericType<RestoreDatalakeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Check the status of datalake restore operation.
   * @param input
   * @return RestoreDatalakeStatusResponse
   */
  public RestoreDatalakeStatusResponse restoreDatalakeStatus(RestoreDatalakeStatusRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling restoreDatalakeStatus");
    }

    return this.invokeAPI("restoreDatalakeStatus", "/api/v1/datalake/restoreDatalakeStatus", input, new GenericType<RestoreDatalakeStatusResponse>(){}, NO_EXTENSION);
  }

  /**
   * Retry last failed operation on a datalake.
   * @param input
   * @return RetryDatalakeResponse
   */
  public RetryDatalakeResponse retryDatalake(RetryDatalakeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling retryDatalake");
    }

    return this.invokeAPI("retryDatalake", "/api/v1/datalake/retryDatalake", input, new GenericType<RetryDatalakeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Rotate autotls certificates on the datalake&#39;s hosts
   * @param input
   * @return RotateAutoTlsCertificatesResponse
   */
  public RotateAutoTlsCertificatesResponse rotateAutoTlsCertificates(RotateAutoTlsCertificatesRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling rotateAutoTlsCertificates");
    }

    return this.invokeAPI("rotateAutoTlsCertificates", "/api/v1/datalake/rotateAutoTlsCertificates", input, new GenericType<RotateAutoTlsCertificatesResponse>(){}, NO_EXTENSION);
  }

  /**
   * Start Datalake
   * @param input
   * @return StartDatalakeResponse
   */
  public StartDatalakeResponse startDatalake(StartDatalakeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling startDatalake");
    }

    return this.invokeAPI("startDatalake", "/api/v1/datalake/startDatalake", input, new GenericType<StartDatalakeResponse>(){}, NO_EXTENSION);
  }

  /**
   * Stop Datalake
   * @param input
   * @return StopDatalakeResponse
   */
  public StopDatalakeResponse stopDatalake(StopDatalakeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling stopDatalake");
    }

    return this.invokeAPI("stopDatalake", "/api/v1/datalake/stopDatalake", input, new GenericType<StopDatalakeResponse>(){}, NO_EXTENSION);
  }

  /**
   * OS or data platform upgrade for the SDX cluster.
   * @param input
   * @return UpgradeDatalakeResponse
   */
  public UpgradeDatalakeResponse upgradeDatalake(UpgradeDatalakeRequest input) {
    if (input == null) {
      throw new CdpClientException("Missing the required parameter 'input' when calling upgradeDatalake");
    }

    return this.invokeAPI("upgradeDatalake", "/api/v1/datalake/upgradeDatalake", input, new GenericType<UpgradeDatalakeResponse>(){}, NO_EXTENSION);
  }
}
