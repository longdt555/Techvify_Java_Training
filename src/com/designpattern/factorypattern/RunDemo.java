package com.designpattern.factorypattern;

public class RunDemo {

	public static void main(String[] args) {
		PhoneFactory pf = new PhoneFactory();
		Phone phone = pf.getPhone(PhoneType.SAMSUNG);
		phone.showInfor();
	}

}
