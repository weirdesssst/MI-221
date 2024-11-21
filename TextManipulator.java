import java.util.Scanner;

public class TextManipulator {

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

    public void manipulateText(String inputText, TextOperations operation) {
        String result = operation.operate(inputText);
        System.out.println("Result: " + result);
    }
}
