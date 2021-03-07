package com.capgemini.onlinebookstore.entities;

public class Address {
	
	private long addressId;
	private String doorNumber;
	private String addressStreet;
	private String addressCity;
	private String addressState;
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
