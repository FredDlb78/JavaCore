package javacore.chapter04.function.exercise.project.refactor;

public class ConditionToTernaryFunctionRefactor {



    public static void main(String[] args) {

        /**
         * Le code doit s'adapter aux différentes valeurs que vous mettrez à la variable age.
         */
        int age = 18;

        int percentageReduction = 0;

        displayPercentageRate(age);

    }

    public static int percentageRateCalculation (int age) {
        int percentageReduction = 0;
        percentageReduction = age < 18 ? 50 : 10;
        return percentageReduction;
    }

    public static void displayPercentageRate(int age) {
        System.out.println("La réduction appliquée est de " + percentageRateCalculation(age) + " % car l'utilisateur est agé de " + age + " ans");
    }
}
