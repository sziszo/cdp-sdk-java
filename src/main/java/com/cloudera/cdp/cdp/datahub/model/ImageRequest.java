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

/**
 * The details of the image used for cluster instances.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-01-18T15:00:48.185-08:00")
public class ImageRequest  {

  /**
   * The ID of the image used for cluster instances. This is generated by the cloud provider to uniquely identify the image.
   **/
  private String id = null;

  /**
   * The image catalog name.
   **/
  private String catalogName = null;

  /**
   * Getter for id.
   * The ID of the image used for cluster instances. This is generated by the cloud provider to uniquely identify the image.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The ID of the image used for cluster instances. This is generated by the cloud provider to uniquely identify the image.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for catalogName.
   * The image catalog name.
   **/
  @JsonProperty("catalogName")
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Setter for catalogName.
   * The image catalog name.
   **/
  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageRequest imageRequest = (ImageRequest) o;
    if (!Objects.equals(this.id, imageRequest.id)) {
      return false;
    }
    if (!Objects.equals(this.catalogName, imageRequest.catalogName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, catalogName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
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

