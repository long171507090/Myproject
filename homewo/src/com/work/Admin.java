package com.work;

public class Admin {
	String name;
	String password;
	
	public Admin(){
		name = "zhangsan";
		password="1234";
	}
	public void outInfo(){
		System.out.println("用户名是:"+name+"密码是:"+password);
	}
	public boolean login(String name,String password){
		if(name.equals(this.name)&&(password.equals(this.password))){
			System.out.println("登入成功");
			return true;
		}
		else
		{
			System.out.println("用户名或密码错误");
			return false;
		}
		
	}
	
}	