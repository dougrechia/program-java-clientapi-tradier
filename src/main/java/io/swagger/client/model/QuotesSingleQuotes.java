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
import io.swagger.client.model.QuotesQuotesQuote;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * QuotesSingleQuotes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-31T14:29:22.511420325Z[GMT]")

public class QuotesSingleQuotes {
  @SerializedName("quote")
  private QuotesQuotesQuote quote = null;

  public QuotesSingleQuotes quote(QuotesQuotesQuote quote) {
    this.quote = quote;
    return this;
  }

   /**
   * Get quote
   * @return quote
  **/
  @Schema(description = "")
  public QuotesQuotesQuote getQuote() {
    return quote;
  }

  public void setQuote(QuotesQuotesQuote quote) {
    this.quote = quote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotesSingleQuotes quotesSingleQuotes = (QuotesSingleQuotes) o;
    return Objects.equals(this.quote, quotesSingleQuotes.quote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quote);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotesSingleQuotes {\n");
    
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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
