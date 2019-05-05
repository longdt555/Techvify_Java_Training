package com.interfacedemo;

public interface CanMove {
	//Phuong thuc trong interface luon la truu tuong va public du ban khong khai bao access modifier
	public abstract void run();
	
	void back();
	
	public int getVelocity();
}
