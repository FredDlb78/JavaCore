package javacore.chapter05.object.practice;

public class PracticeObjectCar {

    String brand;
    String model;
    String color;
    String serialNumber;

    double price;
    double odometer;

    public PracticeObjectCar(String brand, String model, String color, String serialNumber, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serialNumber = serialNumber;
        this.price = price;
        this.odometer = 0;

        this.displayInformation();
    }

    public double run(double distance) {
        System.out.println("La voiture roule pendant " + distance + "km.");
        odometer += distance;
        return distance;
    }

    public void displayInformation() {

        System.out.println(
                        "N° Série : "       + this.serialNumber + " | " +
                        "Marque : "         + this.brand        + " | " +
                        "Modèle : "         + this.model        + " | " +
                        "Couleur : "        + this.color        + " | " +
                        "Kilométrage :  "   + this.odometer
        );

    }
}