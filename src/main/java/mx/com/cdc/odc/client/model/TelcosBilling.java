package mx.com.cdc.odc.client.model;

import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class TelcosBilling {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("account")
  private String account = null;
  @SerializedName("date")
  private LocalDate date = null;
  @SerializedName("rent")
  private String rent = null;
  @SerializedName("addition_services")
  private Integer additionServices = null;
  @SerializedName("air_time")
  private Integer airTime = null;
  @SerializedName("roaming_air_time")
  private Integer roamingAirTime = null;
  @SerializedName("roaming_long_distance")
  private Integer roamingLongDistance = null;
  @SerializedName("internet_services")
  private Integer internetServices = null;
  @SerializedName("taxes")
  private Integer taxes = null;
  @SerializedName("balance")
  private Integer balance = null;
  @SerializedName("previous_balance")
  private Integer previousBalance = null;
  public TelcosBilling id(String id) {
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
  public TelcosBilling account(String account) {
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
  public TelcosBilling date(LocalDate date) {
    this.date = date;
    return this;
  }
   
  @ApiModelProperty(value = "Billing date.")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
  public TelcosBilling rent(String rent) {
    this.rent = rent;
    return this;
  }
   
  @ApiModelProperty(value = "Service rent amount.")
  public String getRent() {
    return rent;
  }
  public void setRent(String rent) {
    this.rent = rent;
  }
  public TelcosBilling additionServices(Integer additionServices) {
    this.additionServices = additionServices;
    return this;
  }
   
  @ApiModelProperty(value = "Amount charged because of additional services.")
  public Integer getAdditionServices() {
    return additionServices;
  }
  public void setAdditionServices(Integer additionServices) {
    this.additionServices = additionServices;
  }
  public TelcosBilling airTime(Integer airTime) {
    this.airTime = airTime;
    return this;
  }
   
  @ApiModelProperty(value = "Amount charged because of air time services.")
  public Integer getAirTime() {
    return airTime;
  }
  public void setAirTime(Integer airTime) {
    this.airTime = airTime;
  }
  public TelcosBilling roamingAirTime(Integer roamingAirTime) {
    this.roamingAirTime = roamingAirTime;
    return this;
  }
   
  @ApiModelProperty(value = "Amount charged because of reaming air time services.")
  public Integer getRoamingAirTime() {
    return roamingAirTime;
  }
  public void setRoamingAirTime(Integer roamingAirTime) {
    this.roamingAirTime = roamingAirTime;
  }
  public TelcosBilling roamingLongDistance(Integer roamingLongDistance) {
    this.roamingLongDistance = roamingLongDistance;
    return this;
  }
   
  @ApiModelProperty(value = "Amounat charged because of long distance air time services.")
  public Integer getRoamingLongDistance() {
    return roamingLongDistance;
  }
  public void setRoamingLongDistance(Integer roamingLongDistance) {
    this.roamingLongDistance = roamingLongDistance;
  }
  public TelcosBilling internetServices(Integer internetServices) {
    this.internetServices = internetServices;
    return this;
  }
   
  @ApiModelProperty(value = "Amount charged because of internet services.")
  public Integer getInternetServices() {
    return internetServices;
  }
  public void setInternetServices(Integer internetServices) {
    this.internetServices = internetServices;
  }
  public TelcosBilling taxes(Integer taxes) {
    this.taxes = taxes;
    return this;
  }
   
  @ApiModelProperty(value = "Amount charged because of taxes.")
  public Integer getTaxes() {
    return taxes;
  }
  public void setTaxes(Integer taxes) {
    this.taxes = taxes;
  }
  public TelcosBilling balance(Integer balance) {
    this.balance = balance;
    return this;
  }
   
  @ApiModelProperty(value = "Account balance.")
  public Integer getBalance() {
    return balance;
  }
  public void setBalance(Integer balance) {
    this.balance = balance;
  }
  public TelcosBilling previousBalance(Integer previousBalance) {
    this.previousBalance = previousBalance;
    return this;
  }
   
  @ApiModelProperty(value = "Balance remaning from previous billing.")
  public Integer getPreviousBalance() {
    return previousBalance;
  }
  public void setPreviousBalance(Integer previousBalance) {
    this.previousBalance = previousBalance;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelcosBilling telcosBilling = (TelcosBilling) o;
    return Objects.equals(this.id, telcosBilling.id) &&
        Objects.equals(this.account, telcosBilling.account) &&
        Objects.equals(this.date, telcosBilling.date) &&
        Objects.equals(this.rent, telcosBilling.rent) &&
        Objects.equals(this.additionServices, telcosBilling.additionServices) &&
        Objects.equals(this.airTime, telcosBilling.airTime) &&
        Objects.equals(this.roamingAirTime, telcosBilling.roamingAirTime) &&
        Objects.equals(this.roamingLongDistance, telcosBilling.roamingLongDistance) &&
        Objects.equals(this.internetServices, telcosBilling.internetServices) &&
        Objects.equals(this.taxes, telcosBilling.taxes) &&
        Objects.equals(this.balance, telcosBilling.balance) &&
        Objects.equals(this.previousBalance, telcosBilling.previousBalance);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, account, date, rent, additionServices, airTime, roamingAirTime, roamingLongDistance, internetServices, taxes, balance, previousBalance);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosBilling {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    rent: ").append(toIndentedString(rent)).append("\n");
    sb.append("    additionServices: ").append(toIndentedString(additionServices)).append("\n");
    sb.append("    airTime: ").append(toIndentedString(airTime)).append("\n");
    sb.append("    roamingAirTime: ").append(toIndentedString(roamingAirTime)).append("\n");
    sb.append("    roamingLongDistance: ").append(toIndentedString(roamingLongDistance)).append("\n");
    sb.append("    internetServices: ").append(toIndentedString(internetServices)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    previousBalance: ").append(toIndentedString(previousBalance)).append("\n");
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
