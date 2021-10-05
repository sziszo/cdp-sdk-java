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
import com.cloudera.cdp.audit.model.ActorIdentity;
import com.cloudera.cdp.audit.model.ApiRequestEvent;
import com.cloudera.cdp.audit.model.CdpServiceEvent;
import com.cloudera.cdp.audit.model.InteractiveLoginEvent;

/**
 * The model for an audit event.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-10-05T14:03:45.738-07:00")
public class CdpAuditEvent  {

  /**
   * The version of the event structure.
   **/
  private String version = null;

  /**
   * UUID for this event.
   **/
  private String id = null;

  /**
   * The source service of the event. It must be the name of a service as enumerated in the CRN definition.
   **/
  private String eventSource = null;

  /**
   * The name of the event. Each source defines all its event names, and a name must be unique for its source.
   **/
  private String eventName = null;

  /**
   * The Unix timestamp, in milliseconds (UTC), when the event occurred.
   **/
  private Long timestamp = null;

  /**
   * The actor who initiated this event.
   **/
  private ActorIdentity actorIdentity = null;

  /**
   * Account id in which this event occurred.
   **/
  private String accountId = null;

  /**
   * Id of the request that initiated this event. Optional.
   **/
  private String requestId = null;

  /**
   * Optional result code.
   **/
  private String resultCode = null;

  /**
   * Optional result message, a short message (about one sentence) describing the result.
   **/
  private String resultMessage = null;

  /**
   * Information originating from an API request.
   **/
  private ApiRequestEvent apiRequestEvent = null;

  /**
   * Information originating from an event generated by a CDP service.
   **/
  private CdpServiceEvent cdpServiceEvent = null;

  /**
   * Information originating from a login event.
   **/
  private InteractiveLoginEvent interactiveLoginEvent = null;

  /**
   * Getter for version.
   * The version of the event structure.
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The version of the event structure.
   **/
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Getter for id.
   * UUID for this event.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * UUID for this event.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for eventSource.
   * The source service of the event. It must be the name of a service as enumerated in the CRN definition.
   **/
  @JsonProperty("eventSource")
  public String getEventSource() {
    return eventSource;
  }

  /**
   * Setter for eventSource.
   * The source service of the event. It must be the name of a service as enumerated in the CRN definition.
   **/
  public void setEventSource(String eventSource) {
    this.eventSource = eventSource;
  }

  /**
   * Getter for eventName.
   * The name of the event. Each source defines all its event names, and a name must be unique for its source.
   **/
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }

  /**
   * Setter for eventName.
   * The name of the event. Each source defines all its event names, and a name must be unique for its source.
   **/
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  /**
   * Getter for timestamp.
   * The Unix timestamp, in milliseconds (UTC), when the event occurred.
   **/
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }

  /**
   * Setter for timestamp.
   * The Unix timestamp, in milliseconds (UTC), when the event occurred.
   **/
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Getter for actorIdentity.
   * The actor who initiated this event.
   **/
  @JsonProperty("actorIdentity")
  public ActorIdentity getActorIdentity() {
    return actorIdentity;
  }

  /**
   * Setter for actorIdentity.
   * The actor who initiated this event.
   **/
  public void setActorIdentity(ActorIdentity actorIdentity) {
    this.actorIdentity = actorIdentity;
  }

  /**
   * Getter for accountId.
   * Account id in which this event occurred.
   **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  /**
   * Setter for accountId.
   * Account id in which this event occurred.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Getter for requestId.
   * Id of the request that initiated this event. Optional.
   **/
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }

  /**
   * Setter for requestId.
   * Id of the request that initiated this event. Optional.
   **/
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Getter for resultCode.
   * Optional result code.
   **/
  @JsonProperty("resultCode")
  public String getResultCode() {
    return resultCode;
  }

  /**
   * Setter for resultCode.
   * Optional result code.
   **/
  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  /**
   * Getter for resultMessage.
   * Optional result message, a short message (about one sentence) describing the result.
   **/
  @JsonProperty("resultMessage")
  public String getResultMessage() {
    return resultMessage;
  }

  /**
   * Setter for resultMessage.
   * Optional result message, a short message (about one sentence) describing the result.
   **/
  public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
  }

  /**
   * Getter for apiRequestEvent.
   * Information originating from an API request.
   **/
  @JsonProperty("apiRequestEvent")
  public ApiRequestEvent getApiRequestEvent() {
    return apiRequestEvent;
  }

  /**
   * Setter for apiRequestEvent.
   * Information originating from an API request.
   **/
  public void setApiRequestEvent(ApiRequestEvent apiRequestEvent) {
    this.apiRequestEvent = apiRequestEvent;
  }

  /**
   * Getter for cdpServiceEvent.
   * Information originating from an event generated by a CDP service.
   **/
  @JsonProperty("cdpServiceEvent")
  public CdpServiceEvent getCdpServiceEvent() {
    return cdpServiceEvent;
  }

  /**
   * Setter for cdpServiceEvent.
   * Information originating from an event generated by a CDP service.
   **/
  public void setCdpServiceEvent(CdpServiceEvent cdpServiceEvent) {
    this.cdpServiceEvent = cdpServiceEvent;
  }

  /**
   * Getter for interactiveLoginEvent.
   * Information originating from a login event.
   **/
  @JsonProperty("interactiveLoginEvent")
  public InteractiveLoginEvent getInteractiveLoginEvent() {
    return interactiveLoginEvent;
  }

  /**
   * Setter for interactiveLoginEvent.
   * Information originating from a login event.
   **/
  public void setInteractiveLoginEvent(InteractiveLoginEvent interactiveLoginEvent) {
    this.interactiveLoginEvent = interactiveLoginEvent;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdpAuditEvent cdpAuditEvent = (CdpAuditEvent) o;
    if (!Objects.equals(this.version, cdpAuditEvent.version)) {
      return false;
    }
    if (!Objects.equals(this.id, cdpAuditEvent.id)) {
      return false;
    }
    if (!Objects.equals(this.eventSource, cdpAuditEvent.eventSource)) {
      return false;
    }
    if (!Objects.equals(this.eventName, cdpAuditEvent.eventName)) {
      return false;
    }
    if (!Objects.equals(this.timestamp, cdpAuditEvent.timestamp)) {
      return false;
    }
    if (!Objects.equals(this.actorIdentity, cdpAuditEvent.actorIdentity)) {
      return false;
    }
    if (!Objects.equals(this.accountId, cdpAuditEvent.accountId)) {
      return false;
    }
    if (!Objects.equals(this.requestId, cdpAuditEvent.requestId)) {
      return false;
    }
    if (!Objects.equals(this.resultCode, cdpAuditEvent.resultCode)) {
      return false;
    }
    if (!Objects.equals(this.resultMessage, cdpAuditEvent.resultMessage)) {
      return false;
    }
    if (!Objects.equals(this.apiRequestEvent, cdpAuditEvent.apiRequestEvent)) {
      return false;
    }
    if (!Objects.equals(this.cdpServiceEvent, cdpAuditEvent.cdpServiceEvent)) {
      return false;
    }
    if (!Objects.equals(this.interactiveLoginEvent, cdpAuditEvent.interactiveLoginEvent)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, id, eventSource, eventName, timestamp, actorIdentity, accountId, requestId, resultCode, resultMessage, apiRequestEvent, cdpServiceEvent, interactiveLoginEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdpAuditEvent {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    actorIdentity: ").append(toIndentedString(actorIdentity)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultMessage: ").append(toIndentedString(resultMessage)).append("\n");
    sb.append("    apiRequestEvent: ").append(toIndentedString(apiRequestEvent)).append("\n");
    sb.append("    cdpServiceEvent: ").append(toIndentedString(cdpServiceEvent)).append("\n");
    sb.append("    interactiveLoginEvent: ").append(toIndentedString(interactiveLoginEvent)).append("\n");
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

