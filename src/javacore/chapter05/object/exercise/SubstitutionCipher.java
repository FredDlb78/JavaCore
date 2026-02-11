package javacore.chapter05.object.exercise;

public class SubstitutionCipher {

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
        System.out.println(encryptText(textToEncrypt));
        System.out.println(encryptTextV2(textToEncrypt));

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