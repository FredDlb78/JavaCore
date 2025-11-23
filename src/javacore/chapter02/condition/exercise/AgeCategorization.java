package javacore.chapter02.condition.exercise;

public class AgeCategorization {

    public static void main(String[] args) {

        //-1, 0, 9, 10, 17, 18, 25, 64, 65
        int age = 65;

        if (age < 0) {
            System.err.println("Un âge ne peut pas être négatif. Age saisi: " + age + "an(s).");
        } else if (age >= 65) {
            System.out.println("Vous avez " + age + " an(s). Vous faites parti(e) de la catégorie Senior.");
        }  else if (age >= 25) {
            System.out.println("Vous avez " + age + " an(s). Vous faites parti(e) de la catégorie Adulte.");
        }  else if (age >= 18) {
            System.out.println("Vous avez " + age + " an(s). Vous faites parti(e) de la catégorie Jeune adulte.");
        }  else if (age >= 10) {
            System.out.println("Vous avez " + age + " an(s). Vous faites parti(e) de la catégorie Adolescent.");
        } else if (age < 10) {
            System.out.println("Vous avez " + age + " an(s). Vous faites parti(e) de la catégorie Enfant.");
        }

    }

}
