package io.swagger.gqs.calculator.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TextFormat {
	@JsonProperty("size") 
    public String size;
    @JsonProperty("bold") 
    public String bold;
    @JsonProperty("underline") 
    public String underline;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
    	return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
    	if (name.equals("")) {
    		this.additionalProperties.put("text", value);
    	}
    	else {
    		this.additionalProperties.put(name, value);    		
    	}
    }
    
    @JsonProperty("size") 
	public String getSize() {
		return size;
	}
	@JsonProperty("size") 
	public void setSize(String size) {
		this.size = size;
	}
	@JsonProperty("bold")
	public String getBold() {
		return bold;
	}
	@JsonProperty("bold")
	public void setBold(String bold) {
		this.bold = bold;
	}
	@JsonProperty("underline")
	public String getUnderline() {
		return underline;
	}
	@JsonProperty("underline")
	public void setUnderline(String underline) {
		this.underline = underline;
	}
    
}
