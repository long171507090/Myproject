package com.nctu02;

import java.util.HashMap;
import java.util.Set;

public class Classes {
		private HashMap<String, Student> stus = new HashMap<String, Student>();
		//1.添加学生
		public void add(Student stu){
			if(stu==null){
				System.out.println("该学生对象是空的,不能添加");
			}else{
				stus.put(stu.getId(), stu);
				System.out.println("添加成功");
			}
		}
		public Student queryStudent(String id){
			boolean a = stus.containsKey(id);
			if(a){
			Student stu = stus.get(id);
			System.out.println(stu);
			return stu;
			}
			System.out.println("该学生不存在");
			return null ;
		}
		public void deleteStudent(String id){
			boolean a = stus.containsKey(id);
			if(a){
			stus.remove(id);
			System.out.println("删除成功");
			return ; 
			}
			System.out.println("未找到");	
		}
		
		
		//4.全部查询
		public void showAllStudents(){
			Set<String> keySet = stus.keySet();
			for (String key : keySet) {
				System.out.println("id"+key+" name"+stus.get(key));
				
			}
			
				}
			
			
		}
		 




