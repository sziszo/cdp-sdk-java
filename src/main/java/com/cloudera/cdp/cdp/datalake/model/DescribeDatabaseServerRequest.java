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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for obtaining Database Server details.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-12-13T15:06:58.502-08:00")
public class DescribeDatabaseServerRequest  {

  /**
   * Stack CRN of the Data Lake
   **/
  private String clusterCrn = null;

  /**
   * Getter for clusterCrn.
   * Stack CRN of the Data Lake
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * Stack CRN of the Data Lake
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDatabaseServerRequest describeDatabaseServerRequest = (DescribeDatabaseServerRequest) o;
    if (!Objects.equals(this.clusterCrn, describeDatabaseServerRequest.clusterCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDatabaseServerRequest {\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

