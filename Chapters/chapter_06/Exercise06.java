package Chapters.chapter_06;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int number = input.nextInt();
        for (int i = 0; i <= number; i++) {
            first(number, i);
            second(number, i);
            System.out.println();

        }
    }

    private static void second(int number, int i) {
        for (int j = i; j >= 1 ; j--) {
            System.out.print(j);
        }
    }

    public static void first(int number, int i) {
        for (int j = number - i; j >= 1; j--) {
            System.out.print(" ");
        }
    }
}
