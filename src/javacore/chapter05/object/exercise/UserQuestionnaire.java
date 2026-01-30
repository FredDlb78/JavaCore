package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class UserQuestionnaire {

    static Scanner sc = new Scanner(System.in);

    static double result = 0;
    static int age;

    static String message = "";
    static String userFirstName;
    static String userLastName = "";
    static String animalName = "";
    static String hasAnimal = "";
    static String userWishContinueReply;

    public static void main(String[] args) {

        setUserFirstName();
        setUserAge();
        setUserResponseForContinueForm();

        if (isYes(userWishContinueReply)) {
            setResult();
            setUserLastName();
            setHasAnimal();
            setMessage(hasAnimal);

            if (isYes(hasAnimal)) {
                setAnimalName();
            }
        } else {
            System.out.println("Questionnaire terminé.");
        }

        displayFormResponses();
    }

    public static void displayFormResponses() {
        System.out.println("Votre prénom est : " + userFirstName);
        System.out.println("Votre âge est de " + age + " ans.");
        System.out.println("Souhaitez-vous répondre à la suite du questionnaire ? " + userWishContinueReply);

        if (isYes(userWishContinueReply)) {
            System.out.println("Vous avez répondu à 5 / 2 = " + result);
            System.out.println("Votre nom est : " + userLastName);
            System.out.println(message);

            if (isYes(hasAnimal)) {
                System.out.println("Le nom de votre animal de compagnie est : " + animalName);
            }
        }
    }

    public static void setUserFirstName() {
        System.out.print("Renseignez votre prénom : ");
        userFirstName = sc.nextLine();
    }

    public static void setUserAge() {
        System.out.print("Renseignez votre âge : ");
        age = sc.nextInt();
        sc.nextLine(); // consomme le '\n'
    }

    public static void setUserResponseForContinueForm() {
        System.out.print("Souhaitez-vous continuer à répondre aux questions suivantes ? ");
        userWishContinueReply = sc.nextLine();
    }

    public static void setResult() {
        System.out.print("Quel est le résultat de 5/2 ? ");
        result = sc.nextDouble();
        sc.nextLine(); // consomme le '\n'
    }

    public static void setUserLastName() {
        System.out.print("Renseignez votre nom de famille : ");
        userLastName = sc.nextLine();
    }

    public static void setHasAnimal() {
        System.out.print("Avez vous un animal de compagnie ? ");
        hasAnimal = sc.nextLine();
    }

    public static void setMessage(String hasAnimal) {
        message = isYes(hasAnimal) ? "Vous avez un animal de compagnie." : "Vous n'avez pas d'animal de compagnie.";
    }

    public static void setAnimalName() {
        System.out.print("Quel est le nom de votre animal de compagnie ? ");
        animalName = sc.nextLine();
    }

    public static boolean isYes(String response) {
        return response != null && response.trim().equalsIgnoreCase("oui");
    }
}