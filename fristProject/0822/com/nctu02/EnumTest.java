package com.nctu02;

public class EnumTest {
	public static void main(String[] args) {
		EnumDemo n1 = new EnumDemo();
		n1.setRestdayDay(WeekDay.Friday);
		n1.setRestdayDay(WeekDay.Sunday);
		if(n1.getRestdayDay() == WeekDay.Saturday||n1.getRestdayDay() == WeekDay.Sunday){
			System.out.println("周末休息");
		}else 
		{
			System.out.println("周末不休息");
		}
	}

}
