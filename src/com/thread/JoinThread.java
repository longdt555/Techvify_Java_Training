package com.thread;

public class JoinThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		JoinThread jt = new JoinThread();
		jt.setName("Thread1");
		
		JoinThread jt1 = new JoinThread();
		jt1.setName("Thread2");
		
		JoinThread jt2 = new JoinThread();
		jt2.setName("Thread3");
		
		jt.start();
		//Join se ngung cac thread khac cho den khi thread hien tai chay xong
		try {
			jt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jt1.start();
		jt2.start();
	}

}
