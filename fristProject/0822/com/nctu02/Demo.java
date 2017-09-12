package com.nctu02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		String age = a+"";
		String age1 = b+"";
		BigDecimal num = new BigDecimal(age);
		BigDecimal num1 = new BigDecimal(age1);
		System.out.println(num.add(num1));
		
	}

}
