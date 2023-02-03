package mx.com.cdc.odc.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class RetailShopping {
  @SerializedName("_id")
  private List<String> id = null;
  @SerializedName("customer_id")
  private String customerId = null;
  @SerializedName("lookup_id")
  private String lookupId = null;
  @SerializedName("purchaes_date")
  private LocalDate purchaesDate = null;
  @SerializedName("payment_method")
  private String paymentMethod = null;
  @SerializedName("invoice")
  private String invoice = null;
  @SerializedName("shipping_address")
  private String shippingAddress = null;
  @SerializedName("total_amount")
  private String totalAmount = null;
  @SerializedName("items")
  private List<RetailItems> items = null;
  public RetailShopping id(List<String> id) {
    this.id = id;
    return this;
  }
  public RetailShopping addIdItem(String idItem) {
    if (this.id == null) {
      this.id = new ArrayList<String>();
    }
    this.id.add(idItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<String> getId() {
    return id;
  }
  public void setId(List<String> id) {
    this.id = id;
  }
  public RetailShopping customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }
   
  @ApiModelProperty(value = "ID given to the customer in the retail store database.")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }
  public RetailShopping lookupId(String lookupId) {
    this.lookupId = lookupId;
    return this;
  }
   
  @ApiModelProperty(value = "ID given to the specific order.")
  public String getLookupId() {
    return lookupId;
  }
  public void setLookupId(String lookupId) {
    this.lookupId = lookupId;
  }
  public RetailShopping purchaesDate(LocalDate purchaesDate) {
    this.purchaesDate = purchaesDate;
    return this;
  }
   
  @ApiModelProperty(value = "Date on which the purchase was performed.")
  public LocalDate getPurchaesDate() {
    return purchaesDate;
  }
  public void setPurchaesDate(LocalDate purchaesDate) {
    this.purchaesDate = purchaesDate;
  }
  public RetailShopping paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }
   
  @ApiModelProperty(value = "Information given by the store related to the payment mehtod used.")
  public String getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
  public RetailShopping invoice(String invoice) {
    this.invoice = invoice;
    return this;
  }
   
  @ApiModelProperty(value = "If available, the invoice ID related to the order.")
  public String getInvoice() {
    return invoice;
  }
  public void setInvoice(String invoice) {
    this.invoice = invoice;
  }
  public RetailShopping shippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }
   
  @ApiModelProperty(value = "Shipping address used for the order.")
  public String getShippingAddress() {
    return shippingAddress;
  }
  public void setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }
  public RetailShopping totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }
   
  @ApiModelProperty(value = "Order total amount including every item bought.")
  public String getTotalAmount() {
    return totalAmount;
  }
  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }
  public RetailShopping items(List<RetailItems> items) {
    this.items = items;
    return this;
  }
  public RetailShopping addItemsItem(RetailItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<RetailItems>();
    }
    this.items.add(itemsItem);
    return this;
  }
   
  @ApiModelProperty(value = "Detail of items included in the order.")
  public List<RetailItems> getItems() {
    return items;
  }
  public void setItems(List<RetailItems> items) {
    this.items = items;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailShopping retailShopping = (RetailShopping) o;
    return Objects.equals(this.id, retailShopping.id) &&
        Objects.equals(this.customerId, retailShopping.customerId) &&
        Objects.equals(this.lookupId, retailShopping.lookupId) &&
        Objects.equals(this.purchaesDate, retailShopping.purchaesDate) &&
        Objects.equals(this.paymentMethod, retailShopping.paymentMethod) &&
        Objects.equals(this.invoice, retailShopping.invoice) &&
        Objects.equals(this.shippingAddress, retailShopping.shippingAddress) &&
        Objects.equals(this.totalAmount, retailShopping.totalAmount) &&
        Objects.equals(this.items, retailShopping.items);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, lookupId, purchaesDate, paymentMethod, invoice, shippingAddress, totalAmount, items);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailShopping {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    lookupId: ").append(toIndentedString(lookupId)).append("\n");
    sb.append("    purchaesDate: ").append(toIndentedString(purchaesDate)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
