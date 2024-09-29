public class WordCountExtractor extends TextExtractor {

    @Override
    public String extract(String text) {
        String[] words = text.split("\\s+");
        return "Numarul de cuvinte: " + words.length;
    }

    @Override
    public String getOperationName() {
        return "Numarul de cuvinte";
    }
}
