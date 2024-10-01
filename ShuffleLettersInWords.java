import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ShuffleLettersInWords extends TextOperation {

    @Override
    public String operate(String text) {
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
