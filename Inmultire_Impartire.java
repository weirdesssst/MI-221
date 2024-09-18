public class Inmultire_Impartire {
    public double inmulteste(double a, double b) {
        return a * b;
    }

    public double imparte(double a, double b) {
        if (b == 0) {
            System.out.println("Impartirea la 0 nu este permisa!");
            return Double.NaN;
        }
        return a / b;
    }
}
