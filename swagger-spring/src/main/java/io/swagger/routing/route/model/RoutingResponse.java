package io.swagger.routing.route.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoutingResponse {
	@JsonProperty("applicationFunnel")
	public ApplicationFunnel applicationFunnel;
	@JsonProperty("financeID")
    public String financeID;
	
	@JsonProperty("applicationFunnel")
	public ApplicationFunnel getApplicationFunnel() {
		return applicationFunnel;
	}
	@JsonProperty("applicationFunnel")
	public void setApplicationFunnel(ApplicationFunnel applicationFunnel) {
		this.applicationFunnel = applicationFunnel;
	}
	@JsonProperty("financeID")
	public String getFinanceID() {
		return financeID;
	}
	@JsonProperty("financeID")
	public void setFinanceID(String financeID) {
		this.financeID = financeID;
	}
    
}
