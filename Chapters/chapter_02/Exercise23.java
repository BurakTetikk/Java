package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.println("Enter price pre gallon: ");
        double pricePerGallon = input.nextDouble();

        double costOfDriving = findTheCostOfDriving(distance, milesPerGallon, pricePerGallon);

        System.out.printf("The cost of driving is $%.2f", costOfDriving);
    }

    public static double findTheCostOfDriving(double distance, double milesPerGallon, double pricePerGallon) {
        double costOfDriving = (distance / milesPerGallon) * pricePerGallon;

        return costOfDriving;
    }
}
