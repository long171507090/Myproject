package com.nctu04;

import java.util.Scanner;
public class Games {
	public static void games(Person user){
		int k=1;
		Scanner sc = new Scanner(System.in);
		while(k==1){
		System.out.println();
		System.out.println();
		System.out.println("            -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("            -*-*-*                         *-*-*-");
		System.out.println("            -*-*-*    石头●剪刀●布   ★游戏★           *-*-*-");
		System.out.println("            -*-*-*       按 1 进入游戏                      *-*-*-");
		System.out.println("            -*-*-*       按 2 查看分数                      *-*-*-");
		System.out.println("            -*-*-*       按 3 分数充值                      *-*-*-");
		System.out.println("            -*-*-*       按 4 退出游戏                      *-*-*-");
		System.out.println("            -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			Play.play(user);
			break;

		case 2:
			System.out.println(user.getGrade());
			break;
		case 3:
			AddGrade.addgrade(user);
			break;
		case 4:
			return;
		}
		}
		return;
		
	}

	}

