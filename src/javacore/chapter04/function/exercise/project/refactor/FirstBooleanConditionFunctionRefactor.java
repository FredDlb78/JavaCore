package javacore.chapter04.function.exercise.project.refactor;

public class FirstBooleanConditionFunctionRefactor {

    public static void main(String[] args) {

        byte age = 17;

        displayAdultOrNot(age);

    }

    public static boolean isAdult (int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }

    public static void displayAdultOrNot(int age) {
        if (isAdult(age)) {
            System.out.println("Vous êtes majeur, votre age est de " + age + " ans.");
        } else {
            System.out.println("Vous êtes mineur car votre age (" + age + " ans) est inférieur à 18 ans.");
        }
    }
}