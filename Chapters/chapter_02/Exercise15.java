package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distanceOfTwoNumbers = findDistanceOfTwoPoints(x1, y1, x2, y2);

        System.out.println("The distance between the two points is " + distanceOfTwoNumbers);
    }

    public static double findDistanceOfTwoPoints(double x1, double y1, double x2, double y2) {
        double distanceOfTwoNumbers =Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);

        return distanceOfTwoNumbers;
    }
}
