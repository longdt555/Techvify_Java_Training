package com.abstractdemo;

//ManualJob - mo phong mot cong viec pho thong
//Lop cha Abstract co hai phuong thuc truu tuong
//Lop nay chi thuc hien 1 trong hai phuong thuc cua lop cha
//Vi vay no phai khai bao Abstract
public abstract class ManualJob extends AbstractJob{
	@Override
	public String getJobName() {
		return "Manual Job";
	}
}
