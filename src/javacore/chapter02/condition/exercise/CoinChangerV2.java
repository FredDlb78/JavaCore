package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {

    public static void main(String[] args) {

        // -1, 0, 1, 2, 3, 12, 13, 32, 33, 82, 83
        int totalBill = 100;      // montant de la facture
        int amountPaid = 367;     // montant payé

        if (totalBill < 0) {
            System.out.println("Le montant de la facture ne peut pas être négatif.");
            return;
        } else if (totalBill == 0) {
            System.out.println("Vous n'avez rien à payer.");
            return;
        } else {
            System.out.println("Le montant total de la facture est de " + totalBill + " €.");
        }

        if (amountPaid <= 0) {
            System.out.println("Le montant payé doit être positif.");
            return;
        } else {
            System.out.println("Le montant que vous avez payé est de " + amountPaid + " €");
        }

        int returnedAmount = amountPaid - totalBill; // Montant à rendre

        if (returnedAmount < 0) {
            System.out.println("Vous avez réglé " + amountPaid + " € sur un total de " + totalBill +
                    " €. Vous devez encore régler " + (-returnedAmount) + " €.");
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

        // Stock disponible
        int fitfyBillStock = 4;
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

        // Montant restant à rendre (qu'on met à jour à chaque étape)
        int remainingAmount = returnedAmount;

        // ---- Billets de 50 ----
        int maxFiftyByValue = remainingAmount / fiftyBill; // théorique avec la valeur
        if (fitfyBillStock <= 0) {
            fiftyBillsToBeReturned = 0;
            System.out.println("Pas de stock de billets de 50€.");
        } else if (fitfyBillStock < maxFiftyByValue) {
            fiftyBillsToBeReturned = fitfyBillStock;
            System.out.println("Pas assez de billets de 50€. On utilise tout le stock disponible.");
        } else {
            fiftyBillsToBeReturned = maxFiftyByValue;
        }
        remainingAmount = remainingAmount - fiftyBillsToBeReturned * fiftyBill;

        // ---- Billets de 20 ----
        int maxTwentyByValue = remainingAmount / twentyBill;
        if (twentyBillStock <= 0) {
            twentyBillsToBeReturned = 0;
            System.out.println("Pas de stock de billets de 20€.");
        } else if (twentyBillStock < maxTwentyByValue) {
            twentyBillsToBeReturned = twentyBillStock;
            System.out.println("Pas assez de billets de 20€. On utilise tout le stock disponible.");
        } else {
            twentyBillsToBeReturned = maxTwentyByValue;
        }
        remainingAmount = remainingAmount - twentyBillsToBeReturned * twentyBill;

        // ---- Billets de 10 ----
        int maxTenByValue = remainingAmount / tenBill;
        if (tenBillStock <= 0) {
            tenBillsToBeReturned = 0;
            System.out.println("Pas de stock de billets de 10€.");
        } else if (tenBillStock < maxTenByValue) {
            tenBillsToBeReturned = tenBillStock;
            System.out.println("Pas assez de billets de 10€. On utilise tout le stock disponible.");
        } else {
            tenBillsToBeReturned = maxTenByValue;
        }
        remainingAmount = remainingAmount - tenBillsToBeReturned * tenBill;

        // ---- Pièces de 2 ----
        int maxTwoByValue = remainingAmount / twoCoin;
        if (twoCoinStock <= 0) {
            twoCoinsToBeReturned = 0;
            System.out.println("Pas de stock de pièces de 2€.");
        } else if (twoCoinStock < maxTwoByValue) {
            twoCoinsToBeReturned = twoCoinStock;
            System.out.println("Pas assez de pièces de 2€. On utilise tout le stock disponible.");
        } else {
            twoCoinsToBeReturned = maxTwoByValue;
        }
        remainingAmount = remainingAmount - twoCoinsToBeReturned * twoCoin;

        // ---- Pièces de 1 ----
        int maxOneByValue = remainingAmount / oneCoin;
        if (oneCoinStock <= 0) {
            oneCoinsToBeReturned = 0;
            System.out.println("Pas de stock de pièces de 1€.");
        } else if (oneCoinStock < maxOneByValue) {
            oneCoinsToBeReturned = oneCoinStock;
            System.out.println("Pas assez de pièces de 1€. On utilise tout le stock disponible.");
        } else {
            oneCoinsToBeReturned = maxOneByValue;
        }
        remainingAmount = remainingAmount - oneCoinsToBeReturned * oneCoin;

        int totalReturned =
                fiftyBillsToBeReturned * fiftyBill +
                        twentyBillsToBeReturned * twentyBill +
                        tenBillsToBeReturned * tenBill +
                        twoCoinsToBeReturned * twoCoin +
                        oneCoinsToBeReturned * oneCoin;

        System.out.println("Monnaie rendue au total : " + totalReturned + "€");

        if (remainingAmount > 0) {
            System.out.println("Impossible de rendre exactement toute la monnaie. Il reste " + remainingAmount + "€ non rendus (manque de stock).");
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
