package Dice;

public class Face_12 extends Dice {
    @Override
    public int roll(){
        return random.nextInt(12)+1;
    }
}
