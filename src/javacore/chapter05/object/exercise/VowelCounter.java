package javacore.chapter05.object.exercise;

public class VowelCounter {

    static String vowels = "aeiouy";

    public static void main(String[] args) {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String text2 = "Test Fred";
        displayVowels(text);

    }

    public static void displayVowels(String text) {
        for (int index = 0; index < vowels.length(); index++) {

            int count = countVowelWithIndexOf(vowels.charAt(index), text);
            if (count > 0) {
                System.out.println("La voyelle " + vowels.charAt(index) + " est présente " + count + " fois dans le texte.");
            } /*else {
                System.out.println("La voyelle " + vowels.charAt(index) + " n'est pas présente dans ce texte.");
            }*/
        }
    }

    public static int countVowel(char vowel, String text) {
        int count = 0;
        for (int textIndex = 0; textIndex < text.length(); textIndex++) {
            if (vowel == text.charAt(textIndex)) {
                count++;
            }
        }
        return count;
    }

    public static int countVowelWithIndexOf(char vowel, String text) {
        int count = 0;
        int index = text.indexOf(vowel, 0);
        while (index >= 0) {
            count++;
            //System.out.println("La voyelle " + vowel + " est présente à l'index " + index);
            index = text.indexOf(vowel, index + 1);
        }
        return count;
    }
}