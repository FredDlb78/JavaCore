package javacore.chapter05.object.exercise;

public class LibraryBook {

    String title;
    String author;
    String isbn; // :) Ca me rappelle une conversation

    int publicationYear;

    boolean isLoaned;

    public void displayInformation() {
        System.out.println("Titre: " + title);
        System.out.println("Auteur: " + author);
        System.out.println("Année de publication: " + publicationYear);
        System.out.println("ISBN: " + isbn);
        if (isLoaned) {
            System.out.println("Le livre " + title + " n'est pas disponible actuellement.");
        } else {
            System.out.println("Le livre " + title + " est disponible.");
        }
    }

    public static void main(String[] args) {

        LibraryBook book = new LibraryBook();
        book.title = "JavaCore Master Guide";
        book.author = "Guillaume Jacquelet";
        book.publicationYear = 2024;
        book.isbn = "979-8340050069";
        book.isLoaned = true;

        book.displayInformation();
    }
}
