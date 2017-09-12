package com.nctusocked;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;


public class LoginSocked {
	public static void main(String[] args) throws Exception {
//		1.建立客户端Socket，指定服务器位置和端口
		Socket socket = new Socket("192.168.11.231",8888);
//		2.得到Socket读写流
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(outputStream);
//		3.利用流按照一定的协议对socket进行读写操作
		String str = "服务端,你好!我是客户端";
		pw.write(str);
//		4.使用close()关闭流和Socket
		pw.close();
		outputStream.close();
	}
}
