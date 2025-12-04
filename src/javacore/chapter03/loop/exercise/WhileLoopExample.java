package javacore.chapter03.loop.exercise;

public class WhileLoopExample {


    public static void main(String[] args) {

        int numberOfTimesToDisplay = 1000;
        int loopCounter = 1; //nombre de tours de boucle

        while (loopCounter <= numberOfTimesToDisplay) {
            System.out.println("Tour n°: " + loopCounter + " - Hello World!");
            loopCounter++;
        }

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Exercice : [⭐] Affichez des séquences de nombres avec la boucle while");
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Nombres ascendants: ");

        byte number = 1;
        byte maxNumber = 10;
        while (number <= maxNumber) {
            System.out.println(number);
            number++;
        }

        System.out.println("Nombres descendants: ");

        number = 10;
        byte minNumber = 1;
        while (number >= minNumber) {
            System.out.println(number);
            number--;
        }

        System.out.println("Nombres pairs ascendants: ");
        number = 2;
        maxNumber = 20;

        while (number <= maxNumber) {
            System.out.println(number);
            number += 2;
        }

        // Ici, j'ai essayé d'utiliser le modulo mais je n'ai pas trouvé de solution sans condition. Je pense qu'on peut mieux faire mais je n'ai pas trouvé.


    }
}
