package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class BinaryConverter {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 2
        String binaryText = "10110110";
        int binaryValue = convertStringToInteger(binaryText);
        System.out.println("La valeur du binaire " + binaryText + " est : " + binaryValue);

        // 3
        String binaryText2 = "1011001010110111101011001001011010101001011111010111001010101101";
        long binaryValue2 = convertStringToLong(binaryText2);
        System.out.println("La valeur du binaire " + binaryText2 + " est : " + binaryValue2);
        // La valeur du binaire 1011001010110111101011001001011010101001011111010111001010101101 est : -5568792651131686228
        // Le calcul est faux, il faut probablement utiliser BigInteger mais avec BigInteger je n'y arrive pas.

        // 4
        String binaryText3 = setBinary();
        long binaryValue3 = convertStringToLong(binaryText3);
        System.out.println("La valeur du binaire " + binaryText3 + " est : " + binaryValue3);

    }

    public static int convertStringToInteger(String text) {

        int result = 0;
        for (int charIndex = text.length() - 1; charIndex >= 0; charIndex--) {

            char currentChar = text.charAt(charIndex);
            String currentString = String.valueOf(currentChar);
            int bitValue = Integer.parseInt(currentString);

            if (bitValue == 0) {
            } else if (bitValue == 1) {
                int currentBitDecimalValue = (int) Math.pow(2, (text.length() - charIndex) - 1);
                result = result + currentBitDecimalValue;
            } else {
                System.err.println("Un binaire ne peut être égal qu'à 0 ou à 1.");
            }

        }
        return result;
    }

    public static long convertStringToLong(String text) {

        long result = 0;
        for (int charIndex = text.length() - 1; charIndex >= 0; charIndex--) {

            char currentChar = text.charAt(charIndex);
            String currentString = String.valueOf(currentChar);
            long bitValue = Long.parseLong(currentString);

            if (bitValue == 0) {
            } else if (bitValue == 1) {
                long currentBitDecimalValue = (long) Math.pow(2, (text.length() - charIndex) - 1);
                result = result + currentBitDecimalValue;
            } else {
                System.err.println("Un binaire ne peut être égal qu'à 0 ou à 1.");
            }

        }
        return result;
    }

    public static String setBinary() {
        String binaryString;
        boolean isValid;

        do {
            System.out.print("Veuillez saisir un nombre binaire à convertir: ");
            binaryString = sc.nextLine();
            isValid = true;

            if (binaryString.isEmpty()) {
                System.out.println("La saisie ne peut pas être vide.");
                isValid = false;
            }

            for (int charIndex = 0; charIndex <= binaryString.length() - 1; charIndex++) {

                char currentChar = binaryString.charAt(charIndex);
                String currentString = String.valueOf(currentChar);
                int bitValue = Integer.parseInt(currentString);

                if (bitValue != 0 && bitValue != 1) {
                    System.out.println("Un binaire ne peut être égal qu'à 0 ou à 1.");
                    isValid = false;
                    break;
                }
            }
        } while (!isValid);
        return binaryString;
    }
}