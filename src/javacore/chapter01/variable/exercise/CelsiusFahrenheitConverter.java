package javacore.chapter01.variable.exercise;

public class CelsiusFahrenheitConverter {

    public static void main (String[] args) {

        double celsiusTemperature = 10;
        double fahrenheitTemperature = celsiusTemperature * 1.8 + 32;
        System.out.println(celsiusTemperature + " degrés Celsius est égal à " + fahrenheitTemperature + " degrés Fahrenheit");

        celsiusTemperature = 50;
        fahrenheitTemperature = celsiusTemperature * 1.8 + 32;
        System.out.println(celsiusTemperature + " degrés Celsius est égal à " + fahrenheitTemperature + " degrés Fahrenheit");

        celsiusTemperature = -50;
        fahrenheitTemperature = celsiusTemperature * 1.8 + 32;
        System.out.println(celsiusTemperature + " degrés Celsius est égal à " + fahrenheitTemperature + " degrés Fahrenheit");

        celsiusTemperature = 0;
        fahrenheitTemperature = celsiusTemperature * 1.8 + 32;
        System.out.println(celsiusTemperature + " degrés Celsius est égal à " + fahrenheitTemperature + " degrés Fahrenheit");

    }

}
