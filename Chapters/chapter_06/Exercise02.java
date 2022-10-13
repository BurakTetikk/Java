package Chapters.chapter_06;

public class Exercise02 {
    public static void main(String[] args) {
        long number = 234;
        sumDigits(number);
    }
    public static int sumDigits(long number) {
        int a = (int) number;
        int digit = 0;
        int sum = 0;
        while (!(a == 0)){
            digit = a % 10;
            sum+= digit;
            a = a / 10;
        }
        System.out.println("Sum of digits : " + sum);
        return 0;
    }
}
