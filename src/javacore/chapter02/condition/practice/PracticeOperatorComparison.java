package javacore.chapter02.condition.practice;

public class PracticeOperatorComparison {

    public static void main (String[] args) {

        int a = 30;
        int b = 40;

        boolean isEqual = a == b;
        System.out.println("Est-ce que a == b : " + isEqual);

        boolean isNotEqual = a != b;
        System.out.println("Est-ce que a != b : " + isNotEqual);

        boolean isLessThan = a < b;
        System.out.println("Est-ce que a < b : " + isLessThan);

        boolean isLessThanOrEqual = a <= b;
        System.out.println("Est-ce que a <= b : " + isLessThanOrEqual);

        int age = 31;
        boolean isThirtyOrYounger = age <= 30;
        System.out.println("Est-ce que l'utilisateur a 30 ans ou moins: " + isThirtyOrYounger);

        boolean isGreatherThan = a > b;
        System.out.println("Est-ce que a > b : " + isGreatherThan);

        boolean isGreatherThanOrEqual = a >= b;
        System.out.println("Est-ce que a >= b : " + isGreatherThanOrEqual);

        boolean priorityTest = 10 + a == 40;
        System.out.println("Est-ce que (10 + a = 40) : " + priorityTest);

        boolean isDoubleLessThanInt = 5.5 < 6;
        System.out.println("Test inter types: (5.5 < 6 " + isDoubleLessThanInt);

    }

}
