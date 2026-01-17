package javacore.chapter04.function.exercise;

public class RecursiveFibonacci {
    static long previousFibonacciNumber = 0;
    static long currentFibonacciNumber = 1;

    public static void main(String[] args) {

        int count = 1;
        int fibonacciNumbersToDisplay = 50;

        // Suite: 0 1 1 2 3 5 8 13 21

        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("---Implémentez le programme qui calculera et affichera les 50 premiers termes de la suite de Fibonacci.---");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        System.out.println();


        recursiveFibonacci(previousFibonacciNumber, currentFibonacciNumber, count, fibonacciNumbersToDisplay);

    }

    public static void recursiveFibonacci(long previousFibonacciNumber, long currentFibonacciNumber, int count, int fibonacciNumbersToDisplay) {
        if (count > fibonacciNumbersToDisplay) {
            return;
        }
        long nextFibonacciNumber = previousFibonacciNumber + currentFibonacciNumber;
        System.out.println(previousFibonacciNumber);
        count = count + 1;


        recursiveFibonacci(currentFibonacciNumber, nextFibonacciNumber, count, fibonacciNumbersToDisplay);
    }
}