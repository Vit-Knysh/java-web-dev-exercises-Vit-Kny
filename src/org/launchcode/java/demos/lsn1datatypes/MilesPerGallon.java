package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please set the number of miles you have driven: ");

        Double miles = input.nextDouble();

        System.out.println("Please set the amount of gas you’ve consumed (in gallons): ");

        Double gallons = input.nextDouble();
        input.close();

        Double MilesPerGallon = miles / gallons;

        System.out.println("The number of miles per gallon is   : " + MilesPerGallon);
    }
}
