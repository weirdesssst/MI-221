import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class FileManipulator {
    protected Path filePath;

    public FileManipulator(String filePath) {
        this.filePath = Paths.get(filePath);
    }

    protected String readFile() throws IOException {
        return new String(Files.readAllBytes(filePath));
    }

    protected void writeFile(String content) throws IOException {
        Files.write(filePath, content.getBytes());
    }
}
