package javacore.chapter04.function.exercise.project.refactor;

public class AgeBasedDiscountFunctionRefactor {

    public static void main(String[] args) {

        // -1, 0, 25, 26, 64, 65
        int age = 70;
        // -1, 0, 50
        double price = 50;

        if (!isAgeValid(age)) {
            System.out.println("L'âge ne peut pas être négatif. Age: " + age);
        } else if (!isPriceValid(price)) {
            System.out.println("Le prix ne peut pas être négatif. Prix: " + price);
        } else {
            displayPriceWithDiscounRate(price, age);
        }
    }

    public static boolean isAgeValid(int age) {
        if (age < 0) {
            //displayAgeErrorMsg(age);
            return false;
        }
        System.out.println("Votre âge est de " + age + " an(s).");
        return true;
    }

    public static boolean isPriceValid(double price) {
        if (price < 0) {
            //displayPriceErrorMsg(price);
            return false;
        }
        System.out.println("Le prix sans la réduction est de " + price + " €.");
        return true;
    }

    public static double discountRateCalculation(int age) {
        double discountRate = 0;
        if (age <= 25) {
            return discountRate = 0.25;
        } else if (age >= 65) {
            return discountRate = 0.75;
        }
        return discountRate = 0.00;
    }

    public static double priceWithDiscountRateCalculation(double price, int age) {
        double discountRate = discountRateCalculation(age);
        price = price - (price * discountRate);
        return price;
    }

    public static void displayPriceWithDiscounRate(double price, int age) {
        System.out.println("Le prix après application du taux de réduction de " + discountRateCalculation(age) + " est de : " + priceWithDiscountRateCalculation(price, age) + " €.");
    }

}