package com.Work2;

public class Plays {
	public static void play(People user1,Computer user2){
		int a = user1.play();
		int b = user2.play();
		if (a != 1 && a != 2 && a != 3) {
			System.out.println("￣^￣您输入的有误,请重新输入￣^￣");
		}
		if (a == b) {
			System.out.println("-------您跟电脑出的是一样的,平手-----------");
			Integral.display(user1, user2);
			
		} else if ((a == 1 && b == 2) || (a == 2 && b == 3)|| (a == 3 && b == 1)) {
			System.out.println("---^_^------恭喜您赢了,太棒了!--------^_^---");
			user1.setIntegral(user1.getIntegral()+10);
			user2.setIntegral(user2.getIntegral()-10);
			Integral.display(user1, user2);
		} else {
			System.out.println("---￣_￣-------很遗憾是您输了!--------￣_￣---");
			user1.setIntegral(user1.getIntegral()-10);
			user2.setIntegral(user2.getIntegral()+10);
			Integral.display(user1, user2);
			}
		}
	}


