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
import com.cloudera.cdp.dw.model.AutoscalingOptionsCreateRequest;
import com.cloudera.cdp.dw.model.ImpalaHASettingsCreateRequest;
import com.cloudera.cdp.dw.model.ImpalaOptionsCreateRequest;
import com.cloudera.cdp.dw.model.QueryIsolationOptionsRequest;
import com.cloudera.cdp.dw.model.ServiceConfigReq;
import com.cloudera.cdp.dw.model.TagRequest;
import java.util.*;

/**
 * Request object for the createVw method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-30T17:23:15.372-07:00")
public class CreateVwRequest  {

  /**
   * ID of cluster where Virtual Warehouse should be created.
   **/
  private String clusterId = null;

  /**
   * ID of Database Catalog that the Virtual Warehouse should be attached to.
   **/
  private String dbcId = null;

  /**
   * Type of Virtual Warehouse to be created.
   **/
  private String vwType = null;

  /**
   * Name of the Virtual Warehouse.
   **/
  private String name = null;

  /**
   * version of the Virtual Warehouse.
   **/
  private String imageVersion = "";

  /**
   * Name of configuration template to use.
   **/
  private String template = null;

  /**
   * Node Count per compute cluster. Implies 'custom' template, even if you pass template explicitly.
   **/
  private Integer nodeCount = 0;

  /**
   * This feature works only for AWS cluster type. An availability zone to host compute instances. If not specified, defaults to a randomly selected availability zone inferred from available subnets. In order to query possible options, see \"availabilityZones\" field of describe-cluster or list-clusters command response.
   **/
  private String availabilityZone = null;

  /**
   * Enable Unified Analytics. In the case of Hive Virtual Warehouses, this cannot be provided, because this value is inferred. In the case of Impala, this can be set. Passing --query-isolation-options will be considered only if this flag is set to true. If Unified Analytics is enabled then the \"enableShutdownOfCoordinator\" in --impala-ha-settings is explicitly disabled (ignored) and should not be provided, furthermore the \"highAvailabilityMode\" in --impala-ha-settings cannot be set to ACTIVE_ACTIVE.
   **/
  private Boolean enableUnifiedAnalytics = null;

  /**
   * Impala specific options. It cannot be provided for Virtual Warehouse types other than Impala.
   **/
  private ImpalaOptionsCreateRequest impalaOptions = null;

  /**
   * High Availability settings for the Impala Virtual Warehouse. NOTE that in --autoscaling object you should avoid using the same deprecated properties because only the --impala-ha-setting properties will be considered if any of its values are set.
   **/
  private ImpalaHASettingsCreateRequest impalaHaSettings = null;

  /**
   * Autoscaling settings for the Virtual Warehouse.
   **/
  private AutoscalingOptionsCreateRequest autoscaling = null;

  /**
   * Configuration settings for the Virtual Warehouse.
   **/
  private ServiceConfigReq config = null;

  /**
   * Query isolation settings for the Virtual Warehouse. For Impala this value will be considered only if Unified Analytics is enabled.
   **/
  private QueryIsolationOptionsRequest queryIsolationOptions = null;

  /**
   * Tags associated with the resources.
   **/
  private List<TagRequest> tags = new ArrayList<TagRequest>();

  /**
   * Sets the authentication mode to use by Hive Server: * `LDAP` * `KERBEROS` Default: `LDAP` if not specified
   **/
  private String hiveAuthenticationMode = null;

  /**
   * Value of 'true' automatically configures the Virtual Warehouse to support JWTs issues by the CDP JWT token provider.  Value of 'false' does not enable JWT auth on the Virtual Warehouse.  If this field is not specified, it defaults to 'false'.
   **/
  private Boolean platformJwtAuth = false;

  /**
   * Getter for clusterId.
   * ID of cluster where Virtual Warehouse should be created.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of cluster where Virtual Warehouse should be created.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for dbcId.
   * ID of Database Catalog that the Virtual Warehouse should be attached to.
   **/
  @JsonProperty("dbcId")
  public String getDbcId() {
    return dbcId;
  }

  /**
   * Setter for dbcId.
   * ID of Database Catalog that the Virtual Warehouse should be attached to.
   **/
  public void setDbcId(String dbcId) {
    this.dbcId = dbcId;
  }

  /**
   * Getter for vwType.
   * Type of Virtual Warehouse to be created.
   **/
  @JsonProperty("vwType")
  public String getVwType() {
    return vwType;
  }

  /**
   * Setter for vwType.
   * Type of Virtual Warehouse to be created.
   **/
  public void setVwType(String vwType) {
    this.vwType = vwType;
  }

  /**
   * Getter for name.
   * Name of the Virtual Warehouse.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the Virtual Warehouse.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for imageVersion.
   * version of the Virtual Warehouse.
   **/
  @JsonProperty("imageVersion")
  public String getImageVersion() {
    return imageVersion;
  }

  /**
   * Setter for imageVersion.
   * version of the Virtual Warehouse.
   **/
  public void setImageVersion(String imageVersion) {
    this.imageVersion = imageVersion;
  }

  /**
   * Getter for template.
   * Name of configuration template to use.
   **/
  @JsonProperty("template")
  public String getTemplate() {
    return template;
  }

  /**
   * Setter for template.
   * Name of configuration template to use.
   **/
  public void setTemplate(String template) {
    this.template = template;
  }

  /**
   * Getter for nodeCount.
   * Node Count per compute cluster. Implies &#39;custom&#39; template, even if you pass template explicitly.
   **/
  @JsonProperty("nodeCount")
  public Integer getNodeCount() {
    return nodeCount;
  }

  /**
   * Setter for nodeCount.
   * Node Count per compute cluster. Implies &#39;custom&#39; template, even if you pass template explicitly.
   **/
  public void setNodeCount(Integer nodeCount) {
    this.nodeCount = nodeCount;
  }

  /**
   * Getter for availabilityZone.
   * This feature works only for AWS cluster type. An availability zone to host compute instances. If not specified, defaults to a randomly selected availability zone inferred from available subnets. In order to query possible options, see \&quot;availabilityZones\&quot; field of describe-cluster or list-clusters command response.
   **/
  @JsonProperty("availabilityZone")
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * Setter for availabilityZone.
   * This feature works only for AWS cluster type. An availability zone to host compute instances. If not specified, defaults to a randomly selected availability zone inferred from available subnets. In order to query possible options, see \&quot;availabilityZones\&quot; field of describe-cluster or list-clusters command response.
   **/
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  /**
   * Getter for enableUnifiedAnalytics.
   * Enable Unified Analytics. In the case of Hive Virtual Warehouses, this cannot be provided, because this value is inferred. In the case of Impala, this can be set. Passing --query-isolation-options will be considered only if this flag is set to true. If Unified Analytics is enabled then the \&quot;enableShutdownOfCoordinator\&quot; in --impala-ha-settings is explicitly disabled (ignored) and should not be provided, furthermore the \&quot;highAvailabilityMode\&quot; in --impala-ha-settings cannot be set to ACTIVE_ACTIVE.
   **/
  @JsonProperty("enableUnifiedAnalytics")
  public Boolean getEnableUnifiedAnalytics() {
    return enableUnifiedAnalytics;
  }

  /**
   * Setter for enableUnifiedAnalytics.
   * Enable Unified Analytics. In the case of Hive Virtual Warehouses, this cannot be provided, because this value is inferred. In the case of Impala, this can be set. Passing --query-isolation-options will be considered only if this flag is set to true. If Unified Analytics is enabled then the \&quot;enableShutdownOfCoordinator\&quot; in --impala-ha-settings is explicitly disabled (ignored) and should not be provided, furthermore the \&quot;highAvailabilityMode\&quot; in --impala-ha-settings cannot be set to ACTIVE_ACTIVE.
   **/
  public void setEnableUnifiedAnalytics(Boolean enableUnifiedAnalytics) {
    this.enableUnifiedAnalytics = enableUnifiedAnalytics;
  }

  /**
   * Getter for impalaOptions.
   * Impala specific options. It cannot be provided for Virtual Warehouse types other than Impala.
   **/
  @JsonProperty("impalaOptions")
  public ImpalaOptionsCreateRequest getImpalaOptions() {
    return impalaOptions;
  }

  /**
   * Setter for impalaOptions.
   * Impala specific options. It cannot be provided for Virtual Warehouse types other than Impala.
   **/
  public void setImpalaOptions(ImpalaOptionsCreateRequest impalaOptions) {
    this.impalaOptions = impalaOptions;
  }

  /**
   * Getter for impalaHaSettings.
   * High Availability settings for the Impala Virtual Warehouse. NOTE that in --autoscaling object you should avoid using the same deprecated properties because only the --impala-ha-setting properties will be considered if any of its values are set.
   **/
  @JsonProperty("impalaHaSettings")
  public ImpalaHASettingsCreateRequest getImpalaHaSettings() {
    return impalaHaSettings;
  }

  /**
   * Setter for impalaHaSettings.
   * High Availability settings for the Impala Virtual Warehouse. NOTE that in --autoscaling object you should avoid using the same deprecated properties because only the --impala-ha-setting properties will be considered if any of its values are set.
   **/
  public void setImpalaHaSettings(ImpalaHASettingsCreateRequest impalaHaSettings) {
    this.impalaHaSettings = impalaHaSettings;
  }

  /**
   * Getter for autoscaling.
   * Autoscaling settings for the Virtual Warehouse.
   **/
  @JsonProperty("autoscaling")
  public AutoscalingOptionsCreateRequest getAutoscaling() {
    return autoscaling;
  }

  /**
   * Setter for autoscaling.
   * Autoscaling settings for the Virtual Warehouse.
   **/
  public void setAutoscaling(AutoscalingOptionsCreateRequest autoscaling) {
    this.autoscaling = autoscaling;
  }

  /**
   * Getter for config.
   * Configuration settings for the Virtual Warehouse.
   **/
  @JsonProperty("config")
  public ServiceConfigReq getConfig() {
    return config;
  }

  /**
   * Setter for config.
   * Configuration settings for the Virtual Warehouse.
   **/
  public void setConfig(ServiceConfigReq config) {
    this.config = config;
  }

  /**
   * Getter for queryIsolationOptions.
   * Query isolation settings for the Virtual Warehouse. For Impala this value will be considered only if Unified Analytics is enabled.
   **/
  @JsonProperty("queryIsolationOptions")
  public QueryIsolationOptionsRequest getQueryIsolationOptions() {
    return queryIsolationOptions;
  }

  /**
   * Setter for queryIsolationOptions.
   * Query isolation settings for the Virtual Warehouse. For Impala this value will be considered only if Unified Analytics is enabled.
   **/
  public void setQueryIsolationOptions(QueryIsolationOptionsRequest queryIsolationOptions) {
    this.queryIsolationOptions = queryIsolationOptions;
  }

  /**
   * Getter for tags.
   * Tags associated with the resources.
   **/
  @JsonProperty("tags")
  public List<TagRequest> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags associated with the resources.
   **/
  public void setTags(List<TagRequest> tags) {
    this.tags = tags;
  }

  /**
   * Getter for hiveAuthenticationMode.
   * Sets the authentication mode to use by Hive Server: * &#x60;LDAP&#x60; * &#x60;KERBEROS&#x60; Default: &#x60;LDAP&#x60; if not specified
   **/
  @JsonProperty("hiveAuthenticationMode")
  public String getHiveAuthenticationMode() {
    return hiveAuthenticationMode;
  }

  /**
   * Setter for hiveAuthenticationMode.
   * Sets the authentication mode to use by Hive Server: * &#x60;LDAP&#x60; * &#x60;KERBEROS&#x60; Default: &#x60;LDAP&#x60; if not specified
   **/
  public void setHiveAuthenticationMode(String hiveAuthenticationMode) {
    this.hiveAuthenticationMode = hiveAuthenticationMode;
  }

  /**
   * Getter for platformJwtAuth.
   * Value of &#39;true&#39; automatically configures the Virtual Warehouse to support JWTs issues by the CDP JWT token provider.  Value of &#39;false&#39; does not enable JWT auth on the Virtual Warehouse.  If this field is not specified, it defaults to &#39;false&#39;.
   **/
  @JsonProperty("platformJwtAuth")
  public Boolean getPlatformJwtAuth() {
    return platformJwtAuth;
  }

  /**
   * Setter for platformJwtAuth.
   * Value of &#39;true&#39; automatically configures the Virtual Warehouse to support JWTs issues by the CDP JWT token provider.  Value of &#39;false&#39; does not enable JWT auth on the Virtual Warehouse.  If this field is not specified, it defaults to &#39;false&#39;.
   **/
  public void setPlatformJwtAuth(Boolean platformJwtAuth) {
    this.platformJwtAuth = platformJwtAuth;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVwRequest createVwRequest = (CreateVwRequest) o;
    if (!Objects.equals(this.clusterId, createVwRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.dbcId, createVwRequest.dbcId)) {
      return false;
    }
    if (!Objects.equals(this.vwType, createVwRequest.vwType)) {
      return false;
    }
    if (!Objects.equals(this.name, createVwRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.imageVersion, createVwRequest.imageVersion)) {
      return false;
    }
    if (!Objects.equals(this.template, createVwRequest.template)) {
      return false;
    }
    if (!Objects.equals(this.nodeCount, createVwRequest.nodeCount)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZone, createVwRequest.availabilityZone)) {
      return false;
    }
    if (!Objects.equals(this.enableUnifiedAnalytics, createVwRequest.enableUnifiedAnalytics)) {
      return false;
    }
    if (!Objects.equals(this.impalaOptions, createVwRequest.impalaOptions)) {
      return false;
    }
    if (!Objects.equals(this.impalaHaSettings, createVwRequest.impalaHaSettings)) {
      return false;
    }
    if (!Objects.equals(this.autoscaling, createVwRequest.autoscaling)) {
      return false;
    }
    if (!Objects.equals(this.config, createVwRequest.config)) {
      return false;
    }
    if (!Objects.equals(this.queryIsolationOptions, createVwRequest.queryIsolationOptions)) {
      return false;
    }
    if (!Objects.equals(this.tags, createVwRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.hiveAuthenticationMode, createVwRequest.hiveAuthenticationMode)) {
      return false;
    }
    if (!Objects.equals(this.platformJwtAuth, createVwRequest.platformJwtAuth)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, dbcId, vwType, name, imageVersion, template, nodeCount, availabilityZone, enableUnifiedAnalytics, impalaOptions, impalaHaSettings, autoscaling, config, queryIsolationOptions, tags, hiveAuthenticationMode, platformJwtAuth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVwRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    dbcId: ").append(toIndentedString(dbcId)).append("\n");
    sb.append("    vwType: ").append(toIndentedString(vwType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    enableUnifiedAnalytics: ").append(toIndentedString(enableUnifiedAnalytics)).append("\n");
    sb.append("    impalaOptions: ").append(toIndentedString(impalaOptions)).append("\n");
    sb.append("    impalaHaSettings: ").append(toIndentedString(impalaHaSettings)).append("\n");
    sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    queryIsolationOptions: ").append(toIndentedString(queryIsolationOptions)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    hiveAuthenticationMode: ").append(toIndentedString(hiveAuthenticationMode)).append("\n");
    sb.append("    platformJwtAuth: ").append(toIndentedString(platformJwtAuth)).append("\n");
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

