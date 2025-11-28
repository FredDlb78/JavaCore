package javacore.chapter02.condition.exercise;

public class SmartHomeSecurity {

    public static void main(String[] args) {

        boolean isHouseEmpty = true;
        boolean isOwnerAsleep = true;
        boolean areAllDoorsAndWindowsClosed = true;
        boolean isAlarmActivated = true;

        boolean isSafeModeActivated = (!isHouseEmpty || !isOwnerAsleep) && areAllDoorsAndWindowsClosed && isAlarmActivated;
        String safeModeNotActivatedMsg = "Le safe mode n'est pas activé.";

        if (isSafeModeActivated) {
            System.out.println("Toutes les conditions sont remplies, l'alarme est activée.");
        }/* else if (isHouseEmpty || isOwnerAsleep) {
            System.out.println("Le maison n'est pas vide et/ou le propriétraire n'est pas endormi.");
            System.out.println(safeModeNotActivatedMsg);*/

        // Ici, j'ai hésité entre les 2 solutions, celle que j'ai choisi, peut ne pas montrer tous les problèmes d'un coup car impossible de rentrer dans les 2 conditions
        // Mais elle affiche un message plus précis qui est toujours vrai.
        // Celle de dessus est plus adaptée mais ne pas l'info précise entre les 2 raisons du coup j'ai opté pour la 2ème.
        // Seul problème, c'est que tant que la maison n'est pas vide, on ne rentre jamais dans l'autre conditon isOwnerAsleep.

        else if (isHouseEmpty) {
            System.out.println("Le maison n'est pas vide.");
            System.out.println(safeModeNotActivatedMsg);
        } else if (isOwnerAsleep) {
            System.out.println("Le propriétaire est endormi.");
            System.out.println(safeModeNotActivatedMsg);
        } else if (!areAllDoorsAndWindowsClosed) {
            System.out.println("Toutes les portes et fenêtres ne sont pas fermées, l'alarme n'est pas activée");
            System.out.println(safeModeNotActivatedMsg);
        } else if (!isAlarmActivated) {
            System.out.println("L'alarme n'est pas activée");
            System.out.println(safeModeNotActivatedMsg);
        }


    }
}
