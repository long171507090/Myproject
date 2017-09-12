package com.nctu04;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banks {
	private String name;
	private int money;
	private boolean isok = true;
	//private final Lock lock = new ReentrantLock();
	//private final Condition con = lock.newCondition();
	
	public synchronized void svae(String name, int money) {
		//lock.lock();
		try {
			if (!isok) {
				//con.await();
				this.wait();
			}
			this.name = name;
			Thread.sleep(100);
			this.money = money;
			isok = false;
			this.notify();
			//con.notify();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void draw(){
		//lock.lock();
		try {
			if (isok) {
				//con.await();
				this.wait();
			}
			Thread.sleep(100);
			System.out.println(this.name+"取款"+this.money);
			isok = true;
			//con.notify();
			this.notify();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
