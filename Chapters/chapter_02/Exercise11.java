package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        final int currentPopulation = 312_032_486;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        int newPopulation = (int)(currentPopulation + (60 * 60.0 * 24 * 365 * years) / (45 * 13 * 7) * (45 * 13 + 13 * 7 - 7 * 45) );

        System.out.printf("%,d",newPopulation);
    }
}
