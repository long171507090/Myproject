package com.vip;

import java.util.Random;
import java.util.Scanner;

public class test {
      public static void main(String[] args) {
    	  
    	 // ArrayList;  动态数组用法!!
		Scanner sc = new Scanner(System.in);
		Member user1 = new Member();
		Member user2 = new Member();
		Member user3 = new Member();
		Member[] users  = new Member[]{user1,user2,user3};
		
		for(int i = 0;i<users.length;i++)
		{ 
			System.out.println("请设置您的会员号");
			users[i].setMemberid(sc.nextInt());
			System.out.println("请输入您的姓名");
			users[i].setName(sc.next());
			System.out.println("请设置消费所得积分");
			users[i].setCredits(sc.nextInt());
			System.out.println("请设置能够享受的折扣");
			users[i].setDiscount(sc.nextFloat());
			boolean k = users[i].judge(users[i].getMemberid());
			if(k == true){
				System.out.println("会员设置成功!");
			}
			else {
				System.out.println("会员设置有误,请重新设置");
				i--;
				continue;
			}
			System.out.println(users[i]);
			//System.out.println("会员:"+tempid+",能享受"+tempdiscount+"折优惠");
		}
		Random random = new Random();
		System.out.println("幸运抽奖开始...");
		System.out.println("请按1键开始抽奖");
		int k;
		k = sc.nextInt();
		if(k == 1){
			int i =random.nextInt(3);
			System.out.println("会员号"+users[i].getMemberid()+"为我们的幸运用户");
		}
		else {
			System.out.println("您按得键有误,抽奖未能开始");
		}
		
	}
}
