package com.nctu02;

public class Producer implements Runnable {
	private Share share = null;
	public Producer(Share share){
		this.share = share;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			if(i % 2 ==0){
				share.push("韩梅梅", "女");
			}else {
				share.push("李雷", "男");
			}
			
		}
		
	}

}
