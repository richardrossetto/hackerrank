package com.hackerrank.Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * For example, the square matrix arr is shown below:
 * 
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 * 
 *  The left-to-right diagonal = 11 + 5 + -12 = 4. The right to left diagonal = 4 + 5 + 10 = 19 . 
 *  Their absolute difference is [4 - 19] = 15.
 */

public class DiagonalDifference {
	public static void main(String[] args) {

		List<List<Integer>> arr = Arrays.asList(
				Arrays.asList(11, 2, 4),
				Arrays.asList(4, 5, 6),
				Arrays.asList(10, 8, -12));
		System.out.println(diagonalDifference(arr));
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
				
		int sumRight = 0;
		int sumLeft = 0;
		
		int topRight = arr.size() - 1;
		for(int i = 0; i < arr.size(); i++) {
			sumRight += arr.get(i).get(i);
			sumLeft += arr.get(i).get(topRight - i);
		}
		return Math.abs(sumRight - sumLeft);
	}
}
