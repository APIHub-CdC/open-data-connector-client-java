package mx.com.cdc.odc.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class TelcosSummaries {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("plan_name")
  private String planName = null;
  @SerializedName("pack_name")
  private String packName = null;
  @SerializedName("balance")
  private String balance = null;
  @SerializedName("mb_included")
  private BigDecimal mbIncluded = null;
  @SerializedName("mb_consumed")
  private BigDecimal mbConsumed = null;
  @SerializedName("available_minutes")
  private String availableMinutes = null;
  @SerializedName("available_sms")
  private String availableSms = null;
  @SerializedName("account")
  private String account = null;
  @SerializedName("payment_date")
  private String paymentDate = null;
  @SerializedName("credit_limit_date")
  private String creditLimitDate = null;
  @SerializedName("valid_until")
  private String validUntil = null;
  public TelcosSummaries id(String id) {
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
  public TelcosSummaries planName(String planName) {
    this.planName = planName;
    return this;
  }
   
  @ApiModelProperty(value = "Name given to the hired plan.")
  public String getPlanName() {
    return planName;
  }
  public void setPlanName(String planName) {
    this.planName = planName;
  }
  public TelcosSummaries packName(String packName) {
    this.packName = packName;
    return this;
  }
   
  @ApiModelProperty(value = "If available, name given by the telco company to the specific pack.")
  public String getPackName() {
    return packName;
  }
  public void setPackName(String packName) {
    this.packName = packName;
  }
  public TelcosSummaries balance(String balance) {
    this.balance = balance;
    return this;
  }
   
  @ApiModelProperty(value = "Balance to be paid before the payment date.")
  public String getBalance() {
    return balance;
  }
  public void setBalance(String balance) {
    this.balance = balance;
  }
  public TelcosSummaries mbIncluded(BigDecimal mbIncluded) {
    this.mbIncluded = mbIncluded;
    return this;
  }
   
  @ApiModelProperty(value = "MB included in the hired plan")
  public BigDecimal getMbIncluded() {
    return mbIncluded;
  }
  public void setMbIncluded(BigDecimal mbIncluded) {
    this.mbIncluded = mbIncluded;
  }
  public TelcosSummaries mbConsumed(BigDecimal mbConsumed) {
    this.mbConsumed = mbConsumed;
    return this;
  }
   
  @ApiModelProperty(value = "MB consumed up to date.")
  public BigDecimal getMbConsumed() {
    return mbConsumed;
  }
  public void setMbConsumed(BigDecimal mbConsumed) {
    this.mbConsumed = mbConsumed;
  }
  public TelcosSummaries availableMinutes(String availableMinutes) {
    this.availableMinutes = availableMinutes;
    return this;
  }
   
  @ApiModelProperty(value = "Available air time for the specific account.")
  public String getAvailableMinutes() {
    return availableMinutes;
  }
  public void setAvailableMinutes(String availableMinutes) {
    this.availableMinutes = availableMinutes;
  }
  public TelcosSummaries availableSms(String availableSms) {
    this.availableSms = availableSms;
    return this;
  }
   
  @ApiModelProperty(value = "SMS available in the specific account.")
  public String getAvailableSms() {
    return availableSms;
  }
  public void setAvailableSms(String availableSms) {
    this.availableSms = availableSms;
  }
  public TelcosSummaries account(String account) {
    this.account = account;
    return this;
  }
   
  @ApiModelProperty(value = "If available, the account name given by the telco company to the aggregated account.")
  public String getAccount() {
    return account;
  }
  public void setAccount(String account) {
    this.account = account;
  }
  public TelcosSummaries paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }
   
  @ApiModelProperty(value = "Lijmit payment date. Shown when available.")
  public String getPaymentDate() {
    return paymentDate;
  }
  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }
  public TelcosSummaries creditLimitDate(String creditLimitDate) {
    this.creditLimitDate = creditLimitDate;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getCreditLimitDate() {
    return creditLimitDate;
  }
  public void setCreditLimitDate(String creditLimitDate) {
    this.creditLimitDate = creditLimitDate;
  }
  public TelcosSummaries validUntil(String validUntil) {
    this.validUntil = validUntil;
    return this;
  }
   
  @ApiModelProperty(value = "Pack validity date.")
  public String getValidUntil() {
    return validUntil;
  }
  public void setValidUntil(String validUntil) {
    this.validUntil = validUntil;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelcosSummaries telcosSummaries = (TelcosSummaries) o;
    return Objects.equals(this.id, telcosSummaries.id) &&
        Objects.equals(this.planName, telcosSummaries.planName) &&
        Objects.equals(this.packName, telcosSummaries.packName) &&
        Objects.equals(this.balance, telcosSummaries.balance) &&
        Objects.equals(this.mbIncluded, telcosSummaries.mbIncluded) &&
        Objects.equals(this.mbConsumed, telcosSummaries.mbConsumed) &&
        Objects.equals(this.availableMinutes, telcosSummaries.availableMinutes) &&
        Objects.equals(this.availableSms, telcosSummaries.availableSms) &&
        Objects.equals(this.account, telcosSummaries.account) &&
        Objects.equals(this.paymentDate, telcosSummaries.paymentDate) &&
        Objects.equals(this.creditLimitDate, telcosSummaries.creditLimitDate) &&
        Objects.equals(this.validUntil, telcosSummaries.validUntil);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, planName, packName, balance, mbIncluded, mbConsumed, availableMinutes, availableSms, account, paymentDate, creditLimitDate, validUntil);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosSummaries {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    packName: ").append(toIndentedString(packName)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    mbIncluded: ").append(toIndentedString(mbIncluded)).append("\n");
    sb.append("    mbConsumed: ").append(toIndentedString(mbConsumed)).append("\n");
    sb.append("    availableMinutes: ").append(toIndentedString(availableMinutes)).append("\n");
    sb.append("    availableSms: ").append(toIndentedString(availableSms)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    creditLimitDate: ").append(toIndentedString(creditLimitDate)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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
