package com.work;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		String name1,password1;
		Admin user = new Admin();
		user.outInfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		name1 = sc.next();
		System.out.println("请输入密码");
		password1=sc.next();
		user.login(name1, password1);
	}
	

}
