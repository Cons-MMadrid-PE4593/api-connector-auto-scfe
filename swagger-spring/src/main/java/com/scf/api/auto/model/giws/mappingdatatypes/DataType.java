package com.scf.api.auto.model.giws.mappingdatatypes;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Id", "Value", "DataType"})
public class DataType {

	@JsonProperty("Id")
	private String id;
	@JsonProperty("Value")
	private String value;
	@JsonProperty("DataType")
	private String dataType;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonProperty("Id")
	public String getId() {
		return id;
	}
	@JsonProperty("Id")
	public void setId(String id) {
		this.id = id;
	}
	@JsonProperty("Value")
	public String getValue() {
		return value;
	}
	@JsonProperty("Value")
	public void setValue(String value) {
		this.value = value;
	}
	@JsonProperty("DataType")
	public String getDataType() {
		return dataType;
	}
	@JsonProperty("DataType")
	public void setDataType(String dataType) {
		this.dataType = dataType;
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
