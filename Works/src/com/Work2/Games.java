package com.Work2;

import java.util.Scanner;

public class Games {
	public static void plays(People p1,Computer c1){
		Scanner sc = new Scanner(System.in);
		int k=1 ;
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
				Plays.play(p1,c1);
				break;

			case 2:
				Integral.display(p1, c1);
				break;
			case 3:
				
				break;
			case 4:
				return;
			}
			}
		
	} 

}
