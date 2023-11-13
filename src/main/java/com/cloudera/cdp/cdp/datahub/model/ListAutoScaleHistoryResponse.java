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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.IndividualAutoScaleHistoryResponse;
import java.util.*;

/**
 * The response object which describes the AutoScale rules for a DataHub cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-11-09T15:08:27.392-08:00")
public class ListAutoScaleHistoryResponse extends CdpResponse {

  /**
   * List of history events for the cluster.
   **/
  private List<IndividualAutoScaleHistoryResponse> historyEvents = new ArrayList<IndividualAutoScaleHistoryResponse>();

  /**
   * Getter for historyEvents.
   * List of history events for the cluster.
   **/
  @JsonProperty("historyEvents")
  public List<IndividualAutoScaleHistoryResponse> getHistoryEvents() {
    return historyEvents;
  }

  /**
   * Setter for historyEvents.
   * List of history events for the cluster.
   **/
  public void setHistoryEvents(List<IndividualAutoScaleHistoryResponse> historyEvents) {
    this.historyEvents = historyEvents;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAutoScaleHistoryResponse listAutoScaleHistoryResponse = (ListAutoScaleHistoryResponse) o;
    if (!Objects.equals(this.historyEvents, listAutoScaleHistoryResponse.historyEvents)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(historyEvents, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAutoScaleHistoryResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    historyEvents: ").append(toIndentedString(historyEvents)).append("\n");
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

