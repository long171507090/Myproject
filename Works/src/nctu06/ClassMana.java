package nctu06;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMana {
      public static void display(ArrayList class1){
    	  Scanner sc = new Scanner(System.in);
    	  while(true){
    	  System.out.println("   欢迎来到学生管理系统      ");
    	  System.out.println("1、添加学生");
    	  System.out.println("2、查询学生");
    	  System.out.println("3、删除学生");
    	  System.out.println("4、退出系统");
    	  int i;
    	  i = sc.nextInt();
    	  switch (i) {
		case 1:
			AddStu.addstu(class1);
			break;

		case 2:
			AddStu.query(class1);
			break;
		case 3:
			AddStu.remove(class1);
			break;
		case 4:
			return;
		}
    	  
    	  
      }
      }
}
