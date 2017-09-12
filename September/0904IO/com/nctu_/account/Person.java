package com.nctu_.account;

public class Person {
	private int id;
	private String name;
	private int balance;
	public Person(int id, String name, int balence) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public Person() {
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
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", balance=" + balance
				+ "]";
	}
	

}
