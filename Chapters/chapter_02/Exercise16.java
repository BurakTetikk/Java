package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double lenghtOfaSide = input.nextDouble();

        double areaOfHexagon = findTheAreaOfHexagon(lenghtOfaSide);

        System.out.printf("The area of the hexagon is :%.4f", areaOfHexagon);
    }

    public static double findTheAreaOfHexagon(double lenghtOfaSide) {
        double areaOfHexagon = Math.pow(3, 0.5) * 3 / 2 * Math.pow(lenghtOfaSide, 2);

        return areaOfHexagon;
    }
}
