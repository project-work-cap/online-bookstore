package com.capgemini.onlinebookstore.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
	@Column
	
	private long paymentId;
//	@Column
//	private PaymentMethod paymentMethod;
	
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
//	public PaymentMethod getPaymentMethod() {
//		return paymentMethod;
//	}
//	public void setPaymentMethod(PaymentMethod paymentMethod) {
//		this.paymentMethod = paymentMethod;
//	}
//	
	

}
