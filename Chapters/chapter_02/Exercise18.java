package Chapters.chapter_02;

public class Exercise18 {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a, b)");
        int a = 1;
        int b = 2;
        for (int i = 0; i < 5; i++) {
            int pow = (int)(Math.pow(a, b));
            System.out.println(a + "\t" + b + "\t"  + pow);
            a++;
            b++;
        }
    }
}
