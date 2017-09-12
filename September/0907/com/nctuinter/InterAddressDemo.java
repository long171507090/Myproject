package com.nctuinter;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InterAddressDemo {
	public static void main(String[] args) throws Exception {
		//InetAddress ip = InetAddress.getByName("stu1608");
		InetAddress ip = InetAddress.getByName("www.4399.com");
		System.out.println(InetAddress.getByName("www.4399.com"));
		System.out.println(ip.hashCode());
		System.out.println(ip.isReachable(5000));
		System.out.println(InetAddress.getLocalHost());
	}

}
