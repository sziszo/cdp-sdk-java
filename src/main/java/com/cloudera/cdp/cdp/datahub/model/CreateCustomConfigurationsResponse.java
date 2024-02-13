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
import com.cloudera.cdp.datahub.model.CustomConfigurations;

/**
 * The response object for create custom configurations request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-02-12T15:29:00.760-08:00")
public class CreateCustomConfigurationsResponse extends CdpResponse {

  /**
   * The custom configurations.
   **/
  private CustomConfigurations customConfigurations = null;

  /**
   * Getter for customConfigurations.
   * The custom configurations.
   **/
  @JsonProperty("customConfigurations")
  public CustomConfigurations getCustomConfigurations() {
    return customConfigurations;
  }

  /**
   * Setter for customConfigurations.
   * The custom configurations.
   **/
  public void setCustomConfigurations(CustomConfigurations customConfigurations) {
    this.customConfigurations = customConfigurations;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomConfigurationsResponse createCustomConfigurationsResponse = (CreateCustomConfigurationsResponse) o;
    if (!Objects.equals(this.customConfigurations, createCustomConfigurationsResponse.customConfigurations)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(customConfigurations, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomConfigurationsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    customConfigurations: ").append(toIndentedString(customConfigurations)).append("\n");
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

