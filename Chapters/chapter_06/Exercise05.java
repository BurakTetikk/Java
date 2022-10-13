package Chapters.chapter_06;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        displaySortedNumbers(number1, number2, number3);
    }
    public static void displaySortedNumbers(double number1, double number2, double number3){
        double max = Math.max(number1, Math.max(number2, number3));
        double min = Math.min(number1, Math.min(number2, number3));
        if (min < number1 && number1 < max) {
            System.out.println(min + " " + number1 + " " + max);
        }else if (min < number2 && number2 < max) {
            System.out.println(min + " " + number2 + " " + max);
        }
        else {
            System.out.println(min + " " + number3 + " " + max);
        }
    }
}
