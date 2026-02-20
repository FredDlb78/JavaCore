package javacore.chapter05.object.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class GradesAnalyzer {

    private static final byte MAX_ATTEMPTS = 3;
    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args) {
        //
        System.out.println(Arrays.toString(setNotes()));
    }

    public static byte[] setNotes() {
        byte notesNumber = requestNotesNumber();
        byte[] notes = new byte[notesNumber];
        byte noteIndex = 0;

        for (noteIndex = 0; noteIndex < notesNumber; noteIndex++) {
            byte attempts = 0;
            do {
                System.out.print("Saisissez votre " + (noteIndex + 1) + "e note :");
                notes[noteIndex] = sc.nextByte();
                attempts++;

                if (notes[noteIndex] < 0 || notes[noteIndex] > 20) {
                    System.out.println("Valeur invalide, veuillez saisir une valeur entre 0 et 20 inclu.");
                } else {
                    break;
                }
            } while (attempts < MAX_ATTEMPTS);

            if (notes[noteIndex] < 0 || notes[noteIndex] > 20) {
                System.out.println("Nombre de tentatives maximum atteint. Note mise à 0 par défaut.");
                notes[noteIndex] = 0;
            }
        }

        return notes;
    }


    public static byte requestNotesNumber() {
        byte attempts = 0;
        byte numberOfNotes;
        do {
            System.out.print("Combien de notes souhaitez-vous saisir ? (Min: 2 - Max: 30) :");
            numberOfNotes = sc.nextByte();
            attempts++;

            if (numberOfNotes < 2 || numberOfNotes > 30) {
                System.err.println("Valeur invalide, veuillez saisir une valeur entre 2 et 30 inclu.");
            } else {
                break;
            }
        } while (attempts < MAX_ATTEMPTS);

        return numberOfNotes;
    }
}
