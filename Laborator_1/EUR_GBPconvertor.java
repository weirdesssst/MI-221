// clasa derivata pentru conversia din EUR in GBP
public class EUR_GBPconvertor extends ConvertorValutar {

    public EUR_GBPconvertor() {
        super(0.84); // presupunem ca 1 EUR = 0.84 GBP
    }

    @Override
    public void afiseazaCurs() {
        System.out.println("Cursul de conversie EUR in GBP este: " + curs);
    }
}