package com.tradier.sdk.model;

import java.math.BigDecimal;
import java.util.Date;

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

public class PositionsInner   {
  
  @Schema(required = true, description = "")
  private BigDecimal costBasis = null;
  
  @Schema(required = true, description = "")
  private Date dateAcquired = null;
  
  @Schema(required = true, description = "")
  private Long id = null;
  
  @Schema(required = true, description = "")
  private BigDecimal quantity = null;
  
  @Schema(required = true, description = "")
  private String symbol = null;
 /**
   * Get costBasis
   * @return costBasis
  **/
  @JsonProperty("cost_basis")
  public BigDecimal getCostBasis() {
    return costBasis;
  }

  public void setCostBasis(BigDecimal costBasis) {
    this.costBasis = costBasis;
  }

  public PositionsInner costBasis(BigDecimal costBasis) {
    this.costBasis = costBasis;
    return this;
  }

 /**
   * Get dateAcquired
   * @return dateAcquired
  **/
  @JsonProperty("date_acquired")
  public Date getDateAcquired() {
    return dateAcquired;
  }

  public void setDateAcquired(Date dateAcquired) {
    this.dateAcquired = dateAcquired;
  }

  public PositionsInner dateAcquired(Date dateAcquired) {
    this.dateAcquired = dateAcquired;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PositionsInner id(Long id) {
    this.id = id;
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

  public PositionsInner quantity(BigDecimal quantity) {
    this.quantity = quantity;
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

  public PositionsInner symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionsInner {\n");
    
    sb.append("    costBasis: ").append(toIndentedString(costBasis)).append("\n");
    sb.append("    dateAcquired: ").append(toIndentedString(dateAcquired)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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
