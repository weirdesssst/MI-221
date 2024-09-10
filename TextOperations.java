import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TextOperations {

    // Stergere spatii
    public String removeSpaces(String text) {
        return text.replace(" ", "");
    }

    // Stergere linii noi 
    public String removeNewLines(String text) {
        return text.replace("\n", "");
    }

    // Text in oglinda
    public String mirrorText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // Cuvinte separate
    public String[] separateWords(String text) {
        return text.split("\\s+");
    }

    // Schimba cuvinte
    public String changeWords(String text, String oldWord, String newWord) {
        return text.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    // Schimba litera in text
    public String shuffleLettersInWords(String text) {
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            List<Character> letters = word.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toList());
            Collections.shuffle(letters);
            for (char c : letters) {
                result.append(c);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
