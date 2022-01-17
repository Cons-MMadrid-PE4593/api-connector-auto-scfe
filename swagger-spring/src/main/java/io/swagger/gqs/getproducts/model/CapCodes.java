package io.swagger.gqs.getproducts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CapCodes{
    @JsonProperty("Capcode") 
    public String capcode;

	public String getCapcode() {
		return capcode;
	}

	public void setCapcode(String capcode) {
		this.capcode = capcode;
	}
    
}

