package com.nctu01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {
	public static void main(String[] args) {
		File file = new File("D:/test.txt");
		try {
			FileReader fr = new FileReader(file);
			//获取文件的大小  数据字节流
			FileInputStream fis = new FileInputStream(file);
			char[] cbuf = new char[fis.available()];
			fr.read(cbuf);
			
			//char数组---->字符串
			String str = new String(cbuf);
			
			System.out.println(str);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
