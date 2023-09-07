package io.swagger.model;

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

public class ProfileProfileAccount   {
  
  @Schema(description = "")
  private String accountNumber = null;
  
  @Schema(description = "")
  private String classification = null;
  
  @Schema(description = "")
  private Date dateCreated = null;
  
  @Schema(description = "")
  private Boolean dayTrader = null;
  
  @Schema(description = "")
  private Integer optionLevel = null;
  
  @Schema(description = "")
  private String status = null;
  
  @Schema(description = "")
  private String type = null;
  
  @Schema(description = "")
  private Date lastUpdateDate = null;
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

  public ProfileProfileAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

 /**
   * Get classification
   * @return classification
  **/
  @JsonProperty("classification")
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public ProfileProfileAccount classification(String classification) {
    this.classification = classification;
    return this;
  }

 /**
   * Get dateCreated
   * @return dateCreated
  **/
  @JsonProperty("date_created")
  public Date getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  public ProfileProfileAccount dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

 /**
   * Get dayTrader
   * @return dayTrader
  **/
  @JsonProperty("day_trader")
  public Boolean isDayTrader() {
    return dayTrader;
  }

  public void setDayTrader(Boolean dayTrader) {
    this.dayTrader = dayTrader;
  }

  public ProfileProfileAccount dayTrader(Boolean dayTrader) {
    this.dayTrader = dayTrader;
    return this;
  }

 /**
   * Get optionLevel
   * @return optionLevel
  **/
  @JsonProperty("option_level")
  public Integer getOptionLevel() {
    return optionLevel;
  }

  public void setOptionLevel(Integer optionLevel) {
    this.optionLevel = optionLevel;
  }

  public ProfileProfileAccount optionLevel(Integer optionLevel) {
    this.optionLevel = optionLevel;
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

  public ProfileProfileAccount status(String status) {
    this.status = status;
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

  public ProfileProfileAccount type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get lastUpdateDate
   * @return lastUpdateDate
  **/
  @JsonProperty("last_update_date")
  public Date getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(Date lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

  public ProfileProfileAccount lastUpdateDate(Date lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileProfileAccount {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dayTrader: ").append(toIndentedString(dayTrader)).append("\n");
    sb.append("    optionLevel: ").append(toIndentedString(optionLevel)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
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
