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
        searchPrimeNumber(10000);
    }

    public static void searchPrimeNumber(int maxLimit) {
        boolean[] isEliminated = new boolean[maxLimit + 1];

        for (int i = 2; i <= maxLimit; i++) {
            if (!isEliminated[i]) {
                for (int multiple = i * 2; multiple <= maxLimit; multiple += i) {
                    isEliminated[multiple] = true;
                }
            }
        }

        for (int i = 2; i <= maxLimit; i++) {
            if (!isEliminated[i]) {
                System.out.println("Le nombre " + i + " est un nombre premier.");
            }
        }
    }
}