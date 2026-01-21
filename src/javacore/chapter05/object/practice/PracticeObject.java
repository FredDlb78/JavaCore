package javacore.chapter05.object.practice;

public class PracticeObject {

    public static void main (String[] args) {

        PracticeObjectCar car1 = new PracticeObjectCar("Ferrari", "F458", "Rouge", "J22H2JK32MLKE0", 250000);

        car1.run(2000);
        car1.displayInformation();

        PracticeObjectCar car2 = new PracticeObjectCar("Ford", "Mustang", "Jaune", "JOILJG5667UIJK", 120000);

        car2.run(8000);
        car2.displayInformation();
    }


}
