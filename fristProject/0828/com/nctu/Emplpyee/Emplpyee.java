package com.nctu.Emplpyee;

public class Emplpyee {
	private int eno;
	private String name;
	private String ejob;
	private char esex;
	private double esalary;
	public Emplpyee(int eno, String name, String ejob, char esex, double esalary) {
		super();
		this.eno = eno;
		this.name = name;
		this.ejob = ejob;
		this.esex = esex;
		this.esalary = esalary;
	}
	public Emplpyee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEjob() {
		return ejob;
	}
	public void setEjob(String ejob) {
		this.ejob = ejob;
	}
	public char getEsex() {
		return esex;
	}
	public void setEsex(char esex) {
		this.esex = esex;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Emplpyee [eno=" + eno + ", name=" + name + ", ejob=" + ejob
				+ ", esex=" + esex + ", esalary=" + esalary + "]";
	}
	
}
