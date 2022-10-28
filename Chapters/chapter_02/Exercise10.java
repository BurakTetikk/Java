package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enterthe amount of water in kilograms: ");
        double amountOfWater = input.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemp = input.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalTemp = input.nextDouble();

        double neededEnergy = computeNeededEnergy(amountOfWater, initialTemp, finalTemp);

        System.out.printf("The energy needed is %.1f", neededEnergy);
    }

    public static double computeNeededEnergy(double amountOfWater, double initialTemp, double finalTemp) {
        double neededEnergy = amountOfWater * (finalTemp - initialTemp) * 4184;

        return neededEnergy;
    }
}
