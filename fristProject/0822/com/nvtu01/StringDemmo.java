package com.nvtu01;

public class StringDemmo {

	public static void ac(){
		String str1 = "abc";
		String str2 = "Abc";
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("str1=str2");
		}
	}
	public static void ab(){
		String str1 = "xiAobAi";
		System.out.println(str1);
		str1 = str1.toUpperCase();
		System.out.println(str1);
		str1 = str1.toLowerCase();
		System.out.println(str1);
	}
	public static void main(String[] args) {
		//ac();
		ab();

	}

}
