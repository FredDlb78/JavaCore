package javacore.chapter04.function.exercise;

public class FunctionOverload {
    public static void main(String[] args) {

        int a = 58;
        int b = 2;
        int c = 3;

        System.out.println("La somme de " + a + " + " + b + " est égale à " + sum(a, b));

        System.out.println("La somme de " + a + " + " + b + " + " + c + " est égale à " + sum(a, b, c));

    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum(int number1, int number2, int number3) {
        return sum(sum(number1, number2), number3);
    }

}