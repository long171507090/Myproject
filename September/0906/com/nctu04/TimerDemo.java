package com.nctu04;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			private int i;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Date d1 = new Date();
				System.out.println(d1.toLocaleString()+"---------"+this.i++);
				if(i == 10){
					this.cancel();
				}
			}
		},3000,1000);
	}

}
