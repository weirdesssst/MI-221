import Dice.Face_12;
import Dice.Face_6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Dice.Dice;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice6 = new Face_6();
        Dice dice12 = new Face_12();
        List<Integer> history6 = new ArrayList<>();
        List<Integer> history12 = new ArrayList<>();
        while (true) {
            System.out.println("___________________________________________________________________________________________");
            System.out.println("Alegeti zarul cu care v-eti arunca!");
            System.out.println("1- 6fete , 2- 12fete , 3- Istoric 6 fete , 4 - Isotric 12 fete ,   5-iesire din program");

            int chosen = scanner.nextInt();
            switch (chosen) {
                case 1:
                    int roll6 = dice6.roll();
                    System.out.println("Zarul aruncat arata:" + roll6);
                    history6.add(roll6);
                    break;
                case 2:
                    int roll12 = dice12.roll();
                    System.out.println("Zarul aruncat arata:" + roll12);
                    history6.add(roll12);
                    break;
                case 3:
                    System.out.println("Istoric pentru zarul cu 6 fete");
                    if(history6.isEmpty()){
                        System.out.println("Nu au fost aruncate zaruri cu 6 fete");
                    } else {
                        for(int result:history6){
                            System.out.print(result+" ");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Istoric pentru zarul cu 12 fete");
                    if(history12.isEmpty()){
                        System.out.println("Nu au fost aruncate zaruri cu 6 fete");
                    } else {
                        for (int result : history12){
                            System.out.print(result+" ");
                        }
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Nu exista asa optiune!");
                    break;
            }
        }
    }
}