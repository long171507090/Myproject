package com.nctu01;
class games extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("正在玩游戏");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class music extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("正在听音乐");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		games g = new games();
		music m = new music();
		g.start();
		m.start();
	}

}
