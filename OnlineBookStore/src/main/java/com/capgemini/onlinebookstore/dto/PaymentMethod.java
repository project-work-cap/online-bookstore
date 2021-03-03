package com.capgemini.onlinebookstore.dto;

public class PaymentMethod {
	private String cashOnDelivery ;
	private String upi;
	private String card;
	public String getCashOnDelivery() {
		return cashOnDelivery;
	}
	public void setCashOnDelivery(String cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}
	public String getUpi() {
		return upi;
	}
	public void setUpi(String upi) {
		this.upi = upi;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}

	
}
