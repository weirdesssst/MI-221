public class SquareRoot extends ArithmeticOperation {
    public SquareRoot(double number) {
        super(number, 0);
    }

    @Override
    public double performOperation() {
        if (num1 < 0) {
            throw new ArithmeticException("Nu se poate calcula rădăcina pătrată a unui număr negativ");
        }
        return Math.sqrt(num1);
    }
}
