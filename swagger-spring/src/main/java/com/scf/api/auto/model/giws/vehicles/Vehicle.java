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
@JsonPropertyOrder({ "vehicleType", "idManufacturer", "manufacturer", "idModel", "model", "idDerivative", "derivative",
		"value", "numDoors", "engineSize", "fuelTypeId", "vehicleTypeId", "transmissionId", "introducedDate",
		"discontinuedDate" })
public class Vehicle {

	@JsonProperty("vehicleType")
	private String vehicleType;
	@JsonProperty("idManufacturer")
	private String idManufacturer;
	@JsonProperty("manufacturer")
	private String manufacturer;
	@JsonProperty("idModel")
	private String idModel;
	@JsonProperty("model")
	private String model;
	@JsonProperty("idDerivative")
	private String idDerivative;
	@JsonProperty("derivative")
	private String derivative;
	@JsonProperty("value")
	private String value;
	@JsonProperty("numDoors")
	private String numDoors;
	@JsonProperty("engineSize")
	private String engineSize;
	@JsonProperty("fuelTypeId")
	private String fuelTypeId;
	@JsonProperty("vehicleTypeId")
	private String vehicleTypeId;
	@JsonProperty("transmissionId")
	private String transmissionId;
	@JsonProperty("introducedDate")
	private String introducedDate;
	@JsonProperty("discontinuedDate")
	private String discontinuedDate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("vehicleType")
	public String getVehicleType() {
		return vehicleType;
	}

	@JsonProperty("vehicleType")
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@JsonProperty("idManufacturer")
	public String getIdManufacturer() {
		return idManufacturer;
	}

	@JsonProperty("idManufacturer")
	public void setIdManufacturer(String idManufacturer) {
		this.idManufacturer = idManufacturer;
	}

	@JsonProperty("manufacturer")
	public String getManufacturer() {
		return manufacturer;
	}

	@JsonProperty("manufacturer")
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@JsonProperty("idModel")
	public String getIdModel() {
		return idModel;
	}

	@JsonProperty("idModel")
	public void setIdModel(String idModel) {
		this.idModel = idModel;
	}

	@JsonProperty("model")
	public String getModel() {
		return model;
	}

	@JsonProperty("model")
	public void setModel(String model) {
		this.model = model;
	}

	@JsonProperty("idDerivative")
	public String getIdDerivative() {
		return idDerivative;
	}

	@JsonProperty("idDerivative")
	public void setIdDerivative(String idDerivative) {
		this.idDerivative = idDerivative;
	}

	@JsonProperty("derivative")
	public String getDerivative() {
		return derivative;
	}

	@JsonProperty("derivative")
	public void setDerivative(String derivative) {
		this.derivative = derivative;
	}

	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}

	@JsonProperty("numDoors")
	public String getNumDoors() {
		return numDoors;
	}

	@JsonProperty("numDoors")
	public void setNumDoors(String numDoors) {
		this.numDoors = numDoors;
	}

	@JsonProperty("engineSize")
	public String getEngineSize() {
		return engineSize;
	}

	@JsonProperty("engineSize")
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	@JsonProperty("fuelTypeId")
	public String getFuelTypeId() {
		return fuelTypeId;
	}

	@JsonProperty("fuelTypeId")
	public void setFuelTypeId(String fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}

	@JsonProperty("vehicleTypeId")
	public String getVehicleTypeId() {
		return vehicleTypeId;
	}

	@JsonProperty("vehicleTypeId")
	public void setVehicleTypeId(String vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}

	@JsonProperty("transmissionId")
	public String getTransmissionId() {
		return transmissionId;
	}

	@JsonProperty("transmissionId")
	public void setTransmissionId(String transmissionId) {
		this.transmissionId = transmissionId;
	}

	@JsonProperty("introducedDate")
	public String getIntroducedDate() {
		return introducedDate;
	}

	@JsonProperty("introducedDate")
	public void setIntroducedDate(String introducedDate) {
		this.introducedDate = introducedDate;
	}

	@JsonProperty("discontinuedDate")
	public String getDiscontinuedDate() {
		return discontinuedDate;
	}

	@JsonProperty("discontinuedDate")
	public void setDiscontinuedDate(String discontinuedDate) {
		this.discontinuedDate = discontinuedDate;
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
