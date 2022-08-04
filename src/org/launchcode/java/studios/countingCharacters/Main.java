package org.launchcode.java.studios.countingCharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        //String phrase = "The features will be the same, but the implementation changes. Unit tests help in this scenario in that, changes to implementation should not require changes to outcome. Thus, if your tests continue to pass after the refactor, you can move on, knowing you have not inadvertently introduced a bug. When you write tests once, they provide a code lifetime’s worth of benefits.";

        //System.out.println("Enter a phrase: ");
        //String phrase = input.nextLine();
        //input.close();
       // FileReader file = new FileReader("C:\\Users\\vknys\\OneDrive\\Documents\\English lessons.txt");

        try {
            File myFile = new File("C:\\\\Users\\\\vknys\\\\OneDrive\\\\Documents\\\\English lessons.txt");
            Scanner reader = new Scanner(myFile);
            String myString = "";
            while (reader.hasNextLine()) {
                myString += reader.nextLine();
                //System.out.println(myString);
            }
            CountingCharacters.CountChars(myString);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }

//CountingCharacters.CountChars(file);

    }
}
