package com.nctu01;

public class InnerClassDemo {
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100; i++) {
			System.out.println("打游戏"+i);
			Thread.sleep(500);
			if (i == 2) {
				new Thread(new Runnable() {

					@Override
					public void run() {
						for (int j = 0; j < 100; j++) {
							System.out.println("听音乐" + j);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}

					}
				}).start();
			}
		}
	}

}
