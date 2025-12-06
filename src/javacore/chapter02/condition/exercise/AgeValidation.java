package javacore.chapter02.condition.exercise;

public class AgeValidation {

    public static void main(String[] args) {

        /**
         * Début d'un code que nous ne comprenons pas à ce stade de la formation...
         */

        // Récupération de la date courante de la machine exécutant ce programme
        java.time.LocalDate currentDate = java.time.LocalDate.now();

        int currentDay = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        int currentYear = currentDate.getYear();       // Année courante (202X)

        System.out.println("Nous sommes le " + currentDay + "/" + currentMonth + "/" + currentYear + ".");

        /**
         * Fin d'un code que nous ne comprenons pas, mais dont nous pouvons utiliser les variables !
         */

        // Écrivez votre code ci-dessous...

        // Cas à tester : jours  au dessus de 31 et en dessous de 1, mois au dessus de 12 et en dessous de 1. 18 ans aujourd'hui, 18 ans demain et 18 ans hier

        int birthdayDay = 8;
        int birthdayMonth = 12;
        int birthdayYear = 2007;

        System.out.println("Vous êtes né le " + birthdayDay + "/" + birthdayMonth + "/" + birthdayYear + ".");

/*        final int LOW_LIMIT_BIRTHDAY_DAY = 1;
        final int HIGH_LIMIT_BIRTHDAY_DAY = 31;
        final int LOW_LIMIT_BIRTHDAY_MONTH = 1;
        final int HIGH_LIMIT_BIRTHDAY_MONTH = 12;
        final int YEAR_OF_MAJORITY = 18;

        if ((birthdayDay < LOW_LIMIT_BIRTHDAY_DAY || birthdayDay > HIGH_LIMIT_BIRTHDAY_DAY) || (birthdayMonth < LOW_LIMIT_BIRTHDAY_MONTH || birthdayMonth > HIGH_LIMIT_BIRTHDAY_MONTH)) {
            System.out.println("La combinaison jour/mois de votre anniversaire n'est pas valide.");
            System.out.println("Le jour doit être compris entre " + LOW_LIMIT_BIRTHDAY_DAY + " et " + HIGH_LIMIT_BIRTHDAY_DAY + ". Jour actuel : " + birthdayDay + ".");
            System.out.println("Le mois doit être compris entre " + LOW_LIMIT_BIRTHDAY_MONTH + " et " + HIGH_LIMIT_BIRTHDAY_MONTH + ". Mois actuel : " + birthdayMonth + ".");

        } else if ((currentYear - birthdayYear) > YEAR_OF_MAJORITY) {
            System.out.println("Vous êtes majeur.");
        } else if ((currentYear - birthdayYear) == YEAR_OF_MAJORITY && ((currentMonth - birthdayMonth) > 0)) {
            System.out.println("Vous êtes majeur.");
        } else if ((currentYear - birthdayYear) == YEAR_OF_MAJORITY
                && (currentMonth - birthdayMonth) == 0
                && (currentDay - birthdayDay >= 0)) {
            System.out.println("Vous êtes majeur.");
        } else if ((currentYear - birthdayYear < 0)) {
            System.out.println("Vous n'êtes pas encore né. :)");
        } else {
            System.out.println("Vous êtes mineur.");
        }*/

        // BONUS 1

        final int DAYS_IN_1_YEAR = 365;
        final int DAYS_IN_18_YEAR = DAYS_IN_1_YEAR * 18;

        final int DAYS_IN_JANUARY   = 31;
        int DAYS_IN_FEBRUARY  = 28; // BONUS 2 : initialisé à 28 et va être impactée par les années bissextiles
        final int DAYS_IN_MARCH     = 31;
        final int DAYS_IN_APRIL     = 30;
        final int DAYS_IN_MAY       = 31;
        final int DAYS_IN_JUNE      = 30;
        final int DAYS_IN_JULY      = 31;
        final int DAYS_IN_AUGUST    = 31;
        final int DAYS_IN_SEPTEMBER = 30;
        final int DAYS_IN_OCTOBER   = 31;
        final int DAYS_IN_NOVEMBER  = 30;
        final int DAYS_IN_DECEMBER  = 31;

        // BONUS 2 : Calculs des années bissextiles
        boolean isBirthdayYearLeap = (birthdayYear % 400 == 0) || (birthdayYear % 4 == 0 && birthdayYear % 100 != 0); // BONUS 2
        boolean isCurrentYearLeap = (currentYear % 400 == 0) || (currentYear % 4 == 0 && currentYear % 100 != 0);   // BONUS 2

        // Années complètes entre l'année de naissance et l'année en cours
        int userCompleteYears = currentYear - birthdayYear - 1;
        if (userCompleteYears < 0) {
            userCompleteYears = 0;
        }
        int userCompleteYearsInDays = userCompleteYears * DAYS_IN_1_YEAR;

        int birthdayYearInDays = 0;
        int currentYearInDays = 0;

        // Jours restants dans l'année de naissance à partir de l'anniversaire
        if (birthdayMonth == 1) {
            birthdayYearInDays = (DAYS_IN_JANUARY - birthdayDay)
                    + DAYS_IN_FEBRUARY + DAYS_IN_MARCH + DAYS_IN_APRIL + DAYS_IN_MAY + DAYS_IN_JUNE
                    + DAYS_IN_JULY + DAYS_IN_AUGUST + DAYS_IN_SEPTEMBER + DAYS_IN_OCTOBER + DAYS_IN_NOVEMBER + DAYS_IN_DECEMBER;
        } else if (birthdayMonth == 2) {
            birthdayYearInDays = (DAYS_IN_FEBRUARY - birthdayDay)
                    + DAYS_IN_MARCH + DAYS_IN_APRIL + DAYS_IN_MAY + DAYS_IN_JUNE
                    + DAYS_IN_JULY + DAYS_IN_AUGUST + DAYS_IN_SEPTEMBER + DAYS_IN_OCTOBER + DAYS_IN_NOVEMBER + DAYS_IN_DECEMBER;
        } else if (birthdayMonth == 3) {
            birthdayYearInDays = (DAYS_IN_MARCH - birthdayDay)
                    + DAYS_IN_APRIL + DAYS_IN_MAY + DAYS_IN_JUNE
                    + DAYS_IN_JULY + DAYS_IN_AUGUST + DAYS_IN_SEPTEMBER + DAYS_IN_OCTOBER + DAYS_IN_NOVEMBER + DAYS_IN_DECEMBER;
        } else if (birthdayMonth == 4) {
            birthdayYearInDays = (DAYS_IN_APRIL - birthdayDay)
                    + DAYS_IN_MAY + DAYS_IN_JUNE + DAYS_IN_JULY
                    + DAYS_IN_AUGUST + DAYS_IN_SEPTEMBER + DAYS_IN_OCTOBER + DAYS_IN_NOVEMBER + DAYS_IN_DECEMBER;
        } else if (birthdayMonth == 5) {
            birthdayYearInDays = (DAYS_IN_MAY - birthdayDay)
                    + DAYS_IN_JUNE + DAYS_IN_JULY + DAYS_IN_AUGUST
                    + DAYS_IN_SEPTEMBER + DAYS_IN_OCTOBER + DAYS_IN_NOVEMBER + DAYS_IN_DECEMBER;
        } else if (birthdayMonth == 6) {
            birthdayYearInDays = (DAYS_IN_JUNE - birthdayDay)
                    + DAYS_IN_JULY + DAYS_IN_AUGUST + DAYS_IN_SEPTEMBER
                    + DAYS_IN_OCTOBER + DAYS_IN_NOVEMBER + DAYS_IN_DECEMBER;
        } else if (birthdayMonth == 7) {
            birthdayYearInDays = (DAYS_IN_JULY - birthdayDay)
                    + DAYS_IN_AUGUST + DAYS_IN_SEPTEMBER + DAYS_IN_OCTOBER + DAYS_IN_NOVEMBER + DAYS_IN_DECEMBER;
        } else if (birthdayMonth == 8) {
            birthdayYearInDays = (DAYS_IN_AUGUST - birthdayDay)
                    + DAYS_IN_SEPTEMBER + DAYS_IN_OCTOBER + DAYS_IN_NOVEMBER + DAYS_IN_DECEMBER;
        } else if (birthdayMonth == 9) {
            birthdayYearInDays = (DAYS_IN_SEPTEMBER - birthdayDay)
                    + DAYS_IN_OCTOBER + DAYS_IN_NOVEMBER + DAYS_IN_DECEMBER;
        } else if (birthdayMonth == 10) {
            birthdayYearInDays = (DAYS_IN_OCTOBER - birthdayDay)
                    + DAYS_IN_NOVEMBER + DAYS_IN_DECEMBER;
        } else if (birthdayMonth == 11) {
            birthdayYearInDays = (DAYS_IN_NOVEMBER - birthdayDay)
                    + DAYS_IN_DECEMBER;
        } else if (birthdayMonth == 12) {
            birthdayYearInDays = (DAYS_IN_DECEMBER - birthdayDay);
        }

        // BONUS 2 : Si l'année de naissance est bissextile et que l'anniversaire est en janvier ou février, il reste un jour de plus dans l'année de naissance après l'anniversaire.
        if (isBirthdayYearLeap && birthdayMonth <= 2) {
            birthdayYearInDays = birthdayYearInDays + 1;
        }

        // Jours écoulés dans l'année courante jusqu'à aujourd'hui
        if (currentMonth == 1) {
            currentYearInDays = currentDay;
        } else if (currentMonth == 2) {
            currentYearInDays = DAYS_IN_JANUARY + currentDay;
        } else if (currentMonth == 3) {
            currentYearInDays = DAYS_IN_JANUARY + DAYS_IN_FEBRUARY + currentDay;
        } else if (currentMonth == 4) {
            currentYearInDays = DAYS_IN_JANUARY + DAYS_IN_FEBRUARY + DAYS_IN_MARCH + currentDay;
        } else if (currentMonth == 5) {
            currentYearInDays = DAYS_IN_JANUARY + DAYS_IN_FEBRUARY + DAYS_IN_MARCH + DAYS_IN_APRIL + currentDay;
        } else if (currentMonth == 6) {
            currentYearInDays = DAYS_IN_JANUARY + DAYS_IN_FEBRUARY + DAYS_IN_MARCH + DAYS_IN_APRIL + DAYS_IN_MAY + currentDay;
        } else if (currentMonth == 7) {
            currentYearInDays = DAYS_IN_JANUARY + DAYS_IN_FEBRUARY + DAYS_IN_MARCH + DAYS_IN_APRIL + DAYS_IN_MAY + DAYS_IN_JUNE + currentDay;
        } else if (currentMonth == 8) {
            currentYearInDays = DAYS_IN_JANUARY + DAYS_IN_FEBRUARY + DAYS_IN_MARCH + DAYS_IN_APRIL + DAYS_IN_MAY + DAYS_IN_JUNE + DAYS_IN_JULY + currentDay;
        } else if (currentMonth == 9) {
            currentYearInDays = DAYS_IN_JANUARY + DAYS_IN_FEBRUARY + DAYS_IN_MARCH + DAYS_IN_APRIL + DAYS_IN_MAY + DAYS_IN_JUNE + DAYS_IN_JULY + DAYS_IN_AUGUST + currentDay;
        } else if (currentMonth == 10) {
            currentYearInDays = DAYS_IN_JANUARY + DAYS_IN_FEBRUARY + DAYS_IN_MARCH + DAYS_IN_APRIL + DAYS_IN_MAY + DAYS_IN_JUNE + DAYS_IN_JULY + DAYS_IN_AUGUST + DAYS_IN_SEPTEMBER + currentDay;
        } else if (currentMonth == 11) {
            currentYearInDays = DAYS_IN_JANUARY + DAYS_IN_FEBRUARY + DAYS_IN_MARCH + DAYS_IN_APRIL + DAYS_IN_MAY + DAYS_IN_JUNE + DAYS_IN_JULY + DAYS_IN_AUGUST + DAYS_IN_SEPTEMBER + DAYS_IN_OCTOBER + currentDay;
        } else if (currentMonth == 12) {
            currentYearInDays = DAYS_IN_JANUARY + DAYS_IN_FEBRUARY + DAYS_IN_MARCH + DAYS_IN_APRIL + DAYS_IN_MAY + DAYS_IN_JUNE + DAYS_IN_JULY + DAYS_IN_AUGUST + DAYS_IN_SEPTEMBER + DAYS_IN_OCTOBER + DAYS_IN_NOVEMBER + currentDay;
        }

        // BONUS 2 : Si l'année courante est bissextile et que nous sommes après février, on ajoute un jour.
        if (isCurrentYearLeap && currentMonth > 2) {
            currentYearInDays = currentYearInDays + 1;
        }

        int userAgeInDays = userCompleteYearsInDays + birthdayYearInDays + currentYearInDays;

        if (userAgeInDays >= DAYS_IN_18_YEAR) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
            int remainingDaysToBeMajor = DAYS_IN_18_YEAR - userAgeInDays;
            System.out.println("Vous serez majeur dans " + remainingDaysToBeMajor + " jours.");
        }
    }
}
