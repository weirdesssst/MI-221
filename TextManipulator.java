public class TextManipulator {
    private TextOperations operations;

    public TextManipulator() {
        this.operations = new TextOperations();
    }

    public void manipulateText(String inputText) {
        System.out.println("Original Text: " + inputText);

        String noSpaces = operations.removeSpaces(inputText);
        System.out.println("Text without spaces: " + noSpaces);

        String noNewLines = operations.removeNewLines(inputText);
        System.out.println("Text without new lines: " + noNewLines);

        String mirrored = operations.mirrorText(inputText);
        System.out.println("Mirrored Text: " + mirrored);

        String[] separatedWords = operations.separateWords(inputText);
        System.out.println("Separated Words: ");
        for (String word : separatedWords) {
            System.out.println(word);
        }

        String changedText = operations.changeWords(inputText, "text", "word");
        System.out.println("Text with replaced word: " + changedText);

        String shuffledLetters = operations.shuffleLettersInWords(inputText);
        System.out.println("Text with shuffled letters in words: " + shuffledLetters);
    }

    public static void main(String[] args) {
        TextManipulator manipulator = new TextManipulator();
        String inputText = "Hello, this is a simple text.\nLet's manipulate it!";
        manipulator.manipulateText(inputText);
    }
}
