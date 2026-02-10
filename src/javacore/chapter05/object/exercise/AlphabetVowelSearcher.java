package javacore.chapter05.object.exercise;

public class AlphabetVowelSearcher {

    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiouy";

        // Consignes 1 & 2 : recherche manuelle avec charAt
        for (int alphaIndex = 0; alphaIndex < alphabet.length(); alphaIndex++) {
            for (int vowelsIndex = 0; vowelsIndex < vowels.length(); vowelsIndex++) {
                if (alphabet.charAt(alphaIndex) == vowels.charAt(vowelsIndex)) {
                    System.out.println("La lettre à la position " + (alphaIndex + 1) + " est la voyelle : " + alphabet.charAt(alphaIndex));
                }
            }
        }

        System.out.println();

        // Consigne 3 : recherche avec indexOf
/*         Je n'ai pas réussi à faire sans la méthode charAt(), je ne sais pas s'il fallait faire seulement avec indexOf().
         Comme ce n'était pas indiqué, je me suis permis d'utiliser les 2 :)*/
        for (int index = 0; index < vowels.length(); index++) {
            char vowel = vowels.charAt(index);
            int position = alphabet.indexOf(vowel);

            if (position >= 0) {
                System.out.println("La lettre " + vowels.charAt(index) + " est à la position " + (position + 1));
            }
        }
    }
}