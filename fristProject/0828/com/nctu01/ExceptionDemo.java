package com.nctu01;



public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int a = 10/0;
		    System.out.println(a);
			
		} catch (Exception e) {
			//1.System.out.println(e);
			//2.e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}