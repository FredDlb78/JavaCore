package javacore.chapter04.function.exercise;

public class RecursiveFunction {

    public static void main(String[] args) {

        int a = 1;
        int limit = 10000;
        displayNumbers(a, limit);
    }

    public static void displayNumbers(int a, int limit) {
        int b = a + 1;

        System.out.println(a);
        if (b > limit) {
            return;
        }
        displayNumbers(b, limit);
    }
}