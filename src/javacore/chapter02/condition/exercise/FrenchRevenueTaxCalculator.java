package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main(String[] args) {

        // -1, 0, 11294, 11295, 28797, 28798, 82341, 83342, 177106, 177107
        double annualBrutSalary = 45000;

        final double WORKER_SOCIAL_CONTRIBUTIONS_RATE = 0.23;
        final double MANAGER_SOCIAL_CONTRIBUTIONS_RATE = 0.25;

        final double UNTAXABLE_LIMIT = 11294.0;         // 0 %
        final double ELEVEN_PERCENT_LIMIT = 28797.0;    // 11 %
        final double THIRTY_PERCENT_LIMIT = 82341.0;    // 30 %
        final double FORTY_ONE_PERCENT_LIMIT = 177106.0; // 41 %
        // 45% au-dessus de cette limite

        final double UNTAXABLE_PERCENT_RATE = 0.0;
        final double ELEVEN_PERCENT_RATE = 0.11;
        final double THIRTY_PERCENT_RATE = 0.30;
        final double FORTY_ONE_PERCENT_RATE = 0.41;
        final double FORTY_FIVE_PERCENT_RATE = 0.45;

        double fortyFivePercentPortion = 0;
        double fortyOnePercentPortion = 0;
        double thirtyPercentPortion = 0;
        double elevenPercentPortion = 0;
        double untaxablePortion = 0;

        double fortyFivePercentTaxeAmount = 0;
        double fortyOnePercentTaxeAmount = 0;
        double thirtyPercentTaxeAmount = 0;
        double elevenPercentTaxeAmount = 0;
        double untaxableTaxeAmount = 0;

        String status = "ouvrier"; // ou cadre

        double annualTaxableNetSalary;
        double socialContributionsRate = 0;

        if (status.equals("ouvrier")) {
            socialContributionsRate = WORKER_SOCIAL_CONTRIBUTIONS_RATE;
        } else if (status.equals("cadre")) {
            socialContributionsRate = MANAGER_SOCIAL_CONTRIBUTIONS_RATE;
        } else {
            System.out.println("Statut inconnu: " + status);
        }
        annualTaxableNetSalary = annualBrutSalary - (annualBrutSalary * socialContributionsRate);
        System.out.println("Le salaire net imposable d'un " + status + " avant l'abattement est " + annualTaxableNetSalary + "€ pour un taux de "
                + socialContributionsRate * 100 + "% et un salaire brut de " + annualBrutSalary + "€.");

        final double REDUCTION = 10.0 / 100;
        double annualTaxableNetIncomeAfterReduction =
                annualTaxableNetSalary - (annualTaxableNetSalary * REDUCTION);

        boolean isAnnualTaxableNetIncomeAfterReductionNegative =
                annualTaxableNetIncomeAfterReduction < 0;

        if (isAnnualTaxableNetIncomeAfterReductionNegative == false) {

            if (annualTaxableNetIncomeAfterReduction > FORTY_ONE_PERCENT_LIMIT) {
                fortyFivePercentPortion = annualTaxableNetIncomeAfterReduction - FORTY_ONE_PERCENT_LIMIT;
            }
            fortyFivePercentTaxeAmount = fortyFivePercentPortion * FORTY_FIVE_PERCENT_RATE;

            if (annualTaxableNetIncomeAfterReduction > FORTY_ONE_PERCENT_LIMIT) {
                fortyOnePercentPortion = FORTY_ONE_PERCENT_LIMIT - THIRTY_PERCENT_LIMIT;
            } else if (annualTaxableNetIncomeAfterReduction > THIRTY_PERCENT_LIMIT) {
                fortyOnePercentPortion = annualTaxableNetIncomeAfterReduction - THIRTY_PERCENT_LIMIT;
            }
            fortyOnePercentTaxeAmount = fortyOnePercentPortion * FORTY_ONE_PERCENT_RATE;

            if (annualTaxableNetIncomeAfterReduction > THIRTY_PERCENT_LIMIT) {
                thirtyPercentPortion = THIRTY_PERCENT_LIMIT - ELEVEN_PERCENT_LIMIT;
            } else if (annualTaxableNetIncomeAfterReduction > ELEVEN_PERCENT_LIMIT) {
                thirtyPercentPortion = annualTaxableNetIncomeAfterReduction - ELEVEN_PERCENT_LIMIT;
            }
            thirtyPercentTaxeAmount = thirtyPercentPortion * THIRTY_PERCENT_RATE;

            if (annualTaxableNetIncomeAfterReduction > ELEVEN_PERCENT_LIMIT) {
                elevenPercentPortion = ELEVEN_PERCENT_LIMIT - UNTAXABLE_LIMIT;
            } else if (annualTaxableNetIncomeAfterReduction > UNTAXABLE_LIMIT) {
                elevenPercentPortion = annualTaxableNetIncomeAfterReduction - UNTAXABLE_LIMIT;
            }
            elevenPercentTaxeAmount = elevenPercentPortion * ELEVEN_PERCENT_RATE;

            if (annualTaxableNetIncomeAfterReduction > UNTAXABLE_LIMIT) {
                untaxablePortion = UNTAXABLE_LIMIT;
            } else if (annualTaxableNetIncomeAfterReduction >= 0) {
                untaxablePortion = annualTaxableNetIncomeAfterReduction;
            }
            untaxableTaxeAmount = untaxablePortion * UNTAXABLE_PERCENT_RATE;

            System.out.println("Le salaire annuel net avant impôt et après abattement de "
                    + (REDUCTION * 100) + "% est de : " + annualTaxableNetIncomeAfterReduction + " €.");
        }

        double totalTaxe = 0;
        double annualNetSalary = 0;
        double effectiveTaxRate = 0;

        if (!isAnnualTaxableNetIncomeAfterReductionNegative) {
            totalTaxe = untaxableTaxeAmount + elevenPercentTaxeAmount + thirtyPercentTaxeAmount
                    + fortyOnePercentTaxeAmount + fortyFivePercentTaxeAmount;

            System.out.println("Le montant total de l'impôt est de : " + totalTaxe + " €.");

            annualNetSalary = annualTaxableNetIncomeAfterReduction - totalTaxe;
            System.out.println("Le salaire annuel net d'impôt est de " + annualNetSalary + " €.");

            effectiveTaxRate = totalTaxe / annualTaxableNetIncomeAfterReduction;
            System.out.println("Le pourcentage d'imposition réel est de " + effectiveTaxRate * 100 + " %.");
        }
    }
}