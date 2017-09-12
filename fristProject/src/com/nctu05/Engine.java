package com.nctu05;

public class Engine {
	private String model;
	private double cap;
	
	public Engine(String model, double cap) {
		super();
		this.model = model;
		this.cap = cap;
	}
	public void turn(){
		System.out.println("引擎启动");
	}
	public void stopturn(){
		System.out.println("引擎关闭");
		
	}

}
