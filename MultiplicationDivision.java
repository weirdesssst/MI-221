public class MultiplicationDivision extends ArithmeticOperation {
    private String operationType;

    public MultiplicationDivision(double num1, double num2, String operationType) {
        super(num1, num2);
        this.operationType = operationType;
    }

    @Override
    public double performOperation() {
        if (operationType.equals("mul")) {
            return num1 * num2;
        } else {
            if (num2 == 0) {
                throw new ArithmeticException("Imparțirea la 0 (zero) nu are sens. Nu putem efectua imparțirea la nimic.");
            }
            return num1 / num2;
        }
    }
}
