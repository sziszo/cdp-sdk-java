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

import javax.ws.rs.core.GenericType;
import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.datalake.model.BackupDatalakeRequest;
import com.cloudera.cdp.datalake.model.BackupDatalakeResponse;
import com.cloudera.cdp.datalake.model.BackupDatalakeStatusRequest;
import com.cloudera.cdp.datalake.model.BackupDatalakeStatusResponse;
import com.cloudera.cdp.datalake.model.CreateAWSDatalakeRequest;
import com.cloudera.cdp.datalake.model.CreateAWSDatalakeResponse;
import com.cloudera.cdp.datalake.model.CreateAzureDatalakeRequest;
import com.cloudera.cdp.datalake.model.CreateAzureDatalakeResponse;
import com.cloudera.cdp.datalake.model.DeleteDatalakeRequest;
import com.cloudera.cdp.datalake.model.DeleteDatalakeResponse;
import com.cloudera.cdp.datalake.model.DescribeDatalakeRequest;
import com.cloudera.cdp.datalake.model.DescribeDatalakeResponse;
import com.cloudera.cdp.datalake.model.Error;
import com.cloudera.cdp.datalake.model.GetClusterHostStatusRequest;
import com.cloudera.cdp.datalake.model.GetClusterHostStatusResponse;
import com.cloudera.cdp.datalake.model.GetClusterServiceStatusRequest;
import com.cloudera.cdp.datalake.model.GetClusterServiceStatusResponse;
import com.cloudera.cdp.datalake.model.ListDatalakeBackupsRequest;
import com.cloudera.cdp.datalake.model.ListDatalakeBackupsResponse;
import com.cloudera.cdp.datalake.model.ListDatalakesRequest;
import com.cloudera.cdp.datalake.model.ListDatalakesResponse;
import com.cloudera.cdp.datalake.model.ListRuntimesRequest;
import com.cloudera.cdp.datalake.model.ListRuntimesResponse;
import com.cloudera.cdp.datalake.model.RepairDatalakeRequest;
import com.cloudera.cdp.datalake.model.RepairDatalakeResponse;
import com.cloudera.cdp.datalake.model.RestoreDatalakeRequest;
import com.cloudera.cdp.datalake.model.RestoreDatalakeResponse;
import com.cloudera.cdp.datalake.model.RestoreDatalakeStatusRequest;
import com.cloudera.cdp.datalake.model.RestoreDatalakeStatusResponse;
import com.cloudera.cdp.datalake.model.StartDatalakeRequest;
import com.cloudera.cdp.datalake.model.StartDatalakeResponse;
import com.cloudera.cdp.datalake.model.StopDatalakeRequest;
import com.cloudera.cdp.datalake.model.StopDatalakeResponse;
import com.cloudera.cdp.datalake.model.UpgradeDatalakeRequest;
import com.cloudera.cdp.datalake.model.UpgradeDatalakeResponse;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-08-20T08:11:35.141-07:00")
public class DatalakeClient extends CdpClient {

  public static final String SERVICE_NAME = "api";

  public DatalakeClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
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
    return this.invokeAPI("/api/v1/datalake/backupDatalake", input, new GenericType<BackupDatalakeResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/backupDatalakeStatus", input, new GenericType<BackupDatalakeStatusResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/createAWSDatalake", input, new GenericType<CreateAWSDatalakeResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/createAzureDatalake", input, new GenericType<CreateAzureDatalakeResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/deleteDatalake", input, new GenericType<DeleteDatalakeResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/describeDatalake", input, new GenericType<DescribeDatalakeResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/getClusterHostStatus", input, new GenericType<GetClusterHostStatusResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/getClusterServiceStatus", input, new GenericType<GetClusterServiceStatusResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/listDatalakeBackups", input, new GenericType<ListDatalakeBackupsResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/listDatalakes", input, new GenericType<ListDatalakesResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/listRuntimes", input, new GenericType<ListRuntimesResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/repairDatalake", input, new GenericType<RepairDatalakeResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/restoreDatalake", input, new GenericType<RestoreDatalakeResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/restoreDatalakeStatus", input, new GenericType<RestoreDatalakeStatusResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/startDatalake", input, new GenericType<StartDatalakeResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/stopDatalake", input, new GenericType<StopDatalakeResponse>(){});
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
    return this.invokeAPI("/api/v1/datalake/upgradeDatalake", input, new GenericType<UpgradeDatalakeResponse>(){});
  }
}
