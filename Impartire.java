class Impartire extends Operatie {
    @Override
    public double executa(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Împărțirea la zero nu este permisă!");
        }
        return a / b;
    }
}
