package com.nctu03;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		long time = System.currentTimeMillis();
		System.out.println(time);
		Date d2 = new Date(1103393889655L);
		System.out.println(d2);
	}

}
