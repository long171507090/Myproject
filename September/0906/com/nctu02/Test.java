package com.nctu02;

public class Test {
	public static void main(String[] args) {
		Share share = new Share();
		Producer pro = new Producer(share);
		Consumer con = new Consumer(share);
		new Thread(pro).start();
		new Thread(con).start();
		
	}

}
