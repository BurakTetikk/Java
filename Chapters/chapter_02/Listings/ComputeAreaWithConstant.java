package Chapters.chapter_02.Listings;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        //Declare a constant
        final double PI = 3.14159;

        //Craet a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a radius
        System.out.println("Enter a number for radius: ");
         double radius = input.nextDouble();

         //Compute area
        double area = radius * radius * PI;

        //Display result
        System.out.println("The area for the circle of radius " + radius +
                " is " + area);
    }
}
