package com.nctu01;


public class Share {
	private String name;
	private String gener;
	private boolean isok = true;
	public synchronized void push(String name,String gener){
		if(!isok){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			try {
				this.name = name;
				Thread.sleep(10);
				this.gener = gener;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		isok = false;
		this.notify();
		
	}
	public synchronized void pop(){
		if(isok){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(20);
			System.out.println(this.name+"-----------------"+this.gener);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		isok = true;
		this.notify();
		
	}

}
