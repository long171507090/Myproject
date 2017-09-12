package com.nctu_.aObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectDemo {
	public static void main(String[] args) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/abc.txt"));
			person p1 = new person(1,"xiaoming",23);
			oos.writeObject(p1);
			oos.flush();
			oos.close();
			System.out.println("结束了");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
