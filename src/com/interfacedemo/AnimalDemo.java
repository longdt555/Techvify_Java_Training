package com.interfacedemo;

public class AnimalDemo {

	public static void main(String[] args) {
		//Ke thua truong tinh cua interface CanDrink
		System.out.println("Drink " + Cat.Sevenup);
		
		Cat cat = new Cat("Tom");
		cat.eat();
		cat.drink();
		cat.back();
		
		CanEat cat2 = new Cat("Ane");
		cat2.eat();
	}

}
