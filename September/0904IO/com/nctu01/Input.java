package com.nctu01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {
	public static void main(String[] args) {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("D:/my.txt"));
			int id = dis.read();
			System.out.println(id);
			System.out.println(dis.readUTF());
			System.out.println(dis.readDouble());
			dis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
