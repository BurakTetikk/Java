package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius and lengt os a cylinder: ");
        double radius = input.nextDouble();
        double lenght = input.nextDouble();

        double area = computeArea(radius, PI);
        double volume = computeVolume(area, lenght);


        System.out.printf("The area is %.4f \n", area);
        System.out.printf("The volume is %.1f", volume);
    }
    public static double computeArea(double radius, double PI){
        double area = radius * radius * PI;

        return area;
    }
    public static double computeVolume(double area, double lenght){
        double volume = area * lenght;

        return volume;
    }
}
