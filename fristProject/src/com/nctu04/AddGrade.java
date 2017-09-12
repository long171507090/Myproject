package com.nctu04;

import java.util.Scanner;

public class AddGrade {
	public static void addgrade(Person user){
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("_____$___欢迎来到充值中心___$______");
		System.out.println("--------请输入金额--10~200--------");
		i = sc.nextInt();
		if(i>9&&i<201){
			user.setGrade(user.getGrade()+i);
			System.out.println("----------充值成功---------");
			System.out.println("  $$  当前余额为:"+user.getGrade());
			return;
		}
		else{
			System.out.println("-----您充值的金额不对-----");
			return ;
		}
	}

}
