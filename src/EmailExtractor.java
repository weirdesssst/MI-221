import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor extends TextExtractor {

    @Override
    public String extract(String text) {
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }

        return "Nu a fost gasit email.";
    }

    @Override
    public String getOperationName() {
        return "Extragere email";
    }
}
