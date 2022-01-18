package io.swagger.routing.route.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FinancialDataRequested {
	@JsonProperty("productID")
	private String productID;
	@JsonProperty("applicationType")
	private String applicationType;
	@JsonProperty("downPayment")
	private Integer downPayment;
	@JsonProperty("termInMonths")
	private Integer termInMonths;
	@JsonProperty("paymentAmount")
	private Double paymentAmount;
	@JsonProperty("lifeInsurance")
	private String lifeInsurance;
	@JsonProperty("employmentInsurance")
	private String employmentInsurance;
	@JsonProperty("damageInsurance")
	private String damageInsurance;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("productID")
	public String getProductID() {
	return productID;
	}

	@JsonProperty("productID")
	public void setProductID(String productID) {
	this.productID = productID;
	}

	@JsonProperty("applicationType")
	public String getApplicationType() {
	return applicationType;
	}

	@JsonProperty("applicationType")
	public void setApplicationType(String applicationType) {
	this.applicationType = applicationType;
	}

	@JsonProperty("downPayment")
	public Integer getDownPayment() {
	return downPayment;
	}

	@JsonProperty("downPayment")
	public void setDownPayment(Integer downPayment) {
	this.downPayment = downPayment;
	}

	@JsonProperty("termInMonths")
	public Integer getTermInMonths() {
	return termInMonths;
	}

	@JsonProperty("termInMonths")
	public void setTermInMonths(Integer termInMonths) {
	this.termInMonths = termInMonths;
	}

	@JsonProperty("paymentAmount")
	public Double getPaymentAmount() {
	return paymentAmount;
	}

	@JsonProperty("paymentAmount")
	public void setPaymentAmount(Double paymentAmount) {
	this.paymentAmount = paymentAmount;
	}

	@JsonProperty("lifeInsurance")
	public String getLifeInsurance() {
	return lifeInsurance;
	}

	@JsonProperty("lifeInsurance")
	public void setLifeInsurance(String lifeInsurance) {
	this.lifeInsurance = lifeInsurance;
	}

	@JsonProperty("employmentInsurance")
	public String getEmploymentInsurance() {
	return employmentInsurance;
	}

	@JsonProperty("employmentInsurance")
	public void setEmploymentInsurance(String employmentInsurance) {
	this.employmentInsurance = employmentInsurance;
	}

	@JsonProperty("damageInsurance")
	public String getDamageInsurance() {
	return damageInsurance;
	}

	@JsonProperty("damageInsurance")
	public void setDamageInsurance(String damageInsurance) {
	this.damageInsurance = damageInsurance;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

}
