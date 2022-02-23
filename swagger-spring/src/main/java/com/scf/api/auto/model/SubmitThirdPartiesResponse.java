package com.scf.api.auto.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SubmitThirdPartiesResponse {

	@JsonProperty("submitThirdPartiesResult")
	private String submitThirdPartiesResult;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("submitThirdPartiesResult")
	public String getSubmitThirdPartiesResult() {
		return submitThirdPartiesResult;
	}

	@JsonProperty("submitThirdPartiesResult")
	public void setSubmitThirdPartiesResult(String submitThirdPartiesResult) {
		this.submitThirdPartiesResult = submitThirdPartiesResult;
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
