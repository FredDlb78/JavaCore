package javacore.chapter05.object.exercise;

public class SpecialCaracters {

    public static void main(String[] args) {


        String welcomeText = "Bonjour, je m'appelle Alexandre, mais tu peux m'appeler \"Alex\" !";
        // String welcomeText = "Bonjour, je m'appelle Alexandre, mais tu peux m'appeler "Alex" !"; Cannot resolve symbol car il ne trouve pas la variable Alex
        System.out.print(welcomeText + "\n");

        String warningText = "/!\\ \t Attention aux erreurs."; // \t => tabulation
        System.out.print(warningText + "\n");
        warningText = "/!\\ \n Attention aux erreurs."; // \n => retour à la ligne
        System.out.print(warningText + "\n");
        warningText = "/!\\ ";
        String warningTextBis = "Attention aux erreurs.";
        System.out.print(warningText + "\n");
        System.out.print(warningTextBis + "\n");
    }
}
