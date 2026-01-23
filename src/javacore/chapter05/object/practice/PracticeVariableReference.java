package javacore.chapter05.object.practice;

public class PracticeVariableReference {

    public static void main(String[] args) {

        //Exemple avec variables primitives

/*        int age1 = 20;
        int age2 = age1;

        System.out.println("Première valeur de age1 : " + age1);
        System.out.println("Première valeur de age2 : " + age2);

        age2 = 35;

        System.out.println("Seconde valeur de age1 : " + age1);
        System.out.println("Seconde valeur de age2 : " + age2);

        displayAge(age2);

        System.out.println("Troisième valeur de age2 : " + age2);*/

        //Exemple avec variables références

        PracticeObjectCar car1 = new PracticeObjectCar("Renault", "Mégane 2", "Grise", "123456", 2500);
        PracticeObjectCar car2 = car1;
/*
        System.out.println("Première valeur de car1 : " + car1);
        System.out.println("Première valeur de car2 : " + car2);

        System.out.println("Première valeur N° Série de car1 : " + car1.serialNumber);
        System.out.println("Première valeur N° Série de car2 : " + car2.serialNumber);

        car2.serialNumber = "987654";

        System.out.println("Seconde valeur N° Série de car1 : " + car1.serialNumber);
        System.out.println("Seconde valeur N° Série de car2 : " + car2.serialNumber);

        displayCar(car1);
        displayCar(car2);

        System.out.println("Troisième valeur N° Série de car1 : " + car1.serialNumber);
        System.out.println("Troisième valeur N° Série de car2 : " + car2.serialNumber);*/

        car1 = new PracticeObjectCar("Renault", "Mégane 2", "Grise", "123456", 2500);
        car2 = new PracticeObjectCar("Renault", "Mégane 2", "Grise", "123456", 2500);

        System.out.println("Seconde valeur référence de car1 : " + car1);
        System.out.println("Seconde valeur référence de car2 : " + car2);

        System.out.println("N° Série de car1 : " + car1.serialNumber);
        System.out.println("N° Série de car2 : " + car2.serialNumber);

        car1.serialNumber = "TEST";

        System.out.println("N° Série de car1 : " + car1.serialNumber);
        System.out.println("N° Série de car2 : " + car2.serialNumber);

    }

    public static void displayCar(PracticeObjectCar car) {
        car.serialNumber = "3456789";

        System.out.println("Valeur fonction du n° série : " + car.serialNumber);
        System.out.println("Référence fonction du n° série : " + car);
    }

    public  static void  displayAge(int age) {

        age = 40;

        System.out.println("Age : " + age);
    }


}
