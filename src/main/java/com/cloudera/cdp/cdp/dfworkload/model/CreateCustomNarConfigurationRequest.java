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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for creating a custom NAR configuration.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-05-09T12:44:58.634-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class CreateCustomNarConfigurationRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The username used to access the storage location
   **/
  private String username = null;

  /**
   * The password used to access the storage location
   **/
  private String password = null;

  /**
   * The storage location, such as an S3 bucket or ADLS container
   **/
  private String storageLocation = null;

  /**
   * The version of the configuration
   **/
  private Integer configurationVersion = null;

  /**
   * The CRN of the project.
   **/
  private String projectCrn = null;

  /**
   * Getter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for username.
   * The username used to access the storage location
   **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * Setter for username.
   * The username used to access the storage location
   **/
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Getter for password.
   * The password used to access the storage location
   **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * Setter for password.
   * The password used to access the storage location
   **/
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Getter for storageLocation.
   * The storage location, such as an S3 bucket or ADLS container
   **/
  @JsonProperty("storageLocation")
  public String getStorageLocation() {
    return storageLocation;
  }

  /**
   * Setter for storageLocation.
   * The storage location, such as an S3 bucket or ADLS container
   **/
  public void setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
  }

  /**
   * Getter for configurationVersion.
   * The version of the configuration
   **/
  @JsonProperty("configurationVersion")
  public Integer getConfigurationVersion() {
    return configurationVersion;
  }

  /**
   * Setter for configurationVersion.
   * The version of the configuration
   **/
  public void setConfigurationVersion(Integer configurationVersion) {
    this.configurationVersion = configurationVersion;
  }

  /**
   * Getter for projectCrn.
   * The CRN of the project.
   **/
  @JsonProperty("projectCrn")
  public String getProjectCrn() {
    return projectCrn;
  }

  /**
   * Setter for projectCrn.
   * The CRN of the project.
   **/
  public void setProjectCrn(String projectCrn) {
    this.projectCrn = projectCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomNarConfigurationRequest createCustomNarConfigurationRequest = (CreateCustomNarConfigurationRequest) o;
    if (!Objects.equals(this.environmentCrn, createCustomNarConfigurationRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.username, createCustomNarConfigurationRequest.username)) {
      return false;
    }
    if (!Objects.equals(this.password, createCustomNarConfigurationRequest.password)) {
      return false;
    }
    if (!Objects.equals(this.storageLocation, createCustomNarConfigurationRequest.storageLocation)) {
      return false;
    }
    if (!Objects.equals(this.configurationVersion, createCustomNarConfigurationRequest.configurationVersion)) {
      return false;
    }
    if (!Objects.equals(this.projectCrn, createCustomNarConfigurationRequest.projectCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, username, password, storageLocation, configurationVersion, projectCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomNarConfigurationRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    projectCrn: ").append(toIndentedString(projectCrn)).append("\n");
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

