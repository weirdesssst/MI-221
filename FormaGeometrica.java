public class FormaGeometrica {
    public static void main(String[] args) {
        Cerc cerc = new Cerc(5.0);
        Dreptunghi dreptunghi = new Dreptunghi(4.0, 6.0);
        System.out.println("Aria cercului: " + cerc.calculeazaAria());
        System.out.println("Perimetrul dreptunghiului: " + dreptunghi.calculeazaPerimetrul());
    }
}

class Cerc extends FormaGeometrica {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public double calculeazaAria() {
        return Math.PI * raza * raza;
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
