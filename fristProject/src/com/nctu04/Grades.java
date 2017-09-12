package com.nctu04;

public class Grades {
	public static void grades1(Person user){
		System.out.println("+0分");
		System.out.println("★☆分数为:☆★"+user.getGrade());
		return;
	}
	public static void grades2(Person user){
		user.setGrade((user.getGrade()-20));
		System.out.println("-20分");
		System.out.println("★☆分数为:☆★"+user.getGrade());
		return;
	}
	public static void grades3(Person user){
		user.setGrade((user.getGrade()+20));
		System.out.println("+20分");
		System.out.println("★☆分数为:☆★"+user.getGrade());
		return;
	}

}
