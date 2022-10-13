package Chapters.chapter_07;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers :");
        int[] numbers = new int[10];
        getNumbers(numbers, input);
    }

    public static int[] getNumbers(int[] numbers, Scanner input) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
