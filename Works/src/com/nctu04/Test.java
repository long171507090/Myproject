package com.nctu04;

public class Test {
	public static void main(String[] args) {
		Banks bank = new Banks();
		DrawMoney dra = new DrawMoney(bank);
		SavingMoney sav = new SavingMoney(bank);
		new Thread(dra).start();
		new Thread(sav).start();
	}

}
