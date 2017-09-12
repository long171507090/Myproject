package com.nctu_.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties p = new Properties();
		try {
			InputStream ips = new FileInputStream("E:/coding/September/0904IO/com/nctu_/Properties/db.Properties");
			p.load(ips);
			System.out.println(p);
			String string = p.getProperty("username");
			System.out.println(string);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
