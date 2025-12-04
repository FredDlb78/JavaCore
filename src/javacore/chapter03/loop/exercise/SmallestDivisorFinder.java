package javacore.chapter03.loop.exercise;

public class SmallestDivisorFinder {


    public static void main(String[] args) {

        // 2, 3, 5, 7, 11, 13, 17, 19, 97... et 100 (un nombre qui n'est pas premier pour vérifier aussi :) )
        int number = 96;
        int divisor = 2;

        // Tant que number % 0 n'est pas égal à 0 on continue
        while (number % divisor != 0) {
            divisor++;
        }
        System.out.println("Le plus petit diviseur de " + number + " est : " + divisor + ".");
        if (number == divisor) {
            System.out.println("Le nombre " + number + " est un nombre premier.");
        }

    }


}
