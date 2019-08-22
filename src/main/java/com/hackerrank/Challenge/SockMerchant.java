package com.hackerrank.Challenge;

import java.util.ArrayList;

/**
 * Created by Richard Rossetto on 21/08/19.
 */
public class SockMerchant {

    /**
     * John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
     * For example, there are n=7 socks with colors ar={1,2,1,2,1,3,2}.
     * There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is 2.
     * Function Description
     * Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
     * sockMerchant has the following parameter(s):
     * n: the number of socks in the pile
     * ar: the colors of each sock
     * The first line contains an integer the number of socks represented in .
     * The second line contains space-separated integers describing the colors  of the socks in the pile.
     */

    public static void main(String[] args) {
        int[] ar = {3, 2, 3, 4, 5, 4, 3, 3};
        int currentColor = 0;

        ArrayList<Integer> colorsArray = new ArrayList<>();
        int countPairOfColors = 0;
        for (int i = 0; i < ar.length; i++) {
            currentColor = ar[i];
            if (colorsArray.contains(currentColor)) {
                countPairOfColors++;
                colorsArray.remove(new Integer(currentColor));
            } else {
                colorsArray.add(new Integer(currentColor));
            }
        }
        System.out.println(countPairOfColors);
    }
}
