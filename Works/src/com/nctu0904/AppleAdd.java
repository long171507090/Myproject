package com.nctu0904;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AppleAdd {
	public static void main(String[] args) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/myapple.txt"));
			Apple a1 = new Apple("iphone6s",3999,"32G");
			Apple a2 = new Apple("iphone7",4399,"32G");
			Apple a3 = new Apple("iphone7plus",5499,"128G");
			ArrayList<Apple> list = new ArrayList<Apple>();
			list.add(a1);
			list.add(a2);
			list.add(a3);
			oos.writeObject(list);
			oos.flush();
			oos.close();
			System.out.println("添加成功");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
