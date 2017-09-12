package com.nctu0904;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
//import java.util.ArrayList;

public class AppleTest {
	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/myapple.txt"));
			//ArrayList<Object> arr = new ArrayList<Object>();
			Object obj = ois.readObject();
			ArrayList<Apple> arr = (ArrayList<Apple>) obj;
			for (Object object : arr) {
				System.out.println(object);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
