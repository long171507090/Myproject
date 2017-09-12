package com.nctu_work;

import java.util.Scanner;

import com.nctu_util.JDBCUtils;

public class JDBCtoMap {
	static JDBCUtils utils = new JDBCUtils();
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		while (true) {
			System.out.println("欢迎来到教师管理系统");
			System.out.println("1.添加老师信息");
			System.out.println("2.查看老师信息");
			System.out.println("3.修改老师信息");
			System.out.println("4.删除老师信息");
			System.out.println("");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				Menegement.add();
				break;
			case 2:
				System.out.println("请输入该老师的名字");
				String name = sc.next();
				Teacher teacher = Menegement.show(name);
				System.out.println(teacher);
				break;
			case 3:
				Menegement.update();
				break;
			case 4:
				Menegement.delete();
				break;
			}
		}
	}
      
      }

