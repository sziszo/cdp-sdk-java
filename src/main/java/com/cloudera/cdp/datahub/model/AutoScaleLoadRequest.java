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
import com.cloudera.cdp.datahub.model.AutoScaleLoadRequestConfiguration;

/**
 * Configuration for Load Based Scaling
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-21T12:39:04.697-07:00")
public class AutoScaleLoadRequest  {

  /**
   * Configuration for Load Based Scaling
   **/
  private AutoScaleLoadRequestConfiguration configuration = null;

  /**
   * An optional identifier for the rule. Generally useful for debugging. Will be auto-generated if none is provided.
   **/
  private String identifier = null;

  /**
   * An optional description for the specific schedule.
   **/
  private String description = null;

  /**
   * Getter for configuration.
   * Configuration for Load Based Scaling
   **/
  @JsonProperty("configuration")
  public AutoScaleLoadRequestConfiguration getConfiguration() {
    return configuration;
  }

  /**
   * Setter for configuration.
   * Configuration for Load Based Scaling
   **/
  public void setConfiguration(AutoScaleLoadRequestConfiguration configuration) {
    this.configuration = configuration;
  }

  /**
   * Getter for identifier.
   * An optional identifier for the rule. Generally useful for debugging. Will be auto-generated if none is provided.
   **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  /**
   * Setter for identifier.
   * An optional identifier for the rule. Generally useful for debugging. Will be auto-generated if none is provided.
   **/
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  /**
   * Getter for description.
   * An optional description for the specific schedule.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * An optional description for the specific schedule.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScaleLoadRequest autoScaleLoadRequest = (AutoScaleLoadRequest) o;
    if (!Objects.equals(this.configuration, autoScaleLoadRequest.configuration)) {
      return false;
    }
    if (!Objects.equals(this.identifier, autoScaleLoadRequest.identifier)) {
      return false;
    }
    if (!Objects.equals(this.description, autoScaleLoadRequest.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuration, identifier, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScaleLoadRequest {\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

