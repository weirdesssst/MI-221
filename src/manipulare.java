import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class manipulare extends FileManipulator {

    public manipulare(String filePath) {
        super(filePath);
    }

    public void removeExtraSpaces() throws IOException {
        String content = readFile();
        content = content.replaceAll("\\s+", " ").trim();
        writeFile(content);
    }

    public void removeNewLines() throws IOException {
        String content = readFile();
        content = content.replaceAll("\\r\\n|\\r|\\n", " ");
        writeFile(content);
    }

    public void reverseText() throws IOException {
        String content = readFile();
        String reversed = new StringBuilder(content).reverse().toString();
        writeFile(reversed);
    }

    public void separateWords() throws IOException {
        String content = readFile();
        content = content.replaceAll("\\s+", " ");
        writeFile(content);
    }

    public void replaceWords(String target, String replacement) throws IOException {
        String content = readFile();
        content = content.replace(target, replacement);
        writeFile(content);
    }
}
