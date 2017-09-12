package com.nee;

public class test {
	public static void main(String[] args) {
		Instrument p1 = new Piano();
		Instrument p2 = new Violin();
		Concert p = new Concert();
		p.doInstrument(p1);
		p.doInstrument(p2);
		boolean a = p2 instanceof Violin;
		System.out.println(a);
		boolean b = p2 instanceof Instrument;
		System.out.println(b);
		boolean c = p1 instanceof Violin;
		System.out.println(c);
	}

}
