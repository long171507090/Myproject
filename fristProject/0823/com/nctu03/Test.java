package com.nctu03;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Girl g1 = new Girl("小芳");
		Girl g2 = new Girl("小红");
		Girl g3 = new Girl("韩梅");
		Girl g4 = new Girl("如花");
		ArrayList gs = new ArrayList();
		gs.add(g1);
		gs.add(g2);
		gs.add(g3);
		gs.add(g4);
		System.out.println(gs.toString());
		gs.remove(1);
		System.out.println(gs.toString());
	}

}
