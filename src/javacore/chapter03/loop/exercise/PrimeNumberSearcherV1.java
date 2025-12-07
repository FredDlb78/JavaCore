package javacore.chapter03.loop.exercise;

import java.util.Arrays;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args) {


        int number = 100;
        int divisor = 2;
        int i = 0;
        int numberOfPrimeMembers = 0;
        int numberOfPrimeMembersExpected = 50;

        for (i = 1; i <= number; i++) {
            //System.out.println("Le nombre testé est : " + i);
            for (divisor = 2; i % divisor != 0; divisor++) {
                //System.out.println(divisor + " n'est pas le plus petit diviseur de " + number + ".");
            }
            //System.out.println("Le plus petit diviseur de " + i + " est : " + divisor + ".");

            if (i == divisor) {
                System.out.println(i + " est un nombre premier.");
                numberOfPrimeMembers++;
            }
        }
        System.out.println("Il y'a " + numberOfPrimeMembers + " nombres premiers entre 1 et " + number + ".");
        // Il y'a 25 nombres premiers entre 1 et 100.
        // Il faut aller jusqu'à 229 pour trouver les 50 nombres premiers.



        // --------- BONUS 2 ---------
        System.out.println("-----BONUS 2-----");

        int max = 100;
        boolean[] isPrime = new boolean[max + 1];

        // 1. On suppose au départ que tous les nombres sont premiers
        Arrays.fill(isPrime, true);

        // 0 et 1 ne sont pas premiers
        isPrime[0] = false;
        isPrime[1] = false;

        // 2. Crible d’Ératosthène
        for (int p = 2; p * p <= max; p++) {
            // Si p est encore marqué comme premier
            if (isPrime[p]) {
                // On barre tous ses multiples à partir de p * p
                for (int multiple = p * p; multiple <= max; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        // 3. Affichage des nombres premiers et comptage
        int count = 0;
        for (int j = 2; j <= max; j++) {
            if (isPrime[j]) {
                System.out.println(j + " est un nombre premier.");
                count++;
            }
        }

        System.out.println("Il y a " + count + " nombres premiers entre 2 et " + max + ".");
    }
}