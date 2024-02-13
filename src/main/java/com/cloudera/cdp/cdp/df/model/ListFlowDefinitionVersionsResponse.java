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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.df.model.FlowVersion;
import java.util.*;

/**
 * Response object for the ListFlowDefinitionVersions method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-02-12T15:29:04.513-08:00")
public class ListFlowDefinitionVersionsResponse extends CdpResponse {

  /**
   * The list of matching flow versions
   **/
  private List<FlowVersion> flowVersions = new ArrayList<FlowVersion>();

  /**
   * Getter for flowVersions.
   * The list of matching flow versions
   **/
  @JsonProperty("flowVersions")
  public List<FlowVersion> getFlowVersions() {
    return flowVersions;
  }

  /**
   * Setter for flowVersions.
   * The list of matching flow versions
   **/
  public void setFlowVersions(List<FlowVersion> flowVersions) {
    this.flowVersions = flowVersions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFlowDefinitionVersionsResponse listFlowDefinitionVersionsResponse = (ListFlowDefinitionVersionsResponse) o;
    if (!Objects.equals(this.flowVersions, listFlowDefinitionVersionsResponse.flowVersions)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowVersions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFlowDefinitionVersionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    flowVersions: ").append(toIndentedString(flowVersions)).append("\n");
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

