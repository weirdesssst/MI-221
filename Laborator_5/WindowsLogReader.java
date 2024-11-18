import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WindowsLogReader {
    public static void readLogs() {
        try {
            // proces pentru a executa comanda "wevtutil" care va obtine ultimele 5 log-uri de sistem
            Process process = Runtime.getRuntime().exec("wevtutil qe System /c:5 /rd:true /f:text");
            
            // BufferedReader pentru a citi iesirea procesului
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            
            System.out.println("Ultimele 5 log-uri de sistem Windows:");

            // citeste si afiseaza fiecare linie
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            reader.close();
        } catch (IOException error) {
            // afiseaza un mesaj de eroare in cazul in care executia/citirea esueaza
            System.err.println("Eroare la citirea log-urilor Windows: " + error.getMessage());
        }
    }
}