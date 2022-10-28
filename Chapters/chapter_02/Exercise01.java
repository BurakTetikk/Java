package Chapters.chapter_02;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Celcius: ");
        double celcius = input.nextDouble();

        double fahrenheit = convertCelciusToFahrenheit(celcius);

        System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit.");
    }

    public static double convertCelciusToFahrenheit(double celcius) {
        double fahrenheit = (9.0 / 5) * celcius +32;
        return fahrenheit;
    }
}
