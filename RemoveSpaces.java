public class RemoveSpaces extends TextOperations {

    @Override
    public String operate(String text) {
        return text.replace(" ", "");
    }
}
