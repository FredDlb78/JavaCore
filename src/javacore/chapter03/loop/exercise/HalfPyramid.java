package javacore.chapter03.loop.exercise;

public class HalfPyramid {

    public static void main(String[] args) {

        int numberOfRows = 6;
        char asterix = '*';

        for (int i = 1; i <= numberOfRows; i++) {
//            System.out.println(asterix);
            System.out.println();

            // Ici, si je n'affiche pas  cette ligne, j'ai 1 étoile sur chaque ligne mais quand je l'affiche, je commence par afficher une ligne vide
            // Je n'ai pas réussi à afficher chaque ligne sans afficher la ligne vide

            for (int j = 1; j <= i; j++) {
                //asterix += asterix;
                System.out.print(asterix);
            }
        }
    }
}
