import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class manipulare {
    private Path filePath;

    public manipulare(String filePath) {
        this.filePath = Paths.get(filePath);
    }

    public void removeExtraSpaces() throws IOException {
        String content = new String(Files.readAllBytes(filePath));
        content = content.replaceAll("\\s+", " ").trim();
        Files.write(filePath, content.getBytes());
    }

    public void removeNewLines() throws IOException {
        String content = new String(Files.readAllBytes(filePath));
        content = content.replaceAll("\\r\\n|\\r|\\n", " ");
        Files.write(filePath, content.getBytes());
    }

    public void reverseText() throws IOException {
        String content = new String(Files.readAllBytes(filePath));
        String reversed = new StringBuilder(content).reverse().toString();
        Files.write(filePath, reversed.getBytes());
    }

    public void separateWords() throws IOException {
        String content = new String(Files.readAllBytes(filePath));
        content = content.replaceAll("\\s+", " ");
        Files.write(filePath, content.getBytes());
    }

    public void replaceWords(String target, String replacement) throws IOException {
        String content = new String(Files.readAllBytes(filePath));
        content = content.replace(target, replacement);
        Files.write(filePath, content.getBytes());
    }
}
