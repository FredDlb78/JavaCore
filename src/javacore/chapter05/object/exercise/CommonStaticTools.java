package javacore.chapter05.object.exercise;

import java.util.Arrays;

public class CommonStaticTools {

    static final int MIN_ARRAY_SIZE = 2;

    // Méthodes static fondamentales en Java

// Math
// Math.abs()
// Math.max()
// Math.min()
// Math.round()
// Math.random()

// Conversion String / nombres
// Integer.parseInt()
// Double.parseDouble()
// String.valueOf()

// Arrays
// Arrays.sort()
// Arrays.toString()

    public static void main(String[] args) {

        int[] numbers = {30, 25, 85, 6, 43, 58, 97, 78, 94, 27, 9, 38, 41, 35, 52, 10, 16, 22, 96, 74, 44, 55, 82, 28, 83, 69, 90, 89, 26, 7, 47, 98, 50, 42, 68, 91, 70, 65, 79, 4, 75, 49, 61, 39, 48, 72, 36, 18, 1, 15, 77, 99, 33, 24, 13, 19, 73, 17, 14, 86, 54, 45, 76, 21, 100, 63, 60, 56, 93, 87, 81, 8, 29, 34, 53, 37, 71, 67, 57, 66, 11, 46, 95, 20, 88, 64, 59, 84, 12, 92, 80, 40, 23, 3, 2, 32, 31, 5, 62, 51};
        double number = 16;
        double number2 = 5;
        double exponent = 3;

        System.out.println(Arrays.toString(sortIntNumbers(numbers)));
        System.out.println("Max :" + getMaxGrade(numbers));
        System.out.println("Min :" + getMinGrade(numbers));
        System.out.println("Racine carrée de " + number + " = " + getSquareRoot(number));
        System.out.println("Carrée de " + number2 + " = " + getPow(number2, exponent));

    }

    public static int[] sortIntNumbers(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    public static double getMaxGrade(int[] gradesArray) {
        if (gradesArray.length < MIN_ARRAY_SIZE) return -1;
        int maxGrade = gradesArray[0];

        for (int gradeIndex = 1; gradeIndex < gradesArray.length; gradeIndex++) {
            maxGrade = Math.max(maxGrade, gradesArray[gradeIndex]);
        }

        return maxGrade;
    }

    // 4
    public static double getMinGrade(int[] gradesArray) {
        if (gradesArray.length < MIN_ARRAY_SIZE) return -1;
        int minGrade = gradesArray[0];

        for (int gradeIndex = 1; gradeIndex < gradesArray.length; gradeIndex++) {
            minGrade = Math.min(minGrade, gradesArray[gradeIndex]);
        }

        return minGrade;
    }

    public static double getSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double getPow(double number, double exponent) {
        return Math.pow(number, exponent);
    }

    // 5
    // On peut retenir que beaucoup de méthodes existent déjà et qu'on perdrait sûrement moins de temps à chercher
    // ce qu'il nous faut qu'à le recoder

}
