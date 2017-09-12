package com.fengzhuang;

public class petion {
     private String name;
     private int age;
     public void working(){
    	 System.out.println("工作中.....");
     }
     public void setName(String name){
    	 this.name = name; 
     }
     public String getName(){
    	 return this.name;
     }
     public void setAge(int age){
    	 
    	 if(age<0){
    		 System.out.println("年龄设置不合理");
    	 }
    	 else {
			this.age=age;
		}
     }
     public int getAge(){
    	 return this.age;
     }
     
}
