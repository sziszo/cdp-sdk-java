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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for describe SSH public key.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-07-28T12:49:36.300-07:00")
public class DescribeSshPublicKeyRequest  {

  /**
   * The SSH public key CRN or its SHA256 fingerprint.
   **/
  private String crnOrFingerprint = null;

  /**
   * The CRN of the user or machine user that the SSH public key belongs to. If it is not included, it defaults to the actor making the request.
   **/
  private String actorCrn = null;

  /**
   * Getter for crnOrFingerprint.
   * The SSH public key CRN or its SHA256 fingerprint.
   **/
  @JsonProperty("crnOrFingerprint")
  public String getCrnOrFingerprint() {
    return crnOrFingerprint;
  }

  /**
   * Setter for crnOrFingerprint.
   * The SSH public key CRN or its SHA256 fingerprint.
   **/
  public void setCrnOrFingerprint(String crnOrFingerprint) {
    this.crnOrFingerprint = crnOrFingerprint;
  }

  /**
   * Getter for actorCrn.
   * The CRN of the user or machine user that the SSH public key belongs to. If it is not included, it defaults to the actor making the request.
   **/
  @JsonProperty("actorCrn")
  public String getActorCrn() {
    return actorCrn;
  }

  /**
   * Setter for actorCrn.
   * The CRN of the user or machine user that the SSH public key belongs to. If it is not included, it defaults to the actor making the request.
   **/
  public void setActorCrn(String actorCrn) {
    this.actorCrn = actorCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSshPublicKeyRequest describeSshPublicKeyRequest = (DescribeSshPublicKeyRequest) o;
    if (!Objects.equals(this.crnOrFingerprint, describeSshPublicKeyRequest.crnOrFingerprint)) {
      return false;
    }
    if (!Objects.equals(this.actorCrn, describeSshPublicKeyRequest.actorCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crnOrFingerprint, actorCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSshPublicKeyRequest {\n");
    sb.append("    crnOrFingerprint: ").append(toIndentedString(crnOrFingerprint)).append("\n");
    sb.append("    actorCrn: ").append(toIndentedString(actorCrn)).append("\n");
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

