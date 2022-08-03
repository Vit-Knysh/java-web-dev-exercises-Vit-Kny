package org.launchcode.java.studios.countingCharacters;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //String phrase = "The features will be the same, but the implementation changes. Unit tests help in this scenario in that, changes to implementation should not require changes to outcome. Thus, if your tests continue to pass after the refactor, you can move on, knowing you have not inadvertently introduced a bug. When you write tests once, they provide a code lifetime’s worth of benefits.";

        System.out.println("Enter a phrase: ");
        String phrase = input.nextLine();
        input.close();

CountingCharacters.CountChars(phrase);

    }
}
