package com.nctu01;
class abc extends Thread{
	@Override
	public void run() {
		System.out.println("开始烧水");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("烧水完成");
	}
}
class acc extends Thread{
	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("洗了第"+i+"个杯子");
		}
		
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		abc ab = new abc();
		acc ac = new acc();
		ab.start();
		ac.start();
	}

}
