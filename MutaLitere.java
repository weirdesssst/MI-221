public class MutaLitere {
  public String mutaLitere(String text) {
    StringBuilder rezultat = new StringBuilder();
    String[] cuvinte = text.split("\\s+");

    for (String cuvant : cuvinte) {
      if (cuvant.length() > 1) {
        // Muta prima literă la final
        String cuvantNou = cuvant.substring(1) + cuvant.charAt(0);
        rezultat.append(cuvantNou).append(" ");
      } else {
        rezultat.append(cuvant).append(" "); // Pentru cuvinte de o literă
      }
    }

    return rezultat.toString().trim(); // Scoate spațiul de la final
  }
}
