package io.swagger.gqs.calculator.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuotingScheme {
	@JsonProperty("XmlData") 
    public String xmlData;
	@JsonProperty("QuoteTable") 
    public ArrayList<QuoteTable> quoteTable;
    @JsonProperty("SummaryTable") 
    public ArrayList<SummaryTable> summaryTable;
    @JsonProperty("TotalTable") 
    public TotalTable totalTable;
    public ArrayList<TextFormat> text_format;
    
	public ArrayList<QuoteTable> getQuoteTable() {
		return quoteTable;
	}
	public void setQuoteTable(ArrayList<QuoteTable> quoteTable) {
		this.quoteTable = quoteTable;
	}
	public ArrayList<SummaryTable> getSummaryTable() {
		return summaryTable;
	}
	public void setSummaryTable(ArrayList<SummaryTable> summaryTable) {
		this.summaryTable = summaryTable;
	}
	public TotalTable getTotalTable() {
		return totalTable;
	}
	public void setTotalTable(TotalTable totalTable) {
		this.totalTable = totalTable;
	}
	public ArrayList<TextFormat> getText_format() {
		return text_format;
	}
	public void setText_format(ArrayList<TextFormat> text_format) {
		this.text_format = text_format;
	}
	public String getXmlData() {
		return xmlData;
	}
	public void setXmlData(String xmlData) {
		this.xmlData = xmlData;
	}
    
}
