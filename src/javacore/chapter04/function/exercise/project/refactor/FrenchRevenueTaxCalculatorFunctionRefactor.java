package javacore.chapter04.function.exercise.project.refactor;

public class FrenchRevenueTaxCalculatorFunctionRefactor {

    static final double RATE_SOCIAL_CONTRIBUTIONS_WORKER = 0.23;
    static final double RATE_SOCIAL_CONTRIBUTIONS_MANAGER = 0.25;

    // Constante d'abattement (classique : visible partout)
    public static final double TAXE_ABATMENT = 10.0 / 100;

    public static void main(String[] args) {

        // -1, 0, 11294, 11295, 28797, 28798, 82341, 83342, 177106, 177107
        double annualBrutSalary = 45000;

        final double BRACKET_FIRST_TAXABLE_LIMIT = 0;
        final double BRACKET_FIRST_TAXABLE_RATE = 0.0;

        final double BRACKET_SECOND_TAXABLE_LIMIT = 11294.0;     // 0 %
        final double BRACKET_SECOND_TAXABLE_RATE = 0.11;

        final double BRACKET_THIRD_TAXABLE_LIMIT = 28797.0;      // 11 %
        final double BRACKET_THIRD_TAXABLE_RATE = 0.30;

        final double BRACKET_FOURTH_TAXABLE_LIMIT = 82341.0;     // 30 %
        final double BRACKET_FOURTH_TAXABLE_RATE = 0.41;

        final double BRACKET_FIFTH_TAXABLE_LIMIT = 177106.0;     // 41 %
        final double BRACKET_FIFTH_TAXABLE_RATE = 0.45;
        // 45% au-dessus

        String status = "ouvrier"; // ou "cadre"

        // Vérifier dès le début si le brut annuel et le status sont valides, sinon on stop tout de suite le programme.
        if (!isValidAnnualBrutSalary(annualBrutSalary) || !isValidStatus(status)) {
            return;
        }

        // Taux de cotisations
        double socialContributionsRate = getSocialContributionsRateByStatus(status);

        // Salaire net imposable (avant abattement)
        System.out.println("Le salaire net imposable d'un " + status + " avant l'abattement est " + getAnnualTaxableNetSalary(status, socialContributionsRate, annualBrutSalary)
                + "€ pour un taux de " + (socialContributionsRate * 100) + "% et un salaire brut de " + annualBrutSalary + "€.");

        // Salaire net imposable après abattement
        double annualTaxableNetIncomeAfterReduction = calculateAnnualTaxableNetIncomeAfterReduction(annualBrutSalary, status);
        System.out.println("Le salaire net annuel imposable après réduction est de : " + annualTaxableNetIncomeAfterReduction);


        // Calcul des portions par tranche
        double fifthBracketPortion = calculatePortionBetweenLimits(annualTaxableNetIncomeAfterReduction, BRACKET_FIFTH_TAXABLE_LIMIT, Double.POSITIVE_INFINITY); // J'ai trouvé ça avec l'IA, je ne savais pas comment représenter l'infini.

        double fourthBracketPortion = calculatePortionBetweenLimits(annualTaxableNetIncomeAfterReduction, BRACKET_FOURTH_TAXABLE_LIMIT, BRACKET_FIFTH_TAXABLE_LIMIT);

        double thirdBracketPortion = calculatePortionBetweenLimits(annualTaxableNetIncomeAfterReduction, BRACKET_THIRD_TAXABLE_LIMIT, BRACKET_FOURTH_TAXABLE_LIMIT);

        double secondBracketPortion = calculatePortionBetweenLimits(annualTaxableNetIncomeAfterReduction, BRACKET_SECOND_TAXABLE_LIMIT, BRACKET_THIRD_TAXABLE_LIMIT);

        double firstBracketPortion = calculatePortionBetweenLimits(annualTaxableNetIncomeAfterReduction, 0, BRACKET_SECOND_TAXABLE_LIMIT);

        // Calcul des montants d'impôt
        double fifthBracketTaxeAmount = firstBracketPortion * BRACKET_FIFTH_TAXABLE_RATE;
        double fourthBracketTaxeAmount = fourthBracketPortion * BRACKET_FOURTH_TAXABLE_RATE;
        double thirdBracketTaxeAmount = thirdBracketPortion * BRACKET_THIRD_TAXABLE_RATE;
        double secondBracketTaxeAmount = secondBracketPortion * BRACKET_SECOND_TAXABLE_RATE;
        double firstBracketTaxeAmount = firstBracketPortion * BRACKET_FIRST_TAXABLE_RATE;

        // Totaux
        double totalTaxe = firstBracketTaxeAmount + secondBracketTaxeAmount + thirdBracketTaxeAmount
                + fourthBracketTaxeAmount + fifthBracketTaxeAmount;

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

        if (status.equals("ouvrier")) {
            return RATE_SOCIAL_CONTRIBUTIONS_WORKER;
        } else if (status.equals("cadre")) {
            return RATE_SOCIAL_CONTRIBUTIONS_MANAGER;
        } else {
            return 0;
        }
    }

    public static double calculateAnnualTaxableNetSalary(double annualBrutSalary, String status) {
        double socialContributionsRate = getSocialContributionsRateByStatus(status);
        return annualBrutSalary - (annualBrutSalary * socialContributionsRate);
    }

    public static double getAnnualTaxableNetSalary(String status, double socialContributionsRate, double annualBrutSalary) {
        return calculateAnnualTaxableNetSalary(annualBrutSalary, status);
    }

    public static double calculateAnnualTaxableNetIncomeAfterReduction(double annualBrutSalary, String status) {
        double annualTaxableNetSalary = calculateAnnualTaxableNetSalary(annualBrutSalary, status);
        return annualTaxableNetSalary - (annualTaxableNetSalary * TAXE_ABATMENT);
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
