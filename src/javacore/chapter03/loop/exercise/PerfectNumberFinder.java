package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {


    public static void main(String[] args) {

        int start = 1;
        int end = 100;

        for (int potentialPerfectNumber = start; potentialPerfectNumber <= end; potentialPerfectNumber++) {
            //System.out.println("Boucle qui parcourt les nombres de : " + start + " à " + end + " . Nombre : " + potentialPerfectNumber);
            int sum = 0;
            for (int potentialDivisor = 1; potentialDivisor < potentialPerfectNumber; potentialDivisor++) {
                // Si le diviseur est un diviseur de potentialPerfectNumber => on l’ajoute à la somme
                if (potentialPerfectNumber % potentialDivisor == 0) {
                    sum += potentialDivisor;
                }
            }
            if (sum == potentialPerfectNumber) {
                System.out.println(potentialPerfectNumber + " est un nombre parfait !");
            }
        }
        // Les nombres parfaits jusqu'à 10000 sont: 6, 28, 496, 8128
    }
}