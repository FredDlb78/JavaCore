package javacore.chapter04.function.exercise.project.refactor;

public class CoinChangerV3FunctionRefactor {

    public static void main(String[] args) {

        // Valeurs des pièces et billets
        final int FIFTY_BILL = 50;
        final int TWENTY_BILL = 20;
        final int TEN_BILL = 10;
        final int TWO_COIN = 2;
        final int ONE_COIN = 1;

        // -1, 0, 1, 2, 3, 12, 13, 32, 33, 82, 83
        int totalBill = 1000;   // montant de la facture
        int amountPaid = 1183;  // montant payé

        displayTotalBill(totalBill);
        displayAmountPaid(amountPaid);

        int amountToBeReturned = calculateChangeAmount(amountPaid, totalBill);
        displayAmountToBeReturned(amountToBeReturned, amountPaid, totalBill);

        if (amountToBeReturned <= 0) {
            return;
        }

        amountToBeReturned = calculateAndDisplayChangeForValue(amountToBeReturned, FIFTY_BILL, "billet(s)");
        amountToBeReturned = calculateAndDisplayChangeForValue(amountToBeReturned, TWENTY_BILL, "billet(s)");
        amountToBeReturned = calculateAndDisplayChangeForValue(amountToBeReturned, TEN_BILL, "billet(s)");
        amountToBeReturned = calculateAndDisplayChangeForValue(amountToBeReturned, TWO_COIN, "pièce(s)");
        amountToBeReturned = calculateAndDisplayChangeForValue(amountToBeReturned, ONE_COIN, "pièce(s)");
    }

    public static boolean isTotalBillEqualToZero(int totalBill) {
        return totalBill == 0;
    }

    public static boolean isAmountPaidEqualToZero(int amountPaid) {
        return amountPaid == 0;
    }

    // Affichages
    public static void displayTotalBill(int totalBill) {
        if (isTotalBillEqualToZero(totalBill)) {
            System.out.println("Vous n'avez rien à payer.");
        } else {
            System.out.println("Le montant total de la facture est de " + totalBill + " €.");
        }
    }

    public static void displayAmountPaid(int amountPaid) {
        if (isAmountPaidEqualToZero(amountPaid)) {
            System.out.println("Vous n'avez rien payé.");
        } else {
            System.out.println("Le montant que vous avez payé est de " + amountPaid + " €");
        }
    }

    public static void displayAmountToBeReturned(int amountToBeReturned, int amountPaid, int totalBill) {
        if (amountToBeReturned < 0) {
            System.err.println("Vous avez réglé " + amountPaid + " € sur un total de " + totalBill + " €. Vous devez encore régler " + (-amountToBeReturned) + " €.");
        } else if (amountToBeReturned == 0) {
            System.out.println("Vous avez payé le montant exact. Aucune monnaie à rendre.");
        } else {
            System.out.println("Montant à rendre : " + amountToBeReturned + "€");
        }
    }

    // Calculs
    public static int calculateChangeAmount(int amountPaid, int totalBill) {
        return amountPaid - totalBill;
    }

    public static int calculateAndDisplayChangeForValue(int amountToBeReturned, int value, String label) {
        int numberOfChangeToBeReturned = 0;

        while (amountToBeReturned >= value) {
            amountToBeReturned -= value;
            numberOfChangeToBeReturned++;
        }

        if (numberOfChangeToBeReturned > 0) {
            System.out.println(numberOfChangeToBeReturned + " " + label + " de " + value + "€.");
        }

        return amountToBeReturned;
    }
}