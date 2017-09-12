package com.nctu02;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Threads extends Thread {
	private Socket accept;
	private Date data = new Date();
	public Threads(Socket accept){
		this.accept = accept;
	}
	
	public void run() {
		//System.out.println(accept.getLocalAddress());
//		3.建立输入和输出流
		try {
			InputStream inputStream = accept.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(inputStream);
			Object object = ois.readObject();
			User user = (User) object;
			System.out.println(user+" "+data.getTime());
			
			OutputStream stream = accept.getOutputStream();
			PrintWriter pw = new PrintWriter(stream);
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			pw.write(str);
			pw.flush();
			
			
			pw.close();
			ois.close();
			inputStream.close();
			accept.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}