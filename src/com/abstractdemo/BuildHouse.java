package com.abstractdemo;

//Class nay thua ke tu class truu tuong ManualJob
//BuildHouse khong duoc khai bao truu tuong
//Vi vay no can thuc hien tat ca cac phuonng thuc truu tuong con lai cua AbstractJob
public class BuildHouse extends ManualJob{
	public BuildHouse() {
		
	}
	
	@Override
	public void doJob() {
		System.out.println("Build a Hosuse");
	}

}
