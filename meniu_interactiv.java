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
        // Acceptă formate cu sau fără prefix internațional
        String phoneRegex = "\\b(\\+\\d{1,3}[- ]?)?\\d{10}\\b";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            phoneNumbers.add(matcher.group());
        }
        return phoneNumbers;
    }
}

// Clasa care extrage URL-uri
class URLExtractor implements Extractor {

    @Override
    public List<String> extract(String text) {
        List<String> urls = new ArrayList<>();
        // Regex pentru URL-uri
        String urlRegex = "(https?://\\S+)";
        Pattern pattern = Pattern.compile(urlRegex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            urls.add(matcher.group());
        }
        return urls;
    }
}

// Clasa care extrage adrese IP
class IPExtractor implements Extractor {

    @Override
    public List<String> extract(String text) {
        List<String> ips = new ArrayList<>();
        // Regex pentru adrese IP
        String ipRegex = "\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b";
        Pattern pattern = Pattern.compile(ipRegex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            ips.add(matcher.group());
        }
        return ips;
    }
}

// Clasa principală care coordonează extragerea
public class TextExtractor {
    private List<Extractor> extractors;

    public TextExtractor() {
        extractors = new ArrayList<>();
        extractors.add(new EmailExtractor());
        extractors.add(new PhoneNumberExtractor());
        extractors.add(new URLExtractor());
        extractors.add(new IPExtractor());  // Adaugat extractor pentru adrese IP
    }

    // Metodă pentru a adăuga dinamic extractoare
    public void addExtractor(Extractor extractor) {
        extractors.add(extractor);
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

        TextExtractor extractor = new TextExtractor();
        
        // Meniu pentru utilizator
        while (true) {
            System.out.println("\nMeniu:");
            System.out.println("1. Extrage adrese de e-mail");
            System.out.println("2. Extrage numere de telefon");
            System.out.println("3. Extrage URL-uri");
            System.out.println("4. Extrage adrese IP");
            System.out.println("5. Introduceți un text pentru toate extragerile");
            System.out.println("6. Ieși");

            int optiune = scanner.nextInt();
            scanner.nextLine();  // Consumă newline-ul rămas

            if (optiune == 6) {
                System.out.println("Ieșire.");
                break;
            }

            System.out.println("Introduceți textul din care doriți să extrageți informații:");
            String inputText = scanner.nextLine();

            switch (optiune) {
                case 1:
                    System.out.println("Extragere e-mailuri...");
                    extractor.addExtractor(new EmailExtractor());
                    break;
                case 2:
                    System.out.println("Extragere numere de telefon...");
                    extractor.addExtractor(new PhoneNumberExtractor());
                    break;
                case 3:
                    System.out.println("Extragere URL-uri...");
                    extractor.addExtractor(new URLExtractor());
                    break;
                case 4:
                    System.out.println("Extragere adrese IP...");
                    extractor.addExtractor(new IPExtractor());
                    break;
                case 5:
                    System.out.println("Extragere pentru toate tipurile...");
                    extractor.extractInformation(inputText);
                    continue;
                default:
                    System.out.println("Opțiune invalidă. Încercați din nou.");
                    continue;
            }

            extractor.extractInformation(inputText);
        }

        scanner.close();
    }
}
