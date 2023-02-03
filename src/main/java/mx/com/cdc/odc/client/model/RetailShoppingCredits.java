package mx.com.cdc.odc.client.model;

import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class RetailShoppingCredits {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("customer_id")
  private String customerId = null;
  @SerializedName("lookup_id")
  private String lookupId = null;
  @SerializedName("current_balance")
  private Integer currentBalance = null;
  @SerializedName("current_debt")
  private Integer currentDebt = null;
  @SerializedName("credit_available")
  private Integer creditAvailable = null;
  @SerializedName("min_payment")
  private Integer minPayment = null;
  @SerializedName("no_interest_payment")
  private Integer noInterestPayment = null;
  @SerializedName("due_date")
  private LocalDate dueDate = null;
  @SerializedName("wallet_balance")
  private Integer walletBalance = null;
  public RetailShoppingCredits id(String id) {
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
  public RetailShoppingCredits customerId(String customerId) {
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
  public RetailShoppingCredits lookupId(String lookupId) {
    this.lookupId = lookupId;
    return this;
  }
   
  @ApiModelProperty(value = "ID given to the specific loan or credit.")
  public String getLookupId() {
    return lookupId;
  }
  public void setLookupId(String lookupId) {
    this.lookupId = lookupId;
  }
  public RetailShoppingCredits currentBalance(Integer currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }
   
  @ApiModelProperty(value = "Only for Credit Cards or Line of Credits Balance owed by the customer.")
  public Integer getCurrentBalance() {
    return currentBalance;
  }
  public void setCurrentBalance(Integer currentBalance) {
    this.currentBalance = currentBalance;
  }
  public RetailShoppingCredits currentDebt(Integer currentDebt) {
    this.currentDebt = currentDebt;
    return this;
  }
   
  @ApiModelProperty(value = "Only fof loans Balance owed by the customer.")
  public Integer getCurrentDebt() {
    return currentDebt;
  }
  public void setCurrentDebt(Integer currentDebt) {
    this.currentDebt = currentDebt;
  }
  public RetailShoppingCredits creditAvailable(Integer creditAvailable) {
    this.creditAvailable = creditAvailable;
    return this;
  }
   
  @ApiModelProperty(value = "Only for Credit Cards or Line of Credits Credit available for new purchases.")
  public Integer getCreditAvailable() {
    return creditAvailable;
  }
  public void setCreditAvailable(Integer creditAvailable) {
    this.creditAvailable = creditAvailable;
  }
  public RetailShoppingCredits minPayment(Integer minPayment) {
    this.minPayment = minPayment;
    return this;
  }
   
  @ApiModelProperty(value = "For Credit Cards or Line of Credits. Minimum payment to avoid default for Loans installment amount.")
  public Integer getMinPayment() {
    return minPayment;
  }
  public void setMinPayment(Integer minPayment) {
    this.minPayment = minPayment;
  }
  public RetailShoppingCredits noInterestPayment(Integer noInterestPayment) {
    this.noInterestPayment = noInterestPayment;
    return this;
  }
   
  @ApiModelProperty(value = "Only for Credit Cards or Line of Credits payment needed to avoid interest charges.")
  public Integer getNoInterestPayment() {
    return noInterestPayment;
  }
  public void setNoInterestPayment(Integer noInterestPayment) {
    this.noInterestPayment = noInterestPayment;
  }
  public RetailShoppingCredits dueDate(LocalDate dueDate) {
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
  public RetailShoppingCredits walletBalance(Integer walletBalance) {
    this.walletBalance = walletBalance;
    return this;
  }
   
  @ApiModelProperty(value = "When available, balance of the Store Wallet.")
  public Integer getWalletBalance() {
    return walletBalance;
  }
  public void setWalletBalance(Integer walletBalance) {
    this.walletBalance = walletBalance;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailShoppingCredits retailShoppingCredits = (RetailShoppingCredits) o;
    return Objects.equals(this.id, retailShoppingCredits.id) &&
        Objects.equals(this.customerId, retailShoppingCredits.customerId) &&
        Objects.equals(this.lookupId, retailShoppingCredits.lookupId) &&
        Objects.equals(this.currentBalance, retailShoppingCredits.currentBalance) &&
        Objects.equals(this.currentDebt, retailShoppingCredits.currentDebt) &&
        Objects.equals(this.creditAvailable, retailShoppingCredits.creditAvailable) &&
        Objects.equals(this.minPayment, retailShoppingCredits.minPayment) &&
        Objects.equals(this.noInterestPayment, retailShoppingCredits.noInterestPayment) &&
        Objects.equals(this.dueDate, retailShoppingCredits.dueDate) &&
        Objects.equals(this.walletBalance, retailShoppingCredits.walletBalance);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, lookupId, currentBalance, currentDebt, creditAvailable, minPayment, noInterestPayment, dueDate, walletBalance);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailShoppingCredits {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    lookupId: ").append(toIndentedString(lookupId)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    currentDebt: ").append(toIndentedString(currentDebt)).append("\n");
    sb.append("    creditAvailable: ").append(toIndentedString(creditAvailable)).append("\n");
    sb.append("    minPayment: ").append(toIndentedString(minPayment)).append("\n");
    sb.append("    noInterestPayment: ").append(toIndentedString(noInterestPayment)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    walletBalance: ").append(toIndentedString(walletBalance)).append("\n");
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
