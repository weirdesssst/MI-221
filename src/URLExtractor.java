import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLExtractor extends TextExtractor {

    @Override
    public String extract(String text) {
        String urlRegex = "www\\.[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        Pattern pattern = Pattern.compile(urlRegex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }

        return "Nu a fost gasit vreun URL.";
    }

    @Override
    public String getOperationName() {
        return "Extragere URL";
    }
}
