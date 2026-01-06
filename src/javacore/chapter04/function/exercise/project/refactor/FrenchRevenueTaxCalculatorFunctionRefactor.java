package javacore.chapter04.function.exercise.project.refactor;

public class FrenchRevenueTaxCalculatorFunctionRefactor {

    // Constante d'abattement (classique : visible partout)
    public static final double REDUCTION = 10.0 / 100;

    public static void main(String[] args) {

        // -1, 0, 11294, 11295, 28797, 28798, 82341, 83342, 177106, 177107
        double annualBrutSalary = 45000;

        final double UNTAXABLE_LIMIT = 11294.0;          // 0 %
        final double ELEVEN_PERCENT_LIMIT = 28797.0;     // 11 %
        final double THIRTY_PERCENT_LIMIT = 82341.0;     // 30 %
        final double FORTY_ONE_PERCENT_LIMIT = 177106.0; // 41 %
        // 45% au-dessus

        final double UNTAXABLE_PERCENT_RATE = 0.0;
        final double ELEVEN_PERCENT_RATE = 0.11;
        final double THIRTY_PERCENT_RATE = 0.30;
        final double FORTY_ONE_PERCENT_RATE = 0.41;
        final double FORTY_FIVE_PERCENT_RATE = 0.45;

        String status = "ouvrier"; // ou "cadre"

        // Vérifier dès le début si le brut annuel et le status sont valides, sinon on stop tout de suite le programme.
        if (!isValidAnnualBrutSalary(annualBrutSalary) || !isValidStatus(status)) {
            return;
        }

        // Taux de cotisations
        double socialContributionsRate = getSocialContributionsRateByStatus(status);

        // Salaire net imposable (avant abattement)
        displayAnnualTaxableNetSalary(status, socialContributionsRate, annualBrutSalary);

        // Salaire net imposable après abattement
        double annualTaxableNetIncomeAfterReduction = calculateAnnualTaxableNetIncomeAfterReduction(annualBrutSalary, status);
        displayAnnualTaxableNetIncomeAfterReduction(annualTaxableNetIncomeAfterReduction);


        // Calcul des portions par tranche
        double fortyFivePercentPortion = calculatePortionAboveLimit(annualTaxableNetIncomeAfterReduction, FORTY_ONE_PERCENT_LIMIT);

        double fortyOnePercentPortion = calculatePortionBetweenLimits(annualTaxableNetIncomeAfterReduction, THIRTY_PERCENT_LIMIT, FORTY_ONE_PERCENT_LIMIT);

        double thirtyPercentPortion = calculatePortionBetweenLimits(annualTaxableNetIncomeAfterReduction, ELEVEN_PERCENT_LIMIT, THIRTY_PERCENT_LIMIT);

        double elevenPercentPortion = calculatePortionBetweenLimits(annualTaxableNetIncomeAfterReduction, UNTAXABLE_LIMIT, ELEVEN_PERCENT_LIMIT);

        double untaxablePortion = calculatePortionUpToLimit(annualTaxableNetIncomeAfterReduction, UNTAXABLE_LIMIT);

        // Calcul des montants d'impôt
        double fortyFivePercentTaxeAmount = calculateTaxAmount(fortyFivePercentPortion, FORTY_FIVE_PERCENT_RATE);
        double fortyOnePercentTaxeAmount = calculateTaxAmount(fortyOnePercentPortion, FORTY_ONE_PERCENT_RATE);
        double thirtyPercentTaxeAmount = calculateTaxAmount(thirtyPercentPortion, THIRTY_PERCENT_RATE);
        double elevenPercentTaxeAmount = calculateTaxAmount(elevenPercentPortion, ELEVEN_PERCENT_RATE);
        double untaxableTaxeAmount = calculateTaxAmount(untaxablePortion, UNTAXABLE_PERCENT_RATE);

        displayAnnualTaxableNetIncomeAfterReduction(annualTaxableNetIncomeAfterReduction);

        // Totaux
        double totalTaxe = untaxableTaxeAmount + elevenPercentTaxeAmount + thirtyPercentTaxeAmount
                + fortyOnePercentTaxeAmount + fortyFivePercentTaxeAmount;

        System.out.println("Le montant total de l'impôt est de : " + totalTaxe + " €.");

        double annualNetSalary = annualTaxableNetIncomeAfterReduction - totalTaxe;
        System.out.println("Le salaire annuel net d'impôt est de " + annualNetSalary + " €.");

        double effectiveTaxRate = calculateEffectiveTaxRate(totalTaxe, annualTaxableNetIncomeAfterReduction);
        System.out.println("Le pourcentage d'imposition réel est de " + (effectiveTaxRate * 100) + " %.");
    }

