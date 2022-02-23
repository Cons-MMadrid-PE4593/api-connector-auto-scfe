package com.scf.api.auto.model.routingservice.route;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoRoutingData {

	@JsonProperty("applicationArea")
	private ApplicationArea applicationArea;
	@JsonProperty("requestMetadata")
	private RequestMetadata requestMetadata;
	@JsonProperty("userRedirectURL")
	private String userRedirectURL;
	@JsonProperty("primaryApplicant")
	private PrimaryApplicant primaryApplicant;
	@JsonProperty("vehicleInfo")
	private VehicleInfo vehicleInfo;
	@JsonProperty("financialDataRequested")
	private FinancialDataRequested financialDataRequested;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonProperty("applicationArea")
	public ApplicationArea getApplicationArea() {
		return applicationArea;
	}
	
	@JsonProperty("applicationArea")
	public void setApplicationArea(ApplicationArea applicationArea) {
		this.applicationArea = applicationArea;
	}
	
	@JsonProperty("requestMetadata")
	public RequestMetadata getRequestMetadata() {
		return requestMetadata;
	}
	
	@JsonProperty("requestMetadata")
	public void setRequestMetadata(RequestMetadata requestMetadata) {
		this.requestMetadata = requestMetadata;
	}
	
	@JsonProperty("userRedirectURL")
	public String getUserRedirectURL() {
		return userRedirectURL;
	}
	
	@JsonProperty("userRedirectURL")
	public void setUserRedirectURL(String userRedirectURL) {
		this.userRedirectURL = userRedirectURL;
	}
	
	@JsonProperty("primaryApplicant")
	public PrimaryApplicant getPrimaryApplicant() {
		return primaryApplicant;
	}
	
	@JsonProperty("primaryApplicant")
	public void setPrimaryApplicant(PrimaryApplicant primaryApplicant) {
		this.primaryApplicant = primaryApplicant;
	}
	
	@JsonProperty("vehicleInfo")
	public VehicleInfo getVehicleInfo() {
		return vehicleInfo;
	}
	
	@JsonProperty("vehicleInfo")
	public void setVehicleInfo(VehicleInfo vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}
	
	@JsonProperty("financialDataRequested")
	public FinancialDataRequested getFinancialDataRequested() {
		return financialDataRequested;
	}
	
	@JsonProperty("financialDataRequested")
	public void setFinancialDataRequested(FinancialDataRequested financialDataRequested) {
		this.financialDataRequested = financialDataRequested;
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