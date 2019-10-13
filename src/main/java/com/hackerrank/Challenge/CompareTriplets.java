package com.hackerrank.Challenge;

import java.util.ArrayList;
import java.util.List;


/*
 * Alice and Bob each created one problem for HackerRank. 
 * A reviewer rates the two challenges, awarding points on a scale from 1 to 100  
 * to  for three categories: problem clarity, originality, and difficulty.
 * We define the rating for Alice's challenge to be the triplet a = (a[0], a[1], a[2]), 
 * and the rating for Bob's challenge to be the triplet b = (b[0], b[1], b[2]).
 * 
 * Your task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
 * If a[i] > b[i], then Alice is awarded  point.
 * If a[i] < b[i], then Bob is awarded  point.
 * If a[i] == b[i], then neither person receives a point
 */

public class CompareTriplets {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		
		a.add(17);
		a.add(28);
		a.add(30);
		
		b.add(99);
		b.add(16);
		b.add(8);
		System.out.println(compareTriplets(a, b));
	}
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	    List<Integer> result = new ArrayList<>();
	         
	         int countA=0;
	         int countB=0;
	         
	         for(int i=0; i < a.size(); i++) {
	             if(a.get(i) > b.get(i)) {
	                 countA += 1;
	             }
	             
	             if(b.get(i) > a.get(i)) {
	                 countB += 1;
	             }
	         }
	         
	         result.add(countA);
	         result.add(countB);
	         return result;

	    }

}
