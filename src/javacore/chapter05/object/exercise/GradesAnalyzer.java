package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class GradesAnalyzer {

    private static final int MAX_ATTEMPTS = 3;
    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args) {
        int[] gradesArray = setGrades();
        int threshold = 12;
        int countAbove = getGradeCountAboveThreshold(gradesArray, threshold);
        double percentAbove = (double) countAbove / gradesArray.length * 100;
        System.out.println("Nombre de notes > " + threshold + " = " + countAbove + " (soit " + percentAbove + "%)");

    }

    // 6
    public static int getGradeCountAboveThreshold(int[] gradesArray, int threshold) {
        int count = 0;

        for (int gradeIndex = 0; gradeIndex < gradesArray.length; gradeIndex++) {
            if (gradesArray[gradeIndex] > threshold) {
                count += 1;
            }
        }
        return count;
    }

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
            if (currentGrade < minGrade) {
                minGrade = currentGrade;
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
