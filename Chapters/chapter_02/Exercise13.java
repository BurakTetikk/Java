package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double MONTHLY_INTEREST_RATE = 0.00417;

        System.out.println("Enter the monthly saving amount: ");
        int savingAmount = input.nextInt();

        System.out.println("Enter the number of month: ");
        int month = input.nextInt();

        double savingAccount = calculateSavinAmount(savingAmount, month, MONTHLY_INTEREST_RATE);

        System.out.printf("After the %d", month);
        System.out.printf(" month, the account value is $%.2f",savingAccount);
    }

    public static double calculateSavinAmount(int savingAmount, int month, double  MONTHLY_INTEREST_RATE) {
        double amount = 0;
        for (int i = 0; i < month; i++) {
            amount = (amount + savingAmount) * (1 + MONTHLY_INTEREST_RATE);
        }
        return amount;
    }
}
