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

        SubstitutionCipher cipher = new SubstitutionCipher(latinAlphabet, substitutionAlphabet);

        System.out.println("Le texte après traitement est : " + cipher.encryptTextSubstitution(askEncryptOrDecrypt()));
    }

    // Consigne 6
    public static String encryptTextSubstitution(byte shouldEncrypt) {
        String originAlphabet;
        String subAlphabet;
        if (shouldEncrypt == 1) {
            originAlphabet = latinAlphabet;
            subAlphabet = askForSubstitutionAlphabet();
        } else {
            originAlphabet = askForSubstitutionAlphabet();
            subAlphabet = latinAlphabet;
        }
        return cipher(askForText(), originAlphabet, subAlphabet, askForIterations());
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
        for (int alphabetIndex = 0; alphabetIndex < alphabet.length(); alphabetIndex++) {
            char currentChar = alphabet.charAt(alphabetIndex);
            if (alphabet.indexOf(currentChar) != alphabet.lastIndexOf(currentChar)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkUserAlphabetSize(String alphabet) {
        return alphabet.length() == 26;
    }

    public static String askForSubstitutionAlphabet() {
        String userSubstitutionAlphabet;
        short attempts = 0;

        do {
            System.out.println("Veuillez fournir votre alphabet de substitution : ");
            userSubstitutionAlphabet = scanner.nextLine().trim().toLowerCase();

            if (!checkUserAlphabetSize(userSubstitutionAlphabet)) {
                System.err.println("Votre alphabet ne contient pas 26 caractères.");
            } else if (!isOnlyLowercaseLettersAZ(userSubstitutionAlphabet)) {
                System.err.println("Votre alphabet doit contenir uniquement des lettres.");
            } else if (!isUniqueEachCharacter(userSubstitutionAlphabet)) {
                System.err.println("Au moins un caractère est en doublon.");
            } else {
                break;
            }

            attempts++;
        } while (attempts < MAX_ATTEMPTS);
        return userSubstitutionAlphabet;
    }

    // Consigne 5
    public static String processText(short encryptOrDecrypt) {
        String result;
        if (encryptOrDecrypt == 1) {
            result = cipher(askForText(), latinAlphabet, substitutionAlphabet, askForIterations());
        } else {
            result = cipher(askForText(), substitutionAlphabet, latinAlphabet, askForIterations());
        }
        return result;
    }

    public static int askForIterations() {
        byte attempts = 0;
        int iterations;
        do {
            System.out.print("Combien de fois souhaitez-vous chiffrer votre texte : ");
            iterations = scanner.nextInt();
            attempts++;
            if (iterations >= 1) {
                break;
            }
            if (attempts >= MAX_ATTEMPTS) {
                System.err.println("Nombre de tentatives dépassé. Votre texte sera traité 1 fois.");
                iterations = 1;
            } else {
                System.out.println("La valeur saisie n'est pas correcte, veuillez réessayer.");
            }
        } while (attempts < MAX_ATTEMPTS);
        scanner.nextLine();
        return iterations;
    }

    public static byte askEncryptOrDecrypt() {
        byte attempts = 0;
        byte shouldEncrypt;

        do {
            System.out.print("Souhaitez-vous chiffrer votre texte (1) ou le déchiffrer (2) : ");
            shouldEncrypt = scanner.nextByte();
            scanner.nextLine();
            attempts++;

            if (attempts >= MAX_ATTEMPTS) {
                System.err.println("Nombre de tentatives dépassé. Fermeture du programme.");
                scanner.nextLine();
            } else if (shouldEncrypt != 1 && shouldEncrypt != 2) {
                System.out.println("Valeur invalide.");
            } else {
                break;
            }

        } while (attempts < MAX_ATTEMPTS);
        return shouldEncrypt;
    }

    public static String askForText() {
        System.out.print("Texte à chiffrer/déchiffrer : ");
        String text = scanner.nextLine().trim().toLowerCase();
        return text;
    }

    // Consigne 4
    public static String cipher(String textToEncrypt, String originAlphabet, String substitutionAlphabet, int cipherIterations) {
        SubstitutionCipher cipher = new SubstitutionCipher(originAlphabet, substitutionAlphabet);
        String encryptedText = "";
        // Si je n'initialise pas encryptedText, j'ai => :170:16 java: variable encryptedText might not have been initialized
        for (int iteration = 0; iteration < cipherIterations; iteration++) {
            encryptedText = cipher(textToEncrypt, originAlphabet, substitutionAlphabet);
            textToEncrypt = encryptedText;
        }
        return encryptedText;
    }

    // Consigne 3
    public static String cipher(String textToEncrypt, String originAlphabet, String substitutionAlphabet) {
        SubstitutionCipher cipher = new SubstitutionCipher(originAlphabet, substitutionAlphabet);

        String encryptedText = "";

        for (int textIndex = 0; textIndex < textToEncrypt.length(); textIndex++) {

            char currentChar = textToEncrypt.charAt(textIndex);
            int currentCharIndex = originAlphabet.indexOf(currentChar);

            if (currentCharIndex >= 0) {
                currentChar = substitutionAlphabet.charAt(currentCharIndex);
            }
            encryptedText += currentChar;
        }
        return encryptedText;
    }

    // ✅ Consigne 2 : correction replaceAll sans "double chiffrement"
    public static String encryptTextV2(String text) {
        String encryptedText = text;

        for (int index = 0; index < latinAlphabet.length(); index++) {
            String sourceLetter = String.valueOf(latinAlphabet.charAt(index));
            String marker = "%" + index + "%";
            encryptedText = encryptedText.replaceAll(sourceLetter, marker);
        }

        for (int index = 0; index < substitutionAlphabet.length(); index++) {
            String marker = "%" + index + "%";
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
