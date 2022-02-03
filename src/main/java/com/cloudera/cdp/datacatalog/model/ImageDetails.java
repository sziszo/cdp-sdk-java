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

package com.cloudera.cdp.datacatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * The details of the image used for cluster instances.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-02-02T18:44:24.210-08:00")
public class ImageDetails  {

  /**
   * The name of the image used for cluster instances.
   **/
  private String name = null;

  /**
   * The ID of the image used for cluster instances. This is internally generated by the cloud provider to uniquely identify the image.
   **/
  private String id = null;

  /**
   * The image catalog URL.
   **/
  private String catalogUrl = null;

  /**
   * The image catalog name.
   **/
  private String catalogName = null;

  /**
   * Getter for name.
   * The name of the image used for cluster instances.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the image used for cluster instances.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for id.
   * The ID of the image used for cluster instances. This is internally generated by the cloud provider to uniquely identify the image.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The ID of the image used for cluster instances. This is internally generated by the cloud provider to uniquely identify the image.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for catalogUrl.
   * The image catalog URL.
   **/
  @JsonProperty("catalogUrl")
  public String getCatalogUrl() {
    return catalogUrl;
  }

  /**
   * Setter for catalogUrl.
   * The image catalog URL.
   **/
  public void setCatalogUrl(String catalogUrl) {
    this.catalogUrl = catalogUrl;
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
    ImageDetails imageDetails = (ImageDetails) o;
    if (!Objects.equals(this.name, imageDetails.name)) {
      return false;
    }
    if (!Objects.equals(this.id, imageDetails.id)) {
      return false;
    }
    if (!Objects.equals(this.catalogUrl, imageDetails.catalogUrl)) {
      return false;
    }
    if (!Objects.equals(this.catalogName, imageDetails.catalogName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, catalogUrl, catalogName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    catalogUrl: ").append(toIndentedString(catalogUrl)).append("\n");
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

