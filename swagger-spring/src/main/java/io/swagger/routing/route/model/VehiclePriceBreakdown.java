package io.swagger.routing.route.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VehiclePriceBreakdown {
	@JsonProperty("totalVehiclePrice")
	private Integer totalVehiclePrice;
	@JsonProperty("vehiclePrice")
	private Integer vehiclePrice;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("totalVehiclePrice")
	public Integer getTotalVehiclePrice() {
	return totalVehiclePrice;
	}

	@JsonProperty("totalVehiclePrice")
	public void setTotalVehiclePrice(Integer totalVehiclePrice) {
	this.totalVehiclePrice = totalVehiclePrice;
	}

	@JsonProperty("vehiclePrice")
	public Integer getVehiclePrice() {
	return vehiclePrice;
	}

	@JsonProperty("vehiclePrice")
	public void setVehiclePrice(Integer vehiclePrice) {
	this.vehiclePrice = vehiclePrice;
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
