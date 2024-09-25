import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextManipulator manipulator = new TextManipulator();

        System.out.println("Please enter the text to manipulate:");
        String inputText = scanner.nextLine();

        int choice;
        do {
            manipulator.displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            TextOperation operation = null;

            switch (choice) {
                case 1:
                    operation = new RemoveSpaces();
                    break;
                case 2:
                    operation = new RemoveNewLines();
                    break;
                case 3:
                    operation = new MirrorText();
                    break;
                case 4:
                    operation = new SeparateWords();
                    break;
                case 5:
                    operation = new ReplaceWord();
                    break;
                case 6:
                    operation = new ShuffleLettersInWords();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }

            if (operation != null) {
                manipulator.manipulateText(inputText, operation);
            }
        } while (choice != 0);

        scanner.close();
    }
}
