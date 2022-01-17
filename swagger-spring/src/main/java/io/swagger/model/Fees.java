package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fees {
	@JsonProperty("payment_id") 
	public String payment_id;
	@JsonProperty("fixed_fee") 
    public String fixed_fee;
	@JsonProperty("min_amount") 
    public String min_amount;
	@JsonProperty("max_amount") 
    public String max_amount;
	@JsonProperty("fee_type_id") 
    public String fee_type_id;
	@JsonProperty("pct_max_fee") 
    public String pct_max_fee;
	
	public String getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}
	public String getFixed_fee() {
		return fixed_fee;
	}
	public void setFixed_fee(String fixed_fee) {
		this.fixed_fee = fixed_fee;
	}
	public String getMin_amount() {
		return min_amount;
	}
	public void setMin_amount(String min_amount) {
		this.min_amount = min_amount;
	}
	public String getMax_amount() {
		return max_amount;
	}
	public void setMax_amount(String max_amount) {
		this.max_amount = max_amount;
	}
	public String getFee_type_id() {
		return fee_type_id;
	}
	public void setFee_type_id(String fee_type_id) {
		this.fee_type_id = fee_type_id;
	}
	public String getPct_max_fee() {
		return pct_max_fee;
	}
	public void setPct_max_fee(String pct_max_fee) {
		this.pct_max_fee = pct_max_fee;
	}
    
}
