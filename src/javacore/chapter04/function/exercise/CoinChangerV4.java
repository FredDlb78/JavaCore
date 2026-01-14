package javacore.chapter04.function.exercise;

public class CoinChangerV4 {

    static final int FIFTY_BILL = 50;
    static final int TWENTY_BILL = 20;
    static final int TEN_BILL = 10;
    static final int TWO_COIN = 2;
    static final int ONE_COIN = 1;

    public static void main(String[] args) {

        int totalBill  = 100;
        int amountPaid = 367;

        // Stock dispo
        int fiftyBillStock = 2;
        int twentyBillStock = 1;
        int tenBillStock = 10;
        int twoCoinStock = 30;
        int oneCoinStock = 500;

        checkAndDisplayTotalBill(totalBill);
        checkAndDisplayAmountPaid(amountPaid);

        int amountToBeReturned = calculateAmountToBeReturned(amountPaid, totalBill);
        displayAmountToBeReturned(amountToBeReturned, amountPaid, totalBill);

        if (amountToBeReturned <= 0) {
            return;
        }

        // Nombre de billets/pièces à rendre
        int fiftyBillsToBeReturned;
        int twentyBillsToBeReturned;
        int tenBillsToBeReturned;
        int twoCoinsToBeReturned;
        int oneCoinsToBeReturned;

        // ---- Billets de 50 ----
        fiftyBillsToBeReturned = getQuantityToReturn(amountToBeReturned, FIFTY_BILL, fiftyBillStock);
        amountToBeReturned = getRemainingAmount(amountToBeReturned, FIFTY_BILL, fiftyBillsToBeReturned);

        // ---- Billets de 20 ----
        twentyBillsToBeReturned = getQuantityToReturn(amountToBeReturned, TWENTY_BILL, twentyBillStock);
        amountToBeReturned = getRemainingAmount(amountToBeReturned, TWENTY_BILL, twentyBillsToBeReturned);

        // ---- Billets de 10 ----
        tenBillsToBeReturned = getQuantityToReturn(amountToBeReturned, TEN_BILL, tenBillStock);
        amountToBeReturned = getRemainingAmount(amountToBeReturned, TEN_BILL, tenBillsToBeReturned);

        // ---- Pièces de 2 ----
        twoCoinsToBeReturned = getQuantityToReturn(amountToBeReturned, TWO_COIN, twoCoinStock);
        amountToBeReturned = getRemainingAmount(amountToBeReturned, TWO_COIN, twoCoinsToBeReturned);

        // ---- Pièces de 1 ----
        oneCoinsToBeReturned = getQuantityToReturn(amountToBeReturned, ONE_COIN, oneCoinStock);
        amountToBeReturned = getRemainingAmount(amountToBeReturned, ONE_COIN, oneCoinsToBeReturned);

        // Total rendu
        int totalReturned = fiftyBillsToBeReturned  * FIFTY_BILL  +
                            twentyBillsToBeReturned * TWENTY_BILL +
                            tenBillsToBeReturned    * TEN_BILL    +
                            twoCoinsToBeReturned    * TWO_COIN    +
                            oneCoinsToBeReturned    * ONE_COIN;

        System.out.println("Monnaie rendue : " + totalReturned + " €.");

        // Résultat final
        System.out.println("Monnaie à rendre :");
        System.out.println(fiftyBillsToBeReturned  + " billet(s) de " + FIFTY_BILL  + " €.");
        System.out.println(twentyBillsToBeReturned + " billet(s) de " + TWENTY_BILL + " €.");
        System.out.println(tenBillsToBeReturned    + " billet(s) de " + TEN_BILL    + " €.");
        System.out.println(twoCoinsToBeReturned    + " pièce(s) de "  + TWO_COIN    + " €.");
        System.out.println(oneCoinsToBeReturned    + " pièce(s) de "  + ONE_COIN    + " €.");

        // Si pas assez de stock pour rendre la monnaie =>
        if (amountToBeReturned > 0) {
            System.out.println("Attention : il manque " + amountToBeReturned + "€ à rendre (stock insuffisant).");
        }
    }

    public static void checkAndDisplayTotalBill(int totalBill) {
        if (totalBill < 0) {
            System.out.println("Le montant de la facture ne peut pas être négatif.");
        } else if (totalBill == 0) {
            System.out.println("Vous n'avez rien à payer.");
        } else {
            System.out.println("Le montant total de la facture est de " + totalBill + " €.");
        }
    }

    public static void checkAndDisplayAmountPaid(int amountPaid) {
        if (amountPaid <= 0) {
            System.out.println("Le montant payé doit être positif.");
        } else {
            System.out.println("Le montant que vous avez payé est de " + amountPaid + " €");
        }
    }

    public static int calculateAmountToBeReturned(int amountPaid, int totalBill) {
        return amountPaid - totalBill;
    }

    public static void displayAmountToBeReturned(int amountToBeReturned, int amountPaid, int totalBill) {
        if (amountToBeReturned < 0) {
            System.out.println("Vous avez réglé " + amountPaid + " € sur un total de " + totalBill +
                    " €. Vous devez encore régler " + (-amountToBeReturned) + " €.");
        } else if (amountToBeReturned == 0) {
            System.out.println("Vous avez payé le montant exact. Aucune monnaie à rendre.");
        } else {
            System.out.println("Montant à rendre : " + amountToBeReturned + " €.");
        }
    }

    public static int getQuantityToReturn(int amountToBeReturned, int value, int stock) {
        int requested = amountToBeReturned / value;
        return Math.min(requested, stock);
    }

    public static int getRemainingAmount(int amountToBeReturned, int value, int quantityReturned) {
        return amountToBeReturned - (value * quantityReturned);
    }
}