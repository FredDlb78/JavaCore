package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {
    public static void main(String[] args) {

        // Suite: 0 1 1 2 3 5 8 13 21

        long previousFibonacciNumber = 0;
        long currentFibonacciNumber = 1;
        long result;

        System.out.println("-----");
        System.out.println("---Implémentez le programme qui calculera et affichera les 50 premiers termes de la suite de Fibonacci.---");
        System.out.println("-----");

        for (int fibonacciTerm = 0; fibonacciTerm < 50; fibonacciTerm++) {
            System.out.println(previousFibonacciNumber);
            result = currentFibonacciNumber + previousFibonacciNumber;
            previousFibonacciNumber = currentFibonacciNumber;
            currentFibonacciNumber = result;
        }

        System.out.println("-----");
        System.out.println("---BONUS [⭐⭐⭐] : Modifiez votre programme de sorte à ce qu'il affiche les 1000 premiers termes de la suite de Fibonacci, tout en distinguant les termes dont les valeurs sont paires.---");
        System.out.println("-----");

        int count;
        int sumOfPairsFibonacciNumbers = 0;

        for (count = 1; count <= 1000; count++) {
            if (previousFibonacciNumber % 2 == 0) {
                System.out.println("Nombre pair de la suite de Fibonacci : " + previousFibonacciNumber);
                sumOfPairsFibonacciNumbers += 1;
            }
            else {
                System.out.println("Nombre impair de la suite de Fibonacci : " + previousFibonacciNumber);
            }
                result = currentFibonacciNumber + previousFibonacciNumber;
                previousFibonacciNumber = currentFibonacciNumber;
                currentFibonacciNumber = result;

        }
        System.out.println("Il y'a " + sumOfPairsFibonacciNumbers + " nombres pairs dans la suite de Fibanacci parmi les " + (count - 1) + " premiers.");

    }
}