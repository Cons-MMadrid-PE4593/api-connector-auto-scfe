package io.swagger.model.giws.mappingdatatypes;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "MappingDataTypesResponse" })

public class MappingDataTypesResponse {

	@JsonProperty("MappingDataTypesResult")
	private MappingDataTypesResult mappingDataTypesResult;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("MappingDataTypesResult")
	public MappingDataTypesResult getMappingDataTypesResult() {
		return mappingDataTypesResult;
	}
	
	@JsonProperty("MappingDataTypesResult")
	public void setMappingDataTypesResult(MappingDataTypesResult mappingDataTypesResult) {
		this.mappingDataTypesResult = mappingDataTypesResult;
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

