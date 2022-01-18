package io.swagger.gqs.calculator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SummaryTable {
	@JsonProperty("NumItems") 
    public String numItems;
    @JsonProperty("Amount") 
    public String amount;
	public String getNumItems() {
		return numItems;
	}
	public void setNumItems(String numItems) {
		this.numItems = numItems;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
    
}