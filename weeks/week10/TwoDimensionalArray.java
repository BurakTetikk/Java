package weeks.week10;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers of row:");
        int row = input.nextInt();
        System.out.println("Enter the numbers of column:");
        int column = input.nextInt();
        int[][] arr = new int[row][];

        fill2DArrayWithRandomValues(arr, 0, 10);

        sumOfColumns(arr);

    }

    public static void sumOfColumns(int[][] arr) {
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                    sum += arr[row][column];
            }
        }
    }

    public static void fill2DArrayWithRandomValues(int[][]arr,int start, int limit){
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = (int) (Math.random() * (limit - start) + start);
            }
        }
    }
}
