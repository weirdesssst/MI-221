import java.util.List;
import java.util.Scanner;

public class MenuDisplayer {

    private List<TextExtractor> extractors;

    public MenuDisplayer(List<TextExtractor> extractors) {
        this.extractors = extractors;
    }

    public void displayMenu(String text1, String text2, String text3) {
        Scanner scanner = new Scanner(System.in);
        String[] texts = {text1, text2, text3};

        System.out.println("Alege un exemplu de text:");
        for (int i = 0; i < texts.length; i++) {
            System.out.println((i + 1) + ". \"" + texts[i] + "\"");
        }

        int textChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (textChoice < 1 || textChoice > 3) {
            System.out.println("Alegere incorecta.");
            return;
        }

        String chosenText = texts[textChoice - 1];

        System.out.println("Alege o operatie asupra textului:");
        for (int i = 0; i < extractors.size(); i++) {
            System.out.println((i + 1) + ". " + extractors.get(i).getOperationName());
        }
        int operationChoice = scanner.nextInt();

        if (operationChoice < 1 || operationChoice > extractors.size()) {
            System.out.println("Alegere incorecta.");
            return;
        }

        TextExtractor chosenExtractor = extractors.get(operationChoice - 1);
        System.out.println("Textul selectat: \"" + chosenText + "\"");
        System.out.println("Rezultat: " + chosenExtractor.extract(chosenText));
    }
}
