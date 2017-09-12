package com.nctu_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.nctu_util.JDBCUtils;
public class Menegement {
	static JDBCUtils utils = new JDBCUtils();
	static Scanner sc = new Scanner(System.in);
	public static void add() throws Exception{
		while (true) {
			System.out.println("请输入老师的名字");
			String name = sc.next();
			System.out.println("请输入老师教的课程");
			String course = sc.next();
			String sql = "INSERT teacher (name,course) VALUES(?,?)";
			ArrayList<Object> list = new ArrayList<Object>();

			list.add(name);
			list.add(course);
			boolean isok = utils.updateByPreparedStatement(sql, list);
			if (isok) {
				System.out.println("添加成功");
			} else {
    		  System.out.println("添加失败");
    	  }
    	  System.out.println("1.继续添加---其他退出");
    	  int i = sc.nextInt();
    	  if(i != 1){
    		  return;
    	  }
    	  }
	}
	public static Teacher show(String name) throws Exception{
			ArrayList<Object> list2 = new ArrayList<Object>();
			list2.add(name);
			String sql = "SELECT * FROM teacher WHERE name = ?";
			Teacher teacher = utils.findSimpleRefResult(sql, list2, Teacher.class);
			return teacher;
		
		}
	
	public static void showall(JDBCUtils utils) throws Exception{
		String sql = "SELECT * FROM teacher";
		List<Teacher> list = utils.findMoreRefResult(sql, null, Teacher.class);
		for (Teacher teacher : list) {
			System.out.println(teacher);
		}
	
	}
	public static void delete() throws Exception{
		System.out.println("请输入需要删除的教师");
		String name = sc.next();
		if(show(name).getName()==null){
			System.out.println("要删除的教师不存在,删除失败");
		}else{
			String sql = "DELETE FROM teacher WHERE name = ?";
			ArrayList<Object> list = new ArrayList<Object>();
			list.add(name);
			boolean isok = utils.updateByPreparedStatement(sql, list);
			if(isok){
				System.out.println("删除成功");
			}else{
				System.out.println("删除失败");
			}
		}
	}
	public static void update() throws Exception{
		System.out.println("请输入需要修改老师的名字");
		String name = sc.next();
		if(show(name).getName() == null){
			System.out.println("需要修改的教师不存在");
		}else {
			System.out.println("请输入该老师新教的课程");
			String course = sc.next();
			String sql = "UPDATE teacher SET course = ? WHERE name = ?";
			ArrayList<Object> list = new ArrayList<Object>();
			list.add(course);
			list.add(name);
			boolean isok = utils.updateByPreparedStatement(sql, list);
			if(isok){
				System.out.println("修改成功");
			}else{
				System.out.println("修改失败");
			}
		}
	}
}
