package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        int minutes = input.nextInt();

        int years = getYears(minutes);
        int days = getDays(minutes, years);

        System.out.println(minutes + " minutes is approximately " + years + " and " + days + " days.");
    }
    public static int getYears(int minutes){
        int years = minutes / (60 * 24 * 365);

        return years;
    }
    public static int getDays(int minutes, int years){
        int days = minutes % (60 * 24 * 365);
        days /= 60 * 24;

        return days;
    }
}
