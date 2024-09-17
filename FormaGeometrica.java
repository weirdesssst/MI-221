public class FormaGeometrica {
    public static void main(String[] args) {
        Cerc cerc = new Cerc(5.0);
        Dreptunghi dreptunghi = new Dreptunghi(4.0, 6.0);
        System.out.println("Aria cercului: " + cerc.calculeazaAria());
        System.out.println("Perimetrul dreptunghiului: " + dreptunghi.calculeazaPerimetrul());
    }
}
