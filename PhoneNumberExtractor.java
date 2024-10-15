// Clasa care extrage numere de telefon
public class PhoneNumberExtractor extends TextExtractor {

    // Constructor care apelează constructorul clasei părinte
    public PhoneNumberExtractor(String text) {
        super(text);
    }

    // Implementarea metodei extract folosind expresii regulate
    @Override
    public String extract() {
        String pattern = "\\b\\d{10}\\b"; // Exemplu de regex pentru 10 cifre consecutive
        return extractUsingRegex(pattern);
    }

    // Metodă de ajutor pentru extragerea informației folosind regex
    private String extractUsingRegex(String pattern) {
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(pattern);
        java.util.regex.Matcher m = p.matcher(text);
        StringBuilder result = new StringBuilder();
        while (m.find()) {
            result.append(m.group()).append("\n");
        }
        return result.toString();
    }
}
