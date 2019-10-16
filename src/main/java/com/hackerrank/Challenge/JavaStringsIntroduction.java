package com.hackerrank.Challenge;

public class JavaStringsIntroduction {
	public static void main(String[] args) {
		 
	        String A= "hello";
	        String B= "java";
	        System.out.println(A.trim().length()+B.trim().length());
	       	        
	        int i = A.compareTo(B);
	        if(i>0){
	             System.out.println("Yes");
	        } else{
	             System.out.println("No");
	        }
	        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " " + 
	        					B.substring(0,1).toUpperCase()+B.substring(1));
	        	
	        }
	        	
}
