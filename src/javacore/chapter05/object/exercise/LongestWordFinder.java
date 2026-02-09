package javacore.chapter05.object.exercise;

public class LongestWordFinder {

    public static void main(String[] args) {

        String text = "a bb ccc ddddddddddd eeeeeeeeee fffffffff gggg hhhhh iiiiiiiiiiii jjjjjj kkkkkkk mmmmmmmm";        //System.out.println(text);

        // 1
        String[] part = text.split(" ");
/*        System.out.println(part[0]);
        System.out.println(part[1]);
        System.out.println(part[2]);*/

        // 2
        displayLongestWordAndLength(part);

        // 3
        int currentWordLength = 0;
        int maxLength = 0;
        int endIndexOfLongestWord = 0;
        int index = 0;

        for (index = 0; index < text.length(); index++) {
            if (text.charAt(index) != ' ') {
                currentWordLength++;
            } else {
                if (currentWordLength > maxLength) {
                    maxLength = currentWordLength;
                    endIndexOfLongestWord = index - 1;
//                    System.out.println("Le mot le plus long contient : " + maxLength);
//                    System.out.println("Le mot actuel contient : " + currentWordLength);
                }
                currentWordLength = 0;
            }
        }
        // Pour le cas où c'est le dernier mot (ne finit pas par un espace)
        if (currentWordLength > maxLength) {
            maxLength = currentWordLength;
            endIndexOfLongestWord = index - 1;
        }

        int startIndex = endIndexOfLongestWord - (maxLength - 1);

        System.out.print("Le mot le plus long est ");
        for (index = startIndex; index <= endIndexOfLongestWord; index++) {
            System.out.print(text.charAt(index));

        }
        System.out.print(".");
        //System.out.println("La fin du mot le plus long est à l'index : " + endIndexOfLongestWord);
        System.out.print(" Il contient " + maxLength + " lettres.");


    }


    public static String findLongestWord(String[] text) {
        String longestWord = text[0];

        for (int index = 1; index < text.length; index++) {

            String currentWord = text[index];

            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }
        return longestWord;
    }

    public static int countLetters(String word) {
        int wordLength = word.length();
        return wordLength;
    }

    public static void displayLongestWordAndLength(String[] text) {
        System.out.println("Le mot le plus long est " + findLongestWord(text) + ". Il contient " + countLetters(findLongestWord(text)) + " lettres.");
    }
}