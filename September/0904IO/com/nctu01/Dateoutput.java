package com.nctu01;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Dateoutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:/my.txt"));
			System.out.println("请写入ID");
			int id = sc.nextInt();
			System.out.println("请输入名字");
			String name = sc.next();
			dos.write(id);
			dos.writeUTF(name);
			dos.writeDouble(3.57);
			dos.flush();
			dos.close();
			System.out.println("写入成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
