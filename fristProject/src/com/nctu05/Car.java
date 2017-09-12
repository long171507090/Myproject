package com.nctu05;

public class Car {
	private String name;
	private String licence;
	private Engine engine;
	private Lamp lamp;
	public Car(String name, String licence, Engine engine, Lamp lamp) {
		super();
		this.name = name;
		this.licence = licence;
		this.engine = engine;
		this.lamp = lamp;
	}
	public void run(){
		System.out.println("汽车启动");
		this.engine.turn();
		this.lamp.light();
	}
	public void stop(){
		System.out.println("汽车关闭");
		this.engine.stopturn();
		this.lamp.dark();
		
	}

}
