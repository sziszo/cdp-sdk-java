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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for upgrading a service.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-03T11:22:10.122-07:00")
public class UpgradeServiceRequest  {

  /**
   * Cluster ID of the service to upgrade.
   **/
  private String clusterId = null;

  /**
   * The maintenance step to be performed. Currently supported steps are prepare, backup, upgrade, cancel and resume.
   **/
  private String step = null;

  /**
   * Getter for clusterId.
   * Cluster ID of the service to upgrade.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Cluster ID of the service to upgrade.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for step.
   * The maintenance step to be performed. Currently supported steps are prepare, backup, upgrade, cancel and resume.
   **/
  @JsonProperty("step")
  public String getStep() {
    return step;
  }

  /**
   * Setter for step.
   * The maintenance step to be performed. Currently supported steps are prepare, backup, upgrade, cancel and resume.
   **/
  public void setStep(String step) {
    this.step = step;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeServiceRequest upgradeServiceRequest = (UpgradeServiceRequest) o;
    if (!Objects.equals(this.clusterId, upgradeServiceRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.step, upgradeServiceRequest.step)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, step);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeServiceRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
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

