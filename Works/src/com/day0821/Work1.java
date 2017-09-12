package com.day0821;

public class Work1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="willabcde";
		String str2 = str.substring( 0, 1);
		str2 = str2.toUpperCase();
		str = str.substring(1);
		str = str2+str;
		System.out.println(str);
	}

}
