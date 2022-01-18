package io.swagger.routing.route.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Odometer {
	@JsonProperty("numUnits")
	private Integer numUnits;
	@JsonProperty("UOM")
	private String uom;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("numUnits")
	public Integer getNumUnits() {
	return numUnits;
	}

	@JsonProperty("numUnits")
	public void setNumUnits(Integer numUnits) {
	this.numUnits = numUnits;
	}

	@JsonProperty("UOM")
	public String getUom() {
	return uom;
	}

	@JsonProperty("UOM")
	public void setUom(String uom) {
	this.uom = uom;
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
