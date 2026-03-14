package javacore.chapter05.object.exercise;

import java.util.Random;
import java.util.Scanner;

public class MysteryNumberGame {

    static Scanner sc = new Scanner(System.in);
    static int MAX_ATTEMPTS = 7;
    static int MIN_LIMIT = 0;
    static int MAX_LIMIT = 100;

    public static void main(String[] args) {

        // 1
//        Random random = new Random();
//        int nombre = random.nextInt(101);
//        System.out.println(nombre);

        // 2
        // Une instance = des données + des comportements qui opèrent sur ces données. Random est un exemple parfait d'une
        // classe qui a besoin d'état pour fonctionner correctement.

        // 3
        askUserResponse();
    }

    // 3
    public static int generateRandomNumberFromZeroTo(int maxLimitPlusOne) {
        Random random = new Random();
        return random.nextInt(maxLimitPlusOne);
        
    // 4
    // 7 tentatives suffisent toujours grâce à la dichotomie : chaque essai divise l'espace par 2, et log₂(101) ≈ 7.

    }

    public static void askUserResponse() {

        int randomNumber = generateRandomNumberFromZeroTo(101);
        int userResponse;
        boolean isValidResponse;
        int attempts = 0;

        do {
            System.out.print("Veuillez entrer un numéro entre " + MIN_LIMIT + " et " + MAX_LIMIT + " : ");
            userResponse = sc.nextInt();
            isValidResponse = userResponse >= MIN_LIMIT && userResponse <= MAX_LIMIT;

            attempts++;
            int remainingAttempts = MAX_ATTEMPTS - attempts;
            System.out.println(remainingAttempts + " tentatives restantes.");

            if (!isValidResponse) {
                System.err.println("Valeur non comprise entre " + MIN_LIMIT + " et " + MAX_LIMIT + ".");
                System.err.println("Fin du programme.");
                break;
            }

            if (randomNumber == userResponse) {
                System.out.println("Bravo, vous avez trouvé le nombre : " + randomNumber);
                break;
            } else if (randomNumber > userResponse) {
                System.out.println("C'est plus!");
            } else {
                System.out.println("C'est moins!");
            }
        } while (attempts < MAX_ATTEMPTS);
    }
}