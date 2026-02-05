package javacore.chapter05.object.exercise;

public class FirstArrays {

    public static void main(String[] args) {

        int[] integerArray = new int[10];
        //System.out.println(integerArray[0]);
        integerArray[0] = 1;
        //System.out.println(integerArray[0]);

        int firstValue = 1;

        for (int index = 0; index < integerArray.length; index++) {
            integerArray[index] = firstValue;
            //System.out.println("La valeur à l'index " + index + " a la valeur : " + integerArray[index]);
            firstValue++;
        }

        displayArray(integerArray);

        for (int index = 0; index < integerArray.length; index++) {
            integerArray[index] *= 3;
        }

        displayArray(integerArray);
        displayEvenNumbers(integerArray);
        setPreviousValueToZeroIfNextIsDivisibleByThree(integerArray);
        displayArray(integerArray);

    }

    public static void displayArray(int[] array) {
        System.out.print("Valeurs du tableau : ");

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void displayEvenNumbers(int[] array) {
        System.out.print("Les valeurs paires du tableau sont : ");

        for (int index = 0; index < array.length; index++) {

            if (array[index] % 2 == 0) {
                System.out.print(array[index] + " ");

            }
        }
        System.out.println();
    }

    public static void setPreviousValueToZeroIfNextIsDivisibleByThree(int[] array) {

        for (int index = 1; index < array.length; index++) {

            if (array[index] % 3 == 0) {
                array[index - 1] = 0;
            }
        }
    }
}
