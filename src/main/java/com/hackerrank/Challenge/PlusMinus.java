package com.hackerrank.Challenge;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/*
 * Given an array of integers, calculate the fractions of its elements that are positive, 
 * negative, and are zeros. Print the decimal value of each fraction on a new line.
 * Note: 
 * This challenge introduces precision problems. 
 * The test cases are scaled to six decimal places, 
 * though answers with absolute error of up to 10 elevado -4 are acceptable.
 * 
 * Example:
 * Input:
 * 6
 * -4 3 -9 0 4 1
 * 
 * Output:
 * 0.500000
 * 0.333333
 * 0.166667
 * 
 * There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
 * The proportions of occurrence are positive: 3/6 = 0.500000, negative: 2/6 = 0.333333 and zeros: 1/6 = 0.166667.
 * */

public class PlusMinus {
	public static void main(String[] args) {
		int[] a ={-4, 3, -9, 0, 4, 1};
		plusMinus(a);
	}
	
	static void plusMinus(int[] arr) {
		DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols(Locale.getDefault());
		formatSymbols.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("0.0########", formatSymbols);
		double pos=0;
		double neg=0;
		double zer=0;
        for(int i=0; i < arr.length;i++){
        	if(arr[i] > 0) 
        		pos += 1;
        	
        	if(arr[i] < 0)
        		neg += 1;
        	
        	if(arr[i]==0)
        		zer +=1;	
        }
        
        System.out.println(df.format(pos/arr.length));
        System.out.println(df.format(neg/arr.length));
        System.out.println(df.format(zer/arr.length));
        
    }
}
