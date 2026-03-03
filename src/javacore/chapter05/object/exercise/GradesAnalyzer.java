package javacore.chapter05.object.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class GradesAnalyzer {

    static final int MAX_ATTEMPTS = 3;
    static final int MIN_GRADES_NUMBER = 2;
    static final int MAX_GRADES_NUMBER = 30;
    static final int MIN_GRADE = 0;
    static final int MAX_GRADE = 20;
    static final int MIN_ARRAY_SIZE = 2;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] gradesArray = setGrades();

        int threshold = 12;
        int countAbove = getGradeCountAboveThreshold(gradesArray, threshold);
        double percentAbove = (double) countAbove / gradesArray.length * 100;
        System.out.println("Nombre de notes > " + threshold + " = " + countAbove + " (soit " + percentAbove + "%)");

        int from = 12;
        int to = 18;
        int countRange = getGradeCountBetweenRange(gradesArray, from, to);
        double percentRange = (double) countRange / gradesArray.length * 100;
        System.out.println("Nombre de notes de " + from + " à " + to + " : " + countRange + " (soit " + percentRange + "%)");

        System.out.println(Arrays.toString(setGradesBis()));

    }

    // 8
    public static int[] setGradesBis() {
        int[] grades = new int[0];
        int gradeNumber = 1;
        boolean isUserEntryDone = false;

        while (!isUserEntryDone && grades.length < MAX_GRADES_NUMBER) {
            System.out.print("Saisissez votre " + gradeNumber + "e note : ");
            gradeNumber++;
            int grade = sc.nextInt();

            if (grade == -1) {
                isUserEntryDone = true;
            } else if (grade < MIN_GRADE || grade > MAX_GRADE) {
                System.out.println("Note invalide, veuillez saisir une valeur entre 0 et 20.");
            } else {
                int[] newGrades = new int[grades.length + 1];
                for (int i = 0; i < grades.length; i++) {
                    newGrades[i] = grades[i];
                }
                newGrades[grades.length] = grade;
                grades = newGrades;
            }
        }
        return grades;
    }


    // 7
    public static int getGradeCountBetweenRange(int[] gradesArray, int min, int max) {
        int count = 0;

        for (int gradeIndex = 0; gradeIndex < gradesArray.length; gradeIndex++) {
            int currentGrade = gradesArray[gradeIndex];
            if (currentGrade >= min && currentGrade <= max) {
                count += 1;
            }
        }
        return count;
    }

    // 6
    public static int getGradeCountAboveThreshold(int[] gradesArray, int threshold) {
        int count = 0;

        for (int gradeIndex = 0; gradeIndex < gradesArray.length; gradeIndex++) {
            int currentGrade = gradesArray[gradeIndex];
            if (currentGrade > threshold) {
                count += 1;
            }
        }
        return count;
    }

    // 5
    public static double getMaxGrade(int[] gradesArray) {
        if (gradesArray.length < MIN_ARRAY_SIZE) return -1;
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
        if (gradesArray.length < MIN_ARRAY_SIZE) return -1;
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
        if (gradesArray.length < MIN_ARRAY_SIZE) return -1;
        int gradesTotal = 0;
        for (int gradeIndex = 0; gradeIndex < gradesArray.length; gradeIndex++) {
            gradesTotal += gradesArray[gradeIndex];
        }
        double gradesAverage = (double) gradesTotal / gradesArray.length;
        return gradesAverage;
    }

    // 2
    public static int[] setGrades() {
        int gradesNumber = requestGradesNumber();
        int[] grades = new int[gradesNumber];
        int gradeIndex;

        for (gradeIndex = 0; gradeIndex < gradesNumber; gradeIndex++) {
            byte attempts = 0;
            do {
                System.out.print("Saisissez votre " + (gradeIndex + 1) + "e note :");
                grades[gradeIndex] = sc.nextByte();
                attempts++;

                if (grades[gradeIndex] < MIN_GRADE || grades[gradeIndex] > MAX_GRADE) {
                    System.out.println("Valeur invalide, veuillez saisir une valeur entre 0 et 20 inclu.");
                } else {
                    break;
                }
            } while (attempts < MAX_ATTEMPTS);

            if (grades[gradeIndex] < MIN_GRADE || grades[gradeIndex] > 20) {
                System.out.println("Nombre de tentatives maximum atteint. Note mise à 0 par défaut.");
                grades[gradeIndex] = 0;
            }
        }
        return grades;
    }

    // 1
    public static int requestGradesNumber() {
        int attempts = 0;
        int gradesNumber;
        do {
            System.out.print("Combien de notes souhaitez-vous saisir ? (Min: " + MIN_GRADES_NUMBER + " - Max: " + MAX_GRADES_NUMBER + ") :");
            gradesNumber = sc.nextByte();
            attempts++;

            if (gradesNumber < MIN_GRADES_NUMBER || gradesNumber > MAX_GRADES_NUMBER) {
                System.err.println("Valeur invalide, veuillez saisir une valeur entre " + MIN_GRADE + " et " + MAX_GRADE + " inclu.");
            } else {
                break;
            }
        } while (attempts < MAX_ATTEMPTS);
        System.out.println("Nombre de notes : " + gradesNumber);
        return gradesNumber;
    }
}