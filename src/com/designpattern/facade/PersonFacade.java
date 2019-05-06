package com.designpattern.facade;

import java.util.Scanner;

public class PersonFacade {
	Name name = new Name();
	PhoneNumber phoneNumber = new PhoneNumber();
	Address address = new Address();

	public PersonFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonFacade(Name name, PhoneNumber phoneNumber, Address address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(Name name) {
		this.name = name;
	}

	/**
	 * @return the phoneNumber
	 */
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("---------------------+----------------------");
		this.name.display();
		this.address.display();
		this.phoneNumber.display();
		System.out.println("---------------------+----------------------");
	}

	public void setInfor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap duong: ");
		String street = scanner.nextLine();
		System.out.print("nhap thanh pho: ");
		String city = scanner.nextLine();
		System.out.print("nhap quoc gia: ");
		String country = scanner.nextLine();
		System.out.print("nhap so dien thoai: ");
		String number = scanner.nextLine();
		System.out.print("nhap ma vung: ");
		String postalCode = scanner.nextLine();
		System.out.print("nhap ho: ");
		String firstName = scanner.nextLine();
		System.out.print("nhap ten dem: ");
		String middleName = scanner.nextLine();
		System.out.print("nhap ten: ");
		String lastName = scanner.nextLine();
		
		this.name = new Name(firstName, middleName, lastName);
		this.address = new Address(street, city, country);
		this.phoneNumber = new PhoneNumber(number, postalCode);
		scanner.close();
	}
}
