package com.nctu.dao;

import java.util.Collection;
import java.util.HashMap;

import com.nctu.Emplpyee.Emplpyee;

public class EmplpyeeDao {
	HashMap<Integer, Emplpyee> emp = new HashMap<Integer, Emplpyee>();
	
	public void addEmplpyee(Emplpyee emplpyee){
		if(emplpyee == null){
			System.out.println("你添加的员工信息为空");
			return;
		}
		if(emp.containsKey(emplpyee.getEno())){
			System.out.println("该工号已经有员工使用,请重新设置新工号");
			return;
		}else{
			emp.put(emplpyee.getEno(), emplpyee);
			System.out.println("添加员工成功");
		}
	}
	
	public void deleteEmplpyee(int eno){
		if(emp.containsKey(eno)){
			emp.remove(eno);
			System.out.println("删除成功");
			return;
		}else {
			System.out.println("为找到该工号的员工");
			return ;
		}
		
	}
	
	public void showEmplpyee(){
		Collection<Emplpyee> array = emp.values();
		for (Emplpyee element : array) {
			System.out.println(element);
		}
	}
	

}
