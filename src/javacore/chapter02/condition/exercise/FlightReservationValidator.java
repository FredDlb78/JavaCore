package javacore.chapter02.condition.exercise;

public class FlightReservationValidator {


    public static void main(String[] args) {

        boolean isLoggedIn = true;

        int age = 1;

        int seatsAvailable = 1;

        boolean isPremiumMember = false;

        boolean isVIPFlight = false;

/*        if (isLoggedIn && age >= 18 && seatsAvailable > 0 && (!isVIPFlight || isPremiumMember)) {
            System.out.println("Reservation effectuee.");
        } else {
            System.out.println("Reservation impossible");
        }*/

        if (!isLoggedIn) {
            System.out.println("Veuillez vous connecter pour effectuer votre réservation.");
        } else if (age < 0) {
            System.out.println("L'age ne peut pas être négatif. Age: " + age);
        } else if (seatsAvailable <= 0) {
            System.out.println("Le nombre de sièges disponibles est insuffisant. Nombre de sièges disponibles: " + seatsAvailable);
        } else if (isVIPFlight && !isPremiumMember) {
            System.out.println("Ce vol est réservé aux membres VIP. Vous n'en faites pas encore parti.");
        } else {
            System.out.println("Réservation effectuée.");
        }

    }
}