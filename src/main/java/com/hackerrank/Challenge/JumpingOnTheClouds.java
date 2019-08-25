package com.hackerrank.Challenge;

import java.util.ArrayList;

/**
 * Created by Richard Rossetto on 25/08/19.
 */
public class JumpingOnTheClouds {

    /**
     * Emma is playing a new mobile game that starts with consecutively numbered clouds.
     * Some of the clouds are thunderheads and others are cumulus.
     * She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2.
     * She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump
     * from her starting postion to the last cloud. It is always possible to win the game.
     * For each game, Emma will get an array of clouds numbered 0 if they are safe or  if they must be avoided.
     * For example, c=[0,1,0,0,0,1,0] indexed from 0....6. The number on each cloud is its index in the list so
     * she must avoid the clouds at indexes 1 and 5. She could follow the following two paths: 0->2->4->6 or 0->2->3->4->6.
     * The first path takes 3 jumps while the second takes 4.
     */

    public static void main(String args[]){
        int[] c = {0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,0};
        int current;
        int countJump = 0;

        ArrayList<Integer> jumps = new ArrayList<>();

        for (int i = 0; i < c.length; i++) {
            current = c[i];
            if(!jumps.isEmpty()){
                if(jumps.contains(c[i]) && c[i] <= 0) {
                    countJump++;
                }else {
                    countJump += c[i];
                    jumps.clear();
                }
                jumps.remove(new Integer(current));
            } else {
                jumps.add(current);
                if(c[i] > 0) {
                    countJump += c[i];
                    jumps.clear();
                }
            }

        }
        System.out.println(countJump);
    }
}
