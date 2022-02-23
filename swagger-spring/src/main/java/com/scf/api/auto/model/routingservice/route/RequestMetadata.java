package com.scf.api.auto.model.routingservice.route;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestMetadata {
	@JsonProperty("conversationID")
	private String conversationID;
	@JsonProperty("referenceNumber")
	private String referenceNumber;
	@JsonProperty("countryCode")
	private String countryCode;
	@JsonProperty("currency")
	private String currency;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("conversationID")
	public String getConversationID() {
	return conversationID;
	}

	@JsonProperty("conversationID")
	public void setConversationID(String conversationID) {
	this.conversationID = conversationID;
	}

	@JsonProperty("referenceNumber")
	public String getReferenceNumber() {
	return referenceNumber;
	}

	@JsonProperty("referenceNumber")
	public void setReferenceNumber(String referenceNumber) {
	this.referenceNumber = referenceNumber;
	}

	@JsonProperty("countryCode")
	public String getCountryCode() {
	return countryCode;
	}

	@JsonProperty("countryCode")
	public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
	}

	@JsonProperty("currency")
	public String getCurrency() {
	return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
	this.currency = currency;
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
