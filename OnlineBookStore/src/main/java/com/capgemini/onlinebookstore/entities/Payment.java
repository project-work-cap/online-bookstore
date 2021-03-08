package com.capgemini.onlinebookstore.entities;

<<<<<<< HEAD

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
=======
>>>>>>> parent of a1d7f73 (added entities)
public class Payment {
	
	private long paymentId;
	private PaymentMethod paymentMethod;
	
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	

}
