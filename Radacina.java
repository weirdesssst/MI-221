class Radacina extends Operatie {
    @Override
    public double executa(double a, double b) {
        if (a < 0) {
            throw new ArithmeticException("Rădăcina pătrată a unui număr negativ nu este permisă!");
        }
        return Math.sqrt(a);
    }
}