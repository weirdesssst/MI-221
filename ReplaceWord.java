import java.util.Scanner;

public class ReplaceWord extends TextOperation {

    @Override
    public String operate(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();
        return text.replaceAll("\\b" + oldWord + "\\b", newWord);
    }
}
