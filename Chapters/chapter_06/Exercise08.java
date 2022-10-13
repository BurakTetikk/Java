package Chapters.chapter_06;

public class Exercise08 {
    public static void main(String[] args) {
        System.out.println("Celsius     Fahrenheit     |     Fahrenheit     Celsius");
        System.out.println("--------------------------------------------------------");
        for (double celsius = 40.0, fahrenheit = 120.0;
             celsius >= 31.0; celsius--, fahrenheit -= 10) {
            System.out.print( celsius + "       " + celsiusToFahrenheit(celsius));
            //System.out.println(celsiusToFahrenheit(celsius));
            System.out.println("                    " + fahrenheit + "       " + fahrenheitToCelsius(fahrenheit));
            //System.out.println(fahrenheitToCelsius(fahrenheit));
        }
    }
    public static double celsiusToFahrenheit(double celsius){
        double x = (9.0 / 5) * celsius + 32;
        return x;
        }

    public static double fahrenheitToCelsius(double fahrenheit){
        double x = (5.0 / 9) * (fahrenheit - 32);
        return x;
    }
}
