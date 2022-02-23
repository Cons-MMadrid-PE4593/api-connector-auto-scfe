package com.scf.api.auto.model.routingservice.route;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleInfo {
	@JsonProperty("category")
	private String category;
	@JsonProperty("manufacturer")
	private String manufacturer;
	@JsonProperty("saleClass")
	private String saleClass;
	@JsonProperty("model")
	private String model;
	@JsonProperty("modelYear")
	private String modelYear;
	@JsonProperty("trim")
	private String trim;
	@JsonProperty("modelID")
	private String modelID;
	@JsonProperty("dealerOwner")
	private String dealerOwner;
	@JsonProperty("vehiclePriceBreakdown")
	private VehiclePriceBreakdown vehiclePriceBreakdown;
	@JsonProperty("pictureURL")
	private String pictureURL;
	@JsonProperty("VIN")
	private String vin;
	@JsonProperty("Odometer")
	private Odometer odometer;
	@JsonProperty("registration")
	private Registration registration;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("category")
	public String getCategory() {
	return category;
	}

	@JsonProperty("category")
	public void setCategory(String category) {
	this.category = category;
	}

	@JsonProperty("manufacturer")
	public String getManufacturer() {
	return manufacturer;
	}

	@JsonProperty("manufacturer")
	public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
	}

	@JsonProperty("saleClass")
	public String getSaleClass() {
	return saleClass;
	}

	@JsonProperty("saleClass")
	public void setSaleClass(String saleClass) {
	this.saleClass = saleClass;
	}

	@JsonProperty("model")
	public String getModel() {
	return model;
	}

	@JsonProperty("model")
	public void setModel(String model) {
	this.model = model;
	}

	@JsonProperty("modelYear")
	public String getModelYear() {
	return modelYear;
	}

	@JsonProperty("modelYear")
	public void setModelYear(String modelYear) {
	this.modelYear = modelYear;
	}

	@JsonProperty("trim")
	public String getTrim() {
	return trim;
	}

	@JsonProperty("trim")
	public void setTrim(String trim) {
	this.trim = trim;
	}

	@JsonProperty("modelID")
	public String getModelID() {
	return modelID;
	}

	@JsonProperty("modelID")
	public void setModelID(String modelID) {
	this.modelID = modelID;
	}

	@JsonProperty("dealerOwner")
	public String getDealerOwner() {
	return dealerOwner;
	}

	@JsonProperty("dealerOwner")
	public void setDealerOwner(String dealerOwner) {
	this.dealerOwner = dealerOwner;
	}

	@JsonProperty("vehiclePriceBreakdown")
	public VehiclePriceBreakdown getVehiclePriceBreakdown() {
	return vehiclePriceBreakdown;
	}

	@JsonProperty("vehiclePriceBreakdown")
	public void setVehiclePriceBreakdown(VehiclePriceBreakdown vehiclePriceBreakdown) {
	this.vehiclePriceBreakdown = vehiclePriceBreakdown;
	}

	@JsonProperty("pictureURL")
	public String getPictureURL() {
	return pictureURL;
	}

	@JsonProperty("pictureURL")
	public void setPictureURL(String pictureURL) {
	this.pictureURL = pictureURL;
	}

	@JsonProperty("VIN")
	public String getVin() {
	return vin;
	}

	@JsonProperty("VIN")
	public void setVin(String vin) {
	this.vin = vin;
	}

	@JsonProperty("Odometer")
	public Odometer getOdometer() {
	return odometer;
	}

	@JsonProperty("Odometer")
	public void setOdometer(Odometer odometer) {
	this.odometer = odometer;
	}

	@JsonProperty("registration")
	public Registration getRegistration() {
	return registration;
	}

	@JsonProperty("registration")
	public void setRegistration(Registration registration) {
	this.registration = registration;
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
