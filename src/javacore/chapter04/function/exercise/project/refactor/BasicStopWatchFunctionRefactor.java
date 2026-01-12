package javacore.chapter04.function.exercise.project.refactor;

public class BasicStopWatchFunctionRefactor {

    public static void main(String[] args) throws InterruptedException {

        int i = 0;
        int seconds = 0;
        int minutes = 0;
        int hours = 0;

        while (i <= 3600) {

            waitOneSecond();
            i++;
            seconds++;

            if (seconds >= 60) {
                minutes++;
                seconds = 0;

                if (minutes >= 60) {
                    hours++;
                    minutes = 0;
                }
            }
            displayChronometerTime(hours, minutes, seconds);
        }
    }


    public static void waitOneSecond() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void displayChronometerTime(int hours, int minutes, int seconds) {
        String displayHours = hours < 10 ? "0" + hours : "" + hours;
        String displayMinutes = minutes < 10 ? "0" + minutes : "" + minutes;
        String displaySeconds = seconds < 10 ? "0" + seconds : "" + seconds;

        System.out.println(displayHours + ":" + displayMinutes + ":" + displaySeconds);
    }
}
