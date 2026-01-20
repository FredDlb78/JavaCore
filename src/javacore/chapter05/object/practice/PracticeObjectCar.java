package javacore.chapter05.object.practice;

public class PracticeObjectCar {

    String brand;
    String model;
    String color;
    String serialNumber;

    double price;
    double odometer;

    public double run(double distance) {
        System.out.println("La voiture roule pendant " + distance + "km.");
        odometer += distance;
        return distance;
    }

    public void displayInformation() {

        System.out.println("N° Série : " + serialNumber + " | Marque : " + brand + " | Modèle : " + model + " | Couleur : " + color + " | Kilométrage :  " + odometer );

    }
}