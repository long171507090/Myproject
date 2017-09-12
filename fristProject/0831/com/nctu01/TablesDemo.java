package com.nctu01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TablesDemo {
	public static void main(String[] args) throws Exception{
		//insert();
		
	}
	public static void insert(String a) throws Exception{
//		String sql1 = "INSERT employee (name,age) VALUES ('王五',21)";
//		mysql(sql1);
//		String sql2 = "UPDATE employee SET name = '王权',age = 33 WHERE id = 2";
//      mysql(sql2);
		String sql3 = "SELECT * FROM employee WHERE name LIKE"+a;
        
	}
    public static void mysql(String sql) throws Exception{
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection con = DriverManager.getConnection("jdbc:mysql:///jdbcdemo?useSSL=true","root","123456");
    	Statement sta = con.createStatement();
    	ResultSet res = sta.executeQuery(sql);
    	while(res.next()){
    		
    	}
    	sta.close();
    	con.close();
    }
}
