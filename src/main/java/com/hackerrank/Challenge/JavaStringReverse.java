package com.hackerrank.Challenge;


/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
Sample Input
madam

Sample Output
Yes


*/
public class JavaStringReverse {
	public static void main(String[] args) {
		String palindrome = "madam";
		String compare = "";
		for(int i = 1; i <= palindrome.length();  i++) {
			compare += palindrome.charAt(palindrome.length() - i);
		}
		if(compare.equals(palindrome)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}
}
