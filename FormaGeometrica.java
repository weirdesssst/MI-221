public class FormaGeometrica {
    public static void main(String[] args) {
        Dreptunghi dreptunghi = new Dreptunghi(4.0, 6.0);
        System.out.println("Perimetrul dreptunghiului: " + dreptunghi.calculeazaPerimetrul());
    }
}

class Dreptunghi extends FormaGeometrica {
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public double calculeazaPerimetrul() {
        return 2 * (lungime + latime);
    }
}


