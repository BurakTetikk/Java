package Chapters.chapter_06;

import java.util.Scanner;

public class Exercise07b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount :");
        double investAmount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage :");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate /= 1200;


        System.out.println("Years       Future Value");

        for (int i = 1; i <= 30; i++) {
            System.out.print(i + "      ");
            double x = futureInvestmentValue(investAmount, monthlyInterestRate, i);
            System.out.println(x);

        }
    }
    public static double futureInvestmentValue(double investAmount, double monthlyInterestRate, int numberOfYears){
        double futureInvestmentValue =investAmount * Math.pow((1 + monthlyInterestRate) , numberOfYears * 12);
        return futureInvestmentValue;
    }
}
