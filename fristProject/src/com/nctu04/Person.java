package com.nctu04;

public class Person {
	private String name;
	private int grade;
	private int win;
	private int lose;
	private int drew;
	public Person() {
		super();
		win =0;
		lose =0;
		drew =0;
		grade=0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getDrew() {
		return drew;
	}

	public void setDrew(int drew) {
		this.drew = drew;
	}

	@Override
	public String toString() {
		return "Person [用户名" + name + ", 您赢了" + win + "把, 您输了" + lose
				+ "把, 平局" + drew + "把]";
	}
	
	

}
