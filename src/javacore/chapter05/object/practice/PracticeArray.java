package javacore.chapter05.object.practice;

import java.util.Scanner;

public class PracticeArray {

    public static void main(String[] args) {

/*        int[] integerArray = {1, 2, 3, 4, 5};

        System.out.println("Référence tableau : " + integerArray);
        System.out.println("Taille du tableau : " + integerArray.length);
        System.out.println("1er élément du tableau : " + integerArray[0]);
        System.out.println("Dernier élément du tableau : " + integerArray[4]);

        // ArrayIndexOutOfBoundsException
        // System.out.println(integerArray[1467]);

        integerArray[0] = 152;
        System.out.println("1er élément du tableau : " + integerArray[0] + " (2ème affichage) ");

        // ArrayIndexOutOfBoundsException
        // integerArray[1337] = 100;
        // System.out.println("Index (Modification) invalide : " + integerArray[1337]);

        for (int index = 0; index < integerArray.length; index++) {
            System.out.println("L'élément " + index + " du tableau est : " + integerArray[index]);
        }

        int[] integerArray2 = new int[20];
        System.out.println(integerArray2[19]);*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Combien d'éléments voulez-vous additionner ?");
        int desiredUserSize = scanner.nextInt();

        int[] userNumberArray = new int[desiredUserSize];

        for (int index = 0; index < userNumberArray.length; index++) {
            System.out.print("Entrez la valeur (" + (index + 1) + "/" + desiredUserSize + ") : ");
            userNumberArray[index] = scanner.nextInt();
        }

        int sumResult = 0;

        for (int index = 0; index < userNumberArray.length; index++) {
            sumResult += userNumberArray[index];
        }
        System.out.println("La somme des nombres est : " + sumResult);
    }
}
