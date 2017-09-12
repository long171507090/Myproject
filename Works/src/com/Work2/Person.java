package com.Work2;

public abstract class Person {
	private String name;
	private int integral;
	public Person(String name, int integral) {
		super();
		this.name = name;
		this.integral = integral;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

	public abstract int play();

}
