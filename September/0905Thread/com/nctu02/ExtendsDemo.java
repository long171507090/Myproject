package com.nctu02;

class person extends Thread{
	private int num = 50;
	person(String name){
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if(num>0){
				System.out.println(super.getName()+"吃了第"+(i+1)+"个苹果");
				num--;
			}
		}
	}
}
public class ExtendsDemo {
	public static void main(String[] args) {
		 new person("小A").start();
		 new person("小B").start();
		 new person("小C").start();
	}

}