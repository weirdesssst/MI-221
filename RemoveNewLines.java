public class RemoveNewLines extends TextOperations {

    @Override
    public String operate(String text) {
        return text.replace("\n", "");
    }
}
