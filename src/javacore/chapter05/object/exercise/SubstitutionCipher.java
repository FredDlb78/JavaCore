package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class SubstitutionCipher {

    static Scanner scanner = new Scanner(System.in);
    static final short MAX_ATTEMPTS = 5;

    private String alphabet;
    private String subsAlphabet;

    /**
     * Alphabet Standard (Latin)
     */
    static String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";
    /**
     * Alphabet de Substitution
     */
    static String substitutionAlphabet = "ntrhwbgeyjzlsoaqdmcuvfpxik";

    public SubstitutionCipher(String alphabet, String subsAlphabet) {
        this.alphabet = alphabet;
        this.subsAlphabet = subsAlphabet;
    }

    public static void main(String[] args) {

        /**
         *  Texte à chiffrer
         */
        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";

        // Ecrivez le code ci-dessous

        SubstitutionCipher cipher = new SubstitutionCipher(latinAlphabet, substitutionAlphabet);

//        System.out.println(encryptText(textToEncrypt));
//        System.out.println(encryptTextV2(textToEncrypt));
//        System.out.println(cipher(textToEncrypt, latinAlphabet, substitutionAlphabet));
//        String encryptedText = cipher(textToEncrypt, latinAlphabet, substitutionAlphabet, 3);
//        System.out.println(encryptedText);
//        String decryptedText = cipher(encryptedText, substitutionAlphabet, latinAlphabet, 3);
//        System.out.println(decryptedText);
//        System.out.println("Le texte après traitement est : " + processText(askShouldEncrypt()));
        System.out.println("Le texte après traitement est : " + cipher.processTextWithUserSubstitutionAlphabet(askShouldEncrypt()));
    }

    // Consigne 6
    public static String processTextWithUserSubstitutionAlphabet(short shouldEncrypt) {
        String result;
        if (shouldEncrypt == 1) {
            result = cipher(askForText(), latinAlphabet, askForSubstitutionAlphabet(), askForIterations());
        } else {
            result = cipher(askForText(), askForSubstitutionAlphabet(), latinAlphabet, askForIterations());
        }
        return result;
    }

    public static boolean isOnlyLowercaseLettersAZ(String alphabet) {
        for (int index = 0; index < alphabet.length(); index++) {
            char currentChar = alphabet.charAt(index);
            if (currentChar < 'a' || currentChar > 'z') {
                return false;
            }
        }
        return true;
    }

    public static boolean isUniqueEachCharacter(String alphabet) {
        for (int index = 0; index < alphabet.length(); index++) {
            char currentChar = alphabet.charAt(index);
            if (alphabet.indexOf(currentChar) != alphabet.lastIndexOf(currentChar)) {
                return false;
            }
        }
        return true;
    }

    public static boolean doesUserSubstitutionAlphabetContain26Characters(String alphabet) {
        if (alphabet.length() != 26) {
            return false;
        }
        return true;
    }

    public static String askForSubstitutionAlphabet() {
        String userSubstitutionAlphabet;
        short attempts = 0;

        do {
            System.out.println("Veuillez fournir votre alphabet de substitution : ");
            userSubstitutionAlphabet = scanner.nextLine().trim().toLowerCase();

            if (!doesUserSubstitutionAlphabetContain26Characters(userSubstitutionAlphabet)) {
                System.err.println("Votre alphabet ne contient pas 26 caractères.");
            }
            if (!isOnlyLowercaseLettersAZ(userSubstitutionAlphabet)) {
                System.err.println("Votre alphabet doit contenir uniquement des lettres.");
            }
            if (!isUniqueEachCharacter(userSubstitutionAlphabet)) {
                System.err.println("Au moins un caractère est en doublon.");
            }

            attempts++;
        } while ((!doesUserSubstitutionAlphabetContain26Characters(userSubstitutionAlphabet)
                || !isOnlyLowercaseLettersAZ(userSubstitutionAlphabet)
                || !isUniqueEachCharacter(userSubstitutionAlphabet))
                && attempts < MAX_ATTEMPTS);
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
            System.exit(1);
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
        SubstitutionCipher cipher = new SubstitutionCipher(alphabet, substitutionAlphabet);
        String encryptedText = "";
        for (int iteration = 0; iteration < cipherIterations; iteration++) {
            encryptedText = cipher(textToEncrypt, alphabet, substitutionAlphabet);
            textToEncrypt = encryptedText;
        }
        return encryptedText;
    }

    // Consigne 3
    public static String cipher(String textToEncrypt, String alphabet, String substitutionAlphabet) {
        SubstitutionCipher cipher = new SubstitutionCipher(alphabet, substitutionAlphabet);

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

    // ✅ Consigne 2 : correction replaceAll sans "double chiffrement"
    // Principe traditionnel : 2 passes
    // 1) Remplacer chaque lettre par un marqueur temporaire unique
    // 2) Remplacer chaque marqueur par la lettre finale de substitution
    public static String encryptTextV2(String text) {
        String encryptedText = text;

        // Pass 1 : on remplace a..z par des marqueurs temporaires
        for (int index = 0; index < latinAlphabet.length(); index++) {
            String sourceLetter = String.valueOf(latinAlphabet.charAt(index));
            String marker = "__" + index + "__"; // marqueur unique
            encryptedText = encryptedText.replaceAll(sourceLetter, marker);
        }

        // Pass 2 : on remplace les marqueurs par les lettres de substitution
        for (int index = 0; index < substitutionAlphabet.length(); index++) {
            String marker = "__" + index + "__";
            String targetLetter = String.valueOf(substitutionAlphabet.charAt(index));
            encryptedText = encryptedText.replaceAll(marker, targetLetter);
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
