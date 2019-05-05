package com.thread;

public class MainThread {

	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		//Because MyThread1 implements Interface Runnable 
		//When we want to run a thread we should be declare a class Thread and assign m1 to thread's constructor
		Thread t = new Thread(m1);
		t.start();
		//
		MyThread2 m2 = new MyThread2();
		m2.start();
	}

}
