package com.nctu02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Share {
	private String name;
	private String gener;
	private boolean isok = true;
	private final Lock lock = new ReentrantLock();
	private Condition con1 = lock.newCondition();
	
	public void push(String name,String gener){
		lock.lock();

		try {
			while (!isok) {
				con1.await();
			}

			this.name = name;
			Thread.sleep(100);
			this.gener = gener;
			isok = false;
			con1.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		

	}
	public void pop(){
		lock.lock();

		try {
			while (isok) {
				con1.await();
			}

			Thread.sleep(20);
			System.out.println(this.name + "-----------------" + this.gener);
			isok = true;
			con1.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		

	}

}
