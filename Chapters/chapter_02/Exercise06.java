package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000:");
        int number = input.nextInt();

        int sum = sumTheDigits(number);

        System.out.println("The sum of the digits of " + number + " : "+ sum);
    }
    public static int sumTheDigits(int number){
        int counter = number;
        int sumOfDigits = 0;

        while(counter > 0){
           sumOfDigits +=counter % 10;;
           counter = counter / 10;
        }

        return sumOfDigits;
    }
}
