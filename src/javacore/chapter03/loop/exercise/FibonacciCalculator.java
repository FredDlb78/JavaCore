package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {
    public static void main(String[] args) {

        int previousValue = 0;
        int value = 1;

        // Suite: 0 1 1 2 3 5 8 13 21

        for (int i = 2; i <= 50; i++) {
            System.out.println(i);
            i += (i -1);
            //System.out.println(i);
        }



    }
}