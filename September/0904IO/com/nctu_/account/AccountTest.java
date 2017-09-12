package com.nctu_.account;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nctu_util.JDBCUtils;

public class AccountTest {
	public static void main(String[] args) {
		JDBCUtils utils = new JDBCUtils();
		Connection con = utils.getConnection();
		String sql ="SELECT * FROM t_account WHERE name = ? AND balance>?";
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("西门官人");
		arr.add(1000);
		Person person = null;
		try {
			 person = utils.findSimpleRefResult(sql, arr, Person.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(person != null){
			
			try {
				con.setAutoCommit(false);
				String sql1 = "UPDATE t_account SET balance = balance-? WHERE name = ?";
				String sql2 = "UPDATE t_account SET balance = balance+? WHERE name = ?";
				ArrayList<Object> arr2 = new ArrayList<Object>();
				ArrayList<Object> arr3 = new ArrayList<Object>();
				arr2.add(1000);
				arr2.add("西门官人");
				arr3.add(1000);
				arr3.add("东方姑娘");
					boolean isok = utils.updateByPreparedStatement(sql1, arr2);
					//System.out.println(1/0);
					boolean isok2 = utils.updateByPreparedStatement(sql2, arr3);
					if(isok&&isok2){
						System.out.println("转账成功");
					}else {
						System.out.println("转账失败");
					}
					con.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			} 
			
			
		}
	}


