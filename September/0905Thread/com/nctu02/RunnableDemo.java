package com.nctu02;
class Apple implements Runnable{
	private int num = 50;

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			synchronized(this){
			if(num>0){
				System.out.println(Thread.currentThread().getName()+"吃了第"+(num--)+"个苹果");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			}
		}	
	}
	
}

public class RunnableDemo {
	public static void main(String[] args) {
		Apple a = new Apple();
		new Thread(a,"小A").start();
		new Thread(a,"小B").start();
		new Thread(a,"小C").start();
	}

}
