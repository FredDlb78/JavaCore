package javacore.chapter02.condition.exercise;

public class NumberComparison {

    public static void main(String[] args) {

        int number1 = 30;
        int number2 = -121;

        if (number1 > number2) {
            System.out.println("Le nombre " + number1 + " est plus grand que le nombre " + number2);
        } else if (number1 < number2) {
            System.out.println("Le nombre " + number1 + " est plus petit que le nombre " + number2);
        } else {
            System.out.println("Les nombres number1 et number2 ont la même valeur " + number1);
        }

    }
}
