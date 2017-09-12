package com.nctu0827;

import java.util.Iterator;
import java.util.LinkedList;

public class homework0827 {
	public static void main(String[] args) {
		LinkedList<Worker> ns = new LinkedList<Worker>();
		Worker n1 = new Worker("zhang3",18,5500);
	    Worker n2 = new Worker("li4",25,8000);
	    Worker n3 = new Worker("wang5",22,7000);
	    ns.add(n1);
	    System.out.println("添加成功");
	    ns.add(n2);
	    System.out.println("添加成功");
	    ns.add(n3);
	    System.out.println("添加成功");
	    
	    System.out.println("新增zhao6");
	    Worker n4 = new Worker("zhao6",24,9000);
	    ns.add(2, n4);
	    for (Worker worker : ns) {
			System.out.println(worker);
		}
	    System.out.println("删除li4");
	    ns.remove(1);
	    for (Worker worker : ns) {
			System.out.println(worker);
		}
	    System.out.println("-----------------------------");
	    Iterator<Worker> it = ns.iterator();
	    while(it.hasNext()){
	    	System.out.println(it.next());
	    }
	    
	    
	}

}
