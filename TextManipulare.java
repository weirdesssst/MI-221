import java.util.Scanner;

public class TextManipulare {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder inputText = new StringBuilder();

    System.out.println("Introdu textul (scrie 'STOP' pentru a termina):");

    // Permite utilizatorului să introducă text pe mai multe linii
    while (true) {
      String line = scanner.nextLine();
      if (line.equalsIgnoreCase("STOP")) {
        break; // Termină citirea la introducerea cuvântului 'STOP'
      }
      inputText.append(line).append("\n"); // Adaugă linia la textul total
    }

    String text = inputText.toString();
    int choice = 0;

    while (choice != 7) {
      System.out.println("Alege o operatiune:");
      System.out.println("1. Sterge liniile noi");
      System.out.println("2. Text oglinda (inversare)");
      System.out.println("3. Muta literele in cuvinte");
      System.out.println("4. Iesire");
      System.out.print("Introdu optiunea (1-4): ");

      choice = scanner.nextInt();
      scanner.nextLine(); // Consumăm linia rămasă

      TextOperations operation = null; // Declarația variabilei pentru operațiune

      switch (choice) {
        case 1:
          operation = new RemoveNewLines(text);
          break;
        case 2:
          operation = new TextOglinda(text);
          break;
        case 3:
          operation = new MutaLitere(text);
          break;
        case 4:
          System.out.println("Iesire din program.");
          break;
        default:
          System.out.println("Optiune invalida, te rog sa alegi din nou.");
          continue; // Revenim la începutul buclei
      }

      if (operation != null) {
        String rezultat = operation.operate(); // Apelăm metoda operate
        System.out.println("Rezultatul operatiei: " + rezultat);
      }
      System.out.println(); // Linia goală pentru mai bună lizibilitate
    }

    scanner.close();
  }
}