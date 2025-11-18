package javacore.chapter01.variable.exercise;

public class VariablesPermutation {

    public static void main(String[] args) {

        int a = 30;
        System.out.println("valeur intiale de a: " + a);
        int b = 55;
        System.out.println("valeur intiale de b: " + b);
        int c = a;

        a = b;
        b = c;

        System.out.println("valeur de a: " + a);
        System.out.println("valeur de b: " + b);
        //System.out.println("valeur de c: " + c);

    }
}
