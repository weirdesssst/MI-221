// Clasa care extrage linkuri URL
class URLExtractor implements Extractor {

    @Override
    public List<String> extract(String text) {
        List<String> urls = new ArrayList<>();
        String urlRegex = "(https?://[\\w.-]+(?:\\.[\\w.-]+)+(?:/[^\\s]*)?)";
        Pattern pattern = Pattern.compile(urlRegex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            urls.add(matcher.group());
        }
        return urls;
    }
}

// Clasa principală care coordonează extragerea
public class TextExtractor {
    private List<Extractor> extractors;

    public TextExtractor() {
        extractors = new ArrayList<>();
        extractors.add(new EmailExtractor());
        extractors.add(new PhoneNumberExtractor());
        extractors.add(new URLExtractor()); // Adăugăm noul extractor de URL-uri
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

