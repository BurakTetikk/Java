package Chapters.chapter_06;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount :");
        double investAmount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage :");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate /= 1200;

        System.out.println("Enter number of years :");
        double numberOfYears = input.nextDouble();

        System.out.println(futureInvestmentValue(investAmount, monthlyInterestRate, (int)numberOfYears));
        }
    public static double futureInvestmentValue(double investAmount, double monthlyInterestRate, int numberOfYears){
        double futureInvestmentValue =investAmount * Math.pow((1 + monthlyInterestRate) , numberOfYears * 12);
        return futureInvestmentValue;
    }
}
