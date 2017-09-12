package com.nctu02;

import java.util.Calendar;


public class Display {
	public static void display(int year,int month){
		System.out.println(year+"年"+month+"月  日历");
		Calendar calendar = Calendar.getInstance();
		calendar.set(calendar.YEAR, year);
		calendar.set(calendar.MONTH, month-1);
		calendar.set(calendar.DAY_OF_MONTH, 1);
		int maxday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int wday = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i = 1;i<wday;i++){
			System.out.print("\t");
		}
		for(int j = 1;j<=maxday;j++){
			System.out.print(j+"\t");
			calendar.set(Calendar.DAY_OF_MONTH,j);
			wday = calendar.get(Calendar.DAY_OF_WEEK);
			if(wday == 7){
				System.out.println();
			}
		}
		
		}
	}


