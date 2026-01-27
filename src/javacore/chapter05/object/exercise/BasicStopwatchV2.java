package javacore.chapter05.object.exercise;

public class BasicStopwatchV2 {

    final int SECONDS_IN_MINUTE = 60;
    final int MINUTES_IN_HOUR = 60;

    String name;

    int seconds;
    int minutes;
    int hours;

    public BasicStopwatchV2(String name) {
        this.name    = name;
        this.hours   = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public static void main(String[] args) throws InterruptedException {
        BasicStopwatchV2 hardBoiledEggStopwatch = new BasicStopwatchV2("Oeufs durs");
        hardBoiledEggStopwatch.launch(3600);
    }

    public void launch(int secondsToElapse) throws InterruptedException {
        int secondsElapsed = 0;
        while (secondsElapsed <= secondsToElapse) {

            waitOneSecond();
            secondsElapsed++;
            this.seconds++;

            if (this.seconds >= SECONDS_IN_MINUTE) {
                this.minutes++;
                this.seconds = 0;

                if (this.minutes >= MINUTES_IN_HOUR) {
                    this.hours++;
                    this.minutes = 0;
                }
            }
            generateTime();
            displayTime();
        }
    }

    public static void waitOneSecond() throws InterruptedException {
        Thread.sleep(1000);
    }

    public String generateTime() {
        String displayHours = this.hours < 10 ? "0" + this.hours : "" + this.hours;
        String displayMinutes = this.minutes < 10 ? "0" + this.minutes : "" + this.minutes;
        String displaySeconds = this.seconds < 10 ? "0" + this.seconds : "" + this.seconds;
        return displayHours + ":" + displayMinutes + ":" + displaySeconds;
    }

    public void displayTime() {
        System.out.println(this.name + " : " + generateTime());
    }
}