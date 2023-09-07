/*
 * Tradier API
 * Tradier API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SymbolLookupSecuritiesSecurity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-31T14:29:22.511420325Z[GMT]")

public class SymbolLookupSecuritiesSecurity {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("description")
  private String description = null;

  public SymbolLookupSecuritiesSecurity symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @Schema(description = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public SymbolLookupSecuritiesSecurity exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @Schema(description = "")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public SymbolLookupSecuritiesSecurity type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SymbolLookupSecuritiesSecurity description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SymbolLookupSecuritiesSecurity symbolLookupSecuritiesSecurity = (SymbolLookupSecuritiesSecurity) o;
    return Objects.equals(this.symbol, symbolLookupSecuritiesSecurity.symbol) &&
        Objects.equals(this.exchange, symbolLookupSecuritiesSecurity.exchange) &&
        Objects.equals(this.type, symbolLookupSecuritiesSecurity.type) &&
        Objects.equals(this.description, symbolLookupSecuritiesSecurity.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, exchange, type, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymbolLookupSecuritiesSecurity {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
