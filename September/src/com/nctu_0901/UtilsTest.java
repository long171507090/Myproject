package com.nctu_0901;

import java.util.ArrayList;
import java.util.List;

import com.nctu_util.JDBCUtils;

public class UtilsTest {
	public static void main(String[] args) throws Exception {
		JDBCUtils util = new JDBCUtils();
		util.getConnection();
		
		//添加
//		String sql = "INSERT employee (name,age) VALUES(?,?)";
//		ArrayList<Object> params = new ArrayList<Object>();
//		params.add("王思聪");
//		params.add(32);
//		boolean isok = util.updateByPreparedStatement(sql, params);
//		if(isok){
//			System.out.println("添加成功");
//		}else{
//			System.out.println("添加失败");
//		}
		//查询多条数据
//		String sql = "SELECT * FROM employee";
//		List<Employee> list = util.findMoreRefResult(sql, null, Employee.class);
//		for (Employee employee2 : list) {
//			System.out.println(employee2);
//		}
		//查询单条数据
		String sql = "SELECT * FROM employee WHERE id = ?";
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add(4);
		Employee employee = util.findSimpleRefResult(sql, list2, Employee.class);
		System.out.println(employee);
	}

}
