package javacore.chapter04.function.exercise.project.refactor;

public class AgeCategorizationFunctionRefactor {

    public static void main(String[] args) {

        //-1, 0, 9, 10, 17, 18, 25, 64, 65
        int age = 65;

        if (!isAgeValid(age)) {
            displayAgeErrorMsg(age);
        } else {
            displayCategory(age);
        }
    }









    public static boolean isAgeValid(int age) {
        if (age < 0) {
            return false;
        }
        displayAge(age);
        return true;
    }

    public static void displayAgeErrorMsg(int age) {
        System.out.println("L'âge ne peut pas être négatif. Age: " + age);
    }

    public static void displayAge(int age) {
        System.out.println("Votre âge est de " + age + " an(s).");
    }

    public static String findCategory(int age) {
        String category = "";
        if (age >= 65) {
            category = "Senior";
        }  else if (age >= 25) {
            category = "Adulte";
        }  else if (age >= 18) {
            category = "Jeune Adulte";
        }  else if (age >= 10) {
            category = "Adolescent";
        } else {
            category = "Enfant";
        }
        return category;
    }

    public static void displayCategory(int age) {
        System.out.println("Vous avez " + age + " an(s). Vous faites parti(e) de la catégorie " + findCategory(age) + ".");
    }

}
