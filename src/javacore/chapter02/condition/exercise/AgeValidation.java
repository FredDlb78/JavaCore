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

        int birthdayDay = 28;
        int birthdayMonth = 1;
        int birthdayYear = 2008;

        System.out.println("Vous êtes né le " + birthdayDay + "/" + birthdayMonth + "/" + birthdayYear + ".");

        final int LOW_LIMIT_BIRTHDAY_DAY = 1;
        final int HIGH_LIMIT_BIRTHDAY_DAY = 31; // BONUS 2: cette valeur ne sera plus un final car elle devra être modifiée en fonction du mois
        final int LOW_LIMIT_BIRTHDAY_MONTH = 1;
        final int HIGH_LIMIT_BIRTHDAY_MONTH = 12;
        final int YEAR_OF_MAJORITY = 18;

        int ageInYears = currentYear - birthdayYear;
        int ageInMonths = currentMonth - birthdayMonth;
        int ageInDays = currentDay - birthdayDay;

        // BONUS 2 : cette vérification est impactée par la gestion des années bissextiles
        // Actuellement, on vérifie juste que le jour est entre 1 et 31
        // Si on prend en compte les années bissextiles, il faut remplacer la limite par un nombre de jours calculés en fonction du mois et de l'année
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

            // Je vois que c'est faux mais je suis à cours d'idées
            int yearsRemainingUntilMajority = YEAR_OF_MAJORITY - (currentYear - birthdayYear);
            int monthsRemainingUntilMajority = currentMonth - birthdayMonth;
            int daysRemainingUntilMajority = currentDay - birthdayDay;
            System.out.println("Vous êtes mineur.");
            System.out.println("Vous serez majeur dans " + yearsRemainingUntilMajority + " ans, " + monthsRemainingUntilMajority + "mois et " + daysRemainingUntilMajority + " jours.");

        }
//        System.out.println("Vous avez " + ageInYears + " ans, " + ageInMonths + " mois et " + ageInDays + " jours.");

        // BONUS 1

        boolean hasMoreThan18Years = ageInYears > YEAR_OF_MAJORITY;
        boolean hasExactly18Years = ageInYears == YEAR_OF_MAJORITY;

        boolean hasMoreMonthsThisYear = ageInMonths > 0;
        boolean hasSameMonthThisYear = ageInMonths == 0;

        boolean hasReachedBirthdayThisMonth = ageInDays >= 0;

        boolean isMajor = hasMoreThan18Years
                || (hasExactly18Years && hasMoreMonthsThisYear)
                || (hasExactly18Years && hasSameMonthThisYear && hasReachedBirthdayThisMonth);

        if (ageInYears < 0) {
            System.out.println("1 - Vous n'êtes pas encore né. :)");
        } else if (isMajor) {
            System.out.println("1 - Vous êtes majeur.");
        } else {
            System.out.println("1 - Vous êtes mineur.");
        }
    }
}
