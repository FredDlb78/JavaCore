package javacore.chapter05.object.practice;

public class PracticeVariableDefault {

    int integer;
    double comma;
    boolean trueOrFalse;
    char caracter;

    String textValue;

    public static void main (String[]args) {

        PracticeVariableDefault testDefaultValueObject = new PracticeVariableDefault();

        System.out.println("Entier : " + testDefaultValueObject.integer);
        System.out.println("Virgule : " + testDefaultValueObject.comma);
        System.out.println("Booléen : " + testDefaultValueObject.trueOrFalse);
        System.out.println("Charactère : " + testDefaultValueObject.caracter);
        System.out.println("Objet : " + testDefaultValueObject.textValue);

        testDefaultValueObject.textValue = "TEST";
        testDefaultValueObject.textValue.toLowerCase();

        System.out.println("Objet : " + testDefaultValueObject.textValue);

    }
}
