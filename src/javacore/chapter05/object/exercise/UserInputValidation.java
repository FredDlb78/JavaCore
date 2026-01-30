package javacore.chapter05.object.exercise;

import java.util.Locale;
import java.util.Scanner;

public class UserInputValidation {

    static Scanner sc = new Scanner(System.in);
    static String dayOfTheWeek = "";

    public static void main(String[] args) {

        do {
            setDayOfTheWeek();

            //Message pour l'utilisateur si la réponse n'est pas correcte
            if (!isCorrectUserDayResponse(dayOfTheWeek)) {
                System.out.println("Jour invalide. Réessayez.");
            }

        } while (!isCorrectUserDayResponse(dayOfTheWeek));

        //System.out.println("Le jour saisi est correct : " + dayOfTheWeek);
    }

    public static void setDayOfTheWeek() {
        System.out.print("Veuillez renseigner le jour de la semaine en minuscules svp : ");
        dayOfTheWeek = sc.nextLine().trim().toLowerCase(Locale.ROOT);
        // J'ai mis le trim() en premier parce que j'ai vu que le raisonnement était : nettoyer la donnée, normaliser puis traiter mais ça ne change rien dans ce cas.
    }

    public static boolean isCorrectUserDayResponse(String dayOfTheWeekResponse) {
        return dayOfTheWeekResponse.equals("lundi")
                || dayOfTheWeekResponse.equals("mardi")
                || dayOfTheWeekResponse.equals("mercredi")
                || dayOfTheWeekResponse.equals("jeudi")
                || dayOfTheWeekResponse.equals("vendredi")
                || dayOfTheWeekResponse.equals("samedi")
                || dayOfTheWeekResponse.equals("dimanche");
    }
}
