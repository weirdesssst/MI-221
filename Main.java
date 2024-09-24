import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean runApp = true;

        while (runApp) {
            System.out.println("Meniu:");
            System.out.println("1. Introducerea datelor de la tastatura");
            System.out.println("2. Date prestabilite (135 si 14)");
            System.out.println("3. Iesire");
            System.out.print("Alegeti o optiune: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    double num1 = getValidNumber(scanner, "Introduceti primul numar: ");
                    double num2 = getValidNumber(scanner, "Introduceti al doilea numar: ");
                    handleOperations(scanner, num1, num2, true);  // Permite schimbarea numerelor
                    break;
                case 2:
                    double defaultNum1 = 135;
                    double defaultNum2 = 14;
                    System.out.println("Folosind date prestabilite: " + defaultNum1 + " si " + defaultNum2);
                    handleOperations(scanner, defaultNum1, defaultNum2, false);  // Nu permite schimbarea numerelor
                    break;
                case 3:
                    runApp = false;
                    System.out.println("Iesire din aplicatie.");
                    break;
                default:
                    System.out.println("Optiune invalida, va rugam sa incercati din nou.");
            }
        }
        scanner.close();
    }

    private static double getValidNumber(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Eroare: Va rugam sa introduceti un numar valid de tip intreg.");
                scanner.next();
            }
        }
    }

    private static void handleOperations(Scanner scanner, double num1, double num2, boolean allowNumberChange) {
        boolean continueOperations = true;

        while (continueOperations) {
            System.out.println("Selectati operatia:");
            System.out.println("1. Adunare");
            System.out.println("2. Scadere");
            System.out.println("3. Extractie radacina");
            System.out.println("4. Inmultire");
            System.out.println("5. Impartire");
            System.out.println("6. Exponentiere");
            System.out.print("Alegeti o optiune: ");
            int operation = scanner.nextInt();

            ArithmeticOperation arithmeticOperation = null;

            switch (operation) {
                case 1:
                    arithmeticOperation = new AdditionSubtraction(num1, num2, "add");
                    break;
                case 2:
                    arithmeticOperation = new AdditionSubtraction(num1, num2, "sub");
                    break;
                case 3:
                    System.out.println("1. Extrage radacina din primul numar");
                    System.out.println("2. Extrage radacina din al doilea numar");
                    int rootOption = scanner.nextInt();
                    if (rootOption == 1) {
                        arithmeticOperation = new SquareRoot(num1);
                    } else if (rootOption == 2) {
                        arithmeticOperation = new SquareRoot(num2);
                    } else {
                        System.out.println("Optiune invalida.");
                        continue;
                    }
                    break;
                case 4:
                    arithmeticOperation = new MultiplicationDivision(num1, num2, "mul");
                    break;
                case 5:
                    arithmeticOperation = new MultiplicationDivision(num1, num2, "div");
                    break;
                case 6:
                    arithmeticOperation = new Exponentiation(num1, num2);
                    break;
                default:
                    System.out.println("Optiune invalida.");
                    continue;
            }

            if (arithmeticOperation != null) {
                try {
                    double result = arithmeticOperation.performOperation();
                    System.out.println("Rezultatul: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Eroare: " + e.getMessage());
                }
            }

            System.out.println("Doriti sa reveniti la meniul principal?");
            System.out.println("1. Da");
            System.out.println("2. Nu, continua cu aceleasi numere");
            if (allowNumberChange) {
                System.out.println("3. Nu, introduceti alte numere");
            }

            int nextStep;
            while (true) {
                nextStep = scanner.nextInt();
                if (nextStep == 1 || nextStep == 2 || (allowNumberChange && nextStep == 3)) {
                    break;
                } else {
                    System.out.println("Optiune invalida. Va rugam sa introduceti o optiune valida.");
                }
            }

            if (nextStep == 1) {
                break;
            } else if (nextStep == 3 && allowNumberChange) {
                num1 = getValidNumber(scanner, "Introduceti primul numar: ");
                num2 = getValidNumber(scanner, "Introduceti al doilea numar: ");
            }
        }
    }
}
