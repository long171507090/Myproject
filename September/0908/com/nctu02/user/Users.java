package com.nctu02.user;

public class Users {
	private int id;
	private String name;
	private String password;
	private String birthday;
	private String sax;
	private String hobby;
	public Users(int id, String name, String password, String birthday,
			String sax, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.sax = sax;
		this.hobby = hobby;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSax() {
		return sax;
	}
	public void setSax(String sax) {
		this.sax = sax;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", password=" + password
				+ ", birthday=" + birthday + ", sax=" + sax + ", hobby="
				+ hobby + "]";
	}
	

}
