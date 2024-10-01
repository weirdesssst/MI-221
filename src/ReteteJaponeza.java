public class ReteteJaponeza extends Bucatarie {

    public ReteteJaponeza() {
        super("Japoneza");
    }

    @Override
    public String[] getRecomandariIngrediente(String ingrediente) {
        ingrediente = ingrediente.replaceAll("\\s+", "").toLowerCase();
        String[] listaIngrediente = ingrediente.split(",");

        boolean contineOrez = false;
        boolean continePeste = false;

        for (String ingredient : listaIngrediente) {
            ingredient = ingredient.trim();
            if (ingredient.equals("orez")) {
                contineOrez = true;
            }
            if (ingredient.equals("peste")) {
                continePeste = true;
            }
        }

        if (contineOrez && continePeste) {
            return new String[]{"Sushi", "Donburi cu peste"};
        } else if (contineOrez) {
            return new String[]{"Sushi"};
        } else if (continePeste) {
            return new String[]{"Donburi cu peste"};
        } else {
            return new String[]{"Nicio reteta japoneza disponibila pentru ingredientele tale."};
        }
    }

    @Override
    public String[] getRecomandariPreferinte(String preferinta) {
        preferinta = preferinta.toLowerCase();

        if (preferinta.equals("sarat")) {
            return new String[]{"Ramen", "Sushi"};
        } else if (preferinta.equals("dulce")) {
            return new String[]{"Dorayaki", "Mochi"};
        } else if (preferinta.equals("acru")) {
            return new String[]{"Tsukemono", "Umeboshi"};
        } else if (preferinta.equals("iute")) {
            return new String[]{"Ramen picant", "Tantanmen"};
        } else {
            return new String[]{"Nicio reteta japoneza disponibila pentru preferintele tale."};
        }
    }
}
