package javacore.chapter04.function.exercise.projet.refactor;

public class AgeBasedDiscountFunctionRefactor {

    public static void main(String[] args) {

        // -1, 0, 25, 26, 64, 65
        int age = 65;
        // -1, 0, 50
        double price = 50;

        if (!isAgeValid(age)) {
            displayAgeErrorMsg(age);
        } else if (!isPriceValid(price)) {
            displayPriceErrorMsg(price);
        } else {
            displayPriceWithDiscountRate(price, age);
        }
    }

    public static boolean isAgeValid(int age) {
        if (age < 0) {
            //displayAgeErrorMsg(age);
            return false;
        }
        displayAge(age);
        return true;
    }

    public static boolean isPriceValid(double price) {
        if (price < 0) {
            //displayPriceErrorMsg(price);
            return false;
        }
        displayPriceWithoutDiscountRate(price);
        return true;
    }

    public static void displayAgeErrorMsg(int age) {
        System.out.println("L'âge ne peut pas être négatif. Age: " + age);
    }

    public static void displayPriceErrorMsg(double price) {
        System.out.println("Le prix ne peut pas être négatif. Prix: " + price);
    }

    public static void displayAge(int age) {
        System.out.println("Votre âge est de " + age + " an(s).");
    }

    public static void displayPriceWithoutDiscountRate(double price) {
        System.out.println("Le prix sans la réduction est de " + price + " €.");
    }

    public static double discountRateCalculation(int age) {
        double discountRate = 0;
        if (age <= 25) {
            discountRate = 0.25;
        } else if (age >= 65) {
            discountRate = 0.75;
        }
        return discountRate;
    }

    public static void displayPriceWithDiscountRate(double price, int age) {
        double discountRate = discountRateCalculation(age);
        price = price - (price * discountRate);
        System.out.println("Le prix après application du taux de réduction de " + discountRate + " est de : " + price + " €.");
    }

}