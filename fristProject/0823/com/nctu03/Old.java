package com.nctu03;

import java.util.ArrayList;

public class Old {
	private String name;
	private ArrayList girls;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList getGirls() {
		return girls;
	}
	public void setGirls(ArrayList girls) {
		this.girls = girls;
	}
	@Override
	public String toString() {
		return "Old [name=" + name + ", girls=" + girls + "]";
	}
	

}
