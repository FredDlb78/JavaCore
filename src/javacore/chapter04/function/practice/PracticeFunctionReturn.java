package javacore.chapter04.function.practice;

public class PracticeFunctionReturn {

    public static void main(String[] args) {

        // return; stop the main execution like the break in loop

        int a = 3;
        int b = 4;

        int result1 = sum(a, b);
        System.out.println("Le résultat de " + a + " + " + b + " = " + result1);

        a = 7;
        b = 8;

        int result2 = sum(a, b);
        System.out.println("Le résultat de " + a + " + " + b + " = " + result2);

        a = 6;
        b = 14;

        int result3 = sum(a, b);
        System.out.println("Le résultat de " + a + " + " + b + " = " + result3);


        System.out.println(sum(56,67));
    }

    public static int sum(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }
}
