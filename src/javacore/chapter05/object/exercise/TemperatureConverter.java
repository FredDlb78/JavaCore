package javacore.chapter05.object.exercise;

public class TemperatureConverter {

    public static final String CELSIUS_UNIT = "°C";
    public static final String FAHRENHEIT_UNIT = "°F";
    public static final String KELVIN_UNIT = "K";

    public static void main(String[] args) {

        double tempCelsius = 10;
        System.out.println(tempCelsius      + CELSIUS_UNIT      + " est égal à " + TemperatureConverter.celsiusToFahrenheit(tempCelsius)    + FAHRENHEIT_UNIT   + ".");
        double tempFahrenheit = 50;
        System.out.println(tempFahrenheit   + FAHRENHEIT_UNIT   + " est égal à " + TemperatureConverter.fahrenheitToCelsius(tempFahrenheit) + CELSIUS_UNIT      + ".");
        double tempKelvin = 293.15;
        System.out.println(tempKelvin       + KELVIN_UNIT       + " est égal à " + TemperatureConverter.kelvinToCelsius(tempKelvin)         + CELSIUS_UNIT      + ".");
        double tempCels = 20;
        System.out.println(tempCels         + CELSIUS_UNIT      + " est égal à " + TemperatureConverter.celsiusToKelvin(tempCels)           + KELVIN_UNIT       + ".");
        double tempFahr = 50;
        System.out.println(tempFahr         + FAHRENHEIT_UNIT   + " est égal à " + TemperatureConverter.fahrenheitToKelvin(tempFahr)        + KELVIN_UNIT       + ".");
        double tempKelv = 283.15;
        System.out.println(tempKelv         + KELVIN_UNIT       + " est égal à " + TemperatureConverter.kelvinToFahrenheit(tempKelv)        + FAHRENHEIT_UNIT   + ".");
    }

    public static double celsiusToFahrenheit(double celsiusTemperature) {
        return celsiusTemperature * 1.8 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) / 1.8;
    }

    public static double celsiusToKelvin(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

    public static double kelvinToCelsius(double kelvinTemperature) {
        return kelvinTemperature - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheitTemperature) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheitTemperature));
    }

    public static double kelvinToFahrenheit(double kelvinTemperature) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvinTemperature));
    }

    // 6 Les méthodes static sont préférables car le convertisseur ne possède aucun état à stocker : il réalise simplement
    // un calcul, donc il est inutile de créer une instance de la classe pour l’utiliser.

    // 7 J'ai l'impression qu'il y'a un piège dans la question 7 que je n'ai pas vu xD
}