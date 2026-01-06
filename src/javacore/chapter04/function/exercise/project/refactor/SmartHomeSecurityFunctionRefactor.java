package javacore.chapter04.function.exercise.project.refactor;

public class SmartHomeSecurityFunctionRefactor {

    public static void main(String[] args) {

        boolean isHouseEmpty = false;
        boolean isOwnerAsleep = false;
        boolean areAllDoorsAndWindowsClosed = true;
        boolean isAlarmActivated = true;

        boolean isSafeModeActivated = isSafeModeActivated(isHouseEmpty, isOwnerAsleep, areAllDoorsAndWindowsClosed, isAlarmActivated);

        displaySecurityStatus(isSafeModeActivated, isHouseEmpty, isOwnerAsleep, areAllDoorsAndWindowsClosed, isAlarmActivated);
    }

    public static boolean isSafeModeActivated(boolean isHouseEmpty, boolean isOwnerAsleep, boolean areAllDoorsAndWindowsClosed, boolean isAlarmActivated) {
        return (isHouseEmpty || isOwnerAsleep) && areAllDoorsAndWindowsClosed && isAlarmActivated;
    }

    public static void displaySecurityStatus(boolean isSafeModeActivated, boolean isHouseEmpty, boolean isOwnerAsleep, boolean areAllDoorsAndWindowsClosed, boolean isAlarmActivated) {

        if (isSafeModeActivated) {
            System.out.println("Mode sécurisé ACTIVÉ : toutes les conditions sont remplies.");
            return;
        }

        System.out.println("Mode sécurisé NON activé :");

        if (!isHouseEmpty && !isOwnerAsleep) {
            System.out.println("- La maison n'est pas vide et le propriétaire n'est pas endormi.");
        }
        if (!areAllDoorsAndWindowsClosed) {
            System.out.println("- Toutes les portes et fenêtres ne sont pas fermées.");
        }
        if (!isAlarmActivated) {
            System.out.println("- L'alarme n'est pas activée.");
        }
    }
}
