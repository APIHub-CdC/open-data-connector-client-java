package mx.com.cdc.odc.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class RetailCustomers {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("client_id")
  private String clientId = null;
  @SerializedName("address")
  private List<Object> address = null;
  @SerializedName("birth_date")
  private LocalDate birthDate = null;
  @SerializedName("gender")
  private Integer gender = null;
  @SerializedName("names")
  private String names = null;
  @SerializedName("phones")
  private List<String> phones = null;
  @SerializedName("emails")
  private List<String> emails = null;
  public RetailCustomers id(String id) {
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
  public RetailCustomers clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }
   
  @ApiModelProperty(value = "Client ID given to customer by the store.")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }
  public RetailCustomers address(List<Object> address) {
    this.address = address;
    return this;
  }
  public RetailCustomers addAddressItem(Object addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<Object>();
    }
    this.address.add(addressItem);
    return this;
  }
   
  @ApiModelProperty(value = "Information related to the shipping or home address of the customer")
  public List<Object> getAddress() {
    return address;
  }
  public void setAddress(List<Object> address) {
    this.address = address;
  }
  public RetailCustomers birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }
   
  @ApiModelProperty(value = "Customer's birth date.")
  public LocalDate getBirthDate() {
    return birthDate;
  }
  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }
  public RetailCustomers gender(Integer gender) {
    this.gender = gender;
    return this;
  }
   
  @ApiModelProperty(value = "Customer's gender.")
  public Integer getGender() {
    return gender;
  }
  public void setGender(Integer gender) {
    this.gender = gender;
  }
  public RetailCustomers names(String names) {
    this.names = names;
    return this;
  }
   
  @ApiModelProperty(value = "Customer's name as fetched from the store.")
  public String getNames() {
    return names;
  }
  public void setNames(String names) {
    this.names = names;
  }
  public RetailCustomers phones(List<String> phones) {
    this.phones = phones;
    return this;
  }
  public RetailCustomers addPhonesItem(String phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<String>();
    }
    this.phones.add(phonesItem);
    return this;
  }
   
  @ApiModelProperty(value = "Customer's phone number.")
  public List<String> getPhones() {
    return phones;
  }
  public void setPhones(List<String> phones) {
    this.phones = phones;
  }
  public RetailCustomers emails(List<String> emails) {
    this.emails = emails;
    return this;
  }
  public RetailCustomers addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<String>();
    }
    this.emails.add(emailsItem);
    return this;
  }
   
  @ApiModelProperty(value = "Customer's email available in the store.")
  public List<String> getEmails() {
    return emails;
  }
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailCustomers retailCustomers = (RetailCustomers) o;
    return Objects.equals(this.id, retailCustomers.id) &&
        Objects.equals(this.clientId, retailCustomers.clientId) &&
        Objects.equals(this.address, retailCustomers.address) &&
        Objects.equals(this.birthDate, retailCustomers.birthDate) &&
        Objects.equals(this.gender, retailCustomers.gender) &&
        Objects.equals(this.names, retailCustomers.names) &&
        Objects.equals(this.phones, retailCustomers.phones) &&
        Objects.equals(this.emails, retailCustomers.emails);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, address, birthDate, gender, names, phones, emails);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailCustomers {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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
