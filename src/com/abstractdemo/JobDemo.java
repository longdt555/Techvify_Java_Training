package com.abstractdemo;

public class JobDemo {

	public static void main(String[] args) {
		//Khoi tao mot doi tuong AbstractJob
		//Tu constructor cua JavaCoding
		AbstractJob job1 = new JavaCoding();
		
		//Goi phuong thuc doJob()
		job1.doJob();
		
		//Phuong thuc getJobName la truu tuong trong lop AbstractJob
		//Nhung no da duoc thuc hien tai lop con nao do
		//Vi vay ban co the goi no
		String jobName1 = job1.getJobName();
		
		System.out.println("Job Name 1: " + jobName1);
		
		//Tuong tu nhu tren
		AbstractJob job2 = new BuildHouse();
		job2.doJob();
		
		String jobName2 = job2.getJobName();
		
		System.out.println("Job Name 2: " + jobName2);
		
	}

}
