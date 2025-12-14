package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main(String[] args) {

        int numberOfRows = 5;
        int numberOfColumns = numberOfRows;
        char sharp = '#';
        char space = ' ';
        char dot = '.';

        for (int i = 1; i <= numberOfRows; i++) {

            for (int j = 1; j <= numberOfColumns; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print(sharp);
                        System.out.print(space);
                    } else {
                        System.out.print(dot);
                        System.out.print(space);
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print(dot);
                        System.out.print(space);
                    } else {
                        System.out.print(sharp);
                        System.out.print(space);
                    }
                }
            }
            System.out.println();
        }
    }
}