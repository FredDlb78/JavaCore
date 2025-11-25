package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main(String[] args) {

        //-1, 0, 11294, 11295, 28797, 28798, 82341, 83342, 177106, 177107
        double annualBrutSalary = 45000;

        double workerSocialContributionsRate = 0.23;
        double managerSocialContributionsRate = 0.25;

        double untaxableLimit = 11294.0;     // 0 % jusqu'à cette limite
        double elevenPercentLimit = 28797.0; // 11 % jusqu'à cette limite
        double thirtyPercentLimit = 82341.0; // 30 % jusqu'à cette limite
        double fortyOnePercentLimit = 177106.0; // 41 % jusqu'à cette limite
        // 45% au-dessus de cette limite

        double untaxablePercentRate = 0;
        double elevenPercentRate = 0.11;
        double thirtyPercentRate = 0.30;
        double fortyOnePercentRate = 0.41;
        double fortyFivePercentRate = 0.45;

        double fortyFivePercentPortion;
        double fortyOnePercentPortion;
        double thirtyPercentPortion;
        double elevenPercentPortion;
        double untaxablePortion;
        double fortyFivePercentTaxeAmount;
        double fortyOnePercentTaxeAmount;
        double thirtyPercentTaxeAmount;
        double elevenPercentTaxeAmount;
        double untaxableTaxeAmount;

        String status = "ouvrier"; // ou cadre

        double annualTaxableNetSalary;

        if (status.equals("ouvrier")) {
            annualTaxableNetSalary = annualBrutSalary - (annualBrutSalary * workerSocialContributionsRate);
            System.out.println("Le salaire net imposable d'un ouvrier avant l'abattement est " + annualTaxableNetSalary + "€ pour un taux de "
                    + workerSocialContributionsRate * 100 + "% et un salaire brut de " + annualBrutSalary + "€.");
        } else {
            annualTaxableNetSalary = annualBrutSalary - (annualBrutSalary * managerSocialContributionsRate);
            System.out.println("Le salaire net imposable d'un cadre est " + annualTaxableNetSalary + "€ pour un taux de "
                    + managerSocialContributionsRate * 100 + "% et un salaire net de " + annualBrutSalary + "€.");
        }

        double reduction = 10.0 / 100;
        double annualTaxableNetIncomeAfterReduction = annualTaxableNetSalary - (annualTaxableNetSalary * reduction);
//        System.out.println("Le salaire net annuel imposable après abattement est de : " + annualTaxableNetIncomeAfterReduction + " €");

        String errMsg = "Le salaire net après réduction ne peut pas être négatif.";

        boolean isAnnualTaxableNetIncomeAfterReductionNegative = annualTaxableNetIncomeAfterReduction < 0;

        if (isAnnualTaxableNetIncomeAfterReductionNegative) {
            fortyFivePercentPortion = 0;
//            System.out.println(errMsg);
        } else if (annualTaxableNetIncomeAfterReduction > fortyOnePercentLimit) {
            fortyFivePercentPortion = annualTaxableNetIncomeAfterReduction - fortyOnePercentLimit;
        } else {
            fortyFivePercentPortion = 0;
        }
        fortyFivePercentTaxeAmount = fortyFivePercentPortion * fortyFivePercentRate;
//        System.out.println("La portion du salaire taxable à 45% est de " + fortyFivePercentPortion + " €.");
//        System.out.println("Le montant de l'impot à 45% est de " + fortyFivePercentTaxeAmount + "€.");

        if (isAnnualTaxableNetIncomeAfterReductionNegative) {
            fortyOnePercentPortion = 0;
//            System.out.println(errMsg);
        } else if (annualTaxableNetIncomeAfterReduction > fortyOnePercentLimit) {
            fortyOnePercentPortion = fortyOnePercentLimit - thirtyPercentLimit;
        } else if (annualTaxableNetIncomeAfterReduction > thirtyPercentLimit) {
            fortyOnePercentPortion = annualTaxableNetIncomeAfterReduction - thirtyPercentLimit;
        } else {
            fortyOnePercentPortion = 0;
        }
        fortyOnePercentTaxeAmount = fortyOnePercentPortion * fortyOnePercentRate;
//        System.out.println("La portion du salaire taxable à 41% est de " + fortyOnePercentPortion + " €.");
//        System.out.println("Le montant de l'impot à 41% est de " + fortyOnePercentTaxeAmount + " €.");

        if (isAnnualTaxableNetIncomeAfterReductionNegative) {
            thirtyPercentPortion = 0;
//            System.out.println(errMsg);
        } else if (annualTaxableNetIncomeAfterReduction > thirtyPercentLimit) {
            thirtyPercentPortion = thirtyPercentLimit - elevenPercentLimit;
        } else if (annualTaxableNetIncomeAfterReduction > elevenPercentLimit) {
            thirtyPercentPortion = annualTaxableNetIncomeAfterReduction - elevenPercentLimit;
        } else {
            thirtyPercentPortion = 0;
        }
        thirtyPercentTaxeAmount = thirtyPercentPortion * thirtyPercentRate;
//        System.out.println("La portion du salaire taxable à 30% est de " + thirtyPercentPortion + " €.");
//        System.out.println("Le montant de l'impot à 30% est de " + thirtyPercentTaxeAmount + " €.");

        if (isAnnualTaxableNetIncomeAfterReductionNegative) {
            elevenPercentPortion = 0;
//            System.out.println(errMsg);
        } else if (annualTaxableNetIncomeAfterReduction > elevenPercentLimit) {
            elevenPercentPortion = elevenPercentLimit - untaxableLimit;
        } else if (annualTaxableNetIncomeAfterReduction > untaxableLimit) {
            elevenPercentPortion = annualTaxableNetIncomeAfterReduction - untaxableLimit;
        } else {
            elevenPercentPortion = 0;
        }
        elevenPercentTaxeAmount = elevenPercentPortion * elevenPercentRate;
//        System.out.println("La portion du salaire taxable à 11% est de " + elevenPercentPortion + " €.");
//        System.out.println("Le montant de l'impôt à 11% est de " + elevenPercentTaxeAmount + " €.");

        if (isAnnualTaxableNetIncomeAfterReductionNegative) {
            untaxablePortion = 0;
            System.out.println(errMsg);
        } else if (annualTaxableNetIncomeAfterReduction > untaxableLimit) {
            untaxablePortion = untaxableLimit;
        } else if (annualTaxableNetIncomeAfterReduction >= 0) {
            untaxablePortion = annualTaxableNetIncomeAfterReduction;
        } else {
            untaxablePortion = 0;
        }
        untaxableTaxeAmount = untaxablePortion * untaxablePercentRate;
//        System.out.println("La portion du salaire non taxable est de " + untaxablePortion + " €.");
//        System.out.println("Le montant de l'impôt à non taxable est de " + untaxableTaxeAmount + " €.");

        if (isAnnualTaxableNetIncomeAfterReductionNegative) {
        } else {
            System.out.println("Le salaire annuel net avant impôt et après abattement de " + (reduction * 100) + "% est de : " + annualTaxableNetIncomeAfterReduction + " €.");
        }

        double totalTaxe;
        if (isAnnualTaxableNetIncomeAfterReductionNegative) {
            totalTaxe = 0;
        } else {
            totalTaxe = untaxableTaxeAmount + elevenPercentTaxeAmount + thirtyPercentTaxeAmount + fortyOnePercentTaxeAmount + fortyFivePercentTaxeAmount;
            System.out.println("Le montant total de l'impôt est de : " + totalTaxe + " €.");
        }

        double annualNetSalary;
        if (isAnnualTaxableNetIncomeAfterReductionNegative) {
            annualNetSalary = 0;
        } else {
            annualNetSalary = annualTaxableNetIncomeAfterReduction - totalTaxe;
            System.out.println("Le salaire annuel net d'impôt est de " + annualNetSalary + " €.");
        }

        double effectiveTaxRate;
        if (isAnnualTaxableNetIncomeAfterReductionNegative) {
            effectiveTaxRate = 0;
        } else {
            effectiveTaxRate = totalTaxe / annualTaxableNetIncomeAfterReduction;
            System.out.println("Le pourcentage d'imposition réel est de " + effectiveTaxRate * 100 + " %.");
        }
    }
}