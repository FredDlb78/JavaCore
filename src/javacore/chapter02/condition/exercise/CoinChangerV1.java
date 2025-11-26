package javacore.chapter02.condition.exercise;

public class CoinChangerV1 {

    public static void main(String[] args) {

        // -1, 0, 1, 2, 3, 12, 13, 32, 33, 82, 83
        int totalBill = 100;      // montant de la facture
        int amountPaid = 3000083;    // montant payé

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

        int returnedAmount = amountPaid - totalBill; // Montant à rendre

        if (returnedAmount < 0) {
            System.out.println("Vous avez réglé " + amountPaid + " € sur un total de " + totalBill +
                    " €. Vous devez rencore régler " + (-returnedAmount) + " €.");
        } else if (returnedAmount == 0) {
            System.out.println("Vous avez payé le montant exact. Aucune monnaie à rendre.");
        } else {
            System.out.println("Montant à rendre : " + returnedAmount + "€");
        }

        // Valeurs des pièces et billets
        int fiftyBill = 50;
        int twentyBill = 20;
        int tenBill = 10;
        int twoCoin = 2;
        int oneCoin = 1;

        // Nombre de billets/pièces à rendre
        int fiftyBillsToBeReturned = 0;
        int twentyBillsToBeReturned = 0;
        int tenBillsToBeReturned = 0;
        int twoCoinsToBeReturned = 0;
        int oneCoinsToBeReturned = 0;

        if (returnedAmount >= fiftyBill) {
            fiftyBillsToBeReturned = returnedAmount / fiftyBill;
            returnedAmount = returnedAmount % fiftyBill;
        }

        if (returnedAmount >= twentyBill) {
            twentyBillsToBeReturned = returnedAmount / twentyBill;
            returnedAmount = returnedAmount % twentyBill;
        }

        if (returnedAmount >= tenBill) {
            tenBillsToBeReturned = returnedAmount / tenBill;
            returnedAmount = returnedAmount % tenBill;
        }

        if (returnedAmount >= twoCoin) {
            twoCoinsToBeReturned = returnedAmount / twoCoin;
            returnedAmount = returnedAmount % twoCoin;
        }

        if (returnedAmount >= oneCoin) {
            oneCoinsToBeReturned = returnedAmount / oneCoin;
            returnedAmount = returnedAmount % oneCoin;
            System.out.println(returnedAmount);
        }

        // Résultat
        System.out.println("Monnaie à rendre :");
        System.out.println(fiftyBillsToBeReturned + " billet(s) de " + fiftyBill + "€");
        System.out.println(twentyBillsToBeReturned + " billet(s) de " + twentyBill + "€");
        System.out.println(tenBillsToBeReturned + " billet(s) de " + tenBill + "€");
        System.out.println(twoCoinsToBeReturned + " pièce(s) de " + twoCoin + "€");
        System.out.println(oneCoinsToBeReturned + " pièce(s) de " + oneCoin + "€");
    }
}
