package com.work3;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Tickets implements Runnable{
	private int tickets = 5;
	private final Lock lock = new ReentrantLock();
	private final Set<String> user = new HashSet<String>();
	public synchronized void buy(){
		lock.lock();
		
			
				if (tickets>0) {
				System.out.println(Thread.currentThread().getName() + "抢到票了");
				tickets--;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
				
			}
		}
	

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			if (!user.contains(Thread.currentThread().getName())) {
				buy();
				user.add(Thread.currentThread().getName());
			}
		}
	}

}

public class BuyTickets {
	public static void main(String[] args) {
		Tickets t1 = new Tickets();
		new Thread(t1,"tom").start();
		new Thread(t1,"jack").start();
		new Thread(t1,"rose").start();
		new Thread(t1,"zhang3").start();
		new Thread(t1,"li4").start();
		new Thread(t1,"wang5").start();
		new Thread(t1,"hanmeimei").start();
		
	}

}
