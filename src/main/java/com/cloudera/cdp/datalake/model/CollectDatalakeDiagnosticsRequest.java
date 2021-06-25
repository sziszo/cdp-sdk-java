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
import com.cloudera.cdp.datalake.model.DatalakeVmLogRequest;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Request object for collecting DataLake diagnostics.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-06-25T14:27:47.576-07:00")
public class CollectDatalakeDiagnosticsRequest  {

  /**
   * CRN of the Datalake cluster.
   **/
  private String crn = null;

  /**
   * Destination of the diagnostics collection (Support, Own cloud storage, Engineering or collect only on the nodes)
   **/
  private String destination = null;

  /**
   * Additional information / title for the diagnostics collection.
   **/
  private String description = null;

  /**
   * Optional support case number in case of SUPPORT destination, otherwise only act as additional data.
   **/
  private String caseNumber = null;

  /**
   * Array of labels that can filter logs that are collected during diagnostics collection.
   **/
  private List<String> labels = new ArrayList<String>();

  /**
   * Date timestamp - collect files only for diagnostics that has higher last modified timestamp value than this.
   **/
  private ZonedDateTime startDate = null;

  /**
   * Date timestamp - collect files only for diagnostics that has lower created timestamp value than this.
   **/
  private ZonedDateTime endDate = null;

  /**
   * Array of log descriptors that should be additionally collected during diagnostics collection.
   **/
  private List<DatalakeVmLogRequest> additionalLogs = new ArrayList<DatalakeVmLogRequest>();

  /**
   * Array of host names (fqdn), collection will run only on the dedicated hosts.
   **/
  private List<String> hosts = new ArrayList<String>();

  /**
   * Array of host groups, collection will run only on the dedicated hosts that belongs to these host groups.
   **/
  private List<String> hostGroups = new ArrayList<String>();

  /**
   * Array of host names (fqdn or IP address), collection will not run on the excluded hosts.
   **/
  private List<String> excludeHosts = new ArrayList<String>();

  /**
   * Skip unhealthy hosts from the diagnostics collection.
   **/
  private Boolean skipUnresponsiveHosts = null;

  /**
   * Include salt minion/master/api system logs in the diagnostics collection.
   **/
  private Boolean includeSaltLogs = null;

  /**
   * If enabled, required package (cdp-telemetry) will be upgraded or installed on the nodes. (useful if package is not installed or needs to be upgraded) Network is required for this operation.
   **/
  private Boolean updatePackage = false;

  /**
   * Enable/disable node level storage validation (can be disabled for example, if you have too many hosts and do not want to do too much parallel writes to s3/abfs)
   **/
  private Boolean storageValidation = false;

