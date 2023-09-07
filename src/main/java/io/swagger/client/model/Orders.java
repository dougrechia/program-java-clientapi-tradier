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
import io.swagger.client.model.OrdersOrders;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Orders
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-31T14:29:22.511420325Z[GMT]")

public class Orders implements InlineResponse2001 {
  @SerializedName("orders")
  private OrdersOrders orders = null;

  public Orders orders(OrdersOrders orders) {
    this.orders = orders;
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @Schema(description = "")
  public OrdersOrders getOrders() {
    return orders;
  }

  public void setOrders(OrdersOrders orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Orders orders = (Orders) o;
    return Objects.equals(this.orders, orders.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Orders {\n");
    
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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
