// Clasa abstractă pentru extragerea informațiilor
public abstract class TextExtractor {
    protected String text;

    // Constructor pentru inițializarea textului
    public TextExtractor(String text) {
        this.text = text;
    }

    // Metodă abstractă pentru extragerea informațiilor
    public abstract String extract();
}
