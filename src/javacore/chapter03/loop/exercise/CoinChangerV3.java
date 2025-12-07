package javacore.chapter03.loop.exercise;

public class CoinChangerV3 {

    public static void main(String[] args) {


        // -1, 0, 1, 2, 3, 12, 13, 32, 33, 82, 83
        int totalBill = 100;      // montant de la facture
        int amountPaid = 90;    // montant payé

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
                    " €. Vous devez rencore régler " + (-amountToBeReturned) + " €.");
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

        int i = 0;
        int numberOfChangeToBeReturned = 0;
        //int change = 0;


        // Billets de 50
        if (amountToBeReturned >= FIFTY_BILL) {
            for (i = 1; FIFTY_BILL * i <= amountToBeReturned; i++) {
            }
            numberOfChangeToBeReturned = i - 1;
            System.out.println(numberOfChangeToBeReturned + " billet(s) de " + FIFTY_BILL + "€.");
            amountToBeReturned -= numberOfChangeToBeReturned * FIFTY_BILL;
        }

        // Billets de 20
        if (amountToBeReturned >= TWENTY_BILL) {
            for (i = 1; TWENTY_BILL * i <= amountToBeReturned; i++) {
            }
            numberOfChangeToBeReturned = i - 1;
            System.out.println(numberOfChangeToBeReturned + " billet(s) de " + TWENTY_BILL + "€.");
            amountToBeReturned -= numberOfChangeToBeReturned * TWENTY_BILL;
        }

        // Billets de 10
        if (amountToBeReturned >= TEN_BILL) {
            for (i = 1; TEN_BILL * i <= amountToBeReturned; i++) {
            }
            numberOfChangeToBeReturned = i - 1;
            System.out.println(numberOfChangeToBeReturned + " billet(s) de " + TEN_BILL + "€.");
            amountToBeReturned -= numberOfChangeToBeReturned * TEN_BILL;
        }

        // Pièces de 2
        if (amountToBeReturned >= TWO_COIN) {
            for (i = 1; TWO_COIN * i <= amountToBeReturned; i++) {
            }
            numberOfChangeToBeReturned = i - 1;
            System.out.println(numberOfChangeToBeReturned + " pièce(s) de " + TWO_COIN + "€.");
            amountToBeReturned -= numberOfChangeToBeReturned * TWO_COIN;
        }

        // Pièces de 1
        if (amountToBeReturned >= ONE_COIN) {
            numberOfChangeToBeReturned =  1;
            System.out.println(numberOfChangeToBeReturned + " pièce(s) de " + ONE_COIN + "€.");
        }

        // J'aurai souhaité faire une boucle pour éviter de répéter ces conditions mais j'ai l'impression
        // que ce n'est pas faisable tant qu'on a pas vu les listes;

    }
}