    public static boolean isValidStatus(String status) {
        if (status.equals("ouvrier") || status.equals("cadre")) {
            return true;
        }
        System.err.println("Statut inconnu: " + status);
        return false;
    }


    public static boolean isValidAnnualBrutSalary(double annualBrutSalary) {
        if (annualBrutSalary < 0) {
            System.err.println("Le salaire brut annuel ne peut pas être négatif: " + annualBrutSalary + ".");
            return false;
        }
        return true;
    }


    public static double getSocialContributionsRateByStatus(String status) {
        final double WORKER_SOCIAL_CONTRIBUTIONS_RATE = 0.23;
        final double MANAGER_SOCIAL_CONTRIBUTIONS_RATE = 0.25;

        if (status.equals("ouvrier")) {
            return WORKER_SOCIAL_CONTRIBUTIONS_RATE;
        } else if (status.equals("cadre")) {
            return MANAGER_SOCIAL_CONTRIBUTIONS_RATE;
        } else {
            return 0;
        }
    }

    public static double calculateAnnualTaxableNetSalary(double annualBrutSalary, String status) {
        double socialContributionsRate = getSocialContributionsRateByStatus(status);
        return annualBrutSalary - (annualBrutSalary * socialContributionsRate);
    }

    public static void displayAnnualTaxableNetSalary(String status, double socialContributionsRate, double annualBrutSalary) {
        double annualTaxableNetSalary = calculateAnnualTaxableNetSalary(annualBrutSalary, status);
        System.out.println("Le salaire net imposable d'un " + status + " avant l'abattement est " + annualTaxableNetSalary
                + "€ pour un taux de " + (socialContributionsRate * 100) + "% et un salaire brut de " + annualBrutSalary + "€.");
    }

    public static double calculateAnnualTaxableNetIncomeAfterReduction(double annualBrutSalary, String status) {
        double annualTaxableNetSalary = calculateAnnualTaxableNetSalary(annualBrutSalary, status);
        return annualTaxableNetSalary - (annualTaxableNetSalary * REDUCTION);
    }

    public static void displayAnnualTaxableNetIncomeAfterReduction(double annualTaxableNetIncomeAfterReduction) {
        System.out.println("Le salaire net annuel imposable après réduction est de : " + annualTaxableNetIncomeAfterReduction);
    }


    // Portion au-dessus d'une limite
    public static double calculatePortionAboveLimit(double income, double lowerLimit) {
        if (income > lowerLimit) {
            return income - lowerLimit;
        }
        return 0;
    }

    // Portion entre deux limites
    public static double calculatePortionBetweenLimits(double income, double lowerLimit, double upperLimit) {
        if (income <= lowerLimit) {
            return 0;
        }

        if (income >= upperLimit) {
            return upperLimit - lowerLimit;
        }

        return income - lowerLimit;
    }

    // Portion jusqu'à une limite
    public static double calculatePortionUpToLimit(double income, double limit) {
        if (income >= limit) {
            return limit;
        }
        return income;
    }

    public static double calculateTaxAmount(double portion, double rate) {
        return portion * rate;
    }

    public static double calculateEffectiveTaxRate(double totalTax, double taxableIncomeAfterReduction) {
        if (taxableIncomeAfterReduction == 0) {
            return 0;
        }
        return totalTax / taxableIncomeAfterReduction;
    }
}
