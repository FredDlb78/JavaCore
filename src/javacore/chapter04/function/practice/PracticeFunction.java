package javacore.chapter04.function.practice;

public class PracticeFunction {

    public static void main(String[] args) {

/*        System.out.println("Hello World!");

        int test = 0;

//        test2; Defined in the scope of test() (function)

        test();

        if (true) {
            System.out.println("Affichage de la fonction test");
//            int test = 0; Already defined in the scope of main
        }*/
        System.out.println(sum(5,3));
    }

    public static void test() {

        System.out.println("Affichage de la fonction test");

        int test = 0;
        int test2 = 0;
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}
