package javacore.chapter03.loop.exercise;

public class FullPyramid {

    public static void main(String[] args) {

        int numberOfRows = 10;
        char space = ' ';
        char asterisk = '*';

        // Boucle qui affiche le nombre de lignes
        for (int currentRow = 1; currentRow <= numberOfRows; currentRow++) {

            // Boucle qui affiche le nombre d'espaces
            for (int i = 1; i <= numberOfRows - currentRow; i++) {
                System.out.print(space);
            }

            // Boucle qui affiche le nombre d'asterix
            // Sans le - 1 la pyramide commence à 2 étoiles et on n'a pas la "pointe" de la pyramide (oui j'ai été jusqu'au dernier indice xD )
            for (int j = 1; j <= 2 * currentRow - 1; j++) {
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }
}