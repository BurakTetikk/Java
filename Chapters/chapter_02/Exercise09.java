package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter v0, v1 and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double averageAcceleration = computeAverageAcceleration(v0, v1, t);

        System.out.printf("The average acceleration is %.4f", averageAcceleration);
    }
    public static double computeAverageAcceleration(double v0, double v1, double t){
        double averageAcceleration = (v1 - v0) / t;

        return averageAcceleration;
    }
}
