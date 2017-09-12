package com.nctu;

public class Test {
	public static void main(String[] args) {
		Iusb m = new Mouse();
		Key k = new Key();
		MotherB mm = new MotherB();
		mm.dowork(m);
		mm.dowork(k);
		
	}

}
