public class MirrorText extends TextOperations {

    @Override
    public String operate(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
