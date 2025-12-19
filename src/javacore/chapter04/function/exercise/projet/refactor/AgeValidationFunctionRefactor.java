package javacore.chapter04.function.exercise.projet.refactor;

public class AgeValidationFunctionRefactor {

    public static void main(String[] args) {

        /**
         * Début d'un code que nous ne comprenons pas à ce stade de la formation...
         */

        // Récupération de la date courante de la machine exécutant ce programme
        java.time.LocalDate currentDate = java.time.LocalDate.now();

        int currentDay = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        int currentYear = currentDate.getYear();       // Année courante (202X)

        /**
         * Fin d'un code que nous ne comprenons pas, mais dont nous pouvons utiliser les variables !
         */

        // Écrivez votre code ci-dessous...

        // Cas à tester : jours  au dessus de 31 et en dessous de 1, mois au dessus de 12 et en dessous de 1. 18 ans aujourd'hui, 18 ans demain et 18 ans hier

        int birthdayDay = 19;
        int birthdayMonth = 12;
        int birthdayYear = 2007;

        displayCurrentDate(currentDay, currentMonth, currentYear);
        displayBirthdayDate(birthdayDay, birthdayMonth, birthdayYear);

        displayMajorityOrNot(birthdayYear, birthdayMonth, birthdayDay, thresoldYearMajorityCalculation(currentYear), currentMonth, currentDay);

    }

    public static void displayCurrentDate(int currentDay, int currentMonth, int currentYear) {
        System.out.println("Nous sommes le " + currentDay + "/" + currentMonth + "/" + currentYear + ".");    }

    public static void displayBirthdayDate(int birthdayDay, int birthdayMonth, int birthdayYear) {
        System.out.println("Vous êtes né le " + birthdayDay + "/" + birthdayMonth + "/" + birthdayYear + ".");
    }

    public static boolean isMajor(int birthdayYear, int birthdayMonth, int birthdayDay, int thresholdYear, int currentMonth, int currentDay) {
        boolean isMajor =
                (birthdayYear < thresholdYear) ||
                        (birthdayYear == thresholdYear && birthdayMonth < currentMonth) ||
                        (birthdayYear == thresholdYear && birthdayMonth == currentMonth && birthdayDay <= currentDay);
        return isMajor;
    }

    public static void displayMajorityOrNot(int birthdayYear, int birthdayMonth, int birthdayDay, int thresholdYear, int currentMonth, int currentDay) {
        if (isMajor(birthdayYear, birthdayMonth, birthdayDay, thresholdYear, currentMonth, currentDay)) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }
    }

    public static int thresoldYearMajorityCalculation(int currentYear) {
        final int MAJORITY_IN_YEARS = 18;
        int thresholdYearMajority = currentYear - MAJORITY_IN_YEARS;
        return thresholdYearMajority;
    }

}