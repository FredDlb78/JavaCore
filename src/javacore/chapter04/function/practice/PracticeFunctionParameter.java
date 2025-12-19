package javacore.chapter04.function.practice;

public class PracticeFunctionParameter {

    public static void main(String[] args) {

        displaySection(1, "Contenu de la section");
        displaySection(2, "AAA");
        displaySection(3, "BBBBBBBB");

    }

    public static void displaySection(int sectionNumber, String sectionContent) {
        System.out.println("----Debut de la fonction [" + sectionNumber + "]-----");
        displaySeparator();
        System.out.println("------" + sectionContent + "------");
        displaySeparator();
        System.out.println("-----Fin de la fonction [" + sectionNumber + "]------");
        System.out.println();
    }

    public static void displaySeparator() {
        System.out.println("---------------------------------");
    }

    public static void timesToDisplaySection(int times, String sectionContent) {
        for (int i = 1; i <= times; i++) {
            displaySection(i, sectionContent);
        }
    }
}
