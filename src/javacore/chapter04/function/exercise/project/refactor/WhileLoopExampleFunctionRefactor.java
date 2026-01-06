package javacore.chapter04.function.exercise.project.refactor;

public class WhileLoopExampleFunctionRefactor {

    public static void main(String[] args) {

        int numberOfTimesToDisplay = 1000;
        displayHelloWorldXTimes(numberOfTimesToDisplay);

        displayExerciseTitle();

        displayAscendingNumbers(1, 10);
        displayDescendingNumbers(10, 1);
        displayEvenAscendingNumbers(2, 20);
    }

    // Affichages

    public static void displayExerciseTitle() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Exercice : [⭐] Affichez des séquences de nombres avec la boucle while");
        System.out.println("----------------------------------------------------------------------");
    }

    public static void displayHelloWorldXTimes(int times) {
        int loopCounter = 1;

        while (loopCounter <= times) {
            System.out.println("Tour n°: " + loopCounter + " - Hello World!");
            loopCounter++;
        }
    }

    public static void displayAscendingNumbers(int start, int end) {
        System.out.println("Nombres ascendants:");

        int number = start;

        while (number <= end) {
            System.out.println(number);
            number++;
        }
    }

    public static void displayDescendingNumbers(int start, int end) {
        System.out.println("Nombres descendants:");

        int number = start;

        while (number >= end) {
            System.out.println(number);
            number--;
        }
    }

    public static void displayEvenAscendingNumbers(int start, int end) {
        System.out.println("Nombres pairs ascendants:");

        int number = start;

        while (number <= end) {
            System.out.println(number);
            number += 2;
        }
    }
}
