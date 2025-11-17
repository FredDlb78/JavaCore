package javacore.chapter01.variable.exercise;

public class FirstInstructions {

    public static void main(String[] args) {

        //1
        int age = 36;
        //2
        System.out.println(age);
        //3
        System.out.println("J'ai " + age + " ans.");

        //4
        String displayAge = "J'ai " + age + " ans.";
        //5
        System.out.println(displayAge);

        //6
        String firstName = "Frédéric";
        //7
        System.out.println(firstName);

        //8
        String displayFirstName = "Je m'appelle " + firstName + ".";

        //9
        System.out.println(displayFirstName + " " + displayAge);

        //10
        System.out.println("Je m'appelle " + firstName + ". J'ai " + age + " ans.");

    }

}
