package javacore.chapter03.loop.exercise;

public class CoinChangerV3 {

    public static void main(String[] args) {


        // -1, 0, 1, 2, 3, 12, 13, 32, 33, 82, 83
        int totalBill = 100;   // montant de la facture
        int amountPaid = 90;   // montant payé

        if (totalBill < 0) {
            System.out.println("Le montant de la facture ne peut pas être négatif.");
        } else if (totalBill == 0) {
            System.out.println("Vous n'avez rien à payer.");
        } else {
            System.out.println("Le montant total de la facture est de " + totalBill + " €.");
        }

        if (amountPaid <= 0) {
            System.out.println("Le montant payé doit être positif.");
        } else {
            System.out.println("Le montant que vous avez payé est de " + amountPaid + " €");
        }

        int amountToBeReturned = amountPaid - totalBill; // Montant à rendre

        if (amountToBeReturned < 0) {
            System.out.println("Vous avez réglé " + amountPaid + " € sur un total de " + totalBill +
                            " €. Vous devez encore régler " + (-amountToBeReturned) + " €.");
        } else if (amountToBeReturned == 0) {
            System.out.println("Vous avez payé le montant exact. Aucune monnaie à rendre.");
        } else {
            System.out.println("Montant à rendre : " + amountToBeReturned + "€");
        }

        // Valeurs des pièces et billets
        final int FIFTY_BILL = 50;
        final int TWENTY_BILL = 20;
        final int TEN_BILL = 10;
        final int TWO_COIN = 2;
        final int ONE_COIN = 1;

        int numberOfChangeToBeReturned;

        // Billets de 50
        numberOfChangeToBeReturned = 0;
        while (amountToBeReturned >= FIFTY_BILL) {
            amountToBeReturned -= FIFTY_BILL;
            numberOfChangeToBeReturned++;
        }
        if (numberOfChangeToBeReturned > 0) {
            System.out.println(numberOfChangeToBeReturned + " billet(s) de " + FIFTY_BILL + "€.");
        }

        // Billets de 20
        numberOfChangeToBeReturned = 0;
        while (amountToBeReturned >= TWENTY_BILL) {
            amountToBeReturned -= TWENTY_BILL;
            numberOfChangeToBeReturned++;
        }
        if (numberOfChangeToBeReturned > 0) {
            System.out.println(numberOfChangeToBeReturned + " billet(s) de " + TWENTY_BILL + "€.");
        }

        // Billets de 10
        numberOfChangeToBeReturned = 0;
        while (amountToBeReturned >= TEN_BILL) {
            amountToBeReturned -= TEN_BILL;
            numberOfChangeToBeReturned++;
        }
        if (numberOfChangeToBeReturned > 0) {
            System.out.println(numberOfChangeToBeReturned + " billet(s) de " + TEN_BILL + "€.");
        }

        // Pièces de 2
        numberOfChangeToBeReturned = 0;
        while (amountToBeReturned >= TWO_COIN) {
            amountToBeReturned -= TWO_COIN;
            numberOfChangeToBeReturned++;
        }
        if (numberOfChangeToBeReturned > 0) {
            System.out.println(numberOfChangeToBeReturned + " pièce(s) de " + TWO_COIN + "€.");
        }

        // Pièces de 1
        numberOfChangeToBeReturned = 0;
        while (amountToBeReturned >= ONE_COIN) {
            amountToBeReturned -= ONE_COIN;
            numberOfChangeToBeReturned++;
        }
        if (numberOfChangeToBeReturned > 0) {
            System.out.println(numberOfChangeToBeReturned + " pièce(s) de " + ONE_COIN + "€.");
        }
    }
}