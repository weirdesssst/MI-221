import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManipulareExtinsa extends FileManipulator {

    public ManipulareExtinsa(String filePath) {
        super(filePath);
    }

    public void convertToUpperCase() throws IOException {
        String content = readFile();
        content = content.toUpperCase();
        writeFile(content);
    }

    public void convertToLowerCase() throws IOException {
        String content = readFile();
        content = content.toLowerCase();
        writeFile(content);
    }

    public int countWords() throws IOException {
        String content = readFile();
        String[] words = content.trim().split("\\s+");
        return words.length;
    }
}
