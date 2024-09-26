class MutaLitere extends TextOperations {
  public MutaLitere(String text) {
    super(text);
  }

  @Override
  public String operate() {
    StringBuilder rezultat = new StringBuilder();
    String[] cuvinte = text.split("\\s+");

    for (String cuvant : cuvinte) {
      if (cuvant.length() > 1) {
        String cuvantNou = cuvant.substring(1) + cuvant.charAt(0); // Mută prima literă la final
        rezultat.append(cuvantNou).append(" ");
      } else {
        rezultat.append(cuvant).append(" ");
      }
    }
    return rezultat.toString().trim(); // Scoate spațiul de la final
  }
}