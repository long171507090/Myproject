package com.nctu01;

public class Consumer implements Runnable {
	private Share share = null;
	public Consumer(Share share){
		this.share = share;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			share.pop();
		}
		
	}

}
