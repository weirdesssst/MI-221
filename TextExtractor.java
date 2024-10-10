import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Interfață pentru extragere
interface Extractor {
    List<String> extract(String text);
}

// Clasa care extrage adrese de e-mail
class EmailExtractor implements Extractor {

    @Override
    public List<String> extract(String text) {
        List<String> emails = new ArrayList<>();
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }
}

// Clasa care extrage numere de telefon
class PhoneNumberExtractor implements Extractor {

    @Override
    public List<String> extract(String text) {
        List<String> phoneNumbers = new ArrayList<>();
        String phoneRegex = "\\b\\d{10}\\b"; // Exemplu pentru numere de telefon de 10 cifre
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            phoneNumbers.add(matcher.group());
        }
        return phoneNumbers;
    }
}

// Clasa principală care coordonează extragerea
public class TextExtractor {
    private List<Extractor> extractors;

    public TextExtractor() {
        extractors = new ArrayList<>();
        extractors.add(new EmailExtractor());
        extractors.add(new PhoneNumberExtractor());
    }

    public void extractInformation(String text) {
        for (Extractor extractor : extractors) {
            List<String> results = extractor.extract(text);
            if (!results.isEmpty()) {
                System.out.println("Rezultate: " + results);
            } else {
                System.out.println("Nu s-a găsit nimic cu acest extractor.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citirea textului de la utilizator
        System.out.println("Introduceți textul din care doriți să extrageți informații:");
        String inputText = scanner.nextLine();

        TextExtractor extractor = new TextExtractor();
        extractor.extractInformation(inputText);

        scanner.close();
    }
}