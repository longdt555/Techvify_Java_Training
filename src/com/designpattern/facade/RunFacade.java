package com.designpattern.facade;

public class RunFacade {

	public static void main(String[] args) {
		PersonFacade pc = new PersonFacade();
		pc.setInfor();
		pc.display();
	}

}
