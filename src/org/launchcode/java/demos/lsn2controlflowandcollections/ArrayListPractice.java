package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<String> someList = new ArrayList<>();
        someList.add("asdas");
        someList.add("qw");
        someList.add("sas");
        someList.add("qwee");
        someList.add("sfasfh");
        someList.add("zxcvb");

        System.out.println("Please set the length of word to search: ");
        Integer numSearch = input.nextInt();

        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i).length() == numSearch) {
                System.out.println(someList.get(i));
            }
        };

       // System.out.println(someList.size());
    };

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    };
}
