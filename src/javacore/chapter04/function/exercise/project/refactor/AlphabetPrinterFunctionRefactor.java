package javacore.chapter04.function.exercise.project.refactor;

public class AlphabetPrinterFunctionRefactor {

    public static void main(String[] args) {

        printAlphabet('A', 'Z');

        System.out.println("-------------------------");

        printAlphabet('a', 'z');

    }

    public static void printAlphabet(char start, char end) {
        char letter = start;

        while (letter <= end) {
            System.out.println(letter);
            letter++;
        }
    }
}