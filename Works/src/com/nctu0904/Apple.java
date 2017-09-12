package com.nctu0904;

import java.io.Serializable;

public class Apple implements Serializable {
	private String id;
	private int price;
	private String mamory;
	public Apple(String id, int price, String mamory) {
		super();
		this.id = id;
		this.price = price;
		this.mamory = mamory;
	}
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMamory() {
		return mamory;
	}
	public void setMamory(String mamory) {
		this.mamory = mamory;
	}
	@Override
	public String toString() {
		return "Apple [id=" + id + ", price=" + price + ", mamory=" + mamory
				+ "]";
	}
	

}
