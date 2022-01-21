package io.swagger.model.gqs.products;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FinanceProduct {
	@JsonProperty("Product") 
    public ArrayList<Product> product;

	public ArrayList<Product> getProduct() {
		return product;
	}

	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}
	
}
