import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOperatii aritmetice simple:");
            System.out.println("1. Adunare");
            System.out.println("2. Scadere");
            System.out.println("3. Inmultire");
            System.out.println("4. Impartire");
            System.out.println("5. Exponentiere");
            System.out.println("6. Extractie radacina");
            System.out.println("7. Iesire din program");
            System.out.print("> ");

            String operatie = scanner.nextLine();

            if (operatie.equals("7")) {
                System.out.println("Iesire din program...");
                break;
            }

            double a, b;
            switch (operatie) {
                case "1":
                case "2":
                    Adunare_Scadere adunareScadere = new Adunare_Scadere();
                    System.out.print("Introduceti primul numar: ");
                    a = scanner.nextDouble();
                    System.out.print("Introduceti al doilea numar: ");
                    b = scanner.nextDouble();
                    if (operatie.equals("1")) {
                        System.out.println("Rezultatul adunarii: " + adunareScadere.aduna(a, b));
                    } else {
                        System.out.println("Rezultatul scaderii: " + adunareScadere.scade(a, b));
                    }
                    break;
                case "3":
                    Inmultire_Impartire inmultireImpartire = new Inmultire_Impartire();
                    System.out.print("Introduceti primul numar: ");
                    a = scanner.nextDouble();
                    System.out.print("Introduceti al doilea numar: ");
                    b = scanner.nextDouble();
                    System.out.println("Rezultatul inmultirii: " + inmultireImpartire.inmulteste(a, b));
                    break;
                case "4":
                    System.out.print("Introduceti primul numar: ");
                    a = scanner.nextDouble();
                    System.out.print("Introduceti al doilea numar: ");
                    b = scanner.nextDouble();
                    if (b == 0) {
                        System.out.println("Impartirea la 0 nu este permisa!");
                    } else {
                        System.out.println("Rezultatul impartirii: " + (a / b));
                    }
                    break;
                case "5":

                    break;
                case "6":

                    break;
                default:
                    System.out.println("Optiune invalida!");
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}

class Adunare_Scadere {
    public double aduna(double a, double b) {
        return a + b;
    }

    public double scade(double a, double b) {
        return a - b;
    }
}
