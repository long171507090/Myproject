package com.nctutowuser;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReadSocked extends Thread {
	private ServerSocket sst;
	private Socket sock;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	public ReadSocked(ServerSocket sst,Socket sock,ObjectInputStream ois,ObjectOutputStream oos){
		this.sst = sst;
		this.sock = sock;
		this.ois = ois;
		this.oos = oos;
	}
	public void run() {
		
	}

}