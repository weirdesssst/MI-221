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