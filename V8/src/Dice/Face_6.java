package Dice;

public class Face_6 extends Dice {
    @Override
    public int roll(){
        return random.nextInt(6)+1;
    }
}
