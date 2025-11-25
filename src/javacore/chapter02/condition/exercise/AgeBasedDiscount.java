package javacore.chapter02.condition.exercise;

public class AgeBasedDiscount {

    public static void main(String[] args) {

        // -1, 0, 25, 26, 64, 65
        int age = 25;
        // -1, 0, 50
        double price = 50;

        double discountRate = 0;
        String displayAge = "Votre âge est de " + age + " an(s).";

        if (age <= 25) {
            discountRate  = 0.25;
            price = price - (price * discountRate);
        } else if (age >= 65) {
            discountRate = 0.75;
            price = price - (price * discountRate);
        } else {
        }

        String discounRateMsg = "Vous bénéficiez d'une réduction de " + discountRate * 100 + "%.";
        String priceMsg = "Le prix de votre billet de train est de " + price + "€.";
        String errMsg = "Le prix et/ou l'age ne peuvent pas être négatif. Prix: " + price + " , Age: " + age + ".";

        if (age < 0) {
            System.err.println(errMsg);
        } else if(price < 0) {
            System.err.println(errMsg);
        } else {
            System.out.println(displayAge);
            System.out.println(discounRateMsg);
            System.out.println(priceMsg);
        }
    }
}