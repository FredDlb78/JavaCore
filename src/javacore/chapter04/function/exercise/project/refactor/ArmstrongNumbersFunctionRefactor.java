package javacore.chapter04.function.exercise.project.refactor;

public class ArmstrongNumbersFunctionRefactor {

    public static void main(String[] args) {

        int highLimitNumber = 100000;

        for (int currentNumber = 0; currentNumber <= highLimitNumber; currentNumber++) {

            int temporaryNumber = currentNumber;
            int digitTemporaryNumberCount = 0;

            // Étape 1 : compter le nombre de chiffres
            digitTemporaryNumberCount = countDigits(temporaryNumber, currentNumber);

            // Étape 2 : calculer la somme des chiffres à la puissance digitsCount
            int sum = calculateSum(currentNumber, digitTemporaryNumberCount);

            // Étape 3 : affichage des nombres armstrong
            displayArmstrongNumber(sum, currentNumber);
        }
    }

    public static int countDigits(int temporaryNumber, int currentNumber) {
        int digitTemporaryNumberCount = 0;

        if (temporaryNumber == 0) {
            digitTemporaryNumberCount = 1;
        } else {
            for (temporaryNumber = currentNumber; temporaryNumber > 0; temporaryNumber = temporaryNumber / 10) {
                digitTemporaryNumberCount++;
            }
        }
        return digitTemporaryNumberCount;
    }

    public static int calculateSum(int currentNumber, int digitTemporaryNumberCount) {

        int temporaryNumber = currentNumber;
        int lastDigit;
        int sum = 0;

        for (temporaryNumber = currentNumber; temporaryNumber > 0; temporaryNumber = temporaryNumber / 10) {

            lastDigit = temporaryNumber % 10;

            int result = calculatePower(lastDigit, digitTemporaryNumberCount);
            sum += result;
        }

        return sum;
    }


    public static int calculatePower(int base, int exponent) {

        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }


    public static void displayArmstrongNumber(int sum, int currentNumber) {
        if (sum == currentNumber) {
            System.out.println(currentNumber + " est un nombre Armstrong.");
        }
    }
}
