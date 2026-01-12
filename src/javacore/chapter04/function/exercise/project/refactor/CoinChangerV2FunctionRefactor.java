package javacore.chapter04.function.exercise.project.refactor;

public class CoinChangerV2FunctionRefactor {

    public static void main(String[] args) {

        // -1, 0, 1, 2, 3, 12, 13, 32, 33, 82, 83
        int totalBill = 500;      // montant de la facture
        int amountPaid = 1500;    // montant payé

        // Valeurs des pièces et billets
        final int FIFTY_BILL = 50;
        final int TWENTY_BILL = 20;
        final int TEN_BILL = 10;
        final int TWO_COIN = 2;
        final int ONE_COIN = 1;

        // Stock disponible
        int fiftyBillStock = 4;
        int twentyBillStock = 1;
        int tenBillStock = 10;
        int twoCoinStock = 30;
        int oneCoinStock = 500;

        // Nombre de billets/pièces à rendre
        int fiftyBillsToBeReturned = 0;
        int twentyBillsToBeReturned = 0;
        int tenBillsToBeReturned = 0;
        int twoCoinsToBeReturned = 0;
        int oneCoinsToBeReturned = 0;

        displayValidationOfTotalBill(totalBill);
        displayValidationOfAmountPaid(amountPaid);
        displayAmountToBeReturned(amountPaid, totalBill);

        int amountToBeReturned = amountToBeReturnedCalculation(amountPaid, totalBill);

        if (!hasMoneyToReturn(amountToBeReturned)) {
            return;
        }

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

        displayMoneyToBeReturned(fiftyBillsToBeReturned, twentyBillsToBeReturned, tenBillsToBeReturned, twoCoinsToBeReturned,
                oneCoinsToBeReturned, FIFTY_BILL, TWENTY_BILL, TEN_BILL, TWO_COIN, ONE_COIN);

        // S'il reste un montant, c'est que le stock ne permettait pas de rendre le montant exact.
        if (amountToBeReturned > 0) {
            System.err.println("Attention : stock insuffisant. Reste non rendu : " + amountToBeReturned + "€");
        }
    }

    public static int getQuantityToReturn(int amountToBeReturned, int stock, final int VALUE) {
        int requested = amountToBeReturned / VALUE;

        if (requested > stock) {
            return stock;
        }
        return requested;
    }

    public static int getRemainingAmount(int amountToBeReturned, int value, int quantityReturned) {
        return amountToBeReturned - (value * quantityReturned);
    }

    public static boolean isValidTotalBill(int totalBill) {
        if (totalBill < 0) {
            return false;
        }
        return true;
    }

    public static void displayValidationOfTotalBill(int totalBill) {
        if (isValidTotalBill(totalBill) && totalBill == 0) {
            System.out.println("Vous n'avez rien à payer.");
        } else if (isValidTotalBill(totalBill)) {
            System.out.println("Le montant total de la facture est de " + totalBill + " €.");
        } else {
            System.err.println("Le montant de la facture ne peut pas être négatif.");
        }
    }

    public static boolean isValidAmountPaid(int amountPaid) {
        if (amountPaid <= 0) {
            return false;
        }
        return true;
    }

    public static void displayValidationOfAmountPaid(int amountPaid) {
        if (!isValidAmountPaid(amountPaid)) {
            System.err.println("Vous n'avez pas encore réglé");
        } else {
            System.out.println("Le montant que vous avez réglé est de " + amountPaid + " €");
        }
    }

    public static int amountToBeReturnedCalculation(int amountPaid, int totalBill) {
        return amountPaid - totalBill;
    }

    public static boolean hasMoneyToReturn(int amountToBeReturned) {
        return amountToBeReturned > 0;
    }


    public static void displayAmountToBeReturned(int amountPaid, int totalBill) {
        int amountToBeReturned = amountToBeReturnedCalculation(amountPaid, totalBill);

        if (amountToBeReturned < 0) {
            System.err.println("Vous avez réglé " + amountPaid + " € sur un total de " + totalBill +
                    " €. Vous devez encore régler " + (-amountToBeReturned) + " €.");
        } else if (amountToBeReturned == 0) {
            System.out.println("Vous avez payé le montant exact. Aucune monnaie à rendre.");
        } else {
            System.out.println("Montant à rendre : " + amountToBeReturned + "€");
        }
    }

    public static void displayMoneyToBeReturned(int fiftyBillsToBeReturned, int twentyBillsToBeReturned, int tenBillsToBeReturned,
                                                int twoCoinsToBeReturned, int oneCoinsToBeReturned,
                                                int FIFTY_BILL, int TWENTY_BILL, int TEN_BILL, int TWO_COIN, int ONE_COIN) {

        System.out.println("Monnaie à rendre :");
        System.out.println(fiftyBillsToBeReturned + " billet(s) de " + FIFTY_BILL + "€");
        System.out.println(twentyBillsToBeReturned + " billet(s) de " + TWENTY_BILL + "€");
        System.out.println(tenBillsToBeReturned + " billet(s) de " + TEN_BILL + "€");
        System.out.println(twoCoinsToBeReturned + " pièce(s) de " + TWO_COIN + "€");
        System.out.println(oneCoinsToBeReturned + " pièce(s) de " + ONE_COIN + "€");
    }
}
