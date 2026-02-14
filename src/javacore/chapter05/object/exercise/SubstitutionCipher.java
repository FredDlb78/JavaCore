package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class SubstitutionCipher {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Alphabet Standard (Latin)
     */
    static String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";
    /**
     * Alphabet de Substitution
     */
    static String substitutionAlphabet = "ntrhwbgeyjzlsoaqdmcuvfpxik";

    public static void main(String[] args) {

        /**
         *  Texte à chiffrer
         */
        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";

        // Ecrivez le code ci-dessous
//        System.out.println(encryptText(textToEncrypt));
//        System.out.println(encryptTextV2(textToEncrypt));
//        System.out.println(cipher(textToEncrypt, latinAlphabet, substitutionAlphabet));
//        String encryptedText = cipher(textToEncrypt, latinAlphabet, substitutionAlphabet, 3);
//        System.out.println(encryptedText);
//        String decryptedText = cipher(encryptedText, substitutionAlphabet, latinAlphabet, 3);
//        System.out.println(decryptedText);
        System.out.println("Le texte après traitement est : " + processText(askShouldEncrypt()));
        askForSubstitutionAlphabet();

    }

    // Consigne 6
    public static boolean doesUserSubstitutionAlphabetContain26Characters() {
        if (askForSubstitutionAlphabet().length() != 26) {
            return false;
        }
        return true;
    }

    public static String askForSubstitutionAlphabet() {
        String userSubstitutionAlphabet;
        do {
            System.out.print("Veuillez fournir votre alphabet de substitution : ");
            userSubstitutionAlphabet = scanner.nextLine();
            if (!doesUserSubstitutionAlphabetContain26Characters()) {
                System.out.println("Votre alphabet ne contient pas 26 caractères.");
            }
        } while (!doesUserSubstitutionAlphabetContain26Characters());

        return userSubstitutionAlphabet;
    }

    // Consigne 5
    public static String processText(short shouldEncrypt) {
        String result;
        if (shouldEncrypt == 1) {
            result = cipher(askForText(), latinAlphabet, substitutionAlphabet, askForIterations());
        } else {
            result = cipher(askForText(), substitutionAlphabet, latinAlphabet, askForIterations());
        }
        return result;
    }

    public static int askForIterations() {
        System.out.print("Combien de fois souhaitez-vous chiffrer votre texte : ");
        int iterations = scanner.nextInt();
        if (iterations < 1) {
            System.err.println("La valeur saisie n'est pas correcte, votre texte sera traité 1 fois.");
            iterations = 1;
        }
        scanner.nextLine();
        return iterations;
    }

    public static short askShouldEncrypt() {
        final short MAX_ATTEMPTS = 5;
        short attempts = 0;
        short shouldEncrypt;
        do {
            System.out.print("Souhaitez-vous chiffrer votre texte (1) ou le déchiffrer (2) : ");
            shouldEncrypt = scanner.nextShort();
            scanner.nextLine();
            attempts++;

            if (shouldEncrypt != 1 && shouldEncrypt != 2) {
                System.out.println("Valeur invalide.");
            }
        } while (shouldEncrypt != 1 && shouldEncrypt != 2 && attempts < MAX_ATTEMPTS);

        if (shouldEncrypt != 1 && shouldEncrypt != 2) {
            System.err.println("Nombre de tentatives dépassé. Fermeture du programme.");
            System.exit(1); // Trouvé en cherchant comment stopper le programme mais on ne l'a pas encore vu.
        }
        return shouldEncrypt;
    }

    public static String askForText() {
        System.out.print("Texte à chiffrer/déchiffrer : ");
        String text = scanner.nextLine().trim().toLowerCase();
        return text;
    }

    // Consigne 4
    public static String cipher(String textToEncrypt, String alphabet, String substitutionAlphabet, int cipherIterations) {
        String encryptedText = "";
        for (int iteration = 0; iteration < cipherIterations; iteration++) {
            encryptedText = cipher(textToEncrypt, alphabet, substitutionAlphabet);
            textToEncrypt = encryptedText;
        }
        return encryptedText;
    }

    // Consigne 3
    public static String cipher(String textToEncrypt, String alphabet, String substitutionAlphabet) {
        String encryptedText = "";

        for (int textIndex = 0; textIndex < textToEncrypt.length(); textIndex++) {

            char currentChar = textToEncrypt.charAt(textIndex);
            int currentCharIndex = alphabet.indexOf(currentChar);

            if (currentCharIndex >= 0) {
                currentChar = substitutionAlphabet.charAt(currentCharIndex);
            }
            encryptedText += currentChar;
        }
        return encryptedText;
    }

    // Consigne 2
    // Solution qui n'est probablement pas bonne car une lettre peut etre "cryptée" plusieurs fois mais je ne vois pas comment faire
    public static String encryptTextV2(String text) {
        String encryptedText = text;

        for (int index = 0; index < latinAlphabet.length(); index++) {

            encryptedText = encryptedText.replaceAll(
                    String.valueOf(latinAlphabet.charAt(index)),
                    String.valueOf(substitutionAlphabet.charAt(index)));
        }
        return encryptedText;
    }

    // Consigne 1
    public static String encryptText(String text) {
        String encryptedText = "";

        for (int textIndex = 0; textIndex < text.length(); textIndex++) {

            char currentChar = text.charAt(textIndex);
            int currentCharIndex = latinAlphabet.indexOf(currentChar);

            if (currentCharIndex >= 0) {
                currentChar = substitutionAlphabet.charAt(currentCharIndex);
            }
            encryptedText += currentChar;
        }
        return encryptedText;
    }
}