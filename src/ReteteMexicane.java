public class ReteteMexicane extends Bucatarie {

    public ReteteMexicane() {
        super("Mexicana");
    }

    @Override
    public String[] getRecomandariIngrediente(String ingrediente) {
        ingrediente = ingrediente.replaceAll("\\s+", "").toLowerCase();
        String[] listaIngrediente = ingrediente.split(",");

        boolean continePorumb = false;
        boolean contineFasole = false;

        for (String ingredient : listaIngrediente) {
            ingredient = ingredient.trim();
            if (ingredient.equals("porumb")) {
                continePorumb = true;
            }
            if (ingredient.equals("fasole")) {
                contineFasole = true;
            }
        }

        if (continePorumb && contineFasole) {
            return new String[]{"Tacos cu porumb si fasole", "Quesadilla"};
        } else if (continePorumb) {
            return new String[]{"Tacos cu porumb"};
        } else if (contineFasole) {
            return new String[]{"Quesadilla"};
        } else {
            return new String[]{"Nicio reteta mexicana disponibila pentru ingredientele tale."};
        }
    }

    @Override
    public String[] getRecomandariPreferinte(String preferinta) {
        preferinta = preferinta.toLowerCase();

        if (preferinta.equals("iute")) {
            return new String[]{"Tacos picante", "Chili con carne"};
        } else if (preferinta.equals("dulce")) {
            return new String[]{"Churros", "Tres Leches"};
        } else if (preferinta.equals("acru")) {
            return new String[]{"Guacamole", "Ceviche"};
        } else if (preferinta.equals("sarat")) {
            return new String[]{"Tacos", "Quesadilla"};
        } else {
            return new String[]{"Nicio reteta mexicana disponibila pentru preferintele tale."};
        }
    }
}
