package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        String practiceString = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or conversations in it, 'and what is the " +
                "use of a book,' thought Alice 'without pictures or conversation?";

        Scanner input = new Scanner(System.in);
        System.out.println("Please type the word you want to search for:");

        String searchTerm = input.nextLine();
        int result = practiceString.toLowerCase().indexOf(searchTerm.toLowerCase());

       if (result != -1) {
           System.out.println(searchTerm + " is present in the string.");
       } else {
           System.out.println(searchTerm + " is not present in the string.");
       };

       Integer index = practiceString.toLowerCase().indexOf(searchTerm.toLowerCase());

       Integer length = searchTerm.length();

        System.out.println("Your search term first appears at index " + index +
                ". Your term is " + length + " characters long.");

        String modifiedString = practiceString.replace(searchTerm, "");
        System.out.println(modifiedString);
    }
}
