package com.Work2;

import java.util.Scanner;

public class People extends Person {
	public People(String name, int integral) {
		super(name, integral);
		// TODO Auto-generated constructor stub
	}

	Scanner sc = new Scanner(System.in);

	public int play() {
        System.out.println("请出拳...");
        System.out.println("1`石头,2`剪刀,3`布");
        int a = sc.nextInt();
        return a;
        
	}

}
