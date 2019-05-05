package com.generic;

public class GenericDemo {

	public static void main(String[] args) {
		MyGeneric<Integer> m1 = new MyGeneric<Integer>();
		m1.add(1000);
		System.out.println(m1.get());
	}

}
