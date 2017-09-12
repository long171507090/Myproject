package com.nctu_.aObject;

import java.io.Serializable;

public class person implements Serializable {
	private int id;
	private String name;
	private int age;
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

}
