import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExtractor extends TextExtractor {

    @Override
    public String extract(String text) {
        String phoneRegex = "\\b\\d{3}[-.]?\\d{3}[-.]?\\d{4}\\b";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }

        return "Nu a fost gasit numar de telefon.";
    }

    @Override
    public String getOperationName() {
        return "Extragere numar de telefon";
    }
}
