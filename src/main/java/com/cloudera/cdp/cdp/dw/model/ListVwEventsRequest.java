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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for the listVwEvents method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-07-13T10:29:21.481-07:00")
public class ListVwEventsRequest  {

  /**
   * ID of cluster.
   **/
  private String clusterId = null;

  /**
   * ID of the Virtual Warehouse.
   **/
  private String vwId = null;

  /**
   * Limit the number of returned rows. If not specified all the events will be returned. Please note the DWX only stores the last 50 events.
   **/
  private Integer limit = null;

  /**
   * Provide the result in ascending order, default is descending.
   **/
  private Boolean ascending = false;

  /**
   * Getter for clusterId.
   * ID of cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for vwId.
   * ID of the Virtual Warehouse.
   **/
  @JsonProperty("vwId")
  public String getVwId() {
    return vwId;
  }

  /**
   * Setter for vwId.
   * ID of the Virtual Warehouse.
   **/
  public void setVwId(String vwId) {
    this.vwId = vwId;
  }

  /**
   * Getter for limit.
   * Limit the number of returned rows. If not specified all the events will be returned. Please note the DWX only stores the last 50 events.
   **/
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  /**
   * Setter for limit.
   * Limit the number of returned rows. If not specified all the events will be returned. Please note the DWX only stores the last 50 events.
   **/
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   * Getter for ascending.
   * Provide the result in ascending order, default is descending.
   **/
  @JsonProperty("ascending")
  public Boolean getAscending() {
    return ascending;
  }

  /**
   * Setter for ascending.
   * Provide the result in ascending order, default is descending.
   **/
  public void setAscending(Boolean ascending) {
    this.ascending = ascending;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListVwEventsRequest listVwEventsRequest = (ListVwEventsRequest) o;
    if (!Objects.equals(this.clusterId, listVwEventsRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.vwId, listVwEventsRequest.vwId)) {
      return false;
    }
    if (!Objects.equals(this.limit, listVwEventsRequest.limit)) {
      return false;
    }
    if (!Objects.equals(this.ascending, listVwEventsRequest.ascending)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, vwId, limit, ascending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVwEventsRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    vwId: ").append(toIndentedString(vwId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    ascending: ").append(toIndentedString(ascending)).append("\n");
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

