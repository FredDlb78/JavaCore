package javacore.chapter05.object.practice;

import java.util.Scanner;

public class PracticeString {

    public static void main (String[] args) {

/*        String hello1 = "Bonjour";
        String hello2 = new String("Bonjour");

        System.out.println("Comparaison référence : " + (hello1 == hello2)); // false
        System.out.println("Comparaison equals : " + hello1.equals(hello2)); // true

        String hello3 = "Bonjour";
        hello3 += ", tout le monde !";

        System.out.println(hello3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel est votre prénom ? ");
        String userFirstName = scanner.nextLine().trim();
        System.out.println("Le prénom donné est : " + userFirstName);

        System.out.println("Valeur rognée : " + userFirstName.trim());
        System.out.println("Valeur initiale : " + userFirstName);*/

        /**
        * Méthodes de la classe String
        **/

        String javaCore = "JavaCore";
        System.out.println(javaCore.contains("Java"));

        System.out.println(javaCore.startsWith("Java"));
        System.out.println(javaCore.endsWith("Java"));

        System.out.println(javaCore.toLowerCase());
        System.out.println(javaCore.toUpperCase());

        System.out.println(javaCore.replaceAll("Java", "AWS"));
    }
}
