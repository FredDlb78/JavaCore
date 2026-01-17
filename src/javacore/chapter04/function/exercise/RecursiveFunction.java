package javacore.chapter04.function.exercise;

public class RecursiveFunction {

    public static void main(String[] args) {

        int a = 1;
        final int limit = 10000;
        displayNumbers(a, limit);
    }

    public static void displayNumbers(int a, final int LIMIT) {
        if (a > LIMIT) {
            return;
        }
        int b = a + 1;

        System.out.println(a);

        displayNumbers(b, LIMIT);
    }
}