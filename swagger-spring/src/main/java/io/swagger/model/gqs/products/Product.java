package io.swagger.model.gqs.products;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Product   {
	@JsonProperty("MarketIso") 
	public String marketIso;
	@JsonProperty("DefaultCurrency") 
	public String defaultCurrency;
	@JsonProperty("ProductId") 
	public String productId;
	@JsonProperty("ProductDesc") 
	public String productDesc;
	@JsonProperty("ProductOnline") 
	public String productOnline;
	@JsonProperty("ProductTypeId") 
	public String productTypeId;
	@JsonProperty("ProductTypeDesc") 
	public String productTypeDesc;
	@JsonProperty("ProductStartDate") 
	public String productStartDate;
	@JsonProperty("ProductEndDate") 
	public String productEndDate;
	@JsonProperty("DefaultRate") 
	public String defaultRate;
	@JsonProperty("ManufacturerDepositContribution") 
	public String manufacturerDepositContribution;
	@JsonProperty("MaxPayment") 
	public String maxPayment;
	@JsonProperty("ProductValidations") 
	public ProductValidations productValidations;
	@JsonProperty("ProductFees") 
	public ProductFees productFees;
	@JsonProperty("CapCodes")
	private CapCodes capCodes;
	
	public String getMarketIso() {
		return marketIso;
	}
	public void setMarketIso(String marketIso) {
		this.marketIso = marketIso;
	}
	public String getDefaultCurrency() {
		return defaultCurrency;
	}
	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductOnline() {
		return productOnline;
	}
	public void setProductOnline(String productOnline) {
		this.productOnline = productOnline;
	}
	public String getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getProductTypeDesc() {
		return productTypeDesc;
	}
	public void setProductTypeDesc(String productTypeDesc) {
		this.productTypeDesc = productTypeDesc;
	}
	public String getProductStartDate() {
		return productStartDate;
	}
	public void setProductStartDate(String productStartDate) {
		this.productStartDate = productStartDate;
	}
	public String getProductEndDate() {
		return productEndDate;
	}
	public void setProductEndDate(String productEndDate) {
		this.productEndDate = productEndDate;
	}
	public String getDefaultRate() {
		return defaultRate;
	}
	public void setDefaultRate(String defaultRate) {
		this.defaultRate = defaultRate;
	}
	public String getManufacturerDepositContribution() {
		return manufacturerDepositContribution;
	}
	public void setManufacturerDepositContribution(String manufacturerDepositContribution) {
		this.manufacturerDepositContribution = manufacturerDepositContribution;
	}
	public String getMaxPayment() {
		return maxPayment;
	}
	public void setMaxPayment(String maxPayment) {
		this.maxPayment = maxPayment;
	}
	public ProductValidations getProductValidations() {
		return productValidations;
	}
	public void setProductValidations(ProductValidations productValidations) {
		this.productValidations = productValidations;
	}
	public ProductFees getProductFees() {
		return productFees;
	}
	public void setProductFees(ProductFees productFees) {
		this.productFees = productFees;
	}
	@JsonProperty("CapCodes")
	public CapCodes getCapCodes() {
	return capCodes;
	}
	@JsonProperty("CapCodes")
	public void setCapCodes(CapCodes capCodes) {
	this.capCodes = capCodes;
	}
}

