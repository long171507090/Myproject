package nctu06;

import java.util.ArrayList;
import java.util.Scanner;

public class AddStu {
	public static void addstu(ArrayList class1){
		Scanner sc = new Scanner(System.in);
		while(true){
		String tempname;
		int tempnum;
		System.out.println("请输入学生名字");
		tempname = sc.next();
		System.out.println("请输入学号");
		tempnum = sc.nextInt();
		Student stu = new Student(tempname,tempnum);
		class1.add(stu);
		System.out.println("添加成功");
		System.out.println("是否继续添加学生?");
		System.out.println("y-继续,n-退出");
		String s1 = sc.next();
		if(!s1.equals("y")){
			return ;
		}
		}		
	}
      public static void query(ArrayList class1){
    	  System.out.println("请输入要查询的学生");
    	  Scanner sc = new Scanner(System.in);
    	  String str1 = sc.next();
    	  for (Object object : class1) {
    		  Student student = (Student)object;
			if((student.getName()).equals(str1)){
				System.out.println("包含该学生");
				System.out.println(student.toString());
				return;
			}
		}
    	  System.out.println("不包含");}
      
      public static void remove(ArrayList class1){
    	  System.out.println("请输入要删除的学生");
    	  Scanner sc = new Scanner(System.in);
    	  String str1 = sc.next();
    	  Student a = judge(class1,str1);
			if(a==null){
				System.out.println("没有查到该学生,删除失败");
			}else{
					class1.remove(a);
			}
    	  
      }
      public static Student judge(ArrayList class1,String s1){
    	  for (Object object : class1) {
    		  Student student = (Student)object;
			if((student.getName()).equals(s1)){
				return student;
			}
      }
    	  return null;
    }
}
