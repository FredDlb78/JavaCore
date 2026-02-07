package javacore.chapter05.object.exercise;

public class ReversedString {

    public static void main(String[] args) {

        String text = "! ecicrexe'l issuér zeva suov ,ovarB";

        // Ecrivez le code ci-dessous

        displayAStringReversed(text);
    }

    public static void displayAStringReversed(String text) {
        for (int index = text.length() - 1; index >= 0; index--) {
            System.out.print(text.charAt(index));
        }
    }
}