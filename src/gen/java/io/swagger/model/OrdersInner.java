package io.swagger.model;

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

public class OrdersInner   {
  
  @Schema(required = true, description = "")
  private Long id = null;
  
  @Schema(required = true, description = "")
  private String type = null;
  
  @Schema(required = true, description = "")
  private String symbol = null;
  
  @Schema(required = true, description = "")
  private String side = null;
  
  @Schema(required = true, description = "")
  private BigDecimal quantity = null;
  
  @Schema(required = true, description = "")
  private String status = null;
  
  @Schema(required = true, description = "")
  private String duration = null;
  
  @Schema(required = true, description = "")
  private BigDecimal avgFillPrice = null;
  
  @Schema(required = true, description = "")
  private BigDecimal execQuantity = null;
  
  @Schema(description = "")
  private BigDecimal price = null;
  
  @Schema(description = "")
  private BigDecimal stop = null;
  
  @Schema(description = "")
  private BigDecimal lastFillPrice = null;
  
  @Schema(required = true, description = "")
  private BigDecimal lastFillQuantity = null;
  
  @Schema(required = true, description = "")
  private BigDecimal remainingQuantity = null;
  
  @Schema(required = true, description = "")
  private Date createDate = null;
  
  @Schema(required = true, description = "")
  private Date transactionDate = null;
  
  @Schema(required = true, description = "")
  private String propertyClass = null;
  
  @Schema(required = true, description = "")
  private String tag = null;
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

  public OrdersInner id(Long id) {
    this.id = id;
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

  public OrdersInner type(String type) {
    this.type = type;
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

  public OrdersInner symbol(String symbol) {
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

  public OrdersInner side(String side) {
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

  public OrdersInner quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OrdersInner status(String status) {
    this.status = status;
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

  public OrdersInner duration(String duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Get avgFillPrice
   * @return avgFillPrice
  **/
  @JsonProperty("avg_fill_price")
  public BigDecimal getAvgFillPrice() {
    return avgFillPrice;
  }

  public void setAvgFillPrice(BigDecimal avgFillPrice) {
    this.avgFillPrice = avgFillPrice;
  }

  public OrdersInner avgFillPrice(BigDecimal avgFillPrice) {
    this.avgFillPrice = avgFillPrice;
    return this;
  }

 /**
   * Get execQuantity
   * @return execQuantity
  **/
  @JsonProperty("exec_quantity")
  public BigDecimal getExecQuantity() {
    return execQuantity;
  }

  public void setExecQuantity(BigDecimal execQuantity) {
    this.execQuantity = execQuantity;
  }

  public OrdersInner execQuantity(BigDecimal execQuantity) {
    this.execQuantity = execQuantity;
    return this;
  }

 /**
   * Get price
   * @return price
  **/
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public OrdersInner price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
   * Get stop
   * @return stop
  **/
  @JsonProperty("stop")
  public BigDecimal getStop() {
    return stop;
  }

  public void setStop(BigDecimal stop) {
    this.stop = stop;
  }

  public OrdersInner stop(BigDecimal stop) {
    this.stop = stop;
    return this;
  }

 /**
   * Get lastFillPrice
   * @return lastFillPrice
  **/
  @JsonProperty("last_fill_price")
  public BigDecimal getLastFillPrice() {
    return lastFillPrice;
  }

  public void setLastFillPrice(BigDecimal lastFillPrice) {
    this.lastFillPrice = lastFillPrice;
  }

  public OrdersInner lastFillPrice(BigDecimal lastFillPrice) {
    this.lastFillPrice = lastFillPrice;
    return this;
  }

 /**
   * Get lastFillQuantity
   * @return lastFillQuantity
  **/
  @JsonProperty("last_fill_quantity")
  public BigDecimal getLastFillQuantity() {
    return lastFillQuantity;
  }

  public void setLastFillQuantity(BigDecimal lastFillQuantity) {
    this.lastFillQuantity = lastFillQuantity;
  }

  public OrdersInner lastFillQuantity(BigDecimal lastFillQuantity) {
    this.lastFillQuantity = lastFillQuantity;
    return this;
  }

 /**
   * Get remainingQuantity
   * @return remainingQuantity
  **/
  @JsonProperty("remaining_quantity")
  public BigDecimal getRemainingQuantity() {
    return remainingQuantity;
  }

  public void setRemainingQuantity(BigDecimal remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
  }

  public OrdersInner remainingQuantity(BigDecimal remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
    return this;
  }

 /**
   * Get createDate
   * @return createDate
  **/
  @JsonProperty("create_date")
  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public OrdersInner createDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }

 /**
   * Get transactionDate
   * @return transactionDate
  **/
  @JsonProperty("transaction_date")
  public Date getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

  public OrdersInner transactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

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

  public OrdersInner propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
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

  public OrdersInner tag(String tag) {
    this.tag = tag;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    avgFillPrice: ").append(toIndentedString(avgFillPrice)).append("\n");
    sb.append("    execQuantity: ").append(toIndentedString(execQuantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    lastFillPrice: ").append(toIndentedString(lastFillPrice)).append("\n");
    sb.append("    lastFillQuantity: ").append(toIndentedString(lastFillQuantity)).append("\n");
    sb.append("    remainingQuantity: ").append(toIndentedString(remainingQuantity)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
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
