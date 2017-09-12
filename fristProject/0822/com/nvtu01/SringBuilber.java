package com.nvtu01;

public class SringBuilber {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("acc");
		str.append("ach");
		System.out.println(str);
		str.append(",wei");
		System.out.println(str);
		str.delete(2, 3);
		System.out.println(str);
		str.deleteCharAt(7);
		System.out.println(str);
	}

}
