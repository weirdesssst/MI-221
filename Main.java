import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int optiune;
        double numar1;
        double numar2 = 0.0;

        do {
            System.out.println("\nMeniu:");
            System.out.println("1. Adunare");
            System.out.println("2. Scadere");
            System.out.println("3. Inmultire");
            System.out.println("4. Impartire");
            System.out.println("5. Exponentiere");
            System.out.println("6. Extragerea radacinii patrate");
            System.out.println("0. Iesi");
            System.out.print("Alege o optiune: ");
            optiune = scanner.nextInt();

            if (optiune != 0) {
                // Verificăm dacă opțiunea este validă
                if (optiune < 0 || optiune > 6) {
                    System.out.println("Opțiune invalidă. Te rog, introdu o opțiune validă.");
                    continue;
                }

                if (optiune != 6) {
                    System.out.print("Introdu primul numar: ");
                    numar1 = scanner.nextDouble();
                    System.out.print("Introdu al doilea numar: ");
                    numar2 = scanner.nextDouble();
                } else {
                    System.out.print("Introdu un numar: ");
                    numar1 = scanner.nextDouble();
                }
                

                Operatie operatie = null;
                switch (optiune) {
                    case 1:
                        operatie = new Adunare();
                        break;
                    case 2:
                        operatie = new Scadere();
                        break;
                    case 3:
                        operatie = new Inmultire();
                        break;
                    case 4:
                        operatie = new Impartire();
                        break;
                    case 5:
                        operatie = new Exponentiere();
                        break;
                    case 6:
                        operatie = new Radacina();
                        break;
                }

                try {
                    if (optiune == 6) {
                        // Pentru radacina patrată, folosim doar numar1
                        System.out.println("Rezultatul: " + operatie.executa(numar1, 0)); // numar2 nu e folosit aici
                    } else {
                        System.out.println("Rezultatul: " + operatie.executa(numar1, numar2));
                    }
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            }

        } while (optiune != 0);

        System.out.println("Program încheiat.");
        scanner.close();
    }
}