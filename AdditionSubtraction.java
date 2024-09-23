public class AdditionSubtraction extends ArithmeticOperation {
    private String operationType;

    public AdditionSubtraction(double num1, double num2, String operationType) {
        super(num1, num2);
        this.operationType = operationType;
    }

    @Override
    public double performOperation() {
        if (operationType.equals("add")) {
            return num1 + num2;
        } else {
            return num1 - num2;
        }
    }
}