  /**
   * Getter for crn.
   * CRN of the Datalake cluster.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * CRN of the Datalake cluster.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for destination.
   * Destination of the diagnostics collection (Support, Own cloud storage, Engineering or collect only on the nodes)
   **/
  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }

  /**
   * Setter for destination.
   * Destination of the diagnostics collection (Support, Own cloud storage, Engineering or collect only on the nodes)
   **/
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * Getter for description.
   * Additional information / title for the diagnostics collection.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Additional information / title for the diagnostics collection.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for caseNumber.
   * Optional support case number in case of SUPPORT destination, otherwise only act as additional data.
   **/
  @JsonProperty("caseNumber")
  public String getCaseNumber() {
    return caseNumber;
  }

  /**
   * Setter for caseNumber.
   * Optional support case number in case of SUPPORT destination, otherwise only act as additional data.
   **/
  public void setCaseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
  }

  /**
   * Getter for labels.
   * Array of labels that can filter logs that are collected during diagnostics collection.
   **/
  @JsonProperty("labels")
  public List<String> getLabels() {
    return labels;
  }

  /**
   * Setter for labels.
   * Array of labels that can filter logs that are collected during diagnostics collection.
   **/
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  /**
   * Getter for startDate.
   * Date timestamp - collect files only for diagnostics that has higher last modified timestamp value than this.
   **/
  @JsonProperty("startDate")
  public ZonedDateTime getStartDate() {
    return startDate;
  }

  /**
   * Setter for startDate.
   * Date timestamp - collect files only for diagnostics that has higher last modified timestamp value than this.
   **/
  public void setStartDate(ZonedDateTime startDate) {
    this.startDate = startDate;
  }

  /**
   * Getter for endDate.
   * Date timestamp - collect files only for diagnostics that has lower created timestamp value than this.
   **/
  @JsonProperty("endDate")
  public ZonedDateTime getEndDate() {
    return endDate;
  }

  /**
   * Setter for endDate.
   * Date timestamp - collect files only for diagnostics that has lower created timestamp value than this.
   **/
  public void setEndDate(ZonedDateTime endDate) {
    this.endDate = endDate;
  }

  /**
   * Getter for additionalLogs.
   * Array of log descriptors that should be additionally collected during diagnostics collection.
   **/
  @JsonProperty("additionalLogs")
  public List<DatalakeVmLogRequest> getAdditionalLogs() {
    return additionalLogs;
  }

  /**
   * Setter for additionalLogs.
   * Array of log descriptors that should be additionally collected during diagnostics collection.
   **/
  public void setAdditionalLogs(List<DatalakeVmLogRequest> additionalLogs) {
    this.additionalLogs = additionalLogs;
  }

  /**
   * Getter for hosts.
   * Array of host names (fqdn), collection will run only on the dedicated hosts.
   **/
  @JsonProperty("hosts")
  public List<String> getHosts() {
    return hosts;
  }

  /**
   * Setter for hosts.
   * Array of host names (fqdn), collection will run only on the dedicated hosts.
   **/
  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }

  /**
   * Getter for hostGroups.
   * Array of host groups, collection will run only on the dedicated hosts that belongs to these host groups.
   **/
  @JsonProperty("hostGroups")
  public List<String> getHostGroups() {
    return hostGroups;
  }

  /**
   * Setter for hostGroups.
   * Array of host groups, collection will run only on the dedicated hosts that belongs to these host groups.
   **/
  public void setHostGroups(List<String> hostGroups) {
    this.hostGroups = hostGroups;
  }

  /**
   * Getter for excludeHosts.
   * Array of host names (fqdn or IP address), collection will not run on the excluded hosts.
   **/
  @JsonProperty("excludeHosts")
  public List<String> getExcludeHosts() {
    return excludeHosts;
  }

  /**
   * Setter for excludeHosts.
   * Array of host names (fqdn or IP address), collection will not run on the excluded hosts.
   **/
  public void setExcludeHosts(List<String> excludeHosts) {
    this.excludeHosts = excludeHosts;
  }

  /**
   * Getter for skipUnresponsiveHosts.
   * Skip unhealthy hosts from the diagnostics collection.
   **/
  @JsonProperty("skipUnresponsiveHosts")
  public Boolean getSkipUnresponsiveHosts() {
    return skipUnresponsiveHosts;
  }

  /**
   * Setter for skipUnresponsiveHosts.
   * Skip unhealthy hosts from the diagnostics collection.
   **/
  public void setSkipUnresponsiveHosts(Boolean skipUnresponsiveHosts) {
    this.skipUnresponsiveHosts = skipUnresponsiveHosts;
  }

  /**
   * Getter for includeSaltLogs.
   * Include salt minion/master/api system logs in the diagnostics collection.
   **/
  @JsonProperty("includeSaltLogs")
  public Boolean getIncludeSaltLogs() {
    return includeSaltLogs;
  }

  /**
   * Setter for includeSaltLogs.
   * Include salt minion/master/api system logs in the diagnostics collection.
   **/
  public void setIncludeSaltLogs(Boolean includeSaltLogs) {
    this.includeSaltLogs = includeSaltLogs;
  }

  /**
   * Getter for updatePackage.
   * If enabled, required package (cdp-telemetry) will be upgraded or installed on the nodes. (useful if package is not installed or needs to be upgraded) Network is required for this operation.
   **/
  @JsonProperty("updatePackage")
  public Boolean getUpdatePackage() {
    return updatePackage;
  }

  /**
   * Setter for updatePackage.
   * If enabled, required package (cdp-telemetry) will be upgraded or installed on the nodes. (useful if package is not installed or needs to be upgraded) Network is required for this operation.
   **/
  public void setUpdatePackage(Boolean updatePackage) {
    this.updatePackage = updatePackage;
  }

  /**
   * Getter for storageValidation.
   * Enable/disable node level storage validation (can be disabled for example, if you have too many hosts and do not want to do too much parallel writes to s3/abfs)
   **/
  @JsonProperty("storageValidation")
  public Boolean getStorageValidation() {
    return storageValidation;
  }

  /**
   * Setter for storageValidation.
   * Enable/disable node level storage validation (can be disabled for example, if you have too many hosts and do not want to do too much parallel writes to s3/abfs)
   **/
  public void setStorageValidation(Boolean storageValidation) {
    this.storageValidation = storageValidation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectDatalakeDiagnosticsRequest collectDatalakeDiagnosticsRequest = (CollectDatalakeDiagnosticsRequest) o;
    if (!Objects.equals(this.crn, collectDatalakeDiagnosticsRequest.crn)) {
      return false;
    }
    if (!Objects.equals(this.destination, collectDatalakeDiagnosticsRequest.destination)) {
      return false;
    }
    if (!Objects.equals(this.description, collectDatalakeDiagnosticsRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.caseNumber, collectDatalakeDiagnosticsRequest.caseNumber)) {
      return false;
    }
    if (!Objects.equals(this.labels, collectDatalakeDiagnosticsRequest.labels)) {
      return false;
    }
    if (!Objects.equals(this.startDate, collectDatalakeDiagnosticsRequest.startDate)) {
      return false;
    }
    if (!Objects.equals(this.endDate, collectDatalakeDiagnosticsRequest.endDate)) {
      return false;
    }
    if (!Objects.equals(this.additionalLogs, collectDatalakeDiagnosticsRequest.additionalLogs)) {
      return false;
    }
    if (!Objects.equals(this.hosts, collectDatalakeDiagnosticsRequest.hosts)) {
      return false;
    }
    if (!Objects.equals(this.hostGroups, collectDatalakeDiagnosticsRequest.hostGroups)) {
      return false;
    }
    if (!Objects.equals(this.excludeHosts, collectDatalakeDiagnosticsRequest.excludeHosts)) {
      return false;
    }
    if (!Objects.equals(this.skipUnresponsiveHosts, collectDatalakeDiagnosticsRequest.skipUnresponsiveHosts)) {
      return false;
    }
    if (!Objects.equals(this.includeSaltLogs, collectDatalakeDiagnosticsRequest.includeSaltLogs)) {
      return false;
    }
    if (!Objects.equals(this.updatePackage, collectDatalakeDiagnosticsRequest.updatePackage)) {
      return false;
    }
    if (!Objects.equals(this.storageValidation, collectDatalakeDiagnosticsRequest.storageValidation)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, destination, description, caseNumber, labels, startDate, endDate, additionalLogs, hosts, hostGroups, excludeHosts, skipUnresponsiveHosts, includeSaltLogs, updatePackage, storageValidation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectDatalakeDiagnosticsRequest {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    additionalLogs: ").append(toIndentedString(additionalLogs)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    hostGroups: ").append(toIndentedString(hostGroups)).append("\n");
    sb.append("    excludeHosts: ").append(toIndentedString(excludeHosts)).append("\n");
    sb.append("    skipUnresponsiveHosts: ").append(toIndentedString(skipUnresponsiveHosts)).append("\n");
    sb.append("    includeSaltLogs: ").append(toIndentedString(includeSaltLogs)).append("\n");
    sb.append("    updatePackage: ").append(toIndentedString(updatePackage)).append("\n");
    sb.append("    storageValidation: ").append(toIndentedString(storageValidation)).append("\n");
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

