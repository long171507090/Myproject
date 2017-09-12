package com.nctu05;

public class Lamp {
	private double wat;
	
	public Lamp(double wat) {
		super();
		this.wat = wat;
	}
	public void light(){
		System.out.println("车灯打开");
	}
	public void dark(){
		System.out.println("车灯关闭");
	}

}
