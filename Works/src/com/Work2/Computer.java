package com.Work2;

import java.util.Random;

public class Computer extends Person {
	Random random = new Random();

	public Computer(String name, int integral) {
		super(name, integral);
		// TODO Auto-generated constructor stub
	}

	public int  play() {
		int a = random.nextInt(3)+1;
        return a ;
	}

}
