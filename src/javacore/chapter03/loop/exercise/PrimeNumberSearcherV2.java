package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV2 {

    public static void main(String[] args) {

        int potentialPrimeNumber = 0;
        int primeNumberFound = 0;
        int searchAmount = 50;

        System.out.println("Liste des " + searchAmount + " premiers nombres premiers.");

        int count = 0;

        while (primeNumberFound < searchAmount) {

            boolean isCurrentNumberPrime = true;

            for (int potentialDivisor = 2; potentialDivisor <= potentialPrimeNumber - 1; potentialDivisor++) {

                count++;

                if (potentialPrimeNumber % potentialDivisor == 0) {
//                    System.out.println("porential prime number: " + potentialPrimeNumber);
//                    System.out.println("potential divisor: " + potentialDivisor);

                    //count++;

                    isCurrentNumberPrime = false;
                    break;
                }

            }


            if (isCurrentNumberPrime) {
                System.out.println("-> " + potentialPrimeNumber + " est le nombre premier n°" + (primeNumberFound + 1));
                primeNumberFound++;
            }
            potentialPrimeNumber++;
            //System.out.println(potentialPrimeNumber);

        }
        System.out.println("Pour les " + searchAmount + " premiers Nombres premiers, il y'a " + potentialPrimeNumber + " nombres analysés et " + count + " itérations.");
        // Je n'ai pas trouvé d'autres endroits où il pourrait être intéressant d'ajouter un break.
        // 814 itérations sans le break et 177 avec soit 4,5 fois moins
        // Pour les 50 premiers Nombres premiers, il y'a 228 nombres analysés et 5144 itérations.
        // Pour les 100 premiers Nombres premiers, il y'a 524 nombres analysés et 24370 itérations.
        // Pour les 1000 premiers Nombres premiers, il y'a 7908 nombres analysés et 3703646 itérations.
        // La différence entre B, D et F est exponentielle, Pour la recherche des 10000 premiers je m'attends à énormément d'itérations (au moins 5/6 chiffres)
        // Sans le break, le nombre d'itérations pour les 10000 premiers est de 1188328985 et avec seulement 496902444 (2 fois moins d'itérations)
    }
}