package javacore.chapter03.loop.exercise;

public class AlphabetPrinter {

    public static void main(String[] args) {

        char letter = 'A';

        while (letter <= 90) {
            System.out.println(letter);
            letter++;
        }

        System.out.println("-------------------------");
        // Valeur trouvée grâce à la première boucle en remplaçant le 90 par 150
        letter = 'a';

        while (letter <= 122) {
            System.out.println(letter);
            letter++;
        }

    }


}
