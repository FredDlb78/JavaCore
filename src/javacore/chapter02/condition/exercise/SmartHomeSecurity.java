package javacore.chapter02.condition.exercise;

public class SmartHomeSecurity {

    public static void main(String[] args) {

        boolean isHouseEmpty = true;
        boolean isOwnerAsleep = true;
        boolean areAllDoorsAndWindowsClosed = true;
        boolean isAlarmActivated = true;

        boolean isSafeModeActivated = (isHouseEmpty || isOwnerAsleep) && areAllDoorsAndWindowsClosed && isAlarmActivated;

        if (isSafeModeActivated) {
            System.out.println("Mode sécurisé ACTIVÉ : toutes les conditions sont remplies.");
        } else {
            System.out.println("Mode sécurisé NON activé :");
            if (!isHouseEmpty && !isOwnerAsleep) {
                System.out.println("- La maison n'est pas vide et le propriétaire n'est pas endormi.");
            } else if (!areAllDoorsAndWindowsClosed) {
                System.out.println("- Toutes les portes et fenêtres ne sont pas fermées.");
            } else if (!isAlarmActivated) {
                System.out.println("- L'alarme n'est pas activée.");
            }
        }
    }
}