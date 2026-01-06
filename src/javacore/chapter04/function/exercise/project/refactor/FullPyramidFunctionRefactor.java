package javacore.chapter04.function.exercise.project.refactor;

public class FullPyramidFunctionRefactor {

    public static void main(String[] args) {

        int numberOfRows = 50;
        displayFullPymarid(numberOfRows);

    }

    public static void displayFullPymarid(int numberOfRows) {
        char space = ' ';
        char asterisk = '*';

        for (int currentRow = 1; currentRow <= numberOfRows; currentRow++) {

            for (int i = 1; i <= numberOfRows - currentRow; i++) {
                System.out.print(space);
            }
            for (int j = 1; j <= 2 * currentRow - 1; j++) {
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }
}