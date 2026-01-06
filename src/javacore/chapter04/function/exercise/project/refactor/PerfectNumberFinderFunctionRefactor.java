package javacore.chapter04.function.exercise.project.refactor;

public class PerfectNumberFinderFunctionRefactor {

    public static void main(String[] args) {
        int start = 1;
        int end = 200000;

        displayPerfectNumbers(start, end);
    }

    public static void displayPerfectNumbers(int start, int end) {
        for (int n = start; n <= end; n++) {
            if (isPerfectNumber(n)) {
                displayPerfectNumber(n);
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int sum = sumOfProperDivisors(number);
        return sum == number;
    }

    public static int sumOfProperDivisors(int number) {
        int sum = 0;

        for (int divisor = 1; divisor < number; divisor++) {
            if (isDivisor(number, divisor)) {
                sum += divisor;
            }
        }
        return sum;
    }

    public static boolean isDivisor(int number, int potentialDivisor) {
        return number % potentialDivisor == 0;
    }

    public static void displayPerfectNumber(int number) {
        System.out.println(number + " est un nombre parfait !");
    }
}
