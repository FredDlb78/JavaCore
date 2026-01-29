package javacore.chapter05.object.practice;

import java.util.Scanner;

public class PracticeScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une valeur: ");
        float userValue = scanner.nextFloat();
        System.out.println("La valeur que vous avez entrée est : " + userValue);

    }


}
