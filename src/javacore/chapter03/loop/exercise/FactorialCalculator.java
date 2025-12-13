package javacore.chapter03.loop.exercise;

public class FactorialCalculator {

    public static void main(String[] args) {

        long number = 20;
        long result = 1;
        long originalNumber = number;

/*        if (number > 0) {
            while (number >= 1) {
                result *= number;
                number--;
            }
            System.out.println("Le factoriel est : " + result);
        } else if (number == 0) {
                result *= number;
            System.out.println("Le factoriel est : " + result);
        } else {
            System.out.println("Le factoriel d'un nombre négatif n'existe pas. Nombre: " + number);
        }*/

        // J'ai choisi la structure ci-dessous pour éviter d'avoir à répéter le System.out.println("Le factoriel est : " + result); 2x

        if (number < 0) {
            System.out.println("Le factoriel d'un nombre négatif n'existe pas. Nombre: " + number);
        } else if (number == 0) {
            result = 1;

        } else {
            while (number >= 1) {
                result *= number;
                number--;
            }
        }
        System.out.println("Le factoriel de " + originalNumber + " est " + result + ".");

/*          7 => 5040
            9 => 362880
            11 => 39916800
            20 => 2432902008176640000
            21 => -4249290049419214848

            A partir de 21, on obtient un résultat négatif, j'imagine parce qu'on dépasse la limite tu type long.
                */
    }
}
