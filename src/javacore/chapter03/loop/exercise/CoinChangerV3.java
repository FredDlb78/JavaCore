package javacore.chapter03.loop.exercise;

public class CoinChangerV3 {

    public static void main(String[] args) {


        // -1, 0, 1, 2, 3, 12, 13, 32, 33, 82, 83
        int totalBill = 100;      // montant de la facture
        int amountPaid = 119;    // montant payé

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

        // Nombre de billets/pièces à rendre
        int fiftyBillsToBeReturned = 0;
        int twentyBillsToBeReturned = 0;
        int tenBillsToBeReturned = 0;
        int twoCoinsToBeReturned = 0;
        int oneCoinsToBeReturned = 0;

        int change = 0;
        int changeToBeReturned = 0;
        if (changeToBeReturned < 0) {
            changeToBeReturned = 0;
        }
        int i = 0;

        if (amountToBeReturned >= FIFTY_BILL) {
            change = FIFTY_BILL;
            changeToBeReturned = fiftyBillsToBeReturned;
            for (i = 1; change * i <= amountToBeReturned; i++) {
            }
        }

        changeToBeReturned = i - 1;
        System.out.println(changeToBeReturned + " billet(s) de " + change + "€");
        amountToBeReturned -=  changeToBeReturned * change;
        //System.out.println("Le montant restant à rembourser est de " + amountToBeReturned + "€.");
        if (amountToBeReturned >= TWENTY_BILL) {
            change = TWENTY_BILL;
            changeToBeReturned = twentyBillsToBeReturned;
        }
        for (i = 1; change * i <= amountToBeReturned; i++) {
        }
        changeToBeReturned = i - 1;
        System.out.println(changeToBeReturned + " billet(s) de " + change + "€");
        amountToBeReturned -=  changeToBeReturned * change;
        //System.out.println("Le montant restant à rembourser est de " + amountToBeReturned + "€.");
        if (amountToBeReturned >= TEN_BILL) {
            change = TEN_BILL;
            changeToBeReturned = tenBillsToBeReturned;
        }
        for (i = 1; change * i <= amountToBeReturned; i++) {
        }
        changeToBeReturned = i - 1;
        System.out.println(changeToBeReturned + " billet(s) de " + change + "€");
        amountToBeReturned -=  changeToBeReturned * change;
        //System.out.println("Le montant restant à rembourser est de " + amountToBeReturned + "€.");
        if (amountToBeReturned >= TWO_COIN) {
            change = TWO_COIN;
            changeToBeReturned = twoCoinsToBeReturned;
        }
        for (i = 1; change * i <= amountToBeReturned; i++) {
        }
        changeToBeReturned = i - 1;
        System.out.println(changeToBeReturned + " billet(s) de " + change + "€");
        amountToBeReturned -=  changeToBeReturned * change;
        //System.out.println("Le montant restant à rembourser est de " + amountToBeReturned + "€.");
        if (amountToBeReturned >= ONE_COIN) {
            change = ONE_COIN;
            changeToBeReturned = oneCoinsToBeReturned;
        }
        for (i = 1; change * i <= amountToBeReturned; i++) {
        }
        changeToBeReturned = i - 1;
        System.out.println(changeToBeReturned + " billet(s) de " + change + "€");
        amountToBeReturned -=  changeToBeReturned * change;
        //System.out.println("Le montant restant à rembourser est de " + amountToBeReturned + "€.");

    }
}