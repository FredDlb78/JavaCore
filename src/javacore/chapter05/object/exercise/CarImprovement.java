package javacore.chapter05.object.exercise;

public class CarImprovement {

    String brand;
    String model;
    String color;
    String serialNumber;

    double price;
    double odometer;

    boolean isEngineStarted;

    public CarImprovement(String brand, String model, String color, String serialNumber, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serialNumber = serialNumber;
        this.price = price;
        this.odometer = 0;
        this.isEngineStarted = false;

        this.displayInformation();
    }

    public double run(double distance) {
        if (isEngineStarted) {
            System.out.println("La voiture roule pendant " + distance + "km.");
            odometer += distance;
            return distance;
        } else {
            System.err.println("Vous devez démarrer la voiture pour pouvoir rouler.");
            return distance = 0;
        }
    }

    public boolean turnOn() {
        if (isEngineStarted) {
            System.out.println("Le moteur est déjà démarré.");
        } else {
            System.out.println("Moteur démarré.");
        }
        return isEngineStarted = true;
    }

    public boolean turnOff() {
        if (!isEngineStarted) {
            System.out.println("Le moteur est déjà éteint.");
        } else {
            System.out.println("Moteur éteint.");
        }
        return isEngineStarted = false;
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

    public static void main(String[] args) {
        CarImprovement car = new CarImprovement("Ferrari", "F458", "Rouge", "J22H2JK32MLKE0", 250000);

        car.turnOn();
        car.turnOn();
        car.run(2000);
        car.turnOff();
        car.turnOff();
        car.displayInformation();
    }
}
