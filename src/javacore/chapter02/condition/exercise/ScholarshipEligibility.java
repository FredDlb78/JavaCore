package javacore.chapter02.condition.exercise;

public class ScholarshipEligibility {


    public static void main(String[] args) {

        //> 3.5 éligible
        // -0.1, 0, 3.5, 3.6, 5, 5.1
        double studentGpa = 4.1;
        boolean isStudentGPAEligible = false;

        final double MIN_GPA_ELIGIBILITY = 3.5;
        final double MAX_GPA_ELIGIBILITY = 5.0;

        //<40000 éligible taux plein, entre 40000 et 60000 éligible taux partiel, + 60000 pas éligible
        // -0.1, 0, 39999, 40000, 60000, 60000.1
        double householdIncome = 39999;
        boolean isHouseholdIncomeFullyEligible = false;
        boolean isHouseholdIncomePartiallyEligible = false;

        final double PARTIAL_HIGH_LIMIT = 60000;
        final double PARTIAL_LOW_LIMIT = 40000;
        final double FULLY_LOW_LIMIT = 0;

        // true, false
        boolean hasExtracurricular = true;

        // Vérifications du GPA

        if (studentGpa < 0 || studentGpa > MAX_GPA_ELIGIBILITY) {
            System.out.println("GPA invalide.");
        } else {
            isStudentGPAEligible = studentGpa > MIN_GPA_ELIGIBILITY && studentGpa <= MAX_GPA_ELIGIBILITY;

            if (isStudentGPAEligible) {
                System.out.println("Le GPA est éligible");
            } else {
                System.out.println("Le GPA n'est pas éligible.");
            }
        }
        System.out.println("GPA: " + studentGpa);

        // Vérifications du householdIncome

        if (householdIncome < FULLY_LOW_LIMIT) {
            System.out.println("Les revenus ne peuvent pas être négatifs");
        } else if (householdIncome > PARTIAL_HIGH_LIMIT) {
            System.out.println("Les revenus sont pas éligibles à une bourse.");
        } else {
            if (householdIncome < PARTIAL_LOW_LIMIT) {
                isHouseholdIncomeFullyEligible = true;
                System.out.println("Les revenus sont éligibles à une bourse à taux plein.");
            } else {
                isHouseholdIncomePartiallyEligible = true;
                System.out.println("Les revenus sont éligibles à une bourse à taux partiel.");
            }
        }
        System.out.println("Revenus: " + householdIncome + " $");

        // Vérifications du hasExtracurricular

        if (!hasExtracurricular) {
            System.out.println("L'étudiant ne pratique pas d'activité parascolaire. Il n'est pas éligible.");
        } else {
            System.out.println("L'étudiant pratique une activité parascolaire. Il est éligible.");
        }

        // Vérifications de l'éligibilité globale

        boolean isFullyEligible = isStudentGPAEligible && isHouseholdIncomeFullyEligible && hasExtracurricular;
        boolean isPartiallyEligible = isStudentGPAEligible && isHouseholdIncomePartiallyEligible && hasExtracurricular;

        if (isFullyEligible) {
            System.out.println("L'étudiant est éligible à une bourse à taux plein");
        } else if (isPartiallyEligible) {
            System.out.println("L'étudiant est éligible à une bourse à taux partiel.");
        } else {
            System.out.println("L'étudiant n'est pas éligible à une bourse.");
        }

    }
}
