package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {


    public static void main(String[] args) {

        int start = 1;
        int end = 100;

        for (int i = start; i <= end; i++) {
            //System.out.println("Boucle qui parcourt les nombres de : " + start + " à " + end + " . Nombre : " + i);
            int sum = 0;
            for (int divisor = 1; divisor < i; divisor++) {
                // Si le diviseur est un diviseur de i => on l’ajoute à la somme
                if (i % divisor == 0) {
                    sum += divisor;
                }
            }
            if (sum == i) {
                System.out.println(i + " est un nombre parfait !");
            }
        }
        // Les nombres parfaits jusqu'à 10000 sont: 6, 28, 496, 8128
    }
}