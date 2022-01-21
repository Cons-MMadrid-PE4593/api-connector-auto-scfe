package io.swagger.model.gqs.products;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductValidations {
	@JsonProperty("Validation") 
    public Validation validation;

	public Validation getValidation() {
		return validation;
	}

	public void setValidation(Validation validation) {
		this.validation = validation;
	}

}
