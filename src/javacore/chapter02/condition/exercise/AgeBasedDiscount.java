package javacore.chapter02.condition.exercise;

public class AgeBasedDiscount {

    public static void main(String[] args) {

        // -1, 0, 25, 26, 64, 65
        int age = 65;
        // -1, 0, 50
        double price = 50;

        double discountRate = 0;
        String displayAge = "Votre âge est de " + age + " an(s).";

        String errMsg = "Le prix et/ou l'age ne peuvent pas être négatif. Prix: " + price + " , Age: " + age + ".";

        if (age < 0) {
            System.err.println(errMsg);
        } else if (price < 0) {
            System.err.println(errMsg);
        } else {
            if (age <= 25) {
                discountRate = 0.25;
                price = price - (price * discountRate);
            } else if (age >= 65) {
                discountRate = 0.75;
                price = price - (price * discountRate);
            }
            System.out.println(displayAge);
            System.out.println("Vous bénéficiez d'une réduction de " + discountRate * 100 + "%.Le prix de votre billet de train est de " + price + "€.");
        }
    }
}