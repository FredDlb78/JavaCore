package javacore.chapter04.function.exercise.project.refactor;

public class MultiplicationTablesFunctionRefactor {

    public static void main(String[] args) {
        int maxTableToDisplay = 9;

        displayMultiplicationTables(maxTableToDisplay);
        System.out.println();
        displayMultiplicationTablesInLine(maxTableToDisplay);
    }

    public static void displayMultiplicationTables(int maxTable) {
        for (int table = 1; table <= maxTable; table++) {
            displaySingleTable(table, maxTable);
        }
    }

    public static void displaySingleTable(int table, int maxMultiplier) {
        System.out.println();
        System.out.println("Table de " + table + " : ");
        System.out.println();

        for (int multiplier = 1; multiplier <= maxMultiplier; multiplier++) {
            int result = multiply(table, multiplier);
            System.out.println(table + " * " + multiplier + " = " + result);
        }
    }

    public static void displayMultiplicationTablesInLine(int maxTable) {
        for (int table = 1; table <= maxTable; table++) {
            displaySingleTableInLine(table, maxTable);
        }
    }

    public static void displaySingleTableInLine(int table, int maxMultiplier) {
        System.out.print("Table de " + table + " : ");

        for (int multiplier = 1; multiplier <= maxMultiplier; multiplier++) {
            int result = multiply(table, multiplier);
            System.out.print(" " + result);
        }
        System.out.println();
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
