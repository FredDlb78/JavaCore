package javacore.chapter02.condition.practice;

public class PracticeOperatorLogical {

    public static void main(String[] args) {

        boolean trueAndTrue = true && true;  // true
        boolean trueAndFalse = true && false; // false
        boolean falseAndTrue = false && true;  // false
        boolean falseAndFalse = false && false; // false

        boolean trueOrTrue = true || true; // true
        boolean trueOrFalse = true || false; // true
        boolean falseOrTrue = false || true; // true
        boolean falseOrFalse = false || false; // false

        boolean notTrue = !true; // false
        boolean notFalse = !false; // vrai

        boolean notNotTrue = !!true;
        boolean notNotFalse = !!false;

        boolean isLoggedIn = true;
        int age = 18;
        int seatsAvailable = 1;

        boolean isPremiumMember = false;
        boolean isVipFlight = true; // Est ce que le vol est réservé aux VIP

        if (isLoggedIn == true && age >= 18 && seatsAvailable > 0 && (!isVipFlight || isPremiumMember)) {
            System.out.println("Réservation effectuée avec succès");
            seatsAvailable--; // Retirer un siège
            System.out.println("Il reste " + seatsAvailable + " places disponibles.");
        } else if (isLoggedIn == false){
            System.out.println("Veuillez vous connecter pour effectuer une réservation.");
        } else if (age < 18){
            System.out.println("Vous ne pouvez pas réserver de siège car vous êtes mineur.");
        } else if (seatsAvailable < 0){
            System.out.println("Nombre de siège(s) disponible(s) insuffisant(s) : " + seatsAvailable + " .");
        } else if (isVipFlight == true){
            System.out.println("Ce vol est réservé aux membres VIP.");
        } else if (isPremiumMember == false){
            System.out.println("Vous n'êtes pas membre premium.");
        }



    }
}
