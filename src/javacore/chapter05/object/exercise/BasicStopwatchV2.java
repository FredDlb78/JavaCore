package javacore.chapter05.object.exercise;

public class BasicStopwatchV2 {

    int seconds;
    int minutes;
    int hours;

    public static void waitOneSecond() throws InterruptedException {
        Thread.sleep(1000);
    }

    // J'ai utilisé un paramètre pour arreter le chrono comme dans la v1 mais si je le retire je peux faire comme dans l'énoncé.
    public void launch(int secondsToElapse) throws InterruptedException {
        int i = 0;
        while (i <= secondsToElapse) {

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
            displayTime(hours, minutes, seconds);
        }
    }

    public static void displayTime(int hours, int minutes, int seconds) {
        String displayHours = hours < 10 ? "0" + hours : "" + hours;
        String displayMinutes = minutes < 10 ? "0" + minutes : "" + minutes;
        String displaySeconds = seconds < 10 ? "0" + seconds : "" + seconds;

        System.out.println(displayHours + ":" + displayMinutes + ":" + displaySeconds);
    }

    public static void main(String[] args) throws InterruptedException {

        BasicStopwatchV2 basicStopwatch = new BasicStopwatchV2();
        basicStopwatch.launch(3600);

    }
}