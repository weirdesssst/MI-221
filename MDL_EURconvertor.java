// clasa derivata pentru conversia din MDL in EUR
public class MDL_EURconvertor extends ConvertorValutar {

    public MDL_EURconvertor() {
        super(0.052); // presupunem ca 1 MDL = 0.052 EUR
    }

    @Override
    public void afiseazaCurs() {
        System.out.println("Cursul de conversie MDL in EUR este: " + curs);
    }
}