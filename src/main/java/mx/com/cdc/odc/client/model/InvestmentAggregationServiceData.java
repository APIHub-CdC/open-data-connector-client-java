package mx.com.cdc.odc.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class InvestmentAggregationServiceData {
  @SerializedName("request_code")
  private String requestCode = null;
  @SerializedName("customers")
  private List<InvestmentCustomers> customers = null;
  @SerializedName("data_save_checkbox")
  private String dataSaveCheckbox = null;
  @SerializedName("portfolio")
  private List<InvestmentPortfolio> portfolio = null;
  @SerializedName("history")
  private List<InvestmentHistory> history = null;
  @SerializedName("errors")
  private List<Object> errors = null;
  public InvestmentAggregationServiceData requestCode(String requestCode) {
    this.requestCode = requestCode;
    return this;
  }
   
  @ApiModelProperty(value = "Request code used to identify this order. Must be unique.")
  public String getRequestCode() {
    return requestCode;
  }
  public void setRequestCode(String requestCode) {
    this.requestCode = requestCode;
  }
  public InvestmentAggregationServiceData customers(List<InvestmentCustomers> customers) {
    this.customers = customers;
    return this;
  }
  public InvestmentAggregationServiceData addCustomersItem(InvestmentCustomers customersItem) {
    if (this.customers == null) {
      this.customers = new ArrayList<InvestmentCustomers>();
    }
    this.customers.add(customersItem);
    return this;
  }
   
  @ApiModelProperty(value = "Customer list.")
  public List<InvestmentCustomers> getCustomers() {
    return customers;
  }
  public void setCustomers(List<InvestmentCustomers> customers) {
    this.customers = customers;
  }
  public InvestmentAggregationServiceData dataSaveCheckbox(String dataSaveCheckbox) {
    this.dataSaveCheckbox = dataSaveCheckbox;
    return this;
  }
   
  @ApiModelProperty(value = "Informational data used by UNNAX.")
  public String getDataSaveCheckbox() {
    return dataSaveCheckbox;
  }
  public void setDataSaveCheckbox(String dataSaveCheckbox) {
    this.dataSaveCheckbox = dataSaveCheckbox;
  }
  public InvestmentAggregationServiceData portfolio(List<InvestmentPortfolio> portfolio) {
    this.portfolio = portfolio;
    return this;
  }
  public InvestmentAggregationServiceData addPortfolioItem(InvestmentPortfolio portfolioItem) {
    if (this.portfolio == null) {
      this.portfolio = new ArrayList<InvestmentPortfolio>();
    }
    this.portfolio.add(portfolioItem);
    return this;
  }
   
  @ApiModelProperty(value = "Portfolio of products hired.")
  public List<InvestmentPortfolio> getPortfolio() {
    return portfolio;
  }
  public void setPortfolio(List<InvestmentPortfolio> portfolio) {
    this.portfolio = portfolio;
  }
  public InvestmentAggregationServiceData history(List<InvestmentHistory> history) {
    this.history = history;
    return this;
  }
  public InvestmentAggregationServiceData addHistoryItem(InvestmentHistory historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<InvestmentHistory>();
    }
    this.history.add(historyItem);
    return this;
  }
   
  @ApiModelProperty(value = "Deposit and withdrawal history.")
  public List<InvestmentHistory> getHistory() {
    return history;
  }
  public void setHistory(List<InvestmentHistory> history) {
    this.history = history;
  }
  public InvestmentAggregationServiceData errors(List<Object> errors) {
    this.errors = errors;
    return this;
  }
  public InvestmentAggregationServiceData addErrorsItem(Object errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Object>();
    }
    this.errors.add(errorsItem);
    return this;
  }
   
  @ApiModelProperty(value = "Shows errors related to the aggregation process.")
  public List<Object> getErrors() {
    return errors;
  }
  public void setErrors(List<Object> errors) {
    this.errors = errors;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentAggregationServiceData investmentAggregationServiceData = (InvestmentAggregationServiceData) o;
    return Objects.equals(this.requestCode, investmentAggregationServiceData.requestCode) &&
        Objects.equals(this.customers, investmentAggregationServiceData.customers) &&
        Objects.equals(this.dataSaveCheckbox, investmentAggregationServiceData.dataSaveCheckbox) &&
        Objects.equals(this.portfolio, investmentAggregationServiceData.portfolio) &&
        Objects.equals(this.history, investmentAggregationServiceData.history) &&
        Objects.equals(this.errors, investmentAggregationServiceData.errors);
  }
  @Override
  public int hashCode() {
    return Objects.hash(requestCode, customers, dataSaveCheckbox, portfolio, history, errors);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentAggregationServiceData {\n");
    
    sb.append("    requestCode: ").append(toIndentedString(requestCode)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    dataSaveCheckbox: ").append(toIndentedString(dataSaveCheckbox)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
