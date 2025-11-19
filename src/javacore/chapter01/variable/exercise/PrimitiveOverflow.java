package javacore.chapter01.variable.exercise;

public class PrimitiveOverflow {

    public static void main(String[] args) {

        short hourSeconds = 60 * 60;
        System.out.println("Le nombre de secondes dans une heure est de " + hourSeconds + " secondes.");
        int daySeconds = hourSeconds * 24;
        System.out.println("Le nombre de secondes dans un jour est de " + daySeconds + " secondes.");
        int weekSeconds = daySeconds * 7;
        System.out.println("Le nombre de secondes dans une semaine est de " + weekSeconds + " secondes.");
        int monthSeconds = daySeconds * 30;
        System.out.println("Le nombre de secondes dans un mois est de " + monthSeconds + " secondes.");

       /*
          Les facteurs à considérer pour le futur (pour moi) sont:
          - la méthode de calcul pour le nombre de secondes dans un mois peut être amenée à évoluer
          pour devenir plus précise
          - il pourrait y'avoir plus tard des conditions en fonction des mois à 28, 29, 30 ou 31 jours
          - on pourrait vouloir calculer le nombre de jours exacts dans une année (365 ou 366)
          Les précision pourraient donc être:
          - le nb de jours secondes exactes dans 1 mois, une année, un siècle ...
          Utiliser la variable daySeconds est plus intéressante car:
          - toujours juste, ne va pas être amenée à évoluer donc c'est plus robuste dans le temps
          - on est aussi plus proche de la réalité sur une année, on a 365,25 avec daySeconds on obtient
          360 jours et avec weekSeconds on obtient 336 jours
        */

        long yearSeconds = daySeconds * 365;
        // Je choisis le type long pour éviter de potentiels débordements si on veut calculer des milliards d'années par exemple
        System.out.println("Le nombre de secondes dans une année est de " + yearSeconds + " secondes.");

    }

}
