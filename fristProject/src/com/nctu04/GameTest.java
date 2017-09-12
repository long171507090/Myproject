package com.nctu04;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person user1 = new Person();
		System.out.println("※￣￣￣请设置您的用户名￣￣￣※");
		user1.setName(sc.next());
		System.out.println("§-----★设置用户名成功★-----§");
		System.out.println();
		System.out.println("『メヘメヘ用户名是:"+user1.getName()+"メヘメヘ』");
		Games.games(user1);
		System.out.println("*┄*┄*┄*┄*游戏结束*┄*┄*┄*┄*");
		System.out.println(user1.toString());
		System.exit(0);
		System.out.println(user1.toString());
		
		
		
	}
}
