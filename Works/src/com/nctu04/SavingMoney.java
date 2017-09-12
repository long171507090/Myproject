package com.nctu04;

public class SavingMoney implements Runnable {
	private Banks bank = null;
	public SavingMoney(Banks bank){
		this.bank = bank;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {
				bank.svae("jack", i+1);
			}else {
				bank.svae("tom", i+1);
			}
			
		}
		
	}

}
