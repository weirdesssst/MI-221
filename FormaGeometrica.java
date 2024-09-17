public class FormaGeometrica {
    public static void main(String[] args) {
        Cerc cerc = new Cerc(5.0);
        System.out.println("Aria cercului: " + cerc.calculeazaAria());
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
