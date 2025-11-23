package javacore.chapter02.condition.exercise;

public class AgeBasedDiscount {

    public static void main(String[] args) {

        // -1, 0, 25, 26, 64, 65
        int age = 65;
        // -1, 0, 50
        double price = 50;

        double youngDiscountRate = 0.25;
        double seniorDiscountRate = 0.75;
        double youngPrice = price - (price * youngDiscountRate);
        double seniorPrice = price - (price * seniorDiscountRate);
        String displayAge = "Votre âge est de " + age + " an(s).";

        if (age < 0) {
            System.err.println("Un age ne peut être négatif, votre âge ne peut pas être " + age + " an(s).");
        } else if (price < 0) {
            System.err.println("Le prix ne peut être négatif. Le prix est actuellement de " + price + "€.");
        } else if (age <= 25) {
            System.out.println(displayAge);
            System.out.println("Vous bénéficiez d'une réduction de " + youngDiscountRate * 100 + "%.");
            System.out.println("Le prix de votre billet de train est de " + youngPrice + "€.");
        } else if (age >= 65) {
            System.out.println(displayAge);
            System.out.println("Vous bénéficiez d'une réduction de " + seniorDiscountRate * 100 + "%.");
            System.out.println("Le prix de votre billet de train est de " + seniorPrice + "€.");
        } else {
            System.out.println(displayAge);
            System.out.println("Vous ne bénéficiez d'aucune réduction.");
            System.out.println("Le prix de votre billet de train est de " + price + "€.");
        }
    }
}