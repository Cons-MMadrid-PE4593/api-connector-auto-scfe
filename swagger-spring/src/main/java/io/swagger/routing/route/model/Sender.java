package io.swagger.routing.route.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sender {
	@JsonProperty("ID")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("language")
	private String language;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("ID")
	public String getId() {
	return id;
	}

	@JsonProperty("ID")
	public void setId(String id) {
	this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
	return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
	this.name = name;
	}

	@JsonProperty("language")
	public String getLanguage() {
	return language;
	}

	@JsonProperty("language")
	public void setLanguage(String language) {
	this.language = language;
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
