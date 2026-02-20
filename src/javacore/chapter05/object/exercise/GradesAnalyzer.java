package javacore.chapter05.object.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class GradesAnalyzer {

    private static final int MAX_ATTEMPTS = 3;
    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args) {
        int[] gradesArray = setGrades();
        getAverage(gradesArray);
    }

    public static double getAverage(int[] gradesArray) {
        int gradesTotal = 0;
        for (int noteIndex = 0; noteIndex < gradesArray.length; noteIndex++) {
            gradesTotal += gradesArray[noteIndex];
        }
        double gradesAverage = (double) gradesTotal / gradesArray.length;
        System.out.println("Moyenne générale: " + gradesAverage);
        return gradesAverage;
    }

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
        System.out.println("Notes : " + Arrays.toString(grades));
        return grades;
    }


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
