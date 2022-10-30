package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        final double INCHES = 0.0254;
        final double POUNDS = 0.45359237;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

       double BMI = computeBMI(weight, height, POUNDS, INCHES);

        System.out.printf("BMI is %.4f", BMI);
    }

    public static double computeBMI(double weight, double height, double POUNDS, double INCHES) {
        double BMI = (weight * POUNDS) / Math.pow((height * INCHES), 2);

        return BMI;
    }
}
