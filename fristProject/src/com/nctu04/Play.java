package com.nctu04;

import java.util.Random;
import java.util.Scanner;

public class Play {
	public static void play(Person user) {
		int k = 1, a, b;
		int x = 0, y = 0, z = 0;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		if(user.getGrade()>0){
			while (k == 1) {
				System.out.println("请出拳...");
				System.out.println("1★石头,2★剪刀,3★布");
				a = sc.nextInt();
				b = random.nextInt(3) + 1;
				if (a != 1 && a != 2 && a != 3) {
					System.out.println("￣^￣您输入的有误,请重新输入￣^￣");
					continue;
				}
				if (a == b) {
					System.out.println("-------您跟电脑出的是一样的,平手-----------");
					Grades.grades1(user);
					z++;
				} else if ((a == 1 && b == 2) || (a == 2 && b == 3)|| (a == 3 && b == 1)) {
					System.out.println("---^_^------恭喜您赢了,太棒了!--------^_^---");
					Grades.grades3(user);
					x++;
				} else {
					System.out.println("---￣_￣-------很遗憾是您输了!--------￣_￣---");
					Grades.grades2(user);
					y++;
					if(user.getGrade()<=0){
						System.out.println("您已经输光了分数,请前往充值!!");
						return ;
					}
				}
				System.out.println("*-*-*-*-*-*是否继续完游戏*-*-*-*-*-*");
				System.out.println("☆―￣￣￣￣￣1★继续＿＿＿＿＿2★退出￣￣￣￣￣￣☆");
				System.out.println();
				System.out.println();
				int num = sc.nextInt();
				if(num==2){
					user.setWin(x);
					user.setLose(y);
					user.setDrew(z);
				   return;
				}
			}
		}
		else{
			System.out.println("------您的分数不够玩游戏,请前去充值-------");
			return;
		}
		}
	}

