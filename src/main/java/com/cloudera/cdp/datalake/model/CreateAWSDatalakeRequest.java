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
import com.cloudera.cdp.datalake.model.AWSConfigurationRequest;
import com.cloudera.cdp.datalake.model.DatalakeResourceTagRequest;
import com.cloudera.cdp.datalake.model.ImageRequest;
import java.util.*;

/**
 * Request object for create AWS datalake request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-21T12:39:05.672-07:00")
public class CreateAWSDatalakeRequest  {

  /**
   * The datalake name. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  private String datalakeName = null;

  /**
   * The environment name or CRN.
   **/
  private String environmentName = null;

  /**
   * AWS configuration.
   **/
  private AWSConfigurationRequest cloudProviderConfiguration = null;

  /**
   * The scale of the datalake. Allowed values are \"LIGHT_DUTY\" or \"MEDIUM_DUTY_HA\". Defaults to \"LIGHT_DUTY\" if not set.
   **/
  private String scale = null;

  /**
   * Tags to be added to Datalake related resources.
   **/
  private List<DatalakeResourceTagRequest> tags = new ArrayList<DatalakeResourceTagRequest>();

  /**
   * Cloudera Runtime version.
   **/
  private String runtime = null;

  /**
   * The image to use for the datalake. This must not be set if the runtime parameter is provided.
   **/
  private ImageRequest image = null;

  /**
   * Getter for datalakeName.
   * The datalake name. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The datalake name. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for environmentName.
   * The environment name or CRN.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The environment name or CRN.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for cloudProviderConfiguration.
   * AWS configuration.
   **/
  @JsonProperty("cloudProviderConfiguration")
  public AWSConfigurationRequest getCloudProviderConfiguration() {
    return cloudProviderConfiguration;
  }

  /**
   * Setter for cloudProviderConfiguration.
   * AWS configuration.
   **/
  public void setCloudProviderConfiguration(AWSConfigurationRequest cloudProviderConfiguration) {
    this.cloudProviderConfiguration = cloudProviderConfiguration;
  }

  /**
   * Getter for scale.
   * The scale of the datalake. Allowed values are \&quot;LIGHT_DUTY\&quot; or \&quot;MEDIUM_DUTY_HA\&quot;. Defaults to \&quot;LIGHT_DUTY\&quot; if not set.
   **/
  @JsonProperty("scale")
  public String getScale() {
    return scale;
  }

  /**
   * Setter for scale.
   * The scale of the datalake. Allowed values are \&quot;LIGHT_DUTY\&quot; or \&quot;MEDIUM_DUTY_HA\&quot;. Defaults to \&quot;LIGHT_DUTY\&quot; if not set.
   **/
  public void setScale(String scale) {
    this.scale = scale;
  }

  /**
   * Getter for tags.
   * Tags to be added to Datalake related resources.
   **/
  @JsonProperty("tags")
  public List<DatalakeResourceTagRequest> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags to be added to Datalake related resources.
   **/
  public void setTags(List<DatalakeResourceTagRequest> tags) {
    this.tags = tags;
  }

  /**
   * Getter for runtime.
   * Cloudera Runtime version.
   **/
  @JsonProperty("runtime")
  public String getRuntime() {
    return runtime;
  }

  /**
   * Setter for runtime.
   * Cloudera Runtime version.
   **/
  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  /**
   * Getter for image.
   * The image to use for the datalake. This must not be set if the runtime parameter is provided.
   **/
  @JsonProperty("image")
  public ImageRequest getImage() {
    return image;
  }

  /**
   * Setter for image.
   * The image to use for the datalake. This must not be set if the runtime parameter is provided.
   **/
  public void setImage(ImageRequest image) {
    this.image = image;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAWSDatalakeRequest createAWSDatalakeRequest = (CreateAWSDatalakeRequest) o;
    if (!Objects.equals(this.datalakeName, createAWSDatalakeRequest.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, createAWSDatalakeRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.cloudProviderConfiguration, createAWSDatalakeRequest.cloudProviderConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.scale, createAWSDatalakeRequest.scale)) {
      return false;
    }
    if (!Objects.equals(this.tags, createAWSDatalakeRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.runtime, createAWSDatalakeRequest.runtime)) {
      return false;
    }
    if (!Objects.equals(this.image, createAWSDatalakeRequest.image)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, environmentName, cloudProviderConfiguration, scale, tags, runtime, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAWSDatalakeRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    cloudProviderConfiguration: ").append(toIndentedString(cloudProviderConfiguration)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

