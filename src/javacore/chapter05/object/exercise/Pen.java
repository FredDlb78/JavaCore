package javacore.chapter05.object.exercise;

public class Pen {

    String name;
    String color;
    String manufacturer;

    int quantity;
    int weight;

    double price;

    public static void main(String[] args) {

        Pen pen = new Pen();
        pen.name = "Stylo";
        pen.color = "bleu";
        pen.manufacturer = "Bic";
        pen.quantity = 10;
        pen.weight = 15;
        pen.price = 2.5;

        pen.displayInformation();

    }

    public void displayInformation() {
        System.out.println(
                        "Nom: "      + name         + ", "  +
                        "Couleur: "  + color        + ", "  +
                        "Prix: "     + price        + "€, " +
                        "Quantité: " + quantity     + ", "  +
                        "Fabricant: "+ manufacturer + ", "  +
                        "Poids: "    + weight       + "g"
        );
    }
}