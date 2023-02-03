package mx.com.cdc.odc.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class AggregationServiceResponsePayloadData {
  @SerializedName("read_accounts")
  private Boolean readAccounts = null;
  @SerializedName("read_customers")
  private Boolean readCustomers = null;
  @SerializedName("merchant_name")
  private String merchantName = "Circulo Credito - INT";
  @SerializedName("merchant_document")
  private String merchantDocument = "-";
  public AggregationServiceResponsePayloadData readAccounts(Boolean readAccounts) {
    this.readAccounts = readAccounts;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Boolean isReadAccounts() {
    return readAccounts;
  }
  public void setReadAccounts(Boolean readAccounts) {
    this.readAccounts = readAccounts;
  }
  public AggregationServiceResponsePayloadData readCustomers(Boolean readCustomers) {
    this.readCustomers = readCustomers;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Boolean isReadCustomers() {
    return readCustomers;
  }
  public void setReadCustomers(Boolean readCustomers) {
    this.readCustomers = readCustomers;
  }
  public AggregationServiceResponsePayloadData merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getMerchantName() {
    return merchantName;
  }
  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }
  public AggregationServiceResponsePayloadData merchantDocument(String merchantDocument) {
    this.merchantDocument = merchantDocument;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getMerchantDocument() {
    return merchantDocument;
  }
  public void setMerchantDocument(String merchantDocument) {
    this.merchantDocument = merchantDocument;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationServiceResponsePayloadData aggregationServiceResponsePayloadData = (AggregationServiceResponsePayloadData) o;
    return Objects.equals(this.readAccounts, aggregationServiceResponsePayloadData.readAccounts) &&
        Objects.equals(this.readCustomers, aggregationServiceResponsePayloadData.readCustomers) &&
        Objects.equals(this.merchantName, aggregationServiceResponsePayloadData.merchantName) &&
        Objects.equals(this.merchantDocument, aggregationServiceResponsePayloadData.merchantDocument);
  }
  @Override
  public int hashCode() {
    return Objects.hash(readAccounts, readCustomers, merchantName, merchantDocument);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationServiceResponsePayloadData {\n");
    
    sb.append("    readAccounts: ").append(toIndentedString(readAccounts)).append("\n");
    sb.append("    readCustomers: ").append(toIndentedString(readCustomers)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantDocument: ").append(toIndentedString(merchantDocument)).append("\n");
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
