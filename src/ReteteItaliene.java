public class ReteteItaliene extends Bucatarie {

    public ReteteItaliene() {
        super("Italiana");
    }

    @Override
    public String[] getRecomandariIngrediente(String ingrediente) {
        ingrediente = ingrediente.replaceAll("\\s+", "").toLowerCase();
        String[] listaIngrediente = ingrediente.split(",");

        boolean continePaste = false;
        boolean contineBranza = false;

        for (String ingredient : listaIngrediente) {
            ingredient = ingredient.trim();
            if (ingredient.equals("paste")) {
                continePaste = true;
            }
            if (ingredient.equals("branza")) {
                contineBranza = true;
            }
        }

        if (continePaste && contineBranza) {
            return new String[]{"Paste Carbonara", "Lasagna"};
        } else if (continePaste) {
            return new String[]{"Paste Carbonara"};
        } else if (contineBranza) {
            return new String[]{"Lasagna"};
        } else {
            return new String[]{"Nicio reteta italiana disponibila pentru ingredientele tale."};
        }
    }

    @Override
    public String[] getRecomandariPreferinte(String preferinta) {
        preferinta = preferinta.toLowerCase();

        if (preferinta.equals("sarat")) {
            return new String[]{"Lasagna", "Pizza Margherita"};
        } else if (preferinta.equals("dulce")) {
            return new String[]{"Tiramisu", "Cannoli"};
        } else if (preferinta.equals("iute")) {
            return new String[]{"Arrabbiata", "Penne all'Arrabbiata"};
        } else {
            return new String[]{"Nicio reteta italiana disponibila pentru preferintele tale."};
        }
    }
}
