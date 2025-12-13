package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args) {


        int number = 100;
        int potentialDivisor = 2;
        int potentialPrimeNumber = 0;
        int foundPrimeNumber = 0;
        int searchAmount = 50;

        for (potentialPrimeNumber = 1; potentialPrimeNumber <= number; potentialPrimeNumber++) {
            //System.out.println("Le nombre testé est : " + potentialPrimeNumber);

            for (potentialDivisor = 2; potentialPrimeNumber % potentialDivisor != 0; potentialDivisor++) {
                //System.out.println(potentialDivisor + " n'est pas le plus petit diviseur de " + number + ".");
            }
            //System.out.println("Le plus petit diviseur de " + potentialPrimeNumber + " est : " + potentialDivisor + ".");
            boolean isPrime = false; // par défaut

            if (potentialPrimeNumber == potentialDivisor) {
                isPrime = true;
                System.out.println(potentialPrimeNumber + " est un nombre premier.");
                foundPrimeNumber++;
            }

        }
        System.out.println("Il y'a " + foundPrimeNumber + " nombres premiers entre 1 et " + number + ".");
        // Il y'a 25 nombres premiers entre 1 et 100.
        // Il faut aller jusqu'à 229 pour trouver les 50 nombres premiers.

/*        // --------- BONUS 2 ---------
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

        System.out.println("Il y a " + count + " nombres premiers entre 2 et " + max + ".");*/
    }
}