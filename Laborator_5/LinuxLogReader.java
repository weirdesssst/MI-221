import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LinuxLogReader {
    // metoda statica care citeste si afiseaza ultimele 5 log-uri de sistem
    public static void readLogs() {
        try {
            // proces care executa comanda "tail" pentru a obtine log-urile de sistem
            Process logProcess = Runtime.getRuntime().exec("tail -n 5 /var/log/syslog");

            // bufferedReader pentru a citi iesirea procesului
            BufferedReader logReader = new BufferedReader(new InputStreamReader(logProcess.getInputStream()));
            String line; // variabila pentru a stoca fiecare linie citita
            
            System.out.println("Ultimele 5 log-uri de sistem Linux:");

            // citeste fiecare linie din fluxul de iesire si o afiseaza in consola
            while ((line = logReader.readLine()) != null) {
                System.out.println(line);
            }
            
            logReader.close();
        } catch (IOException e) {
            
            // mesaj de eroare
            System.err.println("Eroare la citirea log-urilor Linux: " + e.getMessage());
        }
    }
}