package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = computeGratuity(gratuityRate, subtotal);
        double total = computeTotal(subtotal, gratuity);

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
    public static double computeGratuity(double gratuityRate, double subtotal){
        double gratuity = subtotal * gratuityRate / 100;

        return gratuity;
    }
    public static double computeTotal(double subtotal, double gratuity){
        double total = subtotal + gratuity;

        return total;
    }
}
