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
import com.cloudera.cdp.dw.model.VwDiagnosticDataJob;
import java.util.*;

/**
 * Response object for the listVwDiagnosticDataJobsRequest method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-09-28T16:30:04.902-07:00")
public class ListVwDiagnosticDataJobsResponse extends CdpResponse {

  /**
   * The list of the jobs belonging to the particular Virtual Warehouse.
   **/
  private List<VwDiagnosticDataJob> jobs = new ArrayList<VwDiagnosticDataJob>();

  /**
   * The token to use when requesting the next set of results. If there are no additional results, the string is empty.
   **/
  private String nextToken = null;

  /**
   * Getter for jobs.
   * The list of the jobs belonging to the particular Virtual Warehouse.
   **/
  @JsonProperty("jobs")
  public List<VwDiagnosticDataJob> getJobs() {
    return jobs;
  }

  /**
   * Setter for jobs.
   * The list of the jobs belonging to the particular Virtual Warehouse.
   **/
  public void setJobs(List<VwDiagnosticDataJob> jobs) {
    this.jobs = jobs;
  }

  /**
   * Getter for nextToken.
   * The token to use when requesting the next set of results. If there are no additional results, the string is empty.
   **/
  @JsonProperty("nextToken")
  public String getNextToken() {
    return nextToken;
  }

  /**
   * Setter for nextToken.
   * The token to use when requesting the next set of results. If there are no additional results, the string is empty.
   **/
  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListVwDiagnosticDataJobsResponse listVwDiagnosticDataJobsResponse = (ListVwDiagnosticDataJobsResponse) o;
    if (!Objects.equals(this.jobs, listVwDiagnosticDataJobsResponse.jobs)) {
      return false;
    }
    if (!Objects.equals(this.nextToken, listVwDiagnosticDataJobsResponse.nextToken)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs, nextToken, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVwDiagnosticDataJobsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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

