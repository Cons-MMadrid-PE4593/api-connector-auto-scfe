package io.swagger.gqs.calculator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuoteTable {
	@JsonProperty("IRR2") 
    public String iRR2;
    @JsonProperty("IRR") 
    public String iRR;
    @JsonProperty("APR") 
    public String aPR;
    @JsonProperty("QuoteID") 
    public String quoteID;
    @JsonProperty("MonthQuote") 
    public String monthQuote;
    @JsonProperty("MonthInterest") 
    public String monthInterest;
    @JsonProperty("Capital") 
    public String capital;
    @JsonProperty("InsuranceAmount") 
    public String insuranceAmount;
    
	public String getiRR2() {
		return iRR2;
	}
	public void setiRR2(String iRR2) {
		this.iRR2 = iRR2;
	}
	public String getiRR() {
		return iRR;
	}
	public void setiRR(String iRR) {
		this.iRR = iRR;
	}
	public String getaPR() {
		return aPR;
	}
	public void setaPR(String aPR) {
		this.aPR = aPR;
	}
	public String getQuoteID() {
		return quoteID;
	}
	public void setQuoteID(String quoteID) {
		this.quoteID = quoteID;
	}
	public String getMonthQuote() {
		return monthQuote;
	}
	public void setMonthQuote(String monthQuote) {
		this.monthQuote = monthQuote;
	}
	public String getMonthInterest() {
		return monthInterest;
	}
	public void setMonthInterest(String monthInterest) {
		this.monthInterest = monthInterest;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getInsuranceAmount() {
		return insuranceAmount;
	}
	public void setInsuranceAmount(String insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
    
    
}
