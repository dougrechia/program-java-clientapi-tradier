package com.tradier.sdk.model;

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
import com.tradier.sdk.model.BalancesMargin;
import com.tradier.sdk.model.BalancesPdt;
import com.fasterxml.jackson.annotation.JsonCreator;

public class Balances   {
  
  @Schema(required = true, description = "")
  private Integer optionShortValue = null;
  
  @Schema(required = true, description = "")
  private BigDecimal totalEquity = null;
  
  @Schema(required = true, description = "")
  private String accountNumber = null;
  
  @Schema(required = true, description = "")
  private String accountType = null;
  
  @Schema(required = true, description = "")
  private BigDecimal closePl = null;
  
  @Schema(required = true, description = "")
  private BigDecimal currentRequirement = null;
  
  @Schema(required = true, description = "")
  private BigDecimal equity = null;
  
  @Schema(required = true, description = "")
  private BigDecimal longMarketValue = null;
  
  @Schema(required = true, description = "")
  private BigDecimal marketValue = null;
  
  @Schema(required = true, description = "")
  private BigDecimal openPl = null;
  
  @Schema(required = true, description = "")
  private Long optionLongValue = null;
  
  @Schema(required = true, description = "")
  private BigDecimal optionRequirement = null;
  
  @Schema(required = true, description = "")
  private Integer pendingOrdersCount = null;
  
  @Schema(required = true, description = "")
  private BigDecimal shortMarketValue = null;
  
  @Schema(required = true, description = "")
  private BigDecimal stockLongValue = null;
  
  @Schema(required = true, description = "")
  private BigDecimal totalCash = null;
  
  @Schema(required = true, description = "")
  private BigDecimal unclearedFunds = null;
  
  @Schema(required = true, description = "")
  private BigDecimal pendingCash = null;
  
  @Schema(description = "")
  private BalancesPdt pdt = null;
  
  @Schema(required = true, description = "")
  private BalancesMargin margin = null;
 /**
   * Get optionShortValue
   * @return optionShortValue
  **/
  @JsonProperty("option_short_value")
  public Integer getOptionShortValue() {
    return optionShortValue;
  }

  public void setOptionShortValue(Integer optionShortValue) {
    this.optionShortValue = optionShortValue;
  }

  public Balances optionShortValue(Integer optionShortValue) {
    this.optionShortValue = optionShortValue;
    return this;
  }

 /**
   * Get totalEquity
   * @return totalEquity
  **/
  @JsonProperty("total_equity")
  public BigDecimal getTotalEquity() {
    return totalEquity;
  }

  public void setTotalEquity(BigDecimal totalEquity) {
    this.totalEquity = totalEquity;
  }

  public Balances totalEquity(BigDecimal totalEquity) {
    this.totalEquity = totalEquity;
    return this;
  }

 /**
   * Get accountNumber
   * @return accountNumber
  **/
  @JsonProperty("account_number")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Balances accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

 /**
   * Get accountType
   * @return accountType
  **/
  @JsonProperty("account_type")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public Balances accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * Get closePl
   * @return closePl
  **/
  @JsonProperty("close_pl")
  public BigDecimal getClosePl() {
    return closePl;
  }

  public void setClosePl(BigDecimal closePl) {
    this.closePl = closePl;
  }

  public Balances closePl(BigDecimal closePl) {
    this.closePl = closePl;
    return this;
  }

 /**
   * Get currentRequirement
   * @return currentRequirement
  **/
  @JsonProperty("current_requirement")
  public BigDecimal getCurrentRequirement() {
    return currentRequirement;
  }

  public void setCurrentRequirement(BigDecimal currentRequirement) {
    this.currentRequirement = currentRequirement;
  }

  public Balances currentRequirement(BigDecimal currentRequirement) {
    this.currentRequirement = currentRequirement;
    return this;
  }

 /**
   * Get equity
   * @return equity
  **/
  @JsonProperty("equity")
  public BigDecimal getEquity() {
    return equity;
  }

  public void setEquity(BigDecimal equity) {
    this.equity = equity;
  }

  public Balances equity(BigDecimal equity) {
    this.equity = equity;
    return this;
  }

 /**
   * Get longMarketValue
   * @return longMarketValue
  **/
  @JsonProperty("long_market_value")
  public BigDecimal getLongMarketValue() {
    return longMarketValue;
  }

  public void setLongMarketValue(BigDecimal longMarketValue) {
    this.longMarketValue = longMarketValue;
  }

  public Balances longMarketValue(BigDecimal longMarketValue) {
    this.longMarketValue = longMarketValue;
    return this;
  }

 /**
   * Get marketValue
   * @return marketValue
  **/
  @JsonProperty("market_value")
  public BigDecimal getMarketValue() {
    return marketValue;
  }

  public void setMarketValue(BigDecimal marketValue) {
    this.marketValue = marketValue;
  }

  public Balances marketValue(BigDecimal marketValue) {
    this.marketValue = marketValue;
    return this;
  }

 /**
   * Get openPl
   * @return openPl
  **/
  @JsonProperty("open_pl")
  public BigDecimal getOpenPl() {
    return openPl;
  }

  public void setOpenPl(BigDecimal openPl) {
    this.openPl = openPl;
  }

  public Balances openPl(BigDecimal openPl) {
    this.openPl = openPl;
    return this;
  }

 /**
   * Get optionLongValue
   * @return optionLongValue
  **/
  @JsonProperty("option_long_value")
  public Long getOptionLongValue() {
    return optionLongValue;
  }

  public void setOptionLongValue(Long optionLongValue) {
    this.optionLongValue = optionLongValue;
  }

