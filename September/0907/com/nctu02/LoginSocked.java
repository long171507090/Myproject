package com.nctu02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class LoginSocked {
	public static void main(String[] args) throws Exception {
//		1.建立客户端Socket，指定服务器位置和端口
		Socket socket = new Socket("127.0.0.1",9999);
//		2.得到Socket读写流
		OutputStream outputStream = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(outputStream);
//		3.利用流按照一定的协议对socket进行读写操作
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String password = sc.next();
		 User str = new User(name,password);
		oos.writeObject(str);
		oos.flush();
		socket.shutdownOutput();
		InputStream inputStream = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		String str2 = null;
		while((str2 = br.readLine())!=null){
			System.out.println(str2);
		}
         br.close();
		oos.close();
		outputStream.close();
	}
}
