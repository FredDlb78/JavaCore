package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args) {


        int number = 100;
        int divisor = 2;
        int i = 0;

        for (i = 1; i <= number; i++) {
            //System.out.println("Le nombre testé est : " + i);
            for (divisor = 2; i % divisor != 0; divisor++) {
                //System.out.println(divisor + " n'est pas le plus petit diviseur de " + number + ".");
            }
            //System.out.println("Le plus petit diviseur de " + i + " est : " + divisor + ".");

            if (i == divisor) {
                System.out.println(i + " est un nombre premier.");
            }
        }
        System.out.println("Il y'a 25 nombres premiers entre 1 et 100.");
    }
}