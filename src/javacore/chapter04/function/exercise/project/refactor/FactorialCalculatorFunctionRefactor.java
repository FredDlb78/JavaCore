package javacore.chapter04.function.exercise.project.refactor;

public class FactorialCalculatorFunctionRefactor {

    public static void main(String[] args) {

        long number = 6;
        long originalNumber = number;

        long result = calculateFactorial(number);

        System.out.println("Le factoriel de " + originalNumber + " est " + result + ".");
    }

    public static long calculateFactorial(long number) {
        long result = 1;
        if (number < 0) {
            System.out.println("Le factoriel d'un nombre négatif n'existe pas. Nombre: " + number);
        } else if (number == 0) {
            result = 1;

        } else {
            while (number >= 1) {
                result *= number;
                number--;
            }
        }
        return result;
    }
}
