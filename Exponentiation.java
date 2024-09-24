public class Exponentiation extends ArithmeticOperation {
    public Exponentiation(double base, double exponent) {
        super(base, exponent);
    }

    @Override
    public double performOperation() {
        return Math.pow(num1, num2);
    }
}
