package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class UserQuestionnaire {

    public static void main (String[] args) {

        double result = 0;
        String message = "";
        String userLastName = "";
        String animalName= "";
        String hasAnimal = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Renseignez votre prénom : ");
        String userFirstName = sc.nextLine();

        System.out.print("Renseignez votre âge : ");
        byte age = sc.nextByte();
        sc.nextLine();

        System.out.print("Souhaitez-vous continuer à répondre aux questions suivantes ?");
        String userWishContinueReply = sc.nextLine();

        if (isYes(userWishContinueReply)) {
            System.out.print("Quel est le résultat de 5/2 ?");
            result = sc.nextDouble();
            
            sc.nextLine();

            System.out.print("Renseignez votre nom de famille : ");
            userLastName = sc.nextLine();

            System.out.print("Avez vous un animal de compagnie ?");
            hasAnimal = sc.nextLine();
            message = isYes(hasAnimal) ? "Vous avez un animal de compagnie." : "Vous n'avez pas d'animal de compagnie.";

            if (isYes(hasAnimal)) {
                System.out.print("Quel est le nom de votre animal de compagnie ?");
                animalName = sc.nextLine();
            }
        } else {
            System.out.println("Questionnaire terminé.");
        }

        System.out.println("Votre prénom est : " + userFirstName);
        System.out.println("Votre âge est de " + age + " ans.");
        System.out.println("Souhaitez-vous répondre à la suite du questionnaire ?" +userWishContinueReply);
        if (isYes(userWishContinueReply)) {
            System.out.println("Vous avez répondu à 5 /2 = " + result);
            System.out.println("Votre nom est : " + userLastName);
            System.out.println(message);
            if (isYes(hasAnimal)) {
                System.out.println("Le nom de votre animal de compagnie est : " + animalName);
            }
        }
    }

    public static boolean isYes(String response) {
        return response.toLowerCase().equals("oui");
    }
}
