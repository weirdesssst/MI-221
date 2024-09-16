public class conversieValutara {
    public static void main(String[] args) {
        System.out.println("Urmeaza cod...");
    }
}

// clasa de baza
class ConvertorValutar {
    protected double curs;

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