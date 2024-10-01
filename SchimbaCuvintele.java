class SchimbaCuvintele extends TextOperations {
    private String cuvantDeInlocuit;
    private String cuvantNou;

    public SchimbaCuvintele(String text, String cuvantDeInlocuit, String cuvantNou) {
        super(text);
        this.cuvantDeInlocuit = cuvantDeInlocuit;
        this.cuvantNou = cuvantNou;
    }

    @Override
    public String operate() {
        return text.replaceAll("\\b" + cuvantDeInlocuit + "\\b", cuvantNou); // Schimbă cuvintele
    }
}