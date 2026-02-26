package javacore.chapter05.object.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class GradesAnalyzer {

    private static final int MAX_ATTEMPTS = 3;
    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args) {
        int[] gradesArray = setGrades();
        //getAverage(gradesArray);
        //System.out.println("La plus petite note est : " + getMinGrade(gradesArray));
        System.out.println("La plus grande note est : " + getMaxGrade(gradesArray));
    }

    // 6
/*    public static int getGradeCountAboveThreshold(int[] gradesArray, int threshold) {

    }*/

    // 5
    public static double getMaxGrade(int[] gradesArray) {
        int maxGrade = gradesArray[0];

        for (int gradeIndex = 1; gradeIndex < gradesArray.length; gradeIndex++) {
            int currentGrade = gradesArray[gradeIndex];
            if (currentGrade > maxGrade) {
                maxGrade = currentGrade;
            }
        }
        return maxGrade;
    }

    // 4
    public static double getMinGrade(int[] gradesArray) {
        int minGrade = gradesArray[0];

        for (int gradeIndex = 1; gradeIndex < gradesArray.length; gradeIndex++) {
            int currentGrade = gradesArray[gradeIndex];
            int previousGrade = gradesArray[gradeIndex - 1];
            if (currentGrade <= previousGrade) {
                minGrade = currentGrade;
            } else {
                minGrade = gradesArray[0];
            }
        }
        return minGrade;
    }

    // 3
    public static double getAverage(int[] gradesArray) {
        int gradesTotal = 0;
        for (int gradeIndex = 0; gradeIndex < gradesArray.length; gradeIndex++) {
            gradesTotal += gradesArray[gradeIndex];
        }
        double gradesAverage = (double) gradesTotal / gradesArray.length;
        System.out.println("Moyenne générale: " + gradesAverage);
        return gradesAverage;
    }

    // 2
    public static int[] setGrades() {
        int gradesNumber = requestNotesNumber();
        int[] grades = new int[gradesNumber];
        int gradeIndex;

        for (gradeIndex = 0; gradeIndex < gradesNumber; gradeIndex++) {
            byte attempts = 0;
            do {
                System.out.print("Saisissez votre " + (gradeIndex + 1) + "e note :");
                grades[gradeIndex] = sc.nextByte();
                attempts++;

                if (grades[gradeIndex] < 0 || grades[gradeIndex] > 20) {
                    System.out.println("Valeur invalide, veuillez saisir une valeur entre 0 et 20 inclu.");
                } else {
                    break;
                }
            } while (attempts < MAX_ATTEMPTS);

            if (grades[gradeIndex] < 0 || grades[gradeIndex] > 20) {
                System.out.println("Nombre de tentatives maximum atteint. Note mise à 0 par défaut.");
                grades[gradeIndex] = 0;
            }
        }
        //System.out.println("Notes : " + Arrays.toString(grades));
        return grades;
    }

    // 1
    public static int requestNotesNumber() {
        int attempts = 0;
        int gradesNumber;
        do {
            System.out.print("Combien de notes souhaitez-vous saisir ? (Min: 2 - Max: 30) :");
            gradesNumber = sc.nextByte();
            attempts++;

            if (gradesNumber < 2 || gradesNumber > 30) {
                System.err.println("Valeur invalide, veuillez saisir une valeur entre 2 et 30 inclu.");
            } else {
                break;
            }
        } while (attempts < MAX_ATTEMPTS);
        System.out.println("Nombre de notes : " + gradesNumber);
        return gradesNumber;
    }
}
