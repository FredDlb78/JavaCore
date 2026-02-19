package javacore.chapter05.object.exercise;

/*
 * Crible d'Ératosthène — Pseudo-code
 *
 * 1 - Créer un tableau de booléens (false = candidat, true = éliminé)
 * 2 - Pour chaque nombre i non éliminé :
 *      => i est premier
 *      => Éliminer tous ses multiples (i×2, i×3, i×4...)
 * 3 - Afficher tous les nombres restants non éliminés (primeNumber)
 */
public class PrimeNumberSearcherV4 {

    public static void main(String[] args) {
        searchPrimeNumber(229);
    }

    public static void searchPrimeNumber(int maxLimit) {
        boolean[] isEliminated = new boolean[maxLimit + 1]; // Si je ne fais pas le + 1, la limite provoque une ArrayIndexOutOfBoundsException =>  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10000 out of bounds for length 10000
        int firstLoopCount = 0;
        int secondLoopCount = 0;
        int primeNumbersCount = 0;

        // Je commence à 2 parce que 0 et 1 ne sont pas des nombres premiers (convention mathématique? Il me semble que tu m'avais dit ça dans une review)
        for (int potentialPrimeNumber = 2; potentialPrimeNumber <= maxLimit; potentialPrimeNumber++) {
            firstLoopCount++;
            if (!isEliminated[potentialPrimeNumber]) {
                for (int multiple = potentialPrimeNumber * 2; multiple <= maxLimit; multiple += potentialPrimeNumber) {
                    isEliminated[multiple] = true;
                    secondLoopCount++;
                }
            }
        }

        for (int i = 2; i <= maxLimit; i++) {
            if (!isEliminated[i]) {
                System.out.println("Le nombre " + i + " est un nombre premier.");
                primeNumbersCount++;
            }
        }

        System.out.println("Nombre d'opérations totales: " + (firstLoopCount + secondLoopCount));
        System.out.println("Pour les " + primeNumbersCount + " premiers nombres, il y' " + maxLimit + " nombres premiers trouvés et " + (firstLoopCount + secondLoopCount) + " itérations dans le PrimeNumberSearcherV4");

        // Pour les 50 premiers nombres premiers, il y'a 228 nombres analysés et 5144 itérations dans le PrimeNumberSearcherV2
        // Pour les 50 premiers nombres premiers, il y'a 228 nombres analysés et 607 itérations dans le PrimeNumberSearcherV4 soir 8 fois plus et je pense que l'écart augmente quand le nombre de premiers recherchés augmente.
        // PS: Cette logique est vraiment plus dure pour moi :)
    }
}