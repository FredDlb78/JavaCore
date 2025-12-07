package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args) {


        int number = 17;
        int divisor = 2;

        for (divisor = 2; number % divisor != 0; divisor++) {
            System.out.println(divisor + " n'est pas le plus petit diviseur de " + number + ".");
        }
        System.out.println("Le plus petit diviseur de " + number + " est : " + divisor + ".");

        if (number == divisor) {
            System.out.println(number + " est un nombre premier.");
        }

    }

}
