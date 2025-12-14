package javacore.chapter03.loop.exercise;

public class MultiplicationTables {

    public static void main(String[] args) {

        int maxTableToDisplay = 9;

        for (int numberToBeMultiplied = 1; numberToBeMultiplied <= maxTableToDisplay; numberToBeMultiplied++) {
            System.out.println();
            System.out.println("Table de " + numberToBeMultiplied + " : ");
            System.out.println();
//            int result = numberToBeMultiplied * numberMultiplier;
//            System.out.println(numberToBeMultiplied + " * " + numberMultiplier + " = " + result);
            for (int numberMultiplier = 1; numberMultiplier <= maxTableToDisplay; numberMultiplier++) {
//                System.out.println("Table de " + numberToBeMultiplied);
                int result = numberToBeMultiplied * numberMultiplier;
                System.out.println(numberToBeMultiplied + " * " + numberMultiplier + " = " + result);
            }
        }

        System.out.println();

        for (int numberToBeMultiplied = 1; numberToBeMultiplied <= maxTableToDisplay; numberToBeMultiplied++) {
            System.out.print("Table de " + numberToBeMultiplied + " : ");

            for (int numberMultiplier = 1; numberMultiplier <= maxTableToDisplay; numberMultiplier++) {
                int result = numberToBeMultiplied * numberMultiplier;
                System.out.print(" " + result);
            }
            System.out.println();
        }

    }
}