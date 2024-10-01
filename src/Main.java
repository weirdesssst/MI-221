import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/IGOR/IdeaProjects/lab1/example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Fișierul a fost creat: " + file.getName());

                // Adăugarea de conținut de test
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write("This is a sample text with extra spaces and new lines.\n\n");
                    writer.write("Additional line for testing.\n");
                }

            } else {
                System.out.println("Fișierul deja există.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Prima parte: manipulările din clasa manipulare
        manipulare manipulare = new manipulare("C:/Users/IGOR/IdeaProjects/lab1/example.txt");
        try {
            manipulare.removeExtraSpaces();
            manipulare.removeNewLines();
            manipulare.reverseText();
            manipulare.separateWords();
            manipulare.replaceWords("sample", "example");
            System.out.println("Manipulările din prima clasă au fost aplicate cu succes.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // A doua parte: manipulările din clasa ManipulareExtinsa
        ManipulareExtinsa manipulareExtinsa = new ManipulareExtinsa("C:/Users/IGOR/IdeaProjects/lab1/example.txt");
        try {
            manipulareExtinsa.convertToUpperCase();
            int wordCount = manipulareExtinsa.countWords();
            System.out.println("Textul a fost convertit la majuscule.");
            System.out.println("Numărul de cuvinte din fișier: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
