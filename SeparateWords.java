public class SeparateWords extends TextOperation {

    @Override
    public String operate(String text) {
        return String.join("\n", text.split("\\s+"));
    }
}
