package Chapters.chapter_06;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = input.nextInt();
        reverse(number);
    }
    public static int reverse(int number){
        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome){
            System.out.println(number + " is palindrome!");
        }else {
            System.err.println(number + " is not palindrome!");
        }
        return 0;
    }
    public static boolean isPalindrome(int number){
        String str = number + "";
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse += str.charAt(str.length() - (1+i)) + "";
        }
        if (str.equals(reverse)) {
            return true;
        }else {
            return false;
        }
    }
}
