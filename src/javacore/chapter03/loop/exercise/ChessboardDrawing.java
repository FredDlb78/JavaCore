package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main(String[] args) {

        int numberOfRows = 5;
        int numberOfColumns = numberOfRows;
        char sharp = '#';
        char space = ' ';
        char dot = '.';

        for (int currentRow = 1; currentRow <= numberOfRows; currentRow++) {

            for (int currentColumn = 1; currentColumn <= numberOfColumns; currentColumn++) {
                System.out.print(currentRow % 2 == currentColumn % 2 ? sharp : dot);
                System.out.print(space);
            }
            System.out.println();
        }
    }
}