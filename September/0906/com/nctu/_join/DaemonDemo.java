package com.nctu._join;

class DaemonTest extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-------"+i+Thread.currentThread().isDaemon());
		}
	}
}

public class DaemonDemo {
	public static void main(String[] args) {
		DaemonTest dae = new DaemonTest();
		for (int i = 0; i < 50; i++) {
			System.out.println("main"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i == 10){
				dae.setDaemon(true);
				dae.start();
			}
		}
	}

}
