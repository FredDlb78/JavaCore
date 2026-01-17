package javacore.chapter04.function.exercise;

public class RecursiveFactorial {

    static long result = 1;

    public static void main(String[] args) {

        int number = 21; // tests : -1, 0, 1, 20, 21

        if (number < 0) {
            System.err.println("Le factoriel d'un nombre négatif n'existe pas.");
            return;
        }

        calculateFactorial(number);

        System.out.println("Le factoriel de " + number + " est " + result + ".");
    }

    public static void calculateFactorial(int number) {

        if (number <= 1) {
            return;
        }

        result *= number;

        calculateFactorial(number - 1);
    }
}
