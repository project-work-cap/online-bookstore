package com.capgemini.onlinebookstore.entities;


import javax.persistence.Column;
>>>>>>> a1d7f734a4866afd404f8ed7cfc8857a3efcb63c
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentMethod {
	@Id
	private long paymentMethodId;
	private String paymentType ;
	public long getPaymentMethodId() {
		return paymentMethodId;
	@Column
	private String cashOnDelivery ;
	@Column
	private String upi;
	@Column
	private String card;
	@Column
	public String getCashOnDelivery() {
		return cashOnDelivery;
	}
	public void setCashOnDelivery(String cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}
	public String getUpi() {
		return upi;
>>>>>>> a1d7f734a4866afd404f8ed7cfc8857a3efcb63c
	}
	public void setPaymentMethodId(long paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	
	
}
