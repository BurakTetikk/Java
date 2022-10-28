package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        final double POUNDS = 0.454;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double kg = poundsToKg(pounds, POUNDS);
        System.out.println(pounds + " pounds is " + kg + " kilograms.");
    }
    public static double poundsToKg(double pounds, double POUNDS){
        double kg = pounds * POUNDS;

        return kg;
    }
}
