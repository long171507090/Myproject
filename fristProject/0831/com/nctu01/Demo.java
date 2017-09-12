package com.nctu01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws Exception {
		//Create();
		//isert();
		//update();
		delete();
	}
	public static void delete() throws Exception{
		String sql = "DELETE FROM t_student WHERE id = 2";
		mysql(sql);
	}
	public static void update() throws Exception{
		String sql = "UPDATE t_student SET name = '西方官人',age = 32 WHERE id = 2";
		mysql(sql);
	}
	public static void isert() throws Exception{
		String sql = "INSERT t_student (id,name,age) VALUES(2,'东方姑娘',18)";
		mysql(sql);
	}
	public static void Create() throws Exception{
		String sql = "CREATE TABLE t_student(id bigint(20) DEFAULT NULL,name varchar(20) DEFAULT NULL," +
				"age int(20) DEFAULT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8";
		mysql(sql);
	}
	public static void mysql(String sql) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:///jdbcdemo?useSSL=true","root","123456");
		Statement sta = con.createStatement();
		int a = sta.executeUpdate(sql);
		System.out.println(a);
		sta.close();
		con.close();
	}

}
