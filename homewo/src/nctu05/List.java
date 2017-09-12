package nctu05;

import java.util.LinkedList;

public class List {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("范冰冰");
		list.add("李冰冰");
		list.add("凤姐");
		list.add("春哥");
		System.out.println("隔壁老王一共有下面这几个女朋友:");
		System.out.println(list);
		System.out.println("--------------------------------------");
		System.out.println("后来老王跟其中一位闹不合,分手了");
		list.remove(1);
		System.out.println("现在老王还和下面几位保持着不正当关系");
		System.out.println(list);
		
	}

}
