package com.designpattern.factorypattern;

public class PhoneFactory {
	public Phone getPhone(PhoneType phoneType) {
		Phone createdPhone = null;
		switch(phoneType){
		case SAMSUNG:
			createdPhone = new SamsungPhone();
		case IPHONE:
			createdPhone = new SamsungPhone();
		}
		return createdPhone;
	}

}
