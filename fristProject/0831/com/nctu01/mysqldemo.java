package com.nctu01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqldemo {
	public static void main(String[] args) {
		Connection con = null;
		Statement sta = null;
		ResultSet tes = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql:///jdbcdemo?useSSL=true","root","123456");
				sta = con.createStatement();
				tes = sta.executeQuery("" +
						"select p.id,p.productName,p.salePrice,pd.dirName" +
						" from product p, productdir pd" +
						" where p.dir_id = pd.id and p.salePrice >200 order by p.salePrice");
				while(tes.next()){
					int a = tes.getInt("id");
					String acc = tes.getString(2);
					int b = tes.getInt(3);
					String c = tes.getString(4);
					System.out.println("id="+a+"\t名称="+acc+"\t价格="+b+"\t\t属性="+c);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
		if(tes != null){
			try {
				tes.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(sta != null){
			try {
				sta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con != null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
		
	}
}
