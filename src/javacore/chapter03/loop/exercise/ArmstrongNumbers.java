package javacore.chapter03.loop.exercise;

public class ArmstrongNumbers {


    public static void main(String[] args) {

        /*      Boucle principale : parcourir les nombres à partir de 0
        currentNumber = 0, 1, 2, 3, ...*/

        /*          Pour chaque currentNumber :
            Étape 1 : compter le nombre de chiffres
            temporaryNumber = currentNumber => temporaryNumber sera la nombre à "découper"
            digitTemporaryNumberCount = 0 => Nombre de chiffre dans currentNumber
            Tant que temporaryNumber > 0
            temporaryNumber = temporaryNumber / 10
            digitTemporaryNumberCount++


            Exemple : 153
            1er tour => 153 / 10 = 15   temporaryNumber 15 digitTemporaryNumberCount = 1
            2e tour => 15 / 10 = 1      temporaryNumber 1  digitTemporaryNumberCount = 2
            3e tour => 1 / 10 = 0       temporaryNumber 0  digitTemporaryNumberCount = 3
            Fin de boucle => le nombre a 3 chiffres*/

        /*  Étape 2 : calculer la somme des chiffres puissance digitsCount
            Tant que temporaryNumber > 0
            lastNumber = temporaryNumber % 10
            1er tour =>  lastNumber 3
            2e tour =>   lastNumber 5
            3e tour =>   lastNumber 1

            lastNumberPower = lastNumber puissance digitsCount
            1er tour => 3^3 = 27
            2e tour => 5^3 = 125
            3e tour => 1^3 = 1

            result += lastNumberPower
            temporaryNumber = temporaryNumber / 10
            1er tour => 15
            2e tour => 1
            3e tour => 0
            Fin de boucle quand temporaryNumber = 0 => result = 153*/

/*          Étape 3 : vérification finale
            En dehors des boucles
            if result == currentNumber
            => currentNumber est un nombre Armstrong*/

        int highLimitNumber = 100000;

        for (int currentNumber = 0; currentNumber <= highLimitNumber; currentNumber++) {
//            System.out.println("current highLimitNumber : " + currentNumber);

            int temporaryNumber = currentNumber;
            int digitTemporaryNumberCount = 0;
            int lastDigit;

//            System.out.println("temporaryNumber : " + temporaryNumber);

            // Étape 1 : compter le nombre de chiffres
            if (temporaryNumber == 0) {
                digitTemporaryNumberCount = 1;
            } else {
                for (temporaryNumber = currentNumber; temporaryNumber > 0; temporaryNumber = temporaryNumber / 10) {
                    digitTemporaryNumberCount++;
                }
            }

            // Étape 2 : calculer la somme des chiffres à la puissance digitsCount
            int sum = 0;
            for (temporaryNumber = currentNumber; temporaryNumber > 0; temporaryNumber = temporaryNumber / 10) {

                lastDigit = temporaryNumber % 10;
                //System.out.println("Dernier chiffre: " + lastDigit);

                int result = 1;

                for (int i = 0; i < digitTemporaryNumberCount; i++) {
                    result *= lastDigit;
                }

//                System.out.println("Puissance : " + result);
                sum += result;
            }

            // Étape 3 : vérification finale
            if (sum == currentNumber) {
                System.out.println(currentNumber + " est un nombre Armstrong.");
            }
            //System.out.println("Nombre de chiffres dans " + currentNumber + " : " + digitTemporaryNumberCount);
        }
    }
}


/*
En constatant ces 10 premiers nombres Armstrong : que pouvez-vous en déduire sur les suivants ?
=> Il y'a en a 20 entre 0 et 100000 et plus on avance moins il y'en a.
Envisageriez-vous de rechercher le 50ème nombre Armstrong ?
=> Du coup, je pense que trouver le 50ème prendrait un temps fou
Votre machine en serait-elle d'ailleurs capable ?
=> Et la machine n'en serait probablement pas capable */
