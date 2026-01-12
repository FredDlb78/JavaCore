package javacore.chapter04.function.exercise;

public class FactorizationExercise {

    public static void main(String[] args) {

        // Afficher les nombres de 1 à 5
        displayNumbersByAscOrder(1,5);

        // Afficher la table de multiplication de 2
        displayMultiplicationTable(2);

        // Afficher la table de multiplication de 3
        displayMultiplicationTable(3);

        // Afficher la table de multiplication de 6
        displayMultiplicationTable(6);

        // Afficher les carrés des nombres de 1 à 5
        displaySquareOfNumber(1, 5);

        // Afficher les carrés des nombres de 6 à 10
        displaySquareOfNumber(6, 10);

    }

    public static void displayNumbersByAscOrder(int firstNumber, int lastNumber) {
        for (int i = firstNumber; i <= lastNumber; i++) {
            System.out.println("Nombre: " + i);
        }
    }

    public static void displayMultiplicationTable(int multiple) {
        System.out.println("Table de multiplication de " + multiple + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiple + " x " + i + " = " + (multiple * i));
        }
    }

    public static void displaySquareOfNumber(int firstNumber, int lastNumber) {
        System.out.println("Carrés des nombres de " + firstNumber + " à " + lastNumber + " :");
        for (int i = firstNumber; i <= lastNumber; i++) {
            System.out.println(i + " au carré = " + (i * i));
        }
    }

}
