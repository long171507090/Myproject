package com.nctu01;

public class AClass extends School {
	private double height;
	private double width;
	

	public AClass(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}


	@Override
	public double getSch() {
		
		return height*width ;
	}

}
