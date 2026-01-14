package javacore.chapter04.function.exercise;

public class FrenchNetSalaryCalculator {

    static final int MONTHS_IN_ONE_YEAR = 12;
    static final int WORKED_DAYS_BY_WEEK = 5;
    static final  int WEEKS_IN_ONE_MONTH = 4;

    static double hoursWorkedPerDay   = 7.7;
    static double daysWorkedInMonth   = WORKED_DAYS_BY_WEEK * WEEKS_IN_ONE_MONTH;
    static double hoursWorkedPerMonth = hoursWorkedPerDay   * daysWorkedInMonth;
    static double hoursWorkedPerYear  = hoursWorkedPerMonth * MONTHS_IN_ONE_YEAR;

    static final double FIRST_BRACKET_TAXABLE_LIMIT  = 11294.0;      // 0 %
    static final double SECOND_BRACKET_TAXABLE_LIMIT = 28797.0;      // 11 %
    static final double THIRD_BRACKET_TAXABLE_LIMIT  = 82341.0;      // 30 %
    static final double FOURTH_BRACKET_TAXABLE_LIMIT = 177106.0;     // 41 %

    static final double FIRST_TAXABLE_RATE  = 0.0;
    static final double SECOND_TAXABLE_RATE = 0.11;
    static final double THIRD_TAXABLE_RATE  = 0.30;
    static final double FOURTH_TAXABLE_RATE = 0.41;
    static final double FIFTH_TAXABLE_RATE  = 0.45;


    public static void main(String[] args) {

        double socialChargeRate = 0.23;   // ouvrier
        double taxAllowanceRate = 0.10;   // abattement 10 %

        displayTitle("SMIC Français (2022)");
        double smicHourlyRate = 11.07;

        double smicAnnualGross = calculateAnnualGrossSalary(smicHourlyRate);
        System.out.println("Salaire brut annuel : " + smicAnnualGross + " €");

        double smicNetTaxable = applySocialCharges(smicAnnualGross, socialChargeRate);
        System.out.println("Net imposable (après charges) : " + smicNetTaxable + " €");

        double smicNetAfterAllowance = applyTaxAllowance(smicNetTaxable, taxAllowanceRate);
        System.out.println("Net imposable (après abattement) : " + smicNetAfterAllowance + " €");

        double smicNetAnnual = applyRevenueTax(smicNetAfterAllowance);
        System.out.println("Salaire net annuel : " + smicNetAnnual + " €");

        displayTitle("Salaire Médian Français (2022)");

        double medianHourlyRate = 17.50;

        double medianAnnualGross = calculateAnnualGrossSalary(medianHourlyRate);
        System.out.println("Salaire brut annuel : " + medianAnnualGross + " €");

        double medianNetTaxable = applySocialCharges(medianAnnualGross, socialChargeRate);
        System.out.println("Net imposable (après charges) : " + medianNetTaxable + " €");

        double medianNetAfterAllowance = applyTaxAllowance(medianNetTaxable, taxAllowanceRate);
        System.out.println("Net imposable (après abattement) : " + medianNetAfterAllowance + " €");

        double medianNetAnnual = applyRevenueTax(medianNetAfterAllowance);
        System.out.println("Salaire net annuel : " + medianNetAnnual + " €");

        displayTitle("Salaire Moyen Français (2022)");

        double averageHourlyRate = 22.50;

        double averageAnnualGross = calculateAnnualGrossSalary(averageHourlyRate);
        System.out.println("Salaire brut annuel : " + averageAnnualGross + " €");

        double averageNetTaxable = applySocialCharges(averageAnnualGross, socialChargeRate);
        System.out.println("Net imposable (après charges) : " + averageNetTaxable + " €");

        double averageNetAfterAllowance = applyTaxAllowance(averageNetTaxable, taxAllowanceRate);
        System.out.println("Net imposable (après abattement) : " + averageNetAfterAllowance + " €");

        double averageNetAnnual = applyRevenueTax(averageNetAfterAllowance);
        System.out.println("Salaire net annuel : " + averageNetAnnual + " €");

        displayTitle("Seuil de richesse (2022)");

        double wealthHourlyRate = 35.00;

        double wealthAnnualGross = calculateAnnualGrossSalary(wealthHourlyRate);
        System.out.println("Salaire brut annuel : " + wealthAnnualGross + " €");

        double wealthNetTaxable = applySocialCharges(wealthAnnualGross, socialChargeRate);
        System.out.println("Net imposable (après charges) : " + wealthNetTaxable + " €");

        double wealthNetAfterAllowance = applyTaxAllowance(wealthNetTaxable, taxAllowanceRate);
        System.out.println("Net imposable (après abattement) : " + wealthNetAfterAllowance + " €");

        double wealthNetAnnual = applyRevenueTax(wealthNetAfterAllowance);
        System.out.println("Salaire net annuel : " + wealthNetAnnual + " €");
    }

