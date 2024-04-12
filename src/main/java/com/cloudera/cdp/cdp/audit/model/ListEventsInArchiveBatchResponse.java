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

package com.cloudera.cdp.audit.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.audit.model.CdpAuditEvent;
import java.util.*;

/**
 * Response from listing events contained in a single archive batch.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-11T13:44:53.622-07:00")
public class ListEventsInArchiveBatchResponse extends CdpResponse {

  /**
   * The audit events in the archive batch.
   **/
  private List<CdpAuditEvent> auditEvents = new ArrayList<CdpAuditEvent>();

  /**
   * Getter for auditEvents.
   * The audit events in the archive batch.
   **/
  @JsonProperty("auditEvents")
  public List<CdpAuditEvent> getAuditEvents() {
    return auditEvents;
  }

  /**
   * Setter for auditEvents.
   * The audit events in the archive batch.
   **/
  public void setAuditEvents(List<CdpAuditEvent> auditEvents) {
    this.auditEvents = auditEvents;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEventsInArchiveBatchResponse listEventsInArchiveBatchResponse = (ListEventsInArchiveBatchResponse) o;
    if (!Objects.equals(this.auditEvents, listEventsInArchiveBatchResponse.auditEvents)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditEvents, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEventsInArchiveBatchResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    auditEvents: ").append(toIndentedString(auditEvents)).append("\n");
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

