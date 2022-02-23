package com.scf.api.auto.model.giws.vehicles;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "VehiclesResult" })

public class VehiclesResponse {

	@JsonProperty("VehiclesResult")
	private VehiclesResult getVehiclesResult;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("VehiclesResult")
	public VehiclesResult getGetVehiclesResult() {
		return getVehiclesResult;
	}

	@JsonProperty("VehiclesResult")
	public void setGetVehiclesResult(VehiclesResult getVehiclesResult) {
		this.getVehiclesResult = getVehiclesResult;
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

