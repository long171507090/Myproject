package com.nctu01;

import java.util.HashSet;



public class Classs {
   private HashSet<Student> cla = new HashSet<Student>();
		public void add(Student stu){
	    cla.add(stu);
	    System.out.println("添加成功");
   }
		public void query(String stu){
			for (Student student : cla) {
				if(student.getName().equals(stu)){
					System.out.println(student.toString());
				
			}
			}
			System.out.println("查无此人");	
		}
		public void remove(String stu){
			for (Student student : cla) {
				if(student.getName().equals(stu)){
					cla.remove(student);
					System.out.println("删除成功");
				
			}
			}
			System.out.println("查无此人");
			
		}
		

}
