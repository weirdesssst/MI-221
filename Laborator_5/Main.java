public class Main {
    public static void main(String[] args) {
        // obtine numele sistemului de operare curent si il converteste in litere mici
        String os = System.getProperty("os.name").toLowerCase();
        
        // verifica daca sistemul de operare este windows sau linux
        if (os.contains("win")) {
            WindowsLogReader.readLogs();
        } else if (os.contains("nix") || os.contains("nux")) {
            LinuxLogReader.readLogs();
        } else {
            System.out.println("Sistem de operare neacceptat: " + os);
        }
    }
}