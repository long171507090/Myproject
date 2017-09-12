package com.vip;

public class Member {
	private int memberid;
	private String name;
	private int credits;
	private float discount;
	public Member() {
	    
	}
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	

	@Override
	public String toString() {
		return "[新会员号是:" + memberid + ", 享受折扣为:" + discount + "]";
	}
	public boolean judge(int memberid){
		if(0<memberid/100000&&9>memberid/100000){
			return true;
			}
			else {
				System.out.println("您设置的会员号不合法,请重新输入");
				return false;
			}
	}

}
