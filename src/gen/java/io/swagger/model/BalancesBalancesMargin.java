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

public class BalancesBalancesMargin   {
  
  @Schema(description = "")
  private BigDecimal fedCall = null;
  
  @Schema(description = "")
  private BigDecimal maintenanceCall = null;
  
  @Schema(description = "")
  private BigDecimal optionBuyingPower = null;
  
  @Schema(description = "")
  private BigDecimal stockBuyingPower = null;
  
  @Schema(description = "")
  private BigDecimal stockShortValue = null;
  
  @Schema(description = "")
  private BigDecimal sweep = null;
 /**
   * Get fedCall
   * @return fedCall
  **/
  @JsonProperty("fed_call")
  public BigDecimal getFedCall() {
    return fedCall;
  }

  public void setFedCall(BigDecimal fedCall) {
    this.fedCall = fedCall;
  }

  public BalancesBalancesMargin fedCall(BigDecimal fedCall) {
    this.fedCall = fedCall;
    return this;
  }

 /**
   * Get maintenanceCall
   * @return maintenanceCall
  **/
  @JsonProperty("maintenance_call")
  public BigDecimal getMaintenanceCall() {
    return maintenanceCall;
  }

  public void setMaintenanceCall(BigDecimal maintenanceCall) {
    this.maintenanceCall = maintenanceCall;
  }

  public BalancesBalancesMargin maintenanceCall(BigDecimal maintenanceCall) {
    this.maintenanceCall = maintenanceCall;
    return this;
  }

 /**
   * Get optionBuyingPower
   * @return optionBuyingPower
  **/
  @JsonProperty("option_buying_power")
  public BigDecimal getOptionBuyingPower() {
    return optionBuyingPower;
  }

  public void setOptionBuyingPower(BigDecimal optionBuyingPower) {
    this.optionBuyingPower = optionBuyingPower;
  }

  public BalancesBalancesMargin optionBuyingPower(BigDecimal optionBuyingPower) {
    this.optionBuyingPower = optionBuyingPower;
    return this;
  }

 /**
   * Get stockBuyingPower
   * @return stockBuyingPower
  **/
  @JsonProperty("stock_buying_power")
  public BigDecimal getStockBuyingPower() {
    return stockBuyingPower;
  }

  public void setStockBuyingPower(BigDecimal stockBuyingPower) {
    this.stockBuyingPower = stockBuyingPower;
  }

  public BalancesBalancesMargin stockBuyingPower(BigDecimal stockBuyingPower) {
    this.stockBuyingPower = stockBuyingPower;
    return this;
  }

 /**
   * Get stockShortValue
   * @return stockShortValue
  **/
  @JsonProperty("stock_short_value")
  public BigDecimal getStockShortValue() {
    return stockShortValue;
  }

  public void setStockShortValue(BigDecimal stockShortValue) {
    this.stockShortValue = stockShortValue;
  }

  public BalancesBalancesMargin stockShortValue(BigDecimal stockShortValue) {
    this.stockShortValue = stockShortValue;
    return this;
  }

 /**
   * Get sweep
   * @return sweep
  **/
  @JsonProperty("sweep")
  public BigDecimal getSweep() {
    return sweep;
  }

  public void setSweep(BigDecimal sweep) {
    this.sweep = sweep;
  }

  public BalancesBalancesMargin sweep(BigDecimal sweep) {
    this.sweep = sweep;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalancesBalancesMargin {\n");
    
    sb.append("    fedCall: ").append(toIndentedString(fedCall)).append("\n");
    sb.append("    maintenanceCall: ").append(toIndentedString(maintenanceCall)).append("\n");
    sb.append("    optionBuyingPower: ").append(toIndentedString(optionBuyingPower)).append("\n");
    sb.append("    stockBuyingPower: ").append(toIndentedString(stockBuyingPower)).append("\n");
    sb.append("    stockShortValue: ").append(toIndentedString(stockShortValue)).append("\n");
    sb.append("    sweep: ").append(toIndentedString(sweep)).append("\n");
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
