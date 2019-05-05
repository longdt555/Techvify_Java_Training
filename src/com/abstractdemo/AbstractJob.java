package com.abstractdemo;

//mot lop truu tuong mo ta cong viec
public abstract class AbstractJob {
	public AbstractJob() {
		
	}
	
	//day la mot phuong thuc truu tuong
	//no tra ve ten cua cong viec
	public abstract String getJobName();
	
	public abstract void doJob();
}	
