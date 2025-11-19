package javacore.chapter01.variable.exercise;

public class FahrenheitCelsiusConverter {

    public static void main (String[] args) {

        double fahrenheitTemperature = 10;
        double celsiusTemperature = (fahrenheitTemperature - 32) / 1.8;
        System.out.println(fahrenheitTemperature + " degrés Fahrenheit est égal à " + celsiusTemperature + " degrés Celsius");

        fahrenheitTemperature = 50;
        celsiusTemperature = (fahrenheitTemperature - 32) / 1.8;
        System.out.println(fahrenheitTemperature + " degrés Fahrenheit est égal à " + celsiusTemperature + " degrés Celsius");

        fahrenheitTemperature = -50;
        celsiusTemperature = (fahrenheitTemperature - 32) / 1.8;
        System.out.println(fahrenheitTemperature + " degrés Fahrenheit est égal à " + celsiusTemperature + " degrés Celsius");

        fahrenheitTemperature = 0;
        celsiusTemperature = (fahrenheitTemperature - 32) / 1.8;
        System.out.println(fahrenheitTemperature + " degrés Fahrenheit est égal à " + celsiusTemperature + " degrés Celsius");

    }

}
