package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args) {

        int[] integerArray = {1,2,3,1,2,3,5,8,9,12};

        /*for (int i : integerArray) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            ;
        };
        */
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] words = phrase.split("\\.");
        System.out.println(Arrays.toString(words));
    }

};
