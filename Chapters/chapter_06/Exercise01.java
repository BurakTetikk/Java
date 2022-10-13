package Chapters.chapter_06;

public class Exercise01 {
    public static void main(String[] args) {
        int number = 100;
        getPentagonalNumber(number);
    }

    private static int getPentagonalNumber(int number) {
        for (int i = 1; i <= number ;i++) {
            if (i % 11 == 0) {
                System.out.println();
            }
            int a = i * (3 * i - 1) / 2;
            System.out.printf("%8d",a);
        }
        return 0;

    }
}
