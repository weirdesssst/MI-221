public class Recomandari {

    public String[] obtineRecomandariIngrediente(String categorie, String ingrediente) {
        Bucatarie bucatarie;

        // Se alege bucataria corecta pe baza categoriei
        switch (categorie.toLowerCase()) {
            case "japoneza":
                bucatarie = new ReteteJaponeza();
                break;
            case "italiana":
                bucatarie = new ReteteItaliene();
                break;
            case "mexicana":
                bucatarie = new ReteteMexicane();
                break;
            case "moldoveneasca":
                bucatarie = new ReteteMoldovenesti();
                break;
            default:
                return new String[]{"Bucatarie necunoscuta."};
        }

        return bucatarie.getRecomandariIngrediente(ingrediente);
    }

    public String[] obtineRecomandariPreferinte(String categorie, String preferinta) {
        Bucatarie bucatarie;

        // Se alege bucataria corecta pe baza categoriei
        switch (categorie.toLowerCase()) {
            case "japoneza":
                bucatarie = new ReteteJaponeza();
                break;
            case "italiana":
                bucatarie = new ReteteItaliene();
                break;
            case "mexicana":
                bucatarie = new ReteteMexicane();
                break;
            case "moldoveneasca":
                bucatarie = new ReteteMoldovenesti();
                break;
            default:
                return new String[]{"Bucatarie necunoscuta."};
        }

        return bucatarie.getRecomandariPreferinte(preferinta);
    }
}
