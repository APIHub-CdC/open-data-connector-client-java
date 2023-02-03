package mx.com.cdc.odc.client.model;

import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class TelcosPaymentHistory {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("date")
  private LocalDate date = null;
  @SerializedName("pay_mode")
  private String payMode = null;
  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("phone_number")
  private Integer phoneNumber = null;
  @SerializedName("account")
  private String account = null;
  public TelcosPaymentHistory id(String id) {
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
  public TelcosPaymentHistory date(LocalDate date) {
    this.date = date;
    return this;
  }
   
  @ApiModelProperty(value = "Date on which the payment has been perfomed.")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
  public TelcosPaymentHistory payMode(String payMode) {
    this.payMode = payMode;
    return this;
  }
   
  @ApiModelProperty(value = "Payment method used for the specific payment.")
  public String getPayMode() {
    return payMode;
  }
  public void setPayMode(String payMode) {
    this.payMode = payMode;
  }
  public TelcosPaymentHistory amount(Integer amount) {
    this.amount = amount;
    return this;
  }
   
  @ApiModelProperty(value = "Payment amount.")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  public TelcosPaymentHistory phoneNumber(Integer phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
   
  @ApiModelProperty(value = "Phone number that has been paid with the transaction.")
  public Integer getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(Integer phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public TelcosPaymentHistory account(String account) {
    this.account = account;
    return this;
  }
   
  @ApiModelProperty(value = "If available, account ID given to the specific account.")
  public String getAccount() {
    return account;
  }
  public void setAccount(String account) {
    this.account = account;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelcosPaymentHistory telcosPaymentHistory = (TelcosPaymentHistory) o;
    return Objects.equals(this.id, telcosPaymentHistory.id) &&
        Objects.equals(this.date, telcosPaymentHistory.date) &&
        Objects.equals(this.payMode, telcosPaymentHistory.payMode) &&
        Objects.equals(this.amount, telcosPaymentHistory.amount) &&
        Objects.equals(this.phoneNumber, telcosPaymentHistory.phoneNumber) &&
        Objects.equals(this.account, telcosPaymentHistory.account);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, date, payMode, amount, phoneNumber, account);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosPaymentHistory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    payMode: ").append(toIndentedString(payMode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
