package com.hackerrank.Challenge;

public class VeryBigSum {
	public static void main(String[] args) {
		long[] ar = {5, 1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
		
		System.out.println(aVeryBigSum(ar));
	}
	
	static long aVeryBigSum(long[] ar) {
		long count=0;
		for(int i=0; i < ar.length; i++) {
			count = count + ar[i];
		}
		return count;
    }
}
