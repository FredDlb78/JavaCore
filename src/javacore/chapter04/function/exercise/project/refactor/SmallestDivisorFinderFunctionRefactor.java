package javacore.chapter04.function.exercise.project.refactor;

public class SmallestDivisorFinderFunctionRefactor {

    public static void main(String[] args) {

        int number = 7;

        int smallestDivisor = findSmallestDivisor(number);

        displayResultAndIndicatesIfIsPrime(number, smallestDivisor);
    }

    public static int findSmallestDivisor(int number) {
        int divisor = 2;

        while (number % divisor != 0) {
            divisor++;
        }

        return divisor;
    }

    public static void displayResultAndIndicatesIfIsPrime(int number, int divisor) {
        System.out.println("Le plus petit diviseur de " + number + " est : " + divisor + ".");

        if (number == divisor) {
            System.out.println("Le nombre " + number + " est un nombre premier.");
        } else {
            System.err.println("Le nombre " + number + " n'est pas un nombre premier.");
        }
    }
}
