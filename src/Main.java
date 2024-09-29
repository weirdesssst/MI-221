import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String text1 = "Contacteaza ma la exemplu.deexemplu@git.com sau dupa numarul 123-456-7890.";
        String text2 = "Trimite-mi un mesaj la altceva@yahoo.com sau suna-ma la 987.654.3210.";
        String text3 = "Viziteaza pagina noastra web la www.exemplu.com!";

        List<TextExtractor> extractors = new ArrayList<>();
        extractors.add(new EmailExtractor());
        extractors.add(new PhoneNumberExtractor());
        extractors.add(new URLExtractor());
        extractors.add(new WordCountExtractor());

        MenuDisplayer menu = new MenuDisplayer(extractors);
        menu.displayMenu(text1, text2, text3);
    }
}
