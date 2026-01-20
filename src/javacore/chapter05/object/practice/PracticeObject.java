package javacore.chapter05.object.practice;

public class PracticeObject {

    public static void main (String[] args) {

        PracticeObjectCar car1 = new PracticeObjectCar();
        car1.brand = "Ferrari";
        car1.model = "F458";
        car1.color = "Rouge";
        car1.odometer = 0;
        car1.price = 250000;
        car1.serialNumber = "J22H2JK32MLKE0";

        car1.run(2000);
        car1.displayInformation();

        PracticeObjectCar car2 = new PracticeObjectCar();
        car2.brand = "Ford";
        car2.model = "Mustang";
        car2.color = "Jaune";
        car2.odometer = 0;
        car2.price = 120000;
        car2.serialNumber = "JOILJG5667UIJK";

        car2.run(8000);
        car2.displayInformation();
    }


}