  public Balances optionLongValue(Long optionLongValue) {
    this.optionLongValue = optionLongValue;
    return this;
  }

 /**
   * Get optionRequirement
   * @return optionRequirement
  **/
  @JsonProperty("option_requirement")
  public BigDecimal getOptionRequirement() {
    return optionRequirement;
  }

  public void setOptionRequirement(BigDecimal optionRequirement) {
    this.optionRequirement = optionRequirement;
  }

  public Balances optionRequirement(BigDecimal optionRequirement) {
    this.optionRequirement = optionRequirement;
    return this;
  }

 /**
   * Get pendingOrdersCount
   * @return pendingOrdersCount
  **/
  @JsonProperty("pending_orders_count")
  public Integer getPendingOrdersCount() {
    return pendingOrdersCount;
  }

  public void setPendingOrdersCount(Integer pendingOrdersCount) {
    this.pendingOrdersCount = pendingOrdersCount;
  }

  public Balances pendingOrdersCount(Integer pendingOrdersCount) {
    this.pendingOrdersCount = pendingOrdersCount;
    return this;
  }

 /**
   * Get shortMarketValue
   * @return shortMarketValue
  **/
  @JsonProperty("short_market_value")
  public BigDecimal getShortMarketValue() {
    return shortMarketValue;
  }

  public void setShortMarketValue(BigDecimal shortMarketValue) {
    this.shortMarketValue = shortMarketValue;
  }

  public Balances shortMarketValue(BigDecimal shortMarketValue) {
    this.shortMarketValue = shortMarketValue;
    return this;
  }

 /**
   * Get stockLongValue
   * @return stockLongValue
  **/
  @JsonProperty("stock_long_value")
  public BigDecimal getStockLongValue() {
    return stockLongValue;
  }

  public void setStockLongValue(BigDecimal stockLongValue) {
    this.stockLongValue = stockLongValue;
  }

  public Balances stockLongValue(BigDecimal stockLongValue) {
    this.stockLongValue = stockLongValue;
    return this;
  }

 /**
   * Get totalCash
   * @return totalCash
  **/
  @JsonProperty("total_cash")
  public BigDecimal getTotalCash() {
    return totalCash;
  }

  public void setTotalCash(BigDecimal totalCash) {
    this.totalCash = totalCash;
  }

  public Balances totalCash(BigDecimal totalCash) {
    this.totalCash = totalCash;
    return this;
  }

 /**
   * Get unclearedFunds
   * @return unclearedFunds
  **/
  @JsonProperty("uncleared_funds")
  public BigDecimal getUnclearedFunds() {
    return unclearedFunds;
  }

  public void setUnclearedFunds(BigDecimal unclearedFunds) {
    this.unclearedFunds = unclearedFunds;
  }

  public Balances unclearedFunds(BigDecimal unclearedFunds) {
    this.unclearedFunds = unclearedFunds;
    return this;
  }

 /**
   * Get pendingCash
   * @return pendingCash
  **/
  @JsonProperty("pending_cash")
  public BigDecimal getPendingCash() {
    return pendingCash;
  }

  public void setPendingCash(BigDecimal pendingCash) {
    this.pendingCash = pendingCash;
  }

  public Balances pendingCash(BigDecimal pendingCash) {
    this.pendingCash = pendingCash;
    return this;
  }

 /**
   * Get pdt
   * @return pdt
  **/
  @JsonProperty("pdt")
  public BalancesPdt getPdt() {
    return pdt;
  }

  public void setPdt(BalancesPdt pdt) {
    this.pdt = pdt;
  }

  public Balances pdt(BalancesPdt pdt) {
    this.pdt = pdt;
    return this;
  }

 /**
   * Get margin
   * @return margin
  **/
  @JsonProperty("margin")
  public BalancesMargin getMargin() {
    return margin;
  }

  public void setMargin(BalancesMargin margin) {
    this.margin = margin;
  }

  public Balances margin(BalancesMargin margin) {
    this.margin = margin;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balances {\n");
    
    sb.append("    optionShortValue: ").append(toIndentedString(optionShortValue)).append("\n");
    sb.append("    totalEquity: ").append(toIndentedString(totalEquity)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    closePl: ").append(toIndentedString(closePl)).append("\n");
    sb.append("    currentRequirement: ").append(toIndentedString(currentRequirement)).append("\n");
    sb.append("    equity: ").append(toIndentedString(equity)).append("\n");
    sb.append("    longMarketValue: ").append(toIndentedString(longMarketValue)).append("\n");
    sb.append("    marketValue: ").append(toIndentedString(marketValue)).append("\n");
    sb.append("    openPl: ").append(toIndentedString(openPl)).append("\n");
    sb.append("    optionLongValue: ").append(toIndentedString(optionLongValue)).append("\n");
    sb.append("    optionRequirement: ").append(toIndentedString(optionRequirement)).append("\n");
    sb.append("    pendingOrdersCount: ").append(toIndentedString(pendingOrdersCount)).append("\n");
    sb.append("    shortMarketValue: ").append(toIndentedString(shortMarketValue)).append("\n");
    sb.append("    stockLongValue: ").append(toIndentedString(stockLongValue)).append("\n");
    sb.append("    totalCash: ").append(toIndentedString(totalCash)).append("\n");
    sb.append("    unclearedFunds: ").append(toIndentedString(unclearedFunds)).append("\n");
    sb.append("    pendingCash: ").append(toIndentedString(pendingCash)).append("\n");
    sb.append("    pdt: ").append(toIndentedString(pdt)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
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
