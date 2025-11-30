package javacore.chapter02.condition.exercise;

public class MaxOfThree {

    public static void main(String[] args) {

        int a = 4;
        int b = 5;
        int c = 6;

        if (a == b && a == c) {
            System.err.println("Toutes les valeurs sont égales, il n'y en a pas une plus grande que les autres. Valeur des variables: " + a);
        } else if (a == b) {
            System.err.println("Les valeurs de a et b sont égales. Valeur de a et b : " + a);
        } else if (a == c) {
            System.err.println("Les valeurs de a et c sont égales. Valeur de a et c : " + a);
        } else if (b == c) {
            System.err.println("Les valeurs de b et c sont égales. Valeur de b et c : " + b);
        } else if (a > b && a > c) {
            System.out.println("Le plus grand nombre est a. Valeur de a: " + a);
        } else if (b > a && b > c) {
            System.out.println("Le plus grand nombre est b. Valeur de b: " + b);
        } else if (c > a && c > b) {
            System.out.println("Le plus grand nombre est c. Valeur de c: " + c);
        } else {
            System.err.println( "Ceci est un cas auquel je n'ai pas pensé :) .");
        }

    }

}
