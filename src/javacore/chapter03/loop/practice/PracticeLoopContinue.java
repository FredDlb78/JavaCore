package javacore.chapter03.loop.practice;

public class PracticeLoopContinue {

    public static void main (String[] args) {

        for (int number = 0; number < 100; number++) {

            if (number % 2 != 0) {
                continue;
            }
            System.out.println(number);
        }
    }
}