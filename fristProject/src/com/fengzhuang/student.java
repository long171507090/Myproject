package com.fengzhuang;

public class student extends petion{
	int sn;
	public void setSn(int sn){
		this.sn = sn;
	}
	public int getSn(){
		return this.sn;
	}
	public void working(){
   	 System.out.println("学习中.....");
    }

	public void showInfo(){
   	 System.out.println("名称:"+getName()+",年龄"+getAge()+",学号"+getSn());
    }

}
