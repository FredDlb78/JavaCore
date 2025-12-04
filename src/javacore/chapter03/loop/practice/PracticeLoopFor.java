package javacore.chapter03.loop.practice;

public class PracticeLoopFor {

    public static void main(String[] args) {

        int result = 0;

        int currentNumber = 1;
        int maxNumber = 100;

        while (currentNumber <= maxNumber) {

            System.out.println("Result = " + result + " + " + currentNumber);
            result += currentNumber;
            System.out.println("------>" + result);
            currentNumber++;

        }
        System.out.println("Résultat : " + result);

        int result2 = 0;

        for (int cNumber = 1; cNumber <= maxNumber; cNumber++) {
            System.out.println("Result = " + result2 + " + " + cNumber);
            result2 += cNumber;
            System.out.println("------>" + result2);
        }
        System.out.println("La somme des nombres de 1 à 100 est de : " + result2);

        int result3 = 0;
        for (int a = 1; a <= 100; a++) {

            if (a % 2 == 0) {

                int resultForIf = 0;
                for (int b = 1; b <= a; b++) {
                    resultForIf += b;
                }
                System.out.println("Somme des nombres un 1 et " + a + " est égale à " + resultForIf);
            } else {
                System.out.println("Le nombre a est impair. a : " + a);
            }
        }

    }

}
