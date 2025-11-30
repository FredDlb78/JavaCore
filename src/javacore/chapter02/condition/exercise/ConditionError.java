package javacore.chapter02.condition.exercise;

public class ConditionError {


    public static void main(String[] args) {

        int age = 101;

/*        if (age >= 100) {
            System.out.println("Vous êtes une exception dans ce monde !");
        } else if(age > 60 && age < 100) {
            System.out.println("Vous n'êtes plus tout jeune.");
        } else if (age > 18) {
            System.out.println("Vous êtes un adulte.");
        } else if (age == 18) {
            System.out.println("Vous êtes majeur.");
        } else if (age == 17) {
            System.out.println("Vous êtes bientôt majeur !");
        } else {
            System.out.println("Vous êtes mineur.");
        }*/

/*
        Les 2 erreurs commises ici sont:
         - l'ordre des conditions, en faisant un ordre ascendant, quand on arrive à la condition age > 18,
         - pas de borne supérieure pour la tranche age > 18, par conséquent =>
         la condition sera toujours remplie au-dessus de 18 ans et on ne rentrera jamais dans les conditions qui se trouvent en dessous

         2 solutions pour corriger:
         - inverser l'ordre des conditions comme ci dessus.
         - ajouter une borne supérieure à age > 18 comme ci-dessous
         */


        if(age <= 16) {
            System.out.println("Vous êtes mineur.");
        }
        else if(age == 17) {
            System.out.println("Vous êtes bientôt majeur !");
        }
        else if(age == 18) {
            System.out.println("Vous êtes majeur.");
        }
        else if(age <= 60) {
            System.out.println("Vous êtes un adulte.");
        }
        else if(age < 100) {
            System.out.println("Vous n'êtes plus tout jeune.");
        }
        else {
            System.out.println("Vous êtes une exception dans ce monde !");
        }

    }

}
