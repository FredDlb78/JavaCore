package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {

    public static void main(String[] args) {

        // -1, 0, 1, 2, 3, 12, 13, 32, 33, 82, 83
        int totalBill = 100;      // montant de la facture
        int amountPaid = 367;     // montant payé

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

        int amountToBeReturned = amountPaid - totalBill;

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

        // Stock disponible
        int fitfyBillStock = 2;
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

        // ---- Billets de 50 ----
        fiftyBillsToBeReturned = amountToBeReturned / FIFTY_BILL;

        if (fitfyBillStock < fiftyBillsToBeReturned) {
            fiftyBillsToBeReturned = fitfyBillStock;
            amountToBeReturned -= (FIFTY_BILL * fiftyBillsToBeReturned);
            //System.out.println("Pas assez de stock de billets de 50.");
        } else {
            fiftyBillsToBeReturned = amountToBeReturned / FIFTY_BILL;
            amountToBeReturned = amountToBeReturned % FIFTY_BILL;
        }

        // ---- Billets de 20 ----
        twentyBillsToBeReturned = amountToBeReturned / TWENTY_BILL;

        if (twentyBillStock < twentyBillsToBeReturned) {
            twentyBillsToBeReturned = twentyBillStock;
            amountToBeReturned -= (TWENTY_BILL * twentyBillsToBeReturned);
        } else {
            twentyBillsToBeReturned = amountToBeReturned / TWENTY_BILL;
            amountToBeReturned = amountToBeReturned % TWENTY_BILL;
        }

        amountPaid = amountToBeReturned;

        // ---- Billets de 10 ----
        tenBillsToBeReturned = amountToBeReturned / TEN_BILL;

        if (tenBillStock < tenBillsToBeReturned) {
            tenBillsToBeReturned = tenBillStock;
            amountToBeReturned -= (TEN_BILL * tenBillsToBeReturned);
        } else {
            tenBillsToBeReturned = amountToBeReturned / TEN_BILL;
            amountToBeReturned = amountToBeReturned % TEN_BILL;
        }

        amountPaid = amountToBeReturned;

        // ---- Pièces de 2 ----
        twoCoinsToBeReturned = amountToBeReturned / TWO_COIN;

        if (twoCoinStock < twoCoinsToBeReturned) {
            twoCoinsToBeReturned = twoCoinStock;
            amountToBeReturned -= (TWO_COIN * twoCoinsToBeReturned);
        } else {
            twoCoinsToBeReturned = amountToBeReturned / TWO_COIN;
            amountToBeReturned = amountToBeReturned % TWO_COIN;
        }

        amountPaid = amountToBeReturned;

        // ---- Pièces de 1 ----
        oneCoinsToBeReturned = amountToBeReturned / ONE_COIN;

        if (oneCoinStock < oneCoinsToBeReturned) {
            oneCoinsToBeReturned = oneCoinStock;
            amountToBeReturned -= (ONE_COIN * oneCoinsToBeReturned);
        } else {
            oneCoinsToBeReturned = amountToBeReturned / ONE_COIN;
            amountToBeReturned = amountToBeReturned % ONE_COIN;
        }

        // Total réellement rendu
        int totalReturned =
                fiftyBillsToBeReturned * FIFTY_BILL +
                        twentyBillsToBeReturned * TWENTY_BILL +
                        tenBillsToBeReturned * TEN_BILL +
                        twoCoinsToBeReturned * TWO_COIN +
                        oneCoinsToBeReturned * ONE_COIN;

        System.out.println("Monnaie rendue : " + totalReturned);

        // Résultat final
        System.out.println("Monnaie à rendre :");
        System.out.println(fiftyBillsToBeReturned + " billet(s) de " + FIFTY_BILL + "€");
        System.out.println(twentyBillsToBeReturned + " billet(s) de " + TWENTY_BILL + "€");
        System.out.println(tenBillsToBeReturned + " billet(s) de " + TEN_BILL + "€");
        System.out.println(twoCoinsToBeReturned + " pièce(s) de " + TWO_COIN + "€");
        System.out.println(oneCoinsToBeReturned + " pièce(s) de " + ONE_COIN + "€");
    }
}
