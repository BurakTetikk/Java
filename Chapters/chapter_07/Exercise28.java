package Chapters.chapter_07;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        int[] numbers = getFromUser();
        displayAllCombinations(numbers);
    }
    public static void displayAllCombinations(int[] numbers) {
        for (int i = 0; i < numbers.length - 1 ; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
            }
        }
    }
    public static int[] getFromUser() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }
}
