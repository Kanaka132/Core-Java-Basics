package com.opt.demo;

public class Address {

	private int addressId;
	private int addressPinCode;
	public Address(int addressId, int addressPinCode, String addressCity, String addressState) {
		super();
		this.addressId = addressId;
		this.addressPinCode = addressPinCode;
		this.addressCity = addressCity;
		this.addressState = addressState;
	}
	private String addressCity;
	private String addressState;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getAddressPinCode() {
		return addressPinCode;
	}
	public void setAddressPinCode(int addressPinCode) {
		this.addressPinCode = addressPinCode;
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
}
