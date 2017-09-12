package com.nctu05;

public class person {
	private String name;
	private Car car;
	
	public person(String name, Car car) {
		super();
		this.name = name;
		this.car = car;
	}

	public void cars(int i){
		if(i==1){
			this.car.run();
		}
		else if(i==2){
			this.car.stop();
		}
		else {
			System.out.println("输入有误");
		}
	}

}
