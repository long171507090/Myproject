package com.day0821;

import java.util.Arrays;

public class Work2 {
	public static void main(String[] args) {
		String filenames = "abc.java;hello.will.txt;hello.java;hello.class";
		String[] arr = filenames.split(";");
		for (String string : arr) {
			if(string.contains("hello")){
				int index = string.lastIndexOf(".");
				System.out.println(string.substring(index));
			}
			
		}
	}

}
