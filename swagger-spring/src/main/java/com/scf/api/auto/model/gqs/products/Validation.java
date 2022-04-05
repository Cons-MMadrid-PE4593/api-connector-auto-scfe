package com.scf.api.auto.model.gqs.products;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Validation {
	@JsonProperty("MinDeposit") 
    public String minDeposit;
    @JsonProperty("MaxDeposit") 
    public String maxDeposit;
    @JsonProperty("Rate") 
    public String rate;
    @JsonProperty("MinAmountFinanced") 
    public String minAmountFinanced;
    @JsonProperty("MaxAmountFinanced") 
    public String maxAmountFinanced;
    @JsonProperty("MinVehicleAgeAtStart") 
    public String minVehicleAgeAtStart;
    @JsonProperty("MaxVehicleAgeAtStart") 
    public String maxVehicleAgeAtStart;
    @JsonProperty("MaxVehicleAgeAtEnd") 
    public String maxVehicleAgeAtEnd;
    @JsonProperty("Period") 
    public String period;
    @JsonProperty("MaxPeriod") 
    public String maxPeriod;
    @JsonProperty("MinPeriod") 
    public String minPeriod;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
	public String getMinDeposit() {
		return minDeposit;
	}
	public void setMinDeposit(String minDeposit) {
		this.minDeposit = minDeposit;
	}
	public String getMaxDeposit() {
		return maxDeposit;
	}
	public void setMaxDeposit(String maxDeposit) {
		this.maxDeposit = maxDeposit;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getMinAmountFinanced() {
		return minAmountFinanced;
	}
	public void setMinAmountFinanced(String minAmountFinanced) {
		this.minAmountFinanced = minAmountFinanced;
	}
	public String getMaxAmountFinanced() {
		return maxAmountFinanced;
	}
	public void setMaxAmountFinanced(String maxAmountFinanced) {
		this.maxAmountFinanced = maxAmountFinanced;
	}
	public String getMinVehicleAgeAtStart() {
		return minVehicleAgeAtStart;
	}
	public void setMinVehicleAgeAtStart(String minVehicleAgeAtStart) {
		this.minVehicleAgeAtStart = minVehicleAgeAtStart;
	}
	public String getMaxVehicleAgeAtStart() {
		return maxVehicleAgeAtStart;
	}
	public void setMaxVehicleAgeAtStart(String maxVehicleAgeAtStart) {
		this.maxVehicleAgeAtStart = maxVehicleAgeAtStart;
	}
	public String getMaxVehicleAgeAtEnd() {
		return maxVehicleAgeAtEnd;
	}
	public void setMaxVehicleAgeAtEnd(String maxVehicleAgeAtEnd) {
		this.maxVehicleAgeAtEnd = maxVehicleAgeAtEnd;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getMaxPeriod() {
		return maxPeriod;
	}
	public void setMaxPeriod(String maxPeriod) {
		this.maxPeriod = maxPeriod;
	}
	public String getMinPeriod() {
		return minPeriod;
	}
	public void setMinPeriod(String minPeriod) {
		this.minPeriod = minPeriod;
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
