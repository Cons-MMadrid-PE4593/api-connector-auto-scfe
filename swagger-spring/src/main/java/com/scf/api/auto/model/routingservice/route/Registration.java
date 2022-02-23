package com.scf.api.auto.model.routingservice.route;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Registration {
	@JsonProperty("plate")
	private String plate;
	@JsonProperty("firstDate")
	private String firstDate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("plate")
	public String getPlate() {
	return plate;
	}

	@JsonProperty("plate")
	public void setPlate(String plate) {
	this.plate = plate;
	}

	@JsonProperty("firstDate")
	public String getFirstDate() {
	return firstDate;
	}

	@JsonProperty("firstDate")
	public void setFirstDate(String firstDate) {
	this.firstDate = firstDate;
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
