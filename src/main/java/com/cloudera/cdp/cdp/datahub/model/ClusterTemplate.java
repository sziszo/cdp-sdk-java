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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.DatahubResourceTag;
import java.util.*;

/**
 * Information about a cluster template.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-02-29T13:23:31.919-08:00")
public class ClusterTemplate  {

  /**
   * The name of the cluster template.
   **/
  private String clusterTemplateName = null;

  /**
   * The CRN of the cluster template.
   **/
  private String crn = null;

  /**
   * The description of the cluster template.
   **/
  private String description = null;

  /**
   * The instance group count of the cluster.
   **/
  private Integer instanceGroupCount = null;

  /**
   * The status of the cluster template.
   **/
  private String status = null;

  /**
   * Tags added to the cluster template.
   **/
  private List<DatahubResourceTag> tags = new ArrayList<DatahubResourceTag>();

  /**
   * The content of the cluster template.
   **/
  private String clusterTemplateContent = null;

  /**
   * Getter for clusterTemplateName.
   * The name of the cluster template.
   **/
  @JsonProperty("clusterTemplateName")
  public String getClusterTemplateName() {
    return clusterTemplateName;
  }

  /**
   * Setter for clusterTemplateName.
   * The name of the cluster template.
   **/
  public void setClusterTemplateName(String clusterTemplateName) {
    this.clusterTemplateName = clusterTemplateName;
  }

  /**
   * Getter for crn.
   * The CRN of the cluster template.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the cluster template.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for description.
   * The description of the cluster template.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the cluster template.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for instanceGroupCount.
   * The instance group count of the cluster.
   **/
  @JsonProperty("instanceGroupCount")
  public Integer getInstanceGroupCount() {
    return instanceGroupCount;
  }

  /**
   * Setter for instanceGroupCount.
   * The instance group count of the cluster.
   **/
  public void setInstanceGroupCount(Integer instanceGroupCount) {
    this.instanceGroupCount = instanceGroupCount;
  }

  /**
   * Getter for status.
   * The status of the cluster template.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the cluster template.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for tags.
   * Tags added to the cluster template.
   **/
  @JsonProperty("tags")
  public List<DatahubResourceTag> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags added to the cluster template.
   **/
  public void setTags(List<DatahubResourceTag> tags) {
    this.tags = tags;
  }

  /**
   * Getter for clusterTemplateContent.
   * The content of the cluster template.
   **/
  @JsonProperty("clusterTemplateContent")
  public String getClusterTemplateContent() {
    return clusterTemplateContent;
  }

  /**
   * Setter for clusterTemplateContent.
   * The content of the cluster template.
   **/
  public void setClusterTemplateContent(String clusterTemplateContent) {
    this.clusterTemplateContent = clusterTemplateContent;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterTemplate clusterTemplate = (ClusterTemplate) o;
    if (!Objects.equals(this.clusterTemplateName, clusterTemplate.clusterTemplateName)) {
      return false;
    }
    if (!Objects.equals(this.crn, clusterTemplate.crn)) {
      return false;
    }
    if (!Objects.equals(this.description, clusterTemplate.description)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupCount, clusterTemplate.instanceGroupCount)) {
      return false;
    }
    if (!Objects.equals(this.status, clusterTemplate.status)) {
      return false;
    }
    if (!Objects.equals(this.tags, clusterTemplate.tags)) {
      return false;
    }
    if (!Objects.equals(this.clusterTemplateContent, clusterTemplate.clusterTemplateContent)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterTemplateName, crn, description, instanceGroupCount, status, tags, clusterTemplateContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterTemplate {\n");
    sb.append("    clusterTemplateName: ").append(toIndentedString(clusterTemplateName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instanceGroupCount: ").append(toIndentedString(instanceGroupCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    clusterTemplateContent: ").append(toIndentedString(clusterTemplateContent)).append("\n");
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

