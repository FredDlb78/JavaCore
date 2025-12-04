package javacore.chapter03.loop.exercise;

public class WhileLoopExample {


    public static void main(String[] args) {

        int numberOfTimesToDisplay = 1000;
        int loopCounter = 1; //nombre de tours de boucle

        while (loopCounter <= numberOfTimesToDisplay) {
            System.out.println("Tour n°: " + loopCounter + " - Hello World!");
            loopCounter++;
        }
    }
}
