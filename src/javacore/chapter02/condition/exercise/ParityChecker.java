package javacore.chapter02.condition.exercise;

public class ParityChecker {

    public static void main(String[] args) {

        long number = 3333777799999L;

        long lastDigitNumber = number % 10;
        //System.out.println("Le dernier chiffre du nombre: " + number + " est : " + lastDigitNumber);

        if (number % 2 == 0) {
            System.out.println("Le nombre " + number + " est pair.");
            System.out.println("Le dernier chiffre du nombre " + number + "est pair : " + lastDigitNumber);
        } else {
            System.out.println("Le nombre " + number + " est impair.");
            System.out.println("Son dernier chiffre est impair : " + lastDigitNumber);
        }

        /*
        Comment pouvez-vous être certains que le programme vous affiche la bonne réponse ?
        1 - Passer number en long pour pouvoir effectuer l'opération
        2 - Pour extraire le dernier chiffre d'un nombre, on peut le diviser par 10,
        le dernier chiffre passe après la virgule et devient le reste (stocké dans lastDigitNumber).
        */

    }

}
