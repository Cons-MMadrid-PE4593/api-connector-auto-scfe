package com.scf.api.auto.model.routingservice.route;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PrimaryApplicant {
	@JsonProperty("applicantType")
	private String applicantType;
	@JsonProperty("customerType")
	private String customerType;
	@JsonProperty("firstName")
	private String firstName;
	@JsonProperty("lastName")
	private String lastName;
	@JsonProperty("email")
	private String email;
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("address")
	private Address address;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("applicantType")
	public String getApplicantType() {
	return applicantType;
	}

	@JsonProperty("applicantType")
	public void setApplicantType(String applicantType) {
	this.applicantType = applicantType;
	}

	@JsonProperty("customerType")
	public String getCustomerType() {
	return customerType;
	}

	@JsonProperty("customerType")
	public void setCustomerType(String customerType) {
	this.customerType = customerType;
	}

	@JsonProperty("firstName")
	public String getFirstName() {
	return firstName;
	}

	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}

	@JsonProperty("lastName")
	public String getLastName() {
	return lastName;
	}

	@JsonProperty("lastName")
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}

	@JsonProperty("email")
	public String getEmail() {
	return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
	this.email = email;
	}

	@JsonProperty("phone")
	public String getPhone() {
	return phone;
	}

	@JsonProperty("phone")
	public void setPhone(String phone) {
	this.phone = phone;
	}

	@JsonProperty("address")
	public Address getAddress() {
	return address;
	}

	@JsonProperty("address")
	public void setAddress(Address address) {
	this.address = address;
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
