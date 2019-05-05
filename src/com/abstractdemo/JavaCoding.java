package com.abstractdemo;

public class JavaCoding extends AbstractJob{
	public JavaCoding() {
	}
	
	@Override
	public String getJobName() {
		return "Coding Java";
	}

	@Override
	public void doJob() {
		System.out.println("Coding Java");
	}
}
