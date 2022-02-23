package com.scf.api.auto.model.gqs.calculator;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalTable {
	@JsonProperty("InsuranceAmount") 
    public String insuranceAmount;
    @JsonProperty("FeesPercentage") 
    public String feesPercentage;
    @JsonProperty("FeesAmount") 
    public String feesAmount;
    @JsonProperty("InsuranceDamageAmount") 
    public String insuranceDamageAmount;
    @JsonProperty("InsuranceEmploymentAmount") 
    public String insuranceEmploymentAmount;
    @JsonProperty("InsuranceLifeAmount") 
    public String insuranceLifeAmount;
    
	public String getInsuranceAmount() {
		return insuranceAmount;
	}
	public void setInsuranceAmount(String insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	public String getFeesPercentage() {
		return feesPercentage;
	}
	public void setFeesPercentage(String feesPercentage) {
		this.feesPercentage = feesPercentage;
	}
	public String getFeesAmount() {
		return feesAmount;
	}
	public void setFeesAmount(String feesAmount) {
		this.feesAmount = feesAmount;
	}
	public String getInsuranceDamageAmount() {
		return insuranceDamageAmount;
	}
	public void setInsuranceDamageAmount(String insuranceDamageAmount) {
		this.insuranceDamageAmount = insuranceDamageAmount;
	}
	public String getInsuranceEmploymentAmount() {
		return insuranceEmploymentAmount;
	}
	public void setInsuranceEmploymentAmount(String insuranceEmploymentAmount) {
		this.insuranceEmploymentAmount = insuranceEmploymentAmount;
	}
	public String getInsuranceLifeAmount() {
		return insuranceLifeAmount;
	}
	public void setInsuranceLifeAmount(String insuranceLifeAmount) {
		this.insuranceLifeAmount = insuranceLifeAmount;
	}
    
    
}
