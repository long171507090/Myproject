package com.day0906;

public class DrawMoney implements Runnable {
	private Banks bank = null;
	public DrawMoney(Banks bank){
		this.bank = bank;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			bank.draw();
		}
		
	}

}