    public static void displayTitle(String title) {
        System.out.println();
        System.out.println("========== " + title + " ==========");
        System.out.println();
    }

    public static double calculateAnnualGrossSalary(double grossHourlyRate) {
        return grossHourlyRate * hoursWorkedPerYear;
    }

    public static double applySocialCharges(double annualGrossSalary, double socialChargePercentage) {
        return annualGrossSalary - (annualGrossSalary * socialChargePercentage);
    }

    public static double applyTaxAllowance(double annualNetSalary, double taxAllowancePercentage) {
        return annualNetSalary - annualNetSalary * taxAllowancePercentage;
    }

    public static double applyRevenueTax(double annualNetSalary) {
        if (annualNetSalary < 0) {
            return annualNetSalary;
        }

        double fifthTaxablePortion  = 0;
        double fourthTaxablePortion = 0;
        double thirdTaxablePortion  = 0;
        double secondTaxablePortion = 0;
        double firstTaxablePortion  = 0;

        if (annualNetSalary > FOURTH_BRACKET_TAXABLE_LIMIT) {
            fifthTaxablePortion = annualNetSalary - FOURTH_BRACKET_TAXABLE_LIMIT;
        }

        if (annualNetSalary > FOURTH_BRACKET_TAXABLE_LIMIT) {
            fourthTaxablePortion = FOURTH_BRACKET_TAXABLE_LIMIT - THIRD_BRACKET_TAXABLE_LIMIT;
        } else if (annualNetSalary > THIRD_BRACKET_TAXABLE_LIMIT) {
            fourthTaxablePortion = annualNetSalary - THIRD_BRACKET_TAXABLE_LIMIT;
        }

        if (annualNetSalary > THIRD_BRACKET_TAXABLE_LIMIT) {
            thirdTaxablePortion = THIRD_BRACKET_TAXABLE_LIMIT - SECOND_BRACKET_TAXABLE_LIMIT;
        } else if (annualNetSalary > SECOND_BRACKET_TAXABLE_LIMIT) {
            thirdTaxablePortion = annualNetSalary - SECOND_BRACKET_TAXABLE_LIMIT;
        }

        if (annualNetSalary > SECOND_BRACKET_TAXABLE_LIMIT) {
            secondTaxablePortion = SECOND_BRACKET_TAXABLE_LIMIT - FIRST_BRACKET_TAXABLE_LIMIT;
        } else if (annualNetSalary > FIRST_BRACKET_TAXABLE_LIMIT) {
            secondTaxablePortion = annualNetSalary - FIRST_BRACKET_TAXABLE_LIMIT;
        }

        if (annualNetSalary > FIRST_BRACKET_TAXABLE_LIMIT) {
            firstTaxablePortion = FIRST_BRACKET_TAXABLE_LIMIT;
        } else {
            firstTaxablePortion = annualNetSalary;
        }

        double totalTax = (firstTaxablePortion  * FIRST_TAXABLE_RATE)
                        + (secondTaxablePortion * SECOND_TAXABLE_RATE)
                        + (thirdTaxablePortion  * THIRD_TAXABLE_RATE)
                        + (fourthTaxablePortion * FOURTH_TAXABLE_RATE)
                        + (fifthTaxablePortion  * FIFTH_TAXABLE_RATE);

        return annualNetSalary - totalTax;
    }
}