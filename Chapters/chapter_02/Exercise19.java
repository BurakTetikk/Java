package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points (ex. (x1, y1)) for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double areaOfTriangle = findTheAreaOfTriangle(x1, y1, x2, y2, x3, y3);

        System.out.printf("The area of the triangle is %.1f", areaOfTriangle);
    }

    public static double findTheAreaOfTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double side1 =Exercise15.findDistanceOfTwoPoints(x1, y1, x2, y2);
        double side2 =Exercise15.findDistanceOfTwoPoints(x1, y1, x3, y3);
        double side3 =Exercise15.findDistanceOfTwoPoints(x2, y2, x3, y3);

        double s = (side1 + side2 + side3) / 2;

        double areaOfTriangle = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);

        return areaOfTriangle;
    }
}
