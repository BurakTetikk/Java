package Chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int studentsNumber = input.nextInt();
        System.out.println("Enter " + studentsNumber + " scores:");
        int[] score = new int[studentsNumber];
        getScore(score, input);
        printScore(score);
        System.out.println();
    }

    public static void printScore(int[] score) {
        int bestScore = getBestScore(score);
        for (int i = 0; i < score.length; i++) {
            if (bestScore - score[i] <= 10) {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is A");
            }else if (bestScore - score[i] <= 20) {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is B");
            }else if (bestScore - score[i] <= 30) {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is C");
            } else if (bestScore - score[i] <= 40) {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is F");
            }
        }
    }

    public static int getBestScore(int[] score) {
        int best = score[0];
        for (int i = 0; i < score.length; i++) {
            if(best < score[i]) {
                best = score[i];
            }
        }
        return best;
    }

    public static int[] getScore(int[] score, Scanner input) {
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
            System.out.println("Enter " + (score.length - 1 - i) + " scores:");
        }
        return score;
    }
}
