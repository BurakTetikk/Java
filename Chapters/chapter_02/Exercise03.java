package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        final double FEET = 0.305;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = feetToMeters(feet, FEET);
        System.out.println(feet + " feet is " + meters + " meters.");
    }
    public static double feetToMeters(double feet, double FEET){
        double meters = feet * FEET;

        return meters;
    }
}
