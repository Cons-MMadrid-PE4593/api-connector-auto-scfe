package io.swagger.model.routingservice.route;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
	@JsonProperty("line1")
	private String line1;
	@JsonProperty("line2")
	private String line2;
	@JsonProperty("city")
	private String city;
	@JsonProperty("postalCode")
	private String postalCode;
	@JsonProperty("stateOrProvince")
	private String stateOrProvince;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("line1")
	public String getLine1() {
	return line1;
	}

	@JsonProperty("line1")
	public void setLine1(String line1) {
	this.line1 = line1;
	}

	@JsonProperty("line2")
	public String getLine2() {
	return line2;
	}

	@JsonProperty("line2")
	public void setLine2(String line2) {
	this.line2 = line2;
	}

	@JsonProperty("city")
	public String getCity() {
	return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
	this.city = city;
	}

	@JsonProperty("postalCode")
	public String getPostalCode() {
	return postalCode;
	}

	@JsonProperty("postalCode")
	public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
	}

	@JsonProperty("stateOrProvince")
	public String getStateOrProvince() {
	return stateOrProvince;
	}

	@JsonProperty("stateOrProvince")
	public void setStateOrProvince(String stateOrProvince) {
	this.stateOrProvince = stateOrProvince;
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
