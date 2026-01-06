package javacore.chapter04.function.exercise.project.refactor;

public class HalfPyramidFunctionRefactor {

    public static void main(String[] args) {

        int numberOfRows = 12;
        displayHalfPyramid(numberOfRows);
    }

    public static void displayHalfPyramid(int numberOfRows) {
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
