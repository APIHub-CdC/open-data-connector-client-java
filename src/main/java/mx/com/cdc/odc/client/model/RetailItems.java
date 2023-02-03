package mx.com.cdc.odc.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class RetailItems {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("shopping_id")
  private String shoppingId = null;
  @SerializedName("names")
  private String names = null;
  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("count")
  private Integer count = null;
  @SerializedName("discount")
  private String discount = null;
  @SerializedName("total_amount")
  private Integer totalAmount = null;
  public RetailItems id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public RetailItems shoppingId(String shoppingId) {
    this.shoppingId = shoppingId;
    return this;
  }
   
  @ApiModelProperty(value = "ID of the shopping order that includes this item.")
  public String getShoppingId() {
    return shoppingId;
  }
  public void setShoppingId(String shoppingId) {
    this.shoppingId = shoppingId;
  }
  public RetailItems names(String names) {
    this.names = names;
    return this;
  }
   
  @ApiModelProperty(value = "Item name given by the store.")
  public String getNames() {
    return names;
  }
  public void setNames(String names) {
    this.names = names;
  }
  public RetailItems amount(Integer amount) {
    this.amount = amount;
    return this;
  }
   
  @ApiModelProperty(value = "Cost of the product by unit.")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  public RetailItems count(Integer count) {
    this.count = count;
    return this;
  }
   
  @ApiModelProperty(value = "Number of items purchased.")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }
  public RetailItems discount(String discount) {
    this.discount = discount;
    return this;
  }
   
  @ApiModelProperty(value = "If available, the discount applied to the item's list price.")
  public String getDiscount() {
    return discount;
  }
  public void setDiscount(String discount) {
    this.discount = discount;
  }
  public RetailItems totalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }
   
  @ApiModelProperty(value = "Total cost fo the specific product.")
  public Integer getTotalAmount() {
    return totalAmount;
  }
  public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailItems retailItems = (RetailItems) o;
    return Objects.equals(this.id, retailItems.id) &&
        Objects.equals(this.shoppingId, retailItems.shoppingId) &&
        Objects.equals(this.names, retailItems.names) &&
        Objects.equals(this.amount, retailItems.amount) &&
        Objects.equals(this.count, retailItems.count) &&
        Objects.equals(this.discount, retailItems.discount) &&
        Objects.equals(this.totalAmount, retailItems.totalAmount);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, shoppingId, names, amount, count, discount, totalAmount);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailItems {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shoppingId: ").append(toIndentedString(shoppingId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
