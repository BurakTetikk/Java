package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
        double annualInterestRate = input.nextDouble();
        double balance = input.nextDouble();

        double interest = findTheInterest(annualInterestRate, balance);
        System.out.printf("The interest is %.5f", interest);
    }

    public static double findTheInterest(double annualInterestRate, double balance) {
        double interest = balance * (annualInterestRate / 1200);

        return interest;
    }
}
