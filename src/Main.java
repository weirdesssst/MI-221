import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bucatarie bucatarie = null;

        System.out.println("Bine ai venit la aplicatia de recomandare de retete!");
        boolean continua = true;

        while (continua) {
            System.out.println("\nAlege o bucatarie pentru recomandari: Moldoveneasca, Italiana, Japoneza, Mexicana");
            String categorie = scanner.nextLine().toLowerCase();

            switch (categorie) {
                case "japoneza":
                    bucatarie = new ReteteJaponeza();
                    break;
                case "italiana":
                    bucatarie = new ReteteItaliene();
                    break;
                case "mexicana":
                    bucatarie = new ReteteMexicane();
                    break;
                case "moldoveneasca":
                    bucatarie = new ReteteMoldovenesti();
                    break;
                default:
                    System.out.println("Bucatarie necunoscuta.");
                    continue;
            }

            // Întrebare pentru utilizator - ingredient sau preferințe
            System.out.println("Doresti sa cauti retete pe baza ingredientelor sau preferintelor de gust? (scrie 'ingrediente' sau 'preferinte')");
            String tipCautare = scanner.nextLine().toLowerCase();

            String[] retete;

            if (tipCautare.equals("ingrediente")) {
                System.out.println("Introdu ingredientele disponibile, separate prin virgula: ");
                String ingrediente = scanner.nextLine();
                retete = bucatarie.getRecomandariIngrediente(ingrediente);
            } else if (tipCautare.equals("preferinte")) {
                System.out.println("Alege o preferinta de gust: dulce, iute, sarat, acru");
                String preferinta = scanner.nextLine();
                retete = bucatarie.getRecomandariPreferinte(preferinta);
            } else {
                retete = new String[]{"Tip de cautare necunoscuta. Te rugam sa alegi 'ingrediente' sau 'preferinte'."};
            }

            System.out.println("\nRetete recomandate din bucataria " + categorie + ":");
            for (String reteta : retete) {
                System.out.println("- " + reteta);
            }

            System.out.println("\nVrei sa ceri alte recomandari? (da/nu)");
            String raspuns = scanner.nextLine();
            if (raspuns.equalsIgnoreCase("nu")) {
                continua = false;
                System.out.println("Multumim ca ai folosit aplicatia noastra de recomandari de retete!");
            }
        }

        scanner.close();
    }
}
