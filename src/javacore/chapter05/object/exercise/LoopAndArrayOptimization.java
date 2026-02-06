package javacore.chapter05.object.exercise;

public class LoopAndArrayOptimization {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int[] results = new int[numbers.length];

/*        for (int i = 0; i < numbers.length; i++) {
            results[i] = numbers[i] * 2 + 3;
            System.out.println("Le résultat de " + numbers[i] + " * 2 + 3 = " + results[i]);
        }*/

        calculateResult(numbers, results);
        displayResult(numbers, results);

    }

    public static void calculateResult(int[] numbersArray, int[] resultsArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            resultsArray[i] = numbersArray[i] * 2 + 3;
        }
    }

    public static void displayResult(int[] numbersArray, int[] resultsArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println("Le résultat de " + numbersArray[i] + " * 2 + 3 = " + resultsArray[i]);
        }
    }

}
