package javacore.chapter03.loop.exercise;

public class BasicStopwatch {

    public static void main(String[] args) throws InterruptedException {

        int i = 0;
        int seconds = 0;
        int minuts = 0;
        int hours = 0;

        /*
         * Une boucle while qui itèrera 100x grâce à l'incrémentation de la variable i (à la fin de la boucle)
         */
        while (i < 3601) {

            /*
             * Effectue une "pause" de 1000 millisecondes / 1 seconde
             */
            Thread.sleep(1);
            //System.out.println("1 seconde s'est écoulée");

            /*
             * Incrémente "i = i + 1;" pour atteindre la condition de la boucle while
             */
            i++;
            seconds++;

            if (seconds % 60 == 0) {
                minuts += 1;
                seconds = 0;
                if (minuts % 60 == 0) {
                    hours += 1;
                    minuts = 0;
                }
            }

            String displayHours = hours < 10 ? "0" + hours : "" + hours;
            String displayMinuts = minuts < 10 ? "0" + minuts : "" + minuts;
            String displaySeconds = seconds < 10 ? "0" + seconds : "" + seconds;

            System.out.println(displayHours + ":" + displayMinuts + ":" + displaySeconds);

        }
    }
}
