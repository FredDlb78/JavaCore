package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main(String[] args) {

        int numberOfRows = 5;
        int numberOfColumns = numberOfRows;
        char sharp = '#';
        char space = ' ';
        char dot = '.';

        for (int row = 1; row <= numberOfRows; row++) {

            for (int column = 1; column <= numberOfColumns; column++) {
                if (row % 2 == column % 2) {
                    System.out.print(sharp);
                } else {
                    System.out.print(dot);
                }
                System.out.print(space);
            }
            System.out.println();
        }
    }
}