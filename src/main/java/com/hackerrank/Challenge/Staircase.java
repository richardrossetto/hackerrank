package com.hackerrank.Challenge;

/*
 * Consider a staircase of size n = 4:
 *    #
 *   ##
 *  ###
 * ####
 * 
 * Observe that its base and height are both equal to n, 
 * and the image is drawn using # symbols and spaces. 
 * The last line is not preceded by any spaces.
 * Write a program that prints a staircase of size n.
 * 
 * Function Description
 * Complete the staircase function in the editor below. It should print a staircase as described above.
 * staircase has the following parameter(s):
 * n: an integer
 * input Format
 * A single integer, n, denoting the size of the staircase.
 * Constraints.
 * 0 < n <= 100
 * Output Format
 * Print a staircase of size  using # symbols and spaces.
 * Note: The last line must have  spaces in it.
 * 
 * Example:
 * input:
 * 6
 * Output
 * 
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 * ######
 */
public class Staircase {
	public static void main(String[] args) {
		staircase(6);
	}

	static void staircase(int n) {
		String space = " ";
		int count = 0; 
		for (int i = 0; i < n; i++) {
			String stairCase = "";
			count += 1;
			for (int j = 0; j < n - count; j++) {
				stairCase += space;
			}
			for (int s = 0; s < count; s++) {
				stairCase += "#";
			}
			System.out.println(stairCase);
		}
	}

}
