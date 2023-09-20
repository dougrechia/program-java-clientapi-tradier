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
import com.fasterxml.jackson.annotation.JsonCreator;

public class QuotesInner   {
  
  @Schema(required = true, description = "")
  private String symbol = null;
  
  @Schema(required = true, description = "")
  private String description = null;
  
  @Schema(required = true, description = "")
  private String exch = null;
  
  @Schema(required = true, description = "")
  private String type = null;
  
  @Schema(required = true, description = "")
  private BigDecimal last = null;
  
  @Schema(required = true, description = "")
  private BigDecimal change = null;
  
  @Schema(required = true, description = "")
  private Integer volume = null;
  
  @Schema(required = true, description = "")
  private BigDecimal open = null;
  
  @Schema(required = true, description = "")
  private BigDecimal high = null;
  
  @Schema(required = true, description = "")
  private BigDecimal low = null;
  
  @Schema(required = true, description = "")
  private String close = null;
  
  @Schema(required = true, description = "")
  private BigDecimal bid = null;
  
  @Schema(required = true, description = "")
  private BigDecimal ask = null;
  
  @Schema(required = true, description = "")
  private BigDecimal changePercentage = null;
  
  @Schema(required = true, description = "")
  private Integer averageVolume = null;
  
  @Schema(required = true, description = "")
  private Integer lastVolume = null;
  
  @Schema(required = true, description = "")
  private Long tradeDate = null;
  
  @Schema(required = true, description = "")
  private BigDecimal prevclose = null;
  
  @Schema(required = true, description = "")
  private BigDecimal week52High = null;
  
  @Schema(required = true, description = "")
  private BigDecimal week52Low = null;
  
  @Schema(required = true, description = "")
  private Integer bidsize = null;
  
  @Schema(required = true, description = "")
  private String bidexch = null;
  
  @Schema(required = true, description = "")
  private Long bidDate = null;
  
  @Schema(required = true, description = "")
  private Integer asksize = null;
  
  @Schema(required = true, description = "")
  private String askexch = null;
  
  @Schema(required = true, description = "")
  private Long askDate = null;
  
  @Schema(required = true, description = "")
  private String rootSymbols = null;
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

  public QuotesInner symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public QuotesInner description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get exch
   * @return exch
  **/
  @JsonProperty("exch")
  public String getExch() {
    return exch;
  }

  public void setExch(String exch) {
    this.exch = exch;
  }

  public QuotesInner exch(String exch) {
    this.exch = exch;
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

  public QuotesInner type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get last
   * @return last
  **/
  @JsonProperty("last")
  public BigDecimal getLast() {
    return last;
  }

  public void setLast(BigDecimal last) {
    this.last = last;
  }

  public QuotesInner last(BigDecimal last) {
    this.last = last;
    return this;
  }

 /**
   * Get change
   * @return change
  **/
  @JsonProperty("change")
  public BigDecimal getChange() {
    return change;
  }

  public void setChange(BigDecimal change) {
    this.change = change;
  }

  public QuotesInner change(BigDecimal change) {
    this.change = change;
    return this;
  }

 /**
   * Get volume
   * @return volume
  **/
  @JsonProperty("volume")
  public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  public QuotesInner volume(Integer volume) {
    this.volume = volume;
    return this;
  }

 /**
   * Get open
   * @return open
  **/
  @JsonProperty("open")
  public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }

  public QuotesInner open(BigDecimal open) {
    this.open = open;
    return this;
  }

 /**
   * Get high
   * @return high
  **/
  @JsonProperty("high")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public QuotesInner high(BigDecimal high) {
    this.high = high;
    return this;
  }

 /**
   * Get low
   * @return low
  **/
  @JsonProperty("low")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public QuotesInner low(BigDecimal low) {
    this.low = low;
    return this;
  }

 /**
   * Get close
   * @return close
  **/
  @JsonProperty("close")
  public String getClose() {
    return close;
  }

  public void setClose(String close) {
    this.close = close;
  }

  public QuotesInner close(String close) {
    this.close = close;
    return this;
  }

 /**
   * Get bid
   * @return bid
  **/
  @JsonProperty("bid")
  public BigDecimal getBid() {
    return bid;
  }

  public void setBid(BigDecimal bid) {
    this.bid = bid;
  }

  public QuotesInner bid(BigDecimal bid) {
    this.bid = bid;
    return this;
  }

 /**
   * Get ask
   * @return ask
  **/
  @JsonProperty("ask")
  public BigDecimal getAsk() {
    return ask;
  }

  public void setAsk(BigDecimal ask) {
    this.ask = ask;
  }

  public QuotesInner ask(BigDecimal ask) {
    this.ask = ask;
    return this;
  }

 /**
   * Get changePercentage
   * @return changePercentage
  **/
  @JsonProperty("change_percentage")
  public BigDecimal getChangePercentage() {
    return changePercentage;
  }

  public void setChangePercentage(BigDecimal changePercentage) {
    this.changePercentage = changePercentage;
  }

  public QuotesInner changePercentage(BigDecimal changePercentage) {
    this.changePercentage = changePercentage;
    return this;
  }

 /**
   * Get averageVolume
   * @return averageVolume
  **/
  @JsonProperty("average_volume")
  public Integer getAverageVolume() {
    return averageVolume;
  }

  public void setAverageVolume(Integer averageVolume) {
    this.averageVolume = averageVolume;
  }

  public QuotesInner averageVolume(Integer averageVolume) {
    this.averageVolume = averageVolume;
    return this;
  }

 /**
   * Get lastVolume
   * @return lastVolume
  **/
  @JsonProperty("last_volume")
  public Integer getLastVolume() {
    return lastVolume;
  }

