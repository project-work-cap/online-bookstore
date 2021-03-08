package com.capgemini.onlinebookstore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@Column
	private long addressId;
	@Column
	private String doorNumber;
	@Column
	private String addressStreet;
	@Column
	private String addressCity;
	@Column
	private String addressState;
	@Column
	private int addressPinCode;
	
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getAddressStreet() {
		return addressStreet;
	}
	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	public String getAddressState() {
		return addressState;
	}
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	public int getAddressPinCode() {
		return addressPinCode;
	}
	public void setAddressPinCode(int addressPinCode) {
		this.addressPinCode = addressPinCode;
	}
	
	

}
