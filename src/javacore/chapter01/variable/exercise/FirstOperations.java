package javacore.chapter01.variable.exercise;

public class FirstOperations {

    public static void main (String []args) {

        System.out.println("N°1 ---------");

        int a = 6;
        int b = 3;

        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;

        System.out.println("La somme de a et b = " + sum);
        System.out.println("La soustraction de a par b = " + subtraction);
        System.out.println("La multiplication de a par b = " + multiplication);
        System.out.println("La division de a par b = " + division);

        System.out.println("N°2 ---------");

        int c = 4;
        int d = 5;

        c += d;
        // c = c + d
        System.out.println("c est maintenant égal à " + c);
        d -= 5;
        // d = d - 5
        System.out.println("d est maintenant égal à " + d);
        c *= 3;
        // c = c * 3
        System.out.println("c est maintenant égal à " + c);
        d /= 3;
        // d = d / 3
        System.out.println("d est maintenant égal à " + d);

        System.out.println("N°3 ---------");

        int e = 1 * 5 + 2;
        System.out.println("e = " + e);
        // e = 7
        int f = 1 * (5 + 2);
        // f = 7
        System.out.println("f = " + f);
        int g = ((2 * 5) - 2 / (4 - 2)) - 1;
        // g = 10 - 2 / 2 -1 = 10 -1 - 1 = 8
        System.out.println("g = " + g);

    }
}
