import java.util.Scanner;

public class GhostFactory {

    public static Ghost getGhost(String type, String name, String color, int scareLevel) {
        if (type.equalsIgnoreCase("friendly")) {
            return new FriendlyGhost(name, color, scareLevel);
        } else if (type.equalsIgnoreCase("enemy")) {
            return new EnemyGhost(name, color, scareLevel);
        }
        return null; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți tipul de fantomă (friendly/enemy): ");
        String type = scanner.nextLine();

        System.out.println("Introduceți numele fantomei: ");
        String name = scanner.nextLine();

        System.out.println("Introduceți culoarea fantomei: ");
        String color = scanner.nextLine();

        System.out.println("Introduceți nivelul de sperietură (1-10): ");
        int scareLevel = scanner.nextInt();

        Ghost ghost = getGhost(type, name, color, scareLevel);

        if (ghost != null) {
            ghost.scare();
        } else {
            System.out.println("Tip de fantomă necunoscut!");
        }

        scanner.close();
    }
}
