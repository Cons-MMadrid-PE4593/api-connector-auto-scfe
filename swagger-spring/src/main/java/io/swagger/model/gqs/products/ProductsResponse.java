package io.swagger.model.gqs.products;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductsResponse   {
	
	@JsonProperty("XmlData") 
    public String xmlData;
    @JsonProperty("FinanceProduct") 
    public FinanceProduct financeProduct;
	public String getXmlData() {
		return xmlData;
	}
	public void setXmlData(String xmlData) {
		this.xmlData = xmlData;
	}
	public FinanceProduct getFinanceProduct() {
		return financeProduct;
	}
	public void setFinanceProduct(FinanceProduct financeProduct) {
		this.financeProduct = financeProduct;
	}
}

