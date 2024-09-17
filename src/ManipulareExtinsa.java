import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManipulareExtinsa {
    private Path filePath;

    public ManipulareExtinsa(String filePath) {
        this.filePath = Paths.get(filePath);
    }

    public void convertToUpperCase() throws IOException {
        String content = new String(Files.readAllBytes(filePath));
        content = content.toUpperCase();
        Files.write(filePath, content.getBytes());
    }

    public void convertToLowerCase() throws IOException {
        String content = new String(Files.readAllBytes(filePath));
        content = content.toLowerCase();
        Files.write(filePath, content.getBytes());
    }

    public int countWords() throws IOException {
        String content = new String(Files.readAllBytes(filePath));
        String[] words = content.trim().split("\\s+");
        return words.length;
    }
}
