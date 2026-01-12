package javacore.chapter04.function.exercise.project.refactor;

public class FlightReservationValidatorFunctionRefactor {

    public static void main(String[] args) {

        boolean isLoggedIn = true;
        int age = 1;
        int seatsAvailable = 1;
        boolean isPremiumMember = false;
        boolean isVIPFlight = false;

        isPossibleToBook(isLoggedIn, age, seatsAvailable, isPremiumMember, isVIPFlight);
    }

    public static boolean isPossibleToBook(boolean isLoggedIn, int age, int seatsAvailable, boolean isPremiumMember, boolean isVIPFlight) {
        if (!isLoggedIn) {
            System.err.println("Veuillez vous connecter pour effectuer votre réservation.");
            return false;
        }
        if (age < 0) {
            System.err.println("L'age ne peut pas être négatif. Age: " + age);
            return false;
        }
        if (seatsAvailable <= 0) {
            System.err.println("Le nombre de siège(s) disponible(s) est insuffisant. Nombre de siège(s) disponible(s): " + seatsAvailable);
            return false;
        }
        if (isVIPFlight && !isPremiumMember) {
            System.err.println("Ce vol est réservé aux membres VIP. Vous n'en faites pas encore parti.");
            return false;
        }
        System.out.println("Réservation effectuée avec succès.");
        return true;
    }
}
