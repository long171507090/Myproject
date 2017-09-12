package com.nctu._join;

class JoinThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("join"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class JoinDemo {
	public static void main(String[] args) {
		JoinThread j1 = new JoinThread();
		for (int i = 0; i < 50; i++) {
			try {
				System.out.println("main"+i);
				Thread.sleep(100);
				if(i == 10){
					j1.start();
				}
				if (i == 20) {
					j1.join();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
