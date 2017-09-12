package com.nctu03;
class User{
	private User(){
	}
	private static final User instence = new User();
	public User getUser(){
		return instence;
	}
}

public class EhanDemo {
	

}
