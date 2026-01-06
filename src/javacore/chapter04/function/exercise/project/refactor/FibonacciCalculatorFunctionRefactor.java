package javacore.chapter04.function.exercise.project.refactor;

public class FibonacciCalculatorFunctionRefactor {

    private static final int FIRST_TERMS_TO_PRINT = 50;
    private static final int BONUS_TERMS_TO_PRINT = 1000;

    public static void main(String[] args) {

        displayFirstInstruction();
        printFirstFibonacciTerms(FIRST_TERMS_TO_PRINT);

        displaySecondInstruction();
        int sumOfPairsFibonacciNumbers = printFibonacciTermsWithParity(BONUS_TERMS_TO_PRINT);

        System.out.println("Il y'a " + sumOfPairsFibonacciNumbers + " nombres pairs dans la suite de Fibonacci parmi les " + BONUS_TERMS_TO_PRINT + " premiers.");
    }

    // Afficher les N premiers termes
    public static void printFirstFibonacciTerms(int terms) {
        long previous = 0;
        long current = 1;

        for (int i = 0; i < terms; i++) {
            System.out.println(previous);

            long next = previous + current;
            previous = current;
            current = next;
        }
    }

    // Afficher les N premiers termes + pair/impair
    // Renvoie le nombre de termes pairs
    public static int printFibonacciTermsWithParity(int terms) {
        long previous = 0;
        long current = 1;

        int evenCount = 0;

        for (int i = 1; i <= terms; i++) {
            if (isEven(previous)) {
                System.out.println("Nombre pair de la suite de Fibonacci : " + previous);
                evenCount++;
            } else {
                System.out.println("Nombre impair de la suite de Fibonacci : " + previous);
            }

            long next = previous + current;
            previous = current;
            current = next;
        }

        return evenCount;
    }

    public static boolean isEven(long number) {
        return number % 2 == 0;
    }

    // Affichage des consignes
    public static void displayFirstInstruction() {
        System.out.println("-----");
        System.out.println("---Implémentez le programme qui calculera et affichera les 50 premiers termes de la suite de Fibonacci.---");
        System.out.println("-----");
    }

    public static void displaySecondInstruction() {
        System.out.println("-----");
        System.out.println("---BONUS [⭐⭐⭐] : Modifiez votre programme de sorte à ce qu'il affiche les 1000 premiers termes de la suite de Fibonacci, tout en distinguant les termes dont les valeurs sont paires.---");
        System.out.println("-----");
    }
}
