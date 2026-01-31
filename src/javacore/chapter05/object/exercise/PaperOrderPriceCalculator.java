package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class PaperOrderPriceCalculator {

    static Scanner sc = new Scanner(System.in);

    static int sheetsRequired = 0;
    static final int MIN_SHEETS_REQUIRED = 200;
    static final int MAX_SHEETS_REQUIRED = 200000;

    static final int FIRST_INSTALLMENT_LIMIT_LOW = MIN_SHEETS_REQUIRED;
    static final int FIRST_INSTALLMENT_LIMIT_HIGH = 10000;
    static final int SECOND_INSTALLMENT_LIMIT_HIGH = 30000;
    static final int THIRD_INSTALLMENT_LIMIT_HIGH = MAX_SHEETS_REQUIRED;

    static final double FIRST_INSTALLEMENT_PRICE_BY_SHEET = 0.01;
    static final double SECOND_INSTALLEMENT_PRICE_BY_SHEET = FIRST_INSTALLEMENT_PRICE_BY_SHEET * 50 / 100;
    static final double THIRD_INSTALLEMENT_PRICE_BY_SHEET = FIRST_INSTALLEMENT_PRICE_BY_SHEET * 25 / 100;

    static final int FREE_DELIVERY_LIMIT_PRICE = 200;
    static final double DELIVERY_FEES = 9.99;
    static double priceIncludingDeliveryFees = 0;

    static double priceExcludingTax = 0;
    static final double TVA = 0.20;
    static double priceIncludingTax = 0;

    public static void main(String[] args) {
        byte attempts = 0;
        final byte MAX_ATTEMPTS = 5;

        do {
            setSheetsRequiredNumber();
            attempts++;

            if (!isCorrectSheetsRequired(sheetsRequired)) {
                System.out.println("Valeur invalide.");
            }

        } while (!isCorrectSheetsRequired(sheetsRequired) && attempts < MAX_ATTEMPTS);

        if (!isCorrectSheetsRequired(sheetsRequired)) {
            System.out.println("Nombre de tentatives maximum atteint.");
            return;
        }

        calculatePrixeExcludingTax();
        displayPriceExcludingTax();

        calculateDeliveryFees();
        displayPriceIncludingDeliveryFees();

        calculatePriceIncludingTax();
        displayPriceIncludingTax();
    }

    public static void setSheetsRequiredNumber() {
        System.out.print("Veuillez saisir le nombre de feuilles souhaitées (entre " + MIN_SHEETS_REQUIRED + " et " + MAX_SHEETS_REQUIRED + ") :");
        sheetsRequired = sc.nextInt();
        sc.nextLine();
    }

    public static boolean isCorrectSheetsRequired(int sheetsRequired) {
        if (sheetsRequired < MIN_SHEETS_REQUIRED || sheetsRequired > MAX_SHEETS_REQUIRED) {
            return false;
        } else {
            return true;
        }
    }

    public static double calculatePrixeExcludingTax() {
        if (sheetsRequired <= FIRST_INSTALLMENT_LIMIT_HIGH) {
            priceExcludingTax = sheetsRequired * FIRST_INSTALLEMENT_PRICE_BY_SHEET;
        } else if (sheetsRequired <= SECOND_INSTALLMENT_LIMIT_HIGH) {
            priceExcludingTax = FIRST_INSTALLMENT_LIMIT_HIGH * FIRST_INSTALLEMENT_PRICE_BY_SHEET +
                    (sheetsRequired - FIRST_INSTALLMENT_LIMIT_HIGH) * SECOND_INSTALLEMENT_PRICE_BY_SHEET;
        } else if (sheetsRequired <= THIRD_INSTALLMENT_LIMIT_HIGH) {
            priceExcludingTax = FIRST_INSTALLMENT_LIMIT_HIGH * FIRST_INSTALLEMENT_PRICE_BY_SHEET +
                    (SECOND_INSTALLMENT_LIMIT_HIGH - FIRST_INSTALLMENT_LIMIT_HIGH) * SECOND_INSTALLEMENT_PRICE_BY_SHEET +
                    (sheetsRequired - SECOND_INSTALLMENT_LIMIT_HIGH) * THIRD_INSTALLEMENT_PRICE_BY_SHEET;
        } else {
            System.out.println("Cas auquel je n'ai pas pensé.");
            return 0;
        }
        return priceExcludingTax;
    }

    public static double calculatePriceIncludingTax() {
        priceIncludingTax = priceIncludingDeliveryFees + priceIncludingDeliveryFees * TVA;
        return priceIncludingTax;
    }

    public static double calculateDeliveryFees() {
        if (priceExcludingTax <= FREE_DELIVERY_LIMIT_PRICE) {
            priceIncludingDeliveryFees = priceExcludingTax + DELIVERY_FEES;
        } else {
            priceIncludingDeliveryFees = priceExcludingTax;
        }
        return  priceIncludingDeliveryFees;
    }

    public static void displayPrice(String priceType, double priceValue) {
        System.out.println("Le prix " + priceType + " est de " + priceValue + " euros pour " + sheetsRequired + " feuilles.");
    }

    public static void displayPriceExcludingTax() {
        displayPrice("HT", priceExcludingTax);
    }

    public static void displayPriceIncludingTax() {
        displayPrice("TTC", priceIncludingTax);
    }

    public static void displayPriceIncludingDeliveryFees() {
        displayPrice("HT + frais de livraison", priceIncludingDeliveryFees);
    }
}