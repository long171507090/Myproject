package com.nctu01;
class builwairt implements Runnable{

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
class cup implements Runnable{

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

public class RunnableDemo {
	public static void main(String[] args) {
		builwairt bw = new builwairt();
		cup cp = new cup();
		Thread td = new Thread(bw);
		Thread td2 = new Thread(cp);
		td.start();
		td2.start();
		
	}

}
