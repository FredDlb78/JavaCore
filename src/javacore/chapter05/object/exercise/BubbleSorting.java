package javacore.chapter05.object.exercise;

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {

        int[] numbers = {30, 25, 85, 6, 43, 58, 97, 78, 94, 27, 9, 38, 41, 35, 52, 10, 16, 22, 96, 74, 44, 55, 82, 28, 83, 69, 90, 89, 26, 7, 47, 98, 50, 42, 68, 91, 70, 65, 79, 4, 75, 49, 61, 39, 48, 72, 36, 18, 1, 15, 77, 99, 33, 24, 13, 19, 73, 17, 14, 86, 54, 45, 76, 21, 100, 63, 60, 56, 93, 87, 81, 8, 29, 34, 53, 37, 71, 67, 57, 66, 11, 46, 95, 20, 88, 64, 59, 84, 12, 92, 80, 40, 23, 3, 2, 32, 31, 5, 62, 51};

        System.out.println(Arrays.toString(sortIntNumbers(numbers)));

    }

    // 3
    /*Tri par insertion (Insertion Sort) : tu parcours le tableau de gauche à droite en considérant qu’à chaque étape, la partie
    gauche est déjà triée, puis tu “insères” l’élément courant à sa bonne place en décalant les plus grands. Simple, très bon si
    le tableau est presque trié, mais lent sur gros volumes (≈ O(n²)).*/

    public static int[] insertionSort(int[] numbers) {

    // On commence à l'index 1
    // Car l'élément à l'index 0 est considéré comme déjà "trié"
    for (int insertionIndex = 1; insertionIndex < numbers.length; insertionIndex++) {

        // On sauvegarde la valeur actuelle
        int currentValue = numbers[insertionIndex];

        // On regarde à gauche
        int compareIndex = insertionIndex - 1;

        // Tant que :
        // - on n'est pas sorti du tableau
        // - ET que l'élément à gauche est plus grand que currentValue
        while (compareIndex >= 0 && numbers[compareIndex] > currentValue) {

            // On décale l'élément vers la droite
            numbers[compareIndex + 1] = numbers[compareIndex];

            // On continue à regarder encore plus à gauche
            compareIndex--;
        }

        // On insère la valeur à sa bonne position
        numbers[compareIndex + 1] = currentValue;
    }

    return numbers;
}

    /*Tri rapide (Quick Sort) : tu choisis un pivot, tu partitionnes le tableau (plus petits à gauche, plus grands à droite),
    puis tu répètes la même opération récursivement sur chaque côté. Très performant en moyenne (≈ O(n log n)), mais
    plus délicat à coder et peut se dégrader si le pivot est mal choisi (pire cas ≈ O(n²)).*/

    // 2
/*    Forces du tri à bulles :
    Algorithme très simple à comprendre et à implémenter, idéal pour l’apprentissage. Il peut être correct sur de très petits
    tableaux et s’améliore légèrement si on ajoute un arrêt anticipé lorsque le tableau est déjà trié.

    Faiblesses :
    Très lent dès que le nombre d’éléments augmente (complexité en O(n²)), avec beaucoup de comparaisons et d’échanges inutiles.
    En pratique professionnelle, on lui préfère des algorithmes plus efficaces comme le tri rapide ou le tri fusion.*/

    // 1
    public static int[] sortIntNumbers(int[] numbers) {
        int previousNumber;
        int currentNumber;
        int numberIndex;

        for (int boardLoopIndex = 0; boardLoopIndex < numbers.length; boardLoopIndex++) {

            for (numberIndex = 1; numberIndex < numbers.length; numberIndex++) {
                previousNumber = numbers[numberIndex - 1];
                currentNumber = numbers[numberIndex];
                if (previousNumber > currentNumber) {
                    numbers[numberIndex - 1] = currentNumber;
                    numbers[numberIndex] = previousNumber;
                }
            }
        }
        return numbers;
    }
}