package com.designpattern.facade;

public class PhoneNumber {
	private String phoneNumber;
	private String postalCode;

	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhoneNumber(String phoneNumber, String postalCode) {
		super();
		this.phoneNumber = phoneNumber;
		this.postalCode = postalCode;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "PhoneNumber [phoneNumber=" + phoneNumber + ", postalCode=" + postalCode + "]";
	}

	public void display() {
		System.out.println("PhoneNumber: " + this.postalCode + " " + this.phoneNumber);
	}

}
