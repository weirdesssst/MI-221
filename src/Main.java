import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String text = "Contacteaza ma la exemplu.deexemplu@git.com sau dupa numarul 123-456-7890.";

        List<TextExtractor> extractors = new ArrayList<>();
        extractors.add(new EmailExtractor());
        extractors.add(new PhoneNumberExtractor());

        for (TextExtractor extractor : extractors) {
            System.out.println(extractor.extract(text));
        }
    }
}