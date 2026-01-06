package javacore.chapter04.function.exercise.project.refactor;

public class ScholarshipEligibilityFunctionRefactor {

    private static final double MIN_GPA_ELIGIBILITY = 3.5;
    private static final double MAX_GPA_ELIGIBILITY = 5.0;

    private static final double PARTIAL_HIGH_LIMIT = 60000;
    private static final double PARTIAL_LOW_LIMIT = 40000;
    private static final double FULLY_LOW_LIMIT = 0;

    public static void main(String[] args) {

        double studentGpa = 3.6;
        double householdIncome = 39999;
        boolean hasExtracurricular = true;


        boolean isValidGpa = isValidStudentGpa(studentGpa);
        boolean isEligibleGpa = isEligibleStudentGpa(studentGpa);

        displayStudentGpaEligibility(isValidGpa, isEligibleGpa, studentGpa);
        displayGpaValue(studentGpa);
        displayHouseholdIncomeEligibility(householdIncome);
        displayExtracurricular(hasExtracurricular);

        boolean isHouseholdIncomeFullyEligible = isHouseholdIncomeFullyEligible(householdIncome);
        boolean isHouseholdIncomePartiallyEligible = isHouseholdIncomePartiallyEligible(householdIncome);

        boolean isFullyEligible = isEligibleGpa && isHouseholdIncomeFullyEligible && hasExtracurricular;
        boolean isPartiallyEligible = isEligibleGpa && isHouseholdIncomePartiallyEligible && hasExtracurricular;

        displayStudentEligibility(isFullyEligible, isPartiallyEligible);
    }

    public static void displayStudentEligibility(boolean isFullyEligible, boolean isPartiallyEligible) {
        if (isFullyEligible) {
            System.out.println("L'étudiant est éligible à une bourse à taux plein.");
        } else if (isPartiallyEligible) {
            System.out.println("L'étudiant est éligible à une bourse à taux partiel.");
        } else {
            System.out.println("L'étudiant n'est pas éligible à une bourse.");
        }
    }


    public static void displayHouseholdIncomeEligibility(double householdIncome) {
        if (!isValidHouseholdIncome(householdIncome)) {
            System.err.println("Les revenus ne peuvent être négatifs.");
        } else if (!isEligibleHouseholdIncome(householdIncome)) {
            System.err.println("Les revenus ne sont pas éligibles à une bourse.");
        } else if (isHouseholdIncomeFullyEligible(householdIncome)) {
            System.out.println("Les revenus sont éligibles à une bourse à taux plein.");
        } else if (isHouseholdIncomePartiallyEligible(householdIncome)) {
            System.out.println("Les revenus sont éligibles à une bourse à taux partiel.");
        }
        displayHouseholdIncome(householdIncome);
    }

    public static void displayExtracurricular(boolean hasExtracurricular) {
        if (!hasExtracurricular) {
            System.out.println("L'étudiant ne pratique pas d'activité parascolaire. Il n'est pas éligible.");
        } else {
            System.out.println("L'étudiant pratique une activité parascolaire. Il est éligible.");
        }
    }

    public static void displayHouseholdIncome(double householdIncome) {
        System.out.println("Revenus: " + householdIncome);
    }

    public static boolean isValidHouseholdIncome(double householdIncome) {
        return householdIncome >= FULLY_LOW_LIMIT;
    }

    public static boolean isEligibleHouseholdIncome(double householdIncome) {
        return householdIncome <= PARTIAL_HIGH_LIMIT;
    }

    public static boolean isHouseholdIncomeFullyEligible(double householdIncome) {
        return householdIncome >= FULLY_LOW_LIMIT && householdIncome < PARTIAL_LOW_LIMIT;
    }

    public static boolean isHouseholdIncomePartiallyEligible(double householdIncome) {
        return householdIncome >= PARTIAL_LOW_LIMIT && householdIncome <= PARTIAL_HIGH_LIMIT;
    }

    public static boolean isValidStudentGpa(double studentGpa) {
        return studentGpa >= 0 && studentGpa <= MAX_GPA_ELIGIBILITY;
    }

    public static boolean isEligibleStudentGpa(double studentGpa) {
        return isValidStudentGpa(studentGpa) && studentGpa > MIN_GPA_ELIGIBILITY;
    }

    public static void displayStudentGpaEligibility(boolean isValidGpa, boolean isEligibleGpa, double studentGpa) {
        if (!isValidGpa) {
            System.out.println("GPA invalide.");
        } else if (!isEligibleGpa) {
            System.out.println("Le GPA n'est pas éligible.");
        } else {
            System.out.println("Le GPA est éligible.");
        }
    }

    public static void displayGpaValue(double studentGpa) {
        System.out.println("GPA: " + studentGpa);
    }
}