  public void setLastVolume(Integer lastVolume) {
    this.lastVolume = lastVolume;
  }

  public QuotesInner lastVolume(Integer lastVolume) {
    this.lastVolume = lastVolume;
    return this;
  }

 /**
   * Get tradeDate
   * @return tradeDate
  **/
  @JsonProperty("trade_date")
  public Long getTradeDate() {
    return tradeDate;
  }

  public void setTradeDate(Long tradeDate) {
    this.tradeDate = tradeDate;
  }

  public QuotesInner tradeDate(Long tradeDate) {
    this.tradeDate = tradeDate;
    return this;
  }

 /**
   * Get prevclose
   * @return prevclose
  **/
  @JsonProperty("prevclose")
  public BigDecimal getPrevclose() {
    return prevclose;
  }

  public void setPrevclose(BigDecimal prevclose) {
    this.prevclose = prevclose;
  }

  public QuotesInner prevclose(BigDecimal prevclose) {
    this.prevclose = prevclose;
    return this;
  }

 /**
   * Get week52High
   * @return week52High
  **/
  @JsonProperty("week_52_high")
  public BigDecimal getWeek52High() {
    return week52High;
  }

  public void setWeek52High(BigDecimal week52High) {
    this.week52High = week52High;
  }

  public QuotesInner week52High(BigDecimal week52High) {
    this.week52High = week52High;
    return this;
  }

 /**
   * Get week52Low
   * @return week52Low
  **/
  @JsonProperty("week_52_low")
  public BigDecimal getWeek52Low() {
    return week52Low;
  }

  public void setWeek52Low(BigDecimal week52Low) {
    this.week52Low = week52Low;
  }

  public QuotesInner week52Low(BigDecimal week52Low) {
    this.week52Low = week52Low;
    return this;
  }

 /**
   * Get bidsize
   * @return bidsize
  **/
  @JsonProperty("bidsize")
  public Integer getBidsize() {
    return bidsize;
  }

  public void setBidsize(Integer bidsize) {
    this.bidsize = bidsize;
  }

  public QuotesInner bidsize(Integer bidsize) {
    this.bidsize = bidsize;
    return this;
  }

 /**
   * Get bidexch
   * @return bidexch
  **/
  @JsonProperty("bidexch")
  public String getBidexch() {
    return bidexch;
  }

  public void setBidexch(String bidexch) {
    this.bidexch = bidexch;
  }

  public QuotesInner bidexch(String bidexch) {
    this.bidexch = bidexch;
    return this;
  }

 /**
   * Get bidDate
   * @return bidDate
  **/
  @JsonProperty("bid_date")
  public Long getBidDate() {
    return bidDate;
  }

  public void setBidDate(Long bidDate) {
    this.bidDate = bidDate;
  }

  public QuotesInner bidDate(Long bidDate) {
    this.bidDate = bidDate;
    return this;
  }

 /**
   * Get asksize
   * @return asksize
  **/
  @JsonProperty("asksize")
  public Integer getAsksize() {
    return asksize;
  }

  public void setAsksize(Integer asksize) {
    this.asksize = asksize;
  }

  public QuotesInner asksize(Integer asksize) {
    this.asksize = asksize;
    return this;
  }

 /**
   * Get askexch
   * @return askexch
  **/
  @JsonProperty("askexch")
  public String getAskexch() {
    return askexch;
  }

  public void setAskexch(String askexch) {
    this.askexch = askexch;
  }

  public QuotesInner askexch(String askexch) {
    this.askexch = askexch;
    return this;
  }

 /**
   * Get askDate
   * @return askDate
  **/
  @JsonProperty("ask_date")
  public Long getAskDate() {
    return askDate;
  }

  public void setAskDate(Long askDate) {
    this.askDate = askDate;
  }

  public QuotesInner askDate(Long askDate) {
    this.askDate = askDate;
    return this;
  }

 /**
   * Get rootSymbols
   * @return rootSymbols
  **/
  @JsonProperty("root_symbols")
  public String getRootSymbols() {
    return rootSymbols;
  }

  public void setRootSymbols(String rootSymbols) {
    this.rootSymbols = rootSymbols;
  }

  public QuotesInner rootSymbols(String rootSymbols) {
    this.rootSymbols = rootSymbols;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotesInner {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exch: ").append(toIndentedString(exch)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    changePercentage: ").append(toIndentedString(changePercentage)).append("\n");
    sb.append("    averageVolume: ").append(toIndentedString(averageVolume)).append("\n");
    sb.append("    lastVolume: ").append(toIndentedString(lastVolume)).append("\n");
    sb.append("    tradeDate: ").append(toIndentedString(tradeDate)).append("\n");
    sb.append("    prevclose: ").append(toIndentedString(prevclose)).append("\n");
    sb.append("    week52High: ").append(toIndentedString(week52High)).append("\n");
    sb.append("    week52Low: ").append(toIndentedString(week52Low)).append("\n");
    sb.append("    bidsize: ").append(toIndentedString(bidsize)).append("\n");
    sb.append("    bidexch: ").append(toIndentedString(bidexch)).append("\n");
    sb.append("    bidDate: ").append(toIndentedString(bidDate)).append("\n");
    sb.append("    asksize: ").append(toIndentedString(asksize)).append("\n");
    sb.append("    askexch: ").append(toIndentedString(askexch)).append("\n");
    sb.append("    askDate: ").append(toIndentedString(askDate)).append("\n");
    sb.append("    rootSymbols: ").append(toIndentedString(rootSymbols)).append("\n");
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
