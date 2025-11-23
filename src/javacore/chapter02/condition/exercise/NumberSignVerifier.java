package javacore.chapter02.condition.exercise;

public class NumberSignVerifier {

    public static void main(String[] args) {

        double number = 0;

        if (number > 0) {
            System.out.println("Le nombre " + number + " est positif");
        } else if (number < 0){
            System.out.println("Le nombre " + number + " est négatif");
        } else {
            System.out.println("Le nombre " + number + " est neutre");
        }

        // Ici, je ne change pas le code, pour moi la logique reste la même pour un int ou un double et les tests passent dans les 2 cas

        String sign = "neutre";
        // Ici j'ai essayé sans initialiser la valeur => Erreur
        // En suite en initialisant sign à null avec 3 if dont le if isNeutral
        // Finalement, j'ai préféré initialiser à "neutre" et supprimer une condition mais je ne sais pas ce qui est préférable dans ce cas
        // Dans tous les cas, je préfère le première solution

        // Solution alternative avec des if sans dépendances
        if (number > 0) {
            sign = "positif";
        }
        if (number < 0) {
            sign = "négatif";
        }
/*        if (number == 0) {
            sign = "neutral";
        }*/

        System.out.println("Le nombre " + number + " est " + sign);
    }
}