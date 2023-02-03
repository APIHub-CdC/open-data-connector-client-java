package mx.com.cdc.odc.client.model;

import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class InvestmentHistory {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("customer_id")
  private String customerId = null;
  @SerializedName("date")
  private LocalDate date = null;
  public InvestmentHistory id(String id) {
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
  public InvestmentHistory amount(Integer amount) {
    this.amount = amount;
    return this;
  }
   
  @ApiModelProperty(value = "Transaction amount.")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  public InvestmentHistory customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }
   
  @ApiModelProperty(value = "Customer ID related to the transaction.")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }
  public InvestmentHistory date(LocalDate date) {
    this.date = date;
    return this;
  }
   
  @ApiModelProperty(value = "Transaction date.")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentHistory investmentHistory = (InvestmentHistory) o;
    return Objects.equals(this.id, investmentHistory.id) &&
        Objects.equals(this.amount, investmentHistory.amount) &&
        Objects.equals(this.customerId, investmentHistory.customerId) &&
        Objects.equals(this.date, investmentHistory.date);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, amount, customerId, date);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentHistory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
