package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class AreaOfaRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please set the lenght of the rectangle: ");

        Double lenghtOfRectangle = input.nextDouble();

        System.out.println("Please set the width of the rectangle: ");

        Double widthOfRectangle = input.nextDouble();
        input.close();

        Double AreaOfRectangle = lenghtOfRectangle * widthOfRectangle;

        System.out.println("The area of rectangle is: " + AreaOfRectangle);
    }
}
