package com.nctu05;

public class Test {
	public static void main(String[] args) {
		Engine e1 = new Engine("CZ-8091t",3.5);
		Lamp l1 = new Lamp(100);
		Car c1 = new Car("panamera","闵D.88888",e1,l1);
		person n = new person("laowang",c1);
		n.cars(1);
	}

}
