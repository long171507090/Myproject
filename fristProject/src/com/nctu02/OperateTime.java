package com.nctu02;

public abstract class OperateTime {
	public long dowork(){
		long begin = System.currentTimeMillis();
		this.getTime();
		long end = System.currentTimeMillis();	
		return (end-begin);
	}
	public abstract void getTime();

}
