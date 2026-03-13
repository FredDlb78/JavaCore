package javacore.chapter05.object.exercise;

import java.io.UnsupportedEncodingException;
// Suppression de l'import et j'ai utilisé l'import automatique
import java.util.Base64;

// Suppression de "deprecation" car warning
@SuppressWarnings({"restriction" })
public class TestBase64 {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String testContent = "Du texte à encoder pour être envoyé.";

        String encodedContent = Base64.getEncoder().encodeToString(testContent.getBytes("UTF-8"));

        System.out.println("Contenu encodé : " + encodedContent);

    }

}