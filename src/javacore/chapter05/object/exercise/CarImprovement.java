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
    }

    public static void main(String[] args) {
        CarImprovement car = new CarImprovement("Ferrari", "F458", "Rouge", "J22H2JK32MLKE0", 250000);

        car.turnEngineOn();
        car.turnEngineOn();
        car.run(2000);
        car.turnEngineOff();
        car.turnEngineOff();
        car.displayInformation();
    }

    public double run(double distance) {
        if (isEngineStarted) {
            System.out.println("La voiture roule pendant " + distance + "km.");
            odometer += distance;
            return distance;
        } else {
            System.err.println("Vous devez démarrer la voiture pour pouvoir rouler.");
            return 0;
        }
    }

    public boolean turnEngineOn() {
        if (!isEngineStarted) {
            System.out.println("Moteur démarré.");
            return isEngineStarted = true;
        }
        return isEngineStarted = false;
    }

    public boolean turnEngineOff() {
        if (!isEngineStarted) {
            System.out.println("Moteur éteint.");
            return isEngineStarted = false;
        }
        return isEngineStarted = true;
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
