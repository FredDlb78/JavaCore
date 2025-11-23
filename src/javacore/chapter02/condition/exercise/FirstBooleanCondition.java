package javacore.chapter02.condition.exercise;

public class FirstBooleanCondition {

    public static void main(String[] args) {

        byte age = 36;
        boolean isAdult = false;

        if (age >= 18) {
            System.out.println("Vous êtes majeur, votre age est de " + age + " ans.");
        } else {
            System.out.println("Vous êtes mineur car votre age (" + age + " ans) est inférieur à 18 ans.");
        }

    }
}
