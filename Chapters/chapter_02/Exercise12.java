package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = computeMinRunwayLength(speed, acceleration);

        System.out.printf("The minimum runway length for this airplane is %.3f", length);
    }

    public static double computeMinRunwayLength(double speed, double acceleration) {
        double length = speed * speed / (2 * acceleration);

        return length;
    }
}
