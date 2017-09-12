package com.fengzhuang;

public class test {
	public static void main(String[] args) {
		student user = new student();
		user.setAge(22);
		user.setName("张三丰");
		user.setSn(12043130);
		int a=user.getAge();
		user.showInfo();
		System.out.println(a);
		user.working();
		
	}
	

}
