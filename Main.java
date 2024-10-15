import java.util.Scanner;

// Clasa principală care folosește ambele extractoare
public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect Scanner pentru a citi inputul de la tastatură
        Scanner scanner = new Scanner(System.in);

        // Solicită utilizatorului să introducă textul
        System.out.println("Introduceți textul din care doriți să extrageți informațiile:");
        String sampleText = scanner.nextLine();

        // Instanțierea claselor pentru extragerea informațiilor
        PhoneNumberExtractor phoneExtractor = new PhoneNumberExtractor(sampleText);
        EmailExtractor emailExtractor = new EmailExtractor(sampleText);

        // Afișarea rezultatelor extragerilor
        System.out.println("Numere de telefon găsite:");
        System.out.println(phoneExtractor.extract());

        System.out.println("Adrese de email găsite:");
        System.out.println(emailExtractor.extract());

        // Închiderea scanner-ului
        scanner.close();
    }
}
