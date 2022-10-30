package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double speed = input.nextDouble();
        if (-58 <= temperature && temperature <= 41 && speed >= 2) {
            double windChill = findTheWindChill(temperature, speed);
            System.out.printf("The wind-chill index is %.5f", windChill);
        }
        else {
            System.err.print("Check your input!");
        }
    }

    public static double findTheWindChill(double temperature, double speed) {
        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, (16.0 / 100)) + 0.4275 * temperature * Math.pow(speed, (16.0 / 100));

        return windChill;
    }
}
