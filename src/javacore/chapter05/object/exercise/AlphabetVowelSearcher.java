package javacore.chapter05.object.exercise;

public class AlphabetVowelSearcher {

    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiouy";

        // Consignes 1 & 2 : recherche manuelle avec charAt
        for (int index = 0; index < alphabet.length(); index++) {
            for (int index2 = 0; index2 < vowels.length(); index2++) {
                if (alphabet.charAt(index) == vowels.charAt(index2)) {
                    System.out.println("La lettre à la position " + (index + 1) + " est la voyelle : " + alphabet.charAt(index));
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