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
import com.cloudera.cdp.df.model.EventSummary;
import java.util.*;

/**
 * A response to list event history for deployment
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-10-06T10:34:45.194-07:00")
public class ListDeploymentEventsResponse extends CdpResponse {

  /**
   * The events
   **/
  private List<EventSummary> eventSummaries = new ArrayList<EventSummary>();

  /**
   * Getter for eventSummaries.
   * The events
   **/
  @JsonProperty("eventSummaries")
  public List<EventSummary> getEventSummaries() {
    return eventSummaries;
  }

  /**
   * Setter for eventSummaries.
   * The events
   **/
  public void setEventSummaries(List<EventSummary> eventSummaries) {
    this.eventSummaries = eventSummaries;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDeploymentEventsResponse listDeploymentEventsResponse = (ListDeploymentEventsResponse) o;
    if (!Objects.equals(this.eventSummaries, listDeploymentEventsResponse.eventSummaries)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSummaries, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDeploymentEventsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    eventSummaries: ").append(toIndentedString(eventSummaries)).append("\n");
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

