package com.nctu01;

public class StudTest {
        public static void main(String[] args) {
			AClass stu1 = new AClass(10,11);
			BClass stu2 = new BClass(5.8);
			double temp=stu1.getSch();
			double temp2 = stu2.getSch();
			System.out.println(temp);
			System.out.println(temp2);
		}
}
