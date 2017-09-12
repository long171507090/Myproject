package com.nctu02;

import java.text.ParseException;
import java.util.Scanner;

public class CalendarDemo {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年");
		int year = sc.nextInt();
		System.out.println("请输入月");
		int month = sc.nextInt();
		Display.display(year, month);
		
		
		

	}

}
