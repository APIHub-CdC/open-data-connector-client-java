package mx.com.cdc.odc.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class TelcosClientData {
  @SerializedName("_id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("surnames")
  private String surnames = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("created_at")
  private String createdAt = null;
  @SerializedName("updated_at")
  private String updatedAt = null;
  @SerializedName("account")
  private String account = null;
  public TelcosClientData id(String id) {
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
  public TelcosClientData name(String name) {
    this.name = name;
    return this;
  }
   
  @ApiModelProperty(value = "Customer name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public TelcosClientData surnames(String surnames) {
    this.surnames = surnames;
    return this;
  }
   
  @ApiModelProperty(value = "Customer surnames.")
  public String getSurnames() {
    return surnames;
  }
  public void setSurnames(String surnames) {
    this.surnames = surnames;
  }
  public TelcosClientData email(String email) {
    this.email = email;
    return this;
  }
   
  @ApiModelProperty(value = "Customer email available in the telco platform.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public TelcosClientData createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }
   
  @ApiModelProperty(value = "Created at field used internally by UNNAX.")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  public TelcosClientData updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }
   
  @ApiModelProperty(value = "Updated at field used internally by UNNAX.")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }
  public TelcosClientData account(String account) {
    this.account = account;
    return this;
  }
   
  @ApiModelProperty(value = "If available. Account ID in the telco platform.")
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
    TelcosClientData telcosClientData = (TelcosClientData) o;
    return Objects.equals(this.id, telcosClientData.id) &&
        Objects.equals(this.name, telcosClientData.name) &&
        Objects.equals(this.surnames, telcosClientData.surnames) &&
        Objects.equals(this.email, telcosClientData.email) &&
        Objects.equals(this.createdAt, telcosClientData.createdAt) &&
        Objects.equals(this.updatedAt, telcosClientData.updatedAt) &&
        Objects.equals(this.account, telcosClientData.account);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, name, surnames, email, createdAt, updatedAt, account);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosClientData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surnames: ").append(toIndentedString(surnames)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
