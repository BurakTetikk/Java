package Chapters.chapter_06;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        reverse(number);
    }
    public static int reverse(int number){
        String str = "";
        int a = number;
        while (! (a == 0)){
            int digit = a % 10;
            str += digit + "";
            a = a / 10;
        }
        System.out.println("Reversed number: \n" + str);
        return 0;
    }
}
