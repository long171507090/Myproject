package com.nctu02.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nctu02.user.Users;
import com.nctu_util.JDBCUtils;

public class userdao {
	private final JDBCUtils utils = new JDBCUtils();
	public userdao(){
		utils.getConnection();
	}
	
	public Users Login (String name,String password) throws Exception{
		String sql = "SELECT * FROM t_user WHERE name = ?";
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(name);
			return utils.findSimpleRefResult(sql, list, Users.class);			
	}
	public boolean adduser(Users user){
		
		try {
			String sql = "INSERT t_user(name,password,birthday,sax,hobby) SELECT ?,?,?,?,?";
			ArrayList<Object> list = new ArrayList<Object>();
			list.add(user.getName());
			list.add(user.getPassword());
			list.add(user.getBirthday());
			list.add(user.getSax());
			list.add(user.getHobby());
			return  utils.updateByPreparedStatement(sql, list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	return false;
	}
	public List<Users> showAll(){
		String sql = "SELECT * FROM t_user";
		try {
			return utils.findMoreRefResult(sql, null, Users.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public List<Users> query(String name,String sax){
		String sql = "SELECT name,sax,hobby,birthday FROM t_user WHERE name LIKE ? AND sax LIKE ?";
		ArrayList<Object> list = new ArrayList<Object>();
		name = "%"+name+"%";
		sax = "%"+sax+"%";
		list.add(name);
		list.add(sax);
		try {
			return utils.findMoreRefResult(sql, list, Users.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public boolean delete(String name){
		String sql = "DELETE FROM t_user WHERE name = ?";
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(name);
		try {
			return utils.updateByPreparedStatement(sql, list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
