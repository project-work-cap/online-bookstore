package com.capgemini.onlinebookstore.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentMethod {
	@Id
	private long paymentMethodId;
	private String paymentType ;
	public long getPaymentMethodId() {
		return paymentMethodId;
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
