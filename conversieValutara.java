public class conversieValutara {
    public static void main(String[] args) {
        // conversie din MDL in EUR
        MDL_EURconvertor MDLinEUR = new MDL_EURconvertor();
        MDLinEUR.afiseazaCurs();
        double euro = MDLinEUR.converteste(1280); // converteste 1280 MDL in EUR
        System.out.println("1280 MDL in EUR: " + euro);

        // conversie din EUR in GBP
        EUR_GBPconvertor EURinGBP = new EUR_GBPconvertor();
        EURinGBP.afiseazaCurs();
        double lire = EURinGBP.converteste(100); // converteste 100 EUR in GBP
        System.out.println("100 EUR in GBP: " + lire);
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