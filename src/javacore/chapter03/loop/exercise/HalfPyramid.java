package javacore.chapter03.loop.exercise;

public class HalfPyramid {

    public static void main(String[] args) {

        int numberOfRows = 6;
        char asterix = '*';

        for (int i = 1; i <= numberOfRows; i++) {

            for (int j = 1; j <= i; j++) {

                //asterix += asterix;
                System.out.print(asterix);
            }
            System.out.println();
        }
    }
}
