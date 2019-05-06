package com.thread;

public class SleepTest extends Thread{
	private String threadName;
		
	public SleepTest(String threadName) {
		super();
		this.threadName = threadName;
	}


	public String getThreadName() {
		return threadName;
	}


	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getThreadName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		SleepTest st = new SleepTest("A");
		SleepTest st1 = new SleepTest("B");
		st.start();
		st1.start();
	}
}
