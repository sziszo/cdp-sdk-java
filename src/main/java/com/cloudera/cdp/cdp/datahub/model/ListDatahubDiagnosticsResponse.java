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
import com.cloudera.cdp.datahub.model.DatahubDiagnosticsCollectionResponse;
import java.util.*;

/**
 * Response object for listing recent Datahub diagnostics collections.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-28T12:35:39.788-07:00")
public class ListDatahubDiagnosticsResponse extends CdpResponse {

  /**
   * description.
   **/
  private List<DatahubDiagnosticsCollectionResponse> collections = new ArrayList<DatahubDiagnosticsCollectionResponse>();

  /**
   * Getter for collections.
   * description.
   **/
  @JsonProperty("collections")
  public List<DatahubDiagnosticsCollectionResponse> getCollections() {
    return collections;
  }

  /**
   * Setter for collections.
   * description.
   **/
  public void setCollections(List<DatahubDiagnosticsCollectionResponse> collections) {
    this.collections = collections;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDatahubDiagnosticsResponse listDatahubDiagnosticsResponse = (ListDatahubDiagnosticsResponse) o;
    if (!Objects.equals(this.collections, listDatahubDiagnosticsResponse.collections)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDatahubDiagnosticsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
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

