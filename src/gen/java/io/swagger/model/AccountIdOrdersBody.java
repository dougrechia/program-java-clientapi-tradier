package io.swagger.model;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class AccountIdOrdersBody   {
  
  @Schema(required = true, description = "")
  private String propertyClass = null;
  
  @Schema(required = true, description = "")
  private String symbol = null;
  
  @Schema(required = true, description = "")
  private String side = null;
  
  @Schema(required = true, description = "")
  private BigDecimal quantity = null;
  
  @Schema(required = true, description = "")
  private String type = null;
  
  @Schema(required = true, description = "")
  private String duration = null;
  
  @Schema(required = true, description = "")
  private String tag = null;
 /**
   * Get propertyClass
   * @return propertyClass
  **/
  @JsonProperty("class")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public AccountIdOrdersBody propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

 /**
   * Get symbol
   * @return symbol
  **/
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public AccountIdOrdersBody symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

 /**
   * Get side
   * @return side
  **/
  @JsonProperty("side")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public AccountIdOrdersBody side(String side) {
    this.side = side;
    return this;
  }

 /**
   * Get quantity
   * @return quantity
  **/
  @JsonProperty("quantity")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public AccountIdOrdersBody quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AccountIdOrdersBody type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get duration
   * @return duration
  **/
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public AccountIdOrdersBody duration(String duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Get tag
   * @return tag
  **/
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public AccountIdOrdersBody tag(String tag) {
    this.tag = tag;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIdOrdersBody {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
