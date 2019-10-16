package com.hackerrank.Challenge;

public class JavaRegex {
	public static void main(String[] args) {
		
		String ip = "192.168.0.1";
		
		System.out.println(ip.matches("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"));
	}
}
