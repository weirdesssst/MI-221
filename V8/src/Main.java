import Dice.Face_6;
import java.util.Scanner;
import Dice.Dice;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice6 = new Face_6();
        while (true) {
            System.out.println("Alegeti zarul cu care v-eti arunca!");
            System.out.println("1- 6fete , 2- 12fete , 3-iesire din program , 4 show me history ");

            int chosen = scanner.nextInt();
            switch (chosen) {
                case 1:
                    System.out.println("Zarul aruncat arata:" + dice6.roll());
                    break;
                case 2:
                    System.out.println("Still not done!");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nu exista asa optiune!");
                    break;
            }
        }
    }
}