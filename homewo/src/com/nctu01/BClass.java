package com.nctu01;

public class BClass extends School {
	private double radius;
	

	public BClass(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public double getSch() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

}
