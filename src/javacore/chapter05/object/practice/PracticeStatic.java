package javacore.chapter05.object.practice;

import static javacore.chapter05.object.practice.PracticeStaticCalculator.sum;
import static javacore.chapter05.object.practice.PracticeStaticCar.carCounter;

public class PracticeStatic {

    public static void  main(String[] args) {


        PracticeStaticCar car1 = new PracticeStaticCar("Ferrari", "F458", 260000);
        PracticeStaticCar car2 = new PracticeStaticCar("Ford", "Mustang", 130000);

        System.out.println("Nombre de voitures créées: " + carCounter);

        int a = 3;
        int b = 2;
        System.out.println("Somme de " + a + " + " + b + " = " + sum(a, b));
    }
}
