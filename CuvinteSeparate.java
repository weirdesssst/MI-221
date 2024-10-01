class CuvinteSeparate extends TextOperations {
  public CuvinteSeparate(String text) {
    super(text);
  }

  @Override
  public String operate() {
    StringBuilder rezultat = new StringBuilder();
    String[] cuvinte = text.split("\\s+");
    for (String cuvant : cuvinte) {
      rezultat.append(cuvant).append("\n"); // Afișează fiecare cuvânt pe linie separată
    }
    return rezultat.toString();
  }
}