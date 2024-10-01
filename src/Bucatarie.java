public class Bucatarie {
    String numeBucatarie;

    Bucatarie(String numeBucatarie) {
        this.numeBucatarie = numeBucatarie;
    }

    public String[] getRecomandariIngrediente(String ingrediente) {
        return new String[]{"Metoda de recomandari ingrediente nu este definita pentru aceasta bucatarie."};
    }

    public String[] getRecomandariPreferinte(String preferinta) {
        return new String[]{"Metoda de recomandari preferinte nu este definita pentru aceasta bucatarie."};
    }
}
