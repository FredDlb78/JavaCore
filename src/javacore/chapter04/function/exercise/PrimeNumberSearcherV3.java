package javacore.chapter04.function.exercise;

public class PrimeNumberSearcherV3 {

    public static void main (String[] args) {

        int potentialPrimeNumber = 0;
        int primeNumberFound = 0;
        int searchAmount = 50;

        while (primeNumberFound < searchAmount) {

            potentialPrimeNumber++;

            if (isPrimeNumber(potentialPrimeNumber)) {
                System.out.println(potentialPrimeNumber + " est le nombre premier n° " + (primeNumberFound + 1));
                primeNumberFound++;
            }
        }
    }

    public static boolean isPrimeNumber(int number) {

        for (int potentialDivisor = 2; potentialDivisor <= number - 1; potentialDivisor++) {

            if (number % potentialDivisor == 0) {
                return false;
            } // else { return true } => missing return statement
        }
        return true;
    }



}
