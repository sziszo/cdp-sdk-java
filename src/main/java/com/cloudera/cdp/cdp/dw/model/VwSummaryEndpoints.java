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

/**
 * Endpoints for accessing the Virtual Warehouse.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-14T10:47:17.249-07:00")
public class VwSummaryEndpoints  {

  /**
   * JDBC URL for Hive Virtual Warehouses.
   **/
  private String hiveJdbc = null;

  /**
   * JDBC URL for Impala Virtual Warehouses.
   **/
  private String impalaJdbc = null;

  /**
   * JDBC URL for Impala Virtual Warehouses with Kerberos authentication.
   **/
  private String impalaKerberosJdbc = null;

  /**
   * FENG JDBC URL for Impala Virtual Warehouses.
   **/
  private String impalaFENGJdbc = null;

  /**
   * Command to use impala-shell for Impala Virtual Warehouses.
   **/
  private String impalaShell = null;

  /**
   * Command to use impala-shell for Unified Analytics
   **/
  private String fengImpalaShell = null;

  /**
   * Command to use impala-shell for Impala Virtual Warehouses with Kerberos authentication.
   **/
  private String kerberosImpalaShell = null;

  /**
   * URL of Hue for both Hive and Impala Virtual Warehouses.
   **/
  private String hue = null;

  /**
   * URL of Data Analytics Studio for Hive Virtual Warehouses.
   **/
  private String das = null;

  /**
   * Hostname for clients to use when connecting to the VW.
   **/
  private String hostname = null;

  /**
   * Port for clients to use when connecting to the VW.
   **/
  private Integer port = null;

  /**
   * Generic semi-colon delimited list of key-value pairs that contain all necessary information for clients to construct a connection to this Virtual Warehouse using JWTs as the authentication method.
   **/
  private String jwtConnectionString = null;

  /**
   * When platform JWT authentication is enabled, contains a URL where a JWT token can be generated by the CDP JWT token provider.
   **/
  private String jwtTokenGenUrl = null;

  /**
   * Getter for hiveJdbc.
   * JDBC URL for Hive Virtual Warehouses.
   **/
  @JsonProperty("hiveJdbc")
  public String getHiveJdbc() {
    return hiveJdbc;
  }

  /**
   * Setter for hiveJdbc.
   * JDBC URL for Hive Virtual Warehouses.
   **/
  public void setHiveJdbc(String hiveJdbc) {
    this.hiveJdbc = hiveJdbc;
  }

  /**
   * Getter for impalaJdbc.
   * JDBC URL for Impala Virtual Warehouses.
   **/
  @JsonProperty("impalaJdbc")
  public String getImpalaJdbc() {
    return impalaJdbc;
  }

  /**
   * Setter for impalaJdbc.
   * JDBC URL for Impala Virtual Warehouses.
   **/
  public void setImpalaJdbc(String impalaJdbc) {
    this.impalaJdbc = impalaJdbc;
  }

  /**
   * Getter for impalaKerberosJdbc.
   * JDBC URL for Impala Virtual Warehouses with Kerberos authentication.
   **/
  @JsonProperty("impalaKerberosJdbc")
  public String getImpalaKerberosJdbc() {
    return impalaKerberosJdbc;
  }

  /**
   * Setter for impalaKerberosJdbc.
   * JDBC URL for Impala Virtual Warehouses with Kerberos authentication.
   **/
  public void setImpalaKerberosJdbc(String impalaKerberosJdbc) {
    this.impalaKerberosJdbc = impalaKerberosJdbc;
  }

  /**
   * Getter for impalaFENGJdbc.
   * FENG JDBC URL for Impala Virtual Warehouses.
   **/
  @JsonProperty("impalaFENGJdbc")
  public String getImpalaFENGJdbc() {
    return impalaFENGJdbc;
  }

  /**
   * Setter for impalaFENGJdbc.
   * FENG JDBC URL for Impala Virtual Warehouses.
   **/
  public void setImpalaFENGJdbc(String impalaFENGJdbc) {
    this.impalaFENGJdbc = impalaFENGJdbc;
  }

  /**
   * Getter for impalaShell.
   * Command to use impala-shell for Impala Virtual Warehouses.
   **/
  @JsonProperty("impalaShell")
  public String getImpalaShell() {
    return impalaShell;
  }

  /**
   * Setter for impalaShell.
   * Command to use impala-shell for Impala Virtual Warehouses.
   **/
  public void setImpalaShell(String impalaShell) {
    this.impalaShell = impalaShell;
  }

  /**
   * Getter for fengImpalaShell.
   * Command to use impala-shell for Unified Analytics
   **/
  @JsonProperty("fengImpalaShell")
  public String getFengImpalaShell() {
    return fengImpalaShell;
  }

  /**
   * Setter for fengImpalaShell.
   * Command to use impala-shell for Unified Analytics
   **/
  public void setFengImpalaShell(String fengImpalaShell) {
    this.fengImpalaShell = fengImpalaShell;
  }

  /**
   * Getter for kerberosImpalaShell.
   * Command to use impala-shell for Impala Virtual Warehouses with Kerberos authentication.
   **/
  @JsonProperty("kerberosImpalaShell")
  public String getKerberosImpalaShell() {
    return kerberosImpalaShell;
  }

  /**
   * Setter for kerberosImpalaShell.
   * Command to use impala-shell for Impala Virtual Warehouses with Kerberos authentication.
   **/
  public void setKerberosImpalaShell(String kerberosImpalaShell) {
    this.kerberosImpalaShell = kerberosImpalaShell;
  }

  /**
   * Getter for hue.
   * URL of Hue for both Hive and Impala Virtual Warehouses.
   **/
  @JsonProperty("hue")
  public String getHue() {
    return hue;
  }

  /**
   * Setter for hue.
   * URL of Hue for both Hive and Impala Virtual Warehouses.
   **/
  public void setHue(String hue) {
    this.hue = hue;
  }

  /**
   * Getter for das.
   * URL of Data Analytics Studio for Hive Virtual Warehouses.
   **/
  @JsonProperty("das")
  public String getDas() {
    return das;
  }

  /**
   * Setter for das.
   * URL of Data Analytics Studio for Hive Virtual Warehouses.
   **/
  public void setDas(String das) {
    this.das = das;
  }

  /**
   * Getter for hostname.
   * Hostname for clients to use when connecting to the VW.
   **/
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  /**
   * Setter for hostname.
   * Hostname for clients to use when connecting to the VW.
   **/
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  /**
   * Getter for port.
   * Port for clients to use when connecting to the VW.
   **/
  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }

  /**
   * Setter for port.
   * Port for clients to use when connecting to the VW.
   **/
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   * Getter for jwtConnectionString.
   * Generic semi-colon delimited list of key-value pairs that contain all necessary information for clients to construct a connection to this Virtual Warehouse using JWTs as the authentication method.
   **/
  @JsonProperty("jwtConnectionString")
  public String getJwtConnectionString() {
    return jwtConnectionString;
  }

  /**
   * Setter for jwtConnectionString.
   * Generic semi-colon delimited list of key-value pairs that contain all necessary information for clients to construct a connection to this Virtual Warehouse using JWTs as the authentication method.
   **/
  public void setJwtConnectionString(String jwtConnectionString) {
    this.jwtConnectionString = jwtConnectionString;
  }

  /**
   * Getter for jwtTokenGenUrl.
   * When platform JWT authentication is enabled, contains a URL where a JWT token can be generated by the CDP JWT token provider.
   **/
  @JsonProperty("jwtTokenGenUrl")
  public String getJwtTokenGenUrl() {
    return jwtTokenGenUrl;
  }

  /**
   * Setter for jwtTokenGenUrl.
   * When platform JWT authentication is enabled, contains a URL where a JWT token can be generated by the CDP JWT token provider.
   **/
  public void setJwtTokenGenUrl(String jwtTokenGenUrl) {
    this.jwtTokenGenUrl = jwtTokenGenUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VwSummaryEndpoints vwSummaryEndpoints = (VwSummaryEndpoints) o;
    if (!Objects.equals(this.hiveJdbc, vwSummaryEndpoints.hiveJdbc)) {
      return false;
    }
    if (!Objects.equals(this.impalaJdbc, vwSummaryEndpoints.impalaJdbc)) {
      return false;
    }
    if (!Objects.equals(this.impalaKerberosJdbc, vwSummaryEndpoints.impalaKerberosJdbc)) {
      return false;
    }
    if (!Objects.equals(this.impalaFENGJdbc, vwSummaryEndpoints.impalaFENGJdbc)) {
      return false;
    }
    if (!Objects.equals(this.impalaShell, vwSummaryEndpoints.impalaShell)) {
      return false;
    }
    if (!Objects.equals(this.fengImpalaShell, vwSummaryEndpoints.fengImpalaShell)) {
      return false;
    }
    if (!Objects.equals(this.kerberosImpalaShell, vwSummaryEndpoints.kerberosImpalaShell)) {
      return false;
    }
    if (!Objects.equals(this.hue, vwSummaryEndpoints.hue)) {
      return false;
    }
    if (!Objects.equals(this.das, vwSummaryEndpoints.das)) {
      return false;
    }
    if (!Objects.equals(this.hostname, vwSummaryEndpoints.hostname)) {
      return false;
    }
    if (!Objects.equals(this.port, vwSummaryEndpoints.port)) {
      return false;
    }
    if (!Objects.equals(this.jwtConnectionString, vwSummaryEndpoints.jwtConnectionString)) {
      return false;
    }
    if (!Objects.equals(this.jwtTokenGenUrl, vwSummaryEndpoints.jwtTokenGenUrl)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(hiveJdbc, impalaJdbc, impalaKerberosJdbc, impalaFENGJdbc, impalaShell, fengImpalaShell, kerberosImpalaShell, hue, das, hostname, port, jwtConnectionString, jwtTokenGenUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VwSummaryEndpoints {\n");
    sb.append("    hiveJdbc: ").append(toIndentedString(hiveJdbc)).append("\n");
    sb.append("    impalaJdbc: ").append(toIndentedString(impalaJdbc)).append("\n");
    sb.append("    impalaKerberosJdbc: ").append(toIndentedString(impalaKerberosJdbc)).append("\n");
    sb.append("    impalaFENGJdbc: ").append(toIndentedString(impalaFENGJdbc)).append("\n");
    sb.append("    impalaShell: ").append(toIndentedString(impalaShell)).append("\n");
    sb.append("    fengImpalaShell: ").append(toIndentedString(fengImpalaShell)).append("\n");
    sb.append("    kerberosImpalaShell: ").append(toIndentedString(kerberosImpalaShell)).append("\n");
    sb.append("    hue: ").append(toIndentedString(hue)).append("\n");
    sb.append("    das: ").append(toIndentedString(das)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    jwtConnectionString: ").append(toIndentedString(jwtConnectionString)).append("\n");
    sb.append("    jwtTokenGenUrl: ").append(toIndentedString(jwtTokenGenUrl)).append("\n");
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

