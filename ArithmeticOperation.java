public abstract class ArithmeticOperation {
    protected double num1;
    protected double num2;
    public ArithmeticOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract double performOperation();
}
class Addition extends ArithmeticOperation {
    public Addition(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double performOperation() {
        return num1 + num2;
    }
}

class Subtraction extends ArithmeticOperation {
    public Subtraction(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double performOperation() {
        return num1 - num2;
    }
}

class Multiplication extends ArithmeticOperation {
    public Multiplication(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double performOperation() {
        return num1 * num2;
    }
}

class Division extends ArithmeticOperation {
    public Division(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double performOperation() {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }
}

class Exponentiation extends ArithmeticOperation {
    public Exponentiation(double base, double exponent) {
        super(base, exponent);
    }

    @Override
    public double performOperation() {
        return Math.pow(num1, num2);
    }
}

class SquareRoot extends ArithmeticOperation {
    public SquareRoot(double number) {
        super(number, 0);
    }

    @Override
    public double performOperation() {
        if (num1 < 0) {
            throw new ArithmeticException("Cannot calculate the square root of a negative number.");
        }
        return Math.sqrt(num1);
    }
}
