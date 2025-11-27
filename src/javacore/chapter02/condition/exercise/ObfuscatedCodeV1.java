package javacore.chapter02.condition.exercise;

public class ObfuscatedCodeV1 {

    public static void main(String[] args) {

        int b = 1; // Type de véhicule (1 = XXX, 2 = YYY, 3 = ZZZ)

        double a = 100; // Distance

        boolean e = true;
        double d = 0.03;

        double c = 0;

        if (b == 1) {
            c = a * 0.10;
        }
        if (b == 2) {
            c = a * 0.20;
        }
        if (b == 3) {
            c = a * 0.35;
        }
        if (e) {
            c = c - (a * d);
        }

        System.out.println("___________ : " + c + "€");

    }
}
