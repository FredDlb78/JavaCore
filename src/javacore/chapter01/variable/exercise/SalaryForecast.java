package javacore.chapter01.variable.exercise;

public class SalaryForecast {

    public static void main(String[] args) {

        // Données en dur

        double netOfSocialRate = 0.75;
        double afterTaxRate = 0.895;
        double grossHourlyRate = 25; // en euros
        double hoursWorkedPerDay = 7.7;
        double hoursWorkedPerWeek = hoursWorkedPerDay * 5;
        int weeksInMonth = 4;
        int monthsInYear = 12;
        int daysWorkedInWeek = 5;

        // Calculs liés aux taux

        double taxableNetHourlyRate = grossHourlyRate * netOfSocialRate; // en euros
        double netHourlyRate = taxableNetHourlyRate * afterTaxRate; // en euros

        // Calculs liés au durées

        double daysWorkedInMonth = daysWorkedInWeek * weeksInMonth;
        double hoursWorkedPerMonth = hoursWorkedPerDay * daysWorkedInMonth;
        double hoursWorkedPerYear = hoursWorkedPerMonth * monthsInYear;
        /*
        Ici j'ai finalement opté pour la solution au dessus vs en dessous car si on doit faire un refacto
        sur le calcul du nombre d'heures travaillées par mois, ça fixera les 2 calculs automatiquement
        au lieu de devoir corriger hoursWorkedPerMonth ET hoursWorkedPerYear
        */
        //double hoursWorkedPerYear = hoursWorkedPerWeek * weeksInYear;

        // Exercices part 1: Calculs des montants bruts

        double grossDailySalary = grossHourlyRate * hoursWorkedPerDay;
        double grossWeeklySalary = grossHourlyRate * hoursWorkedPerWeek;
        double grossMonthlySalary = grossHourlyRate * hoursWorkedPerMonth;
        double grossAnnualSalary = grossHourlyRate * hoursWorkedPerYear;

        // Exercices part 2: Calculs des montants nets imposables

        double taxableNetMonthlySalary = taxableNetHourlyRate * hoursWorkedPerMonth;
        double taxableNetAnnualSalary = taxableNetHourlyRate * hoursWorkedPerYear;

        // Exercices part 3: Calculs des montants nets

        double netMonthlySalary = netHourlyRate * hoursWorkedPerMonth;
        double netAnnualSalary = netHourlyRate * hoursWorkedPerYear;

        System.out.println("Salaire brut journalier : " + grossDailySalary + " euro(s)");
        System.out.println("Salaire brut hebdo : " + grossWeeklySalary + " euro(s)");
        System.out.println("Salaire brut mensuel : " + grossMonthlySalary + " euro(s)");
        System.out.println("Salaire brut annuel : " + grossAnnualSalary + " euro(s)");
        System.out.println("Salaire net imposable mensuel : " + taxableNetMonthlySalary + " euro(s)");
        System.out.println("Salaire net imposable annuel : " + taxableNetAnnualSalary + " euro(s)");
        System.out.println("Salaire net mensuel : " + netMonthlySalary + " euro(s)");
        System.out.println("Salaire net annuel : " + netAnnualSalary + " euro(s)");




        // Données non utilisées mais dont je me suis servi en construisant le programme

        //        String employeeWork = "développeur";
        //        String employeeStatus = "cadre";
        //        int weeksInYear = 52;

        /*
        System.out.println("Taux horaire brut: " + grossHourlyRate + " euros");
        System.out.println("Nombre d'heures travaillées par jour: " + hoursWorkedPerDay);
        System.out.println("Nombre d'heures travaillées par semaine: " + hoursWorkedPerWeek);
        System.out.println("Nombre de semaines par mois: " + weeksInMonth);
        System.out.println("Nombre de jours travaillés par semaine: " + daysWorkedInWeek);
        System.out.println("Nombre de jours travaillés par mois: " + daysWorkedInMonth);
        System.out.println("Nombre d'heures travaillées par mois: " + hoursWorkedPerMonth);
        System.out.println("Salaire brut mensuel : " + grossMonthSalary + " euros");
        */

    }
}
