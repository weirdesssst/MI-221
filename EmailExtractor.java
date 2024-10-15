// Clasa care extrage adrese de email
public class EmailExtractor extends TextExtractor {

    // Constructor care apelează constructorul clasei părinte
    public EmailExtractor(String text) {
        super(text);
    }

    // Implementarea metodei extract folosind expresii regulate
    @Override
    public String extract() {
        String pattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
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
