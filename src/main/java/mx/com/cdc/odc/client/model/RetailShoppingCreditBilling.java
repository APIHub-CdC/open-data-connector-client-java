package mx.com.cdc.odc.client.model;

import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class RetailShoppingCreditBilling {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("customer_id")
  private String customerId = null;
  @SerializedName("lookup_id")
  private String lookupId = null;
  @SerializedName("period")
  private String period = null;
  @SerializedName("expenses")
  private Integer expenses = null;
  @SerializedName("payments")
  private Integer payments = null;
  @SerializedName("due_date")
  private LocalDate dueDate = null;
  public RetailShoppingCreditBilling id(String id) {
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
  public RetailShoppingCreditBilling customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }
   
  @ApiModelProperty(value = "Customer ID given to customer by the store.")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }
  public RetailShoppingCreditBilling lookupId(String lookupId) {
    this.lookupId = lookupId;
    return this;
  }
   
  @ApiModelProperty(value = "ID given to the specific billing.")
  public String getLookupId() {
    return lookupId;
  }
  public void setLookupId(String lookupId) {
    this.lookupId = lookupId;
  }
  public RetailShoppingCreditBilling period(String period) {
    this.period = period;
    return this;
  }
   
  @ApiModelProperty(value = "Billing period.")
  public String getPeriod() {
    return period;
  }
  public void setPeriod(String period) {
    this.period = period;
  }
  public RetailShoppingCreditBilling expenses(Integer expenses) {
    this.expenses = expenses;
    return this;
  }
   
  @ApiModelProperty(value = "Total amount of expenses during the billed period.")
  public Integer getExpenses() {
    return expenses;
  }
  public void setExpenses(Integer expenses) {
    this.expenses = expenses;
  }
  public RetailShoppingCreditBilling payments(Integer payments) {
    this.payments = payments;
    return this;
  }
   
  @ApiModelProperty(value = "Total amount of payments during the billed period.")
  public Integer getPayments() {
    return payments;
  }
  public void setPayments(Integer payments) {
    this.payments = payments;
  }
  public RetailShoppingCreditBilling dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }
   
  @ApiModelProperty(value = "Date on which the payment must be fulfilled.")
  public LocalDate getDueDate() {
    return dueDate;
  }
  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailShoppingCreditBilling retailShoppingCreditBilling = (RetailShoppingCreditBilling) o;
    return Objects.equals(this.id, retailShoppingCreditBilling.id) &&
        Objects.equals(this.customerId, retailShoppingCreditBilling.customerId) &&
        Objects.equals(this.lookupId, retailShoppingCreditBilling.lookupId) &&
        Objects.equals(this.period, retailShoppingCreditBilling.period) &&
        Objects.equals(this.expenses, retailShoppingCreditBilling.expenses) &&
        Objects.equals(this.payments, retailShoppingCreditBilling.payments) &&
        Objects.equals(this.dueDate, retailShoppingCreditBilling.dueDate);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, lookupId, period, expenses, payments, dueDate);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailShoppingCreditBilling {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    lookupId: ").append(toIndentedString(lookupId)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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
