package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount :");
        double investAmount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage :");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate /= 1200;

        System.out.println("Enter number of years :");
        double numberOfYears = input.nextDouble();

        double futureInvestmentValue = investAmount * Math.pow((1 + monthlyInterestRate) , numberOfYears * 12);

        System.out.println("Accumulated value is :" + futureInvestmentValue);
    }
}
