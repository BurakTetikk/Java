package Chapters.chapter_06;

public class Exercise09 {
    public static void main(String[] args) {
        System.out.println("Feet        Meters      |       Meters      Feet");
        System.out.println("-------------------------------------------------");
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters +=5) {
            System.out.print("     " + feet);
            System.out.print("     " + footToMeter(feet));
            System.out.print("            " + meters);
            System.out.println("            " + meterToFoot(meters));
        }
    }
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
