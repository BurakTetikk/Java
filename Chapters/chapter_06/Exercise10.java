package Chapters.chapter_06;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println("The prime numbers less than 10000 are :");
        int count = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                count++;
                if (count % 10 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}