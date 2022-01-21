package io.swagger.model.gqs.products;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductFees {
	@JsonProperty("Fees") 
    public Fees fees;

	public Fees getFees() {
		return fees;
	}

	public void setFees(Fees fees) {
		this.fees = fees;
	}
	
}
