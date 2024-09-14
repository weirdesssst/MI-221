import java.util.Scanner;

public class TextManipulator {
    private TextOperations operations;

    public TextManipulator() {
        this.operations = new TextOperations();
    }

    // Menu for selecting operations
    public void displayMenu() {
        System.out.println("\nSelect an operation:");
        System.out.println("1. Remove Spaces");
        System.out.println("2. Remove New Lines");
        System.out.println("3. Mirror Text");
        System.out.println("4. Separate Words");
        System.out.println("5. Replace a Word");
        System.out.println("6. Shuffle Letters in Words");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public void manipulateText(String inputText, int choice) {
        switch (choice) {
            case 1:
                String noSpaces = operations.removeSpaces(inputText);
                System.out.println("Text without spaces: " + noSpaces);
                break;

            case 2:
                String noNewLines = operations.removeNewLines(inputText);
                System.out.println("Text without new lines: " + noNewLines);
                break;

            case 3:
                String mirrored = operations.mirrorText(inputText);
                System.out.println("Mirrored Text: " + mirrored);
                break;

            case 4:
                String[] separatedWords = operations.separateWords(inputText);
                System.out.println("Separated Words: ");
                for (String word : separatedWords) {
                    System.out.println(word);
                }
                break;

            case 5:
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the word to replace: ");
                String oldWord = sc.nextLine();
                System.out.print("Enter the new word: ");
                String newWord = sc.nextLine();
                String changedText = operations.changeWords(inputText, oldWord, newWord);
                System.out.println("Text with replaced word: " + changedText);
                break;

            case 6:
                String shuffledLetters = operations.shuffleLettersInWords(inputText);
                System.out.println("Text with shuffled letters in words: " + shuffledLetters);
                break;

            case 0:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextManipulator manipulator = new TextManipulator();

        System.out.println("Please enter the text to manipulate:");
        String inputText = scanner.nextLine();

        int choice;
        do {
            manipulator.displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            manipulator.manipulateText(inputText, choice);
        } while (choice != 0);

        scanner.close();
    }
}
