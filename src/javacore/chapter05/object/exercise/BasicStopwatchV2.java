package javacore.chapter05.object.exercise;

public class BasicStopwatchV2 {

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

    public static void waitOneSecond() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void launch(int secondsToElapse) throws InterruptedException {
        int i = 0;
        while (i <= secondsToElapse) {

            waitOneSecond();
            i++;
            this.seconds++;

            if (this.seconds >= 60) {
                this.minutes++;
                this.seconds = 0;

                if (this.minutes >= 60) {
                    this.hours++;
                    this.minutes = 0;
                }
            }
            displayTime();
        }
    }

    public void displayTime() {
        String displayHours = this.hours < 10 ? "0" + this.hours : "" + this.hours;
        String displayMinutes = this.minutes < 10 ? "0" + this.minutes : "" + this.minutes;
        String displaySeconds = this.seconds < 10 ? "0" + this.seconds : "" + this.seconds;

        System.out.println(this.name + " : " + displayHours + ":" + displayMinutes + ":" + displaySeconds);
    }

    public static void main(String[] args) throws InterruptedException {

        BasicStopwatchV2 hardBoiledEggStopwatch = new BasicStopwatchV2("Oeufs durs");
        hardBoiledEggStopwatch.launch(3600);

    }
}