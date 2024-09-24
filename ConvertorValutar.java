// clasa de baza
public class ConvertorValutar {
    public double curs;

    // constructor
    public ConvertorValutar(double curs) {
        this.curs = curs;
    }

    // metoda pentru a converti o suma de bani
    public double converteste(double suma) {
        return suma * curs;
    }

    // metoda pentru a afisa cursul valutar
    public void afiseazaCurs() {
        System.out.println("Cursul valutar este: " + curs);
    }
}