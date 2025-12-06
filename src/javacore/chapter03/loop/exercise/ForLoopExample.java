package javacore.chapter03.loop.exercise;

public class ForLoopExample {

    public static void main(String[] args) {

        System.out.println("-----Ascendants-----");

        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }

        System.out.println("-----Descendants-----");

        for (int number2 = 10; number2 > 0; number2--) {
            System.out.println(number2);
        }

        System.out.println("-----Ascendants pairs-----");

        for (int number3 = 2; number3 <= 20; number3 += 2) {
            System.out.println(number3);
        }

        System.out.println("-----Alphabet-----");

        for (char letter = 'A'; letter <= 90; letter++) {
            System.out.println(letter);
        }

        System.out.println("-----Calcul de factoriels-----");

        long result = 1;
        long number = 21;

        if (number < 0) {
            System.out.println("Le factoriel d'un nombre négatif n'existe pas. Nombre: " + number);
        } else {
            if (number == 0) {
                result *= number;
            } else {
                for (int i = 1; i <= number; i++) {
                    result *= i;
                }
            }
            System.out.println("Le factoriel de " + number + " est de " + result + ".");
        }
    }
}