package com.nctu02;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException, Exception {
		System.out.println("服务端准备好了");
//		1.建立服务器端Socket绑定指定端口并开始监听
		ServerSocket sst = new ServerSocket(9999);
//		2.使用accept()方法阻塞等待监听，获得新的连接
		Socket accept = null;
		while(true){
			accept = sst.accept();
			Threads t1 = new Threads(accept);
			t1.start();
		}
		
	}
	}


