package com.nctu01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class collectionsDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("33");
		list.add("58");
		list.add("32");
		list.add("12");
		list.add("48");
		System.out.println(list);
		//Collections.sort(list);
		Collections.sort(list,new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(Integer.parseInt(o1)<Integer.parseInt(o2)){
					return -1;
				}else if(Integer.parseInt(o1)>Integer.parseInt(o2)){
					return 1;
				}
				return 0;
			}
			
		});
		System.out.println(list);
		
	}

}
