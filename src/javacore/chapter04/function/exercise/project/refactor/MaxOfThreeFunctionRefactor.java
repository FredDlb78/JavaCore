package javacore.chapter04.function.exercise.project.refactor;

public class MaxOfThreeFunctionRefactor {

    public static void main(String[] args) {

        int a = 7;
        int b = 7;
        int c = 7;

        if (areEquals(a, b, c)) {
        } else if (atLeastTwoValuesAreEqual(a, b, c)) {
            displayEqualsValues(a, b, c);
        } else {
            int max = getMaxValueOf(a, b, c);
            displayMaxValueMsg(a, b, c, max);
        }

        displayValues(a, b, c);
    }

    public static boolean areEquals(int a, int b, int c) {
        System.out.println("Toutes les valeurs sont égales, il n'y en a pas une plus grande que les autres.");
        return a == b && b == c;
    }

    public static boolean atLeastTwoValuesAreEqual(int a, int b, int c) {
        return a == b || a == c || b == c;
    }

    public static int getMaxValueOf(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        return c;
    }

    public static void displayEqualsValues(int a, int b, int c) {
        if (a == b) {
            System.out.println("Les valeurs de a et b sont égales. Valeur : " + a);
        } else if (a == c) {
            System.out.println("Les valeurs de a et c sont égales. Valeur : " + a);
        } else {
            System.out.println("Les valeurs de b et c sont égales. Valeur : " + b);
        }
    }

    public static void displayMaxValueMsg(int a, int b, int c, int max) {
        if (max == a) {
            System.out.println("Le plus grand nombre est a. Valeur de a: " + a);
        } else if (max == b) {
            System.out.println("Le plus grand nombre est b. Valeur de b: " + b);
        } else {
            System.out.println("Le plus grand nombre est c. Valeur de c: " + c);
        }
    }

    public static void displayValues(int a, int b, int c) {
        System.out.println("Valeur de a : " + a);
        System.out.println("Valeur de b : " + b);
        System.out.println("Valeur de c : " + c);
    }
}
