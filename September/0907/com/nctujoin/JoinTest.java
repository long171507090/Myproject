package com.nctujoin;

class joindemo extends Thread{
	private int time;
	private String  name;
	public joindemo(String name,int time){
		this.name = name;
		this.time = time;
	}
	@Override
	public void run() {
		System.out.println(this.name+"开始了....");
		try {
			Thread.sleep(this.time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.name+"结束了....");
	}
}
public class JoinTest {
	public static void main(String[] args) {
		joindemo j1 = new joindemo("zhang3",5000);
		joindemo j2 = new joindemo("li4",7000);
		joindemo j3 = new joindemo("wang5",9000);
		try {
			j1.start();
			j1.join();
			j2.start();
			j2.join();
			j3.start();
			j3.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
