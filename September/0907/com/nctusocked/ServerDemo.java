package com.nctusocked;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("服务端准备好了");
//		1.建立服务器端Socket绑定指定端口并开始监听
		ServerSocket sst = new ServerSocket(9999);
//		2.使用accept()方法阻塞等待监听，获得新的连接
		Socket accept = sst.accept();
		System.out.println(accept.getLocalAddress());
//		3.建立输入和输出流
		InputStream inputStream = accept.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//		4.在已有的协议上产生会话
		String str = null;
		while((str = br.readLine())!=null){
			System.out.println(str);
		}
//		5.使用close()关闭流和Socket
		br.close();
		inputStream.close();
		accept.close();
	}
	}


