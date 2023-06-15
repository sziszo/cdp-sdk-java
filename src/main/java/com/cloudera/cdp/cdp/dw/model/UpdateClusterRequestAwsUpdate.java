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
import com.cloudera.cdp.dw.model.ExternalBucketAccessInfo;
import java.util.*;
import java.util.Map;

/**
 * Additional properties for AWS clusters.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-14T15:47:16.233-07:00")
public class UpdateClusterRequestAwsUpdate  {

  /**
   * External bucket definition.
   **/
  private Map<String, ExternalBucketAccessInfo> externalBuckets = new HashMap<String, ExternalBucketAccessInfo>();

  /**
   * Getter for externalBuckets.
   * External bucket definition.
   **/
  @JsonProperty("externalBuckets")
  public Map<String, ExternalBucketAccessInfo> getExternalBuckets() {
    return externalBuckets;
  }

  /**
   * Setter for externalBuckets.
   * External bucket definition.
   **/
  public void setExternalBuckets(Map<String, ExternalBucketAccessInfo> externalBuckets) {
    this.externalBuckets = externalBuckets;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClusterRequestAwsUpdate updateClusterRequestAwsUpdate = (UpdateClusterRequestAwsUpdate) o;
    if (!Objects.equals(this.externalBuckets, updateClusterRequestAwsUpdate.externalBuckets)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalBuckets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClusterRequestAwsUpdate {\n");
    sb.append("    externalBuckets: ").append(toIndentedString(externalBuckets)).append("\n");
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

