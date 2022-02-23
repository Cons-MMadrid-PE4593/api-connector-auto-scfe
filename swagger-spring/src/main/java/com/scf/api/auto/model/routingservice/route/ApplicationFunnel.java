package com.scf.api.auto.model.routingservice.route;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicationFunnel {
    @JsonProperty("URL") 
    public String uRL;
    @JsonProperty("lifeSpan") 
    public long lifeSpan;
    
    @JsonProperty("URL") 
	public String getuRL() {
		return uRL;
	}
    @JsonProperty("URL") 
	public void setuRL(String uRL) {
		this.uRL = uRL;
	}
    @JsonProperty("lifeSpan") 
	public long getLifeSpan() {
		return lifeSpan;
	}
    @JsonProperty("lifeSpan") 
	public void setLifeSpan(long lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
}
