package com.nctu01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyDemo {
	public static void copy(String input,String output){
		try {
			FileInputStream n1 = new FileInputStream(input);
			FileOutputStream n2 = new FileOutputStream(output);
			byte[] b = new byte[1024];
			while(n1.read(b) != -1){
				n2.write(b);
				n2.flush();
			}
			n1.close();
			n2.close();
			System.out.println("复制完成");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		copy("D:/文件接收/day14_IO.docx", "E:/软件/copy.docx");
	}

}
