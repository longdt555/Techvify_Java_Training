package com.thread;

public class Synchronization implements Runnable{
	public int balance;
	
	public Synchronization() {
		this.balance=1000;
	}
	
	public synchronized void withDraw() throws InterruptedException {
		if (balance>0) {
			Thread.sleep(1000);
			balance = balance-1000;
			System.out.println(balance);
		}else {
			System.out.println("No money.");
		}
	}
	
	@Override
	public void run() {
		try {
			withDraw();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Synchronization syn = new Synchronization();
		Thread t1 = new Thread(syn);
		Thread t2 = new Thread(syn);
		t1.start();
		t2.start();
	}

	

}
