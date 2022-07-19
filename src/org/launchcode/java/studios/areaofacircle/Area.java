package org.launchcode.java.studios.areaofacircle;

public class Area {
    public static void main(String[] args) {
        double area;
        double radius;

        java.util.Scanner input;

        input = new java.util.Scanner(System.in);
        System.out.println("Enter a radius: ");
        do {
            radius = input.nextDouble();
        } while (radius <= 0 );

        input.close();

        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
