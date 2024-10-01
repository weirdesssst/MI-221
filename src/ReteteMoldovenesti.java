public class ReteteMoldovenesti extends Bucatarie {

    public ReteteMoldovenesti() {
        super("Moldoveneasca");
    }

    @Override
    public String[] getRecomandariIngrediente(String ingrediente) {
        ingrediente = ingrediente.replaceAll("\\s+", "").toLowerCase();
        String[] listaIngrediente = ingrediente.split(",");

        boolean contineCartofi = false;
        boolean contineCeapa = false;

        for (String ingredient : listaIngrediente) {
            ingredient = ingredient.trim();
            if (ingredient.equals("cartofi")) {
                contineCartofi = true;
            }
            if (ingredient.equals("ceapa")) {
                contineCeapa = true;
            }
        }

        if (contineCartofi && contineCeapa) {
            return new String[]{"Placinte cu cartofi", "Tocana moldoveneasca"};
        } else if (contineCartofi) {
            return new String[]{"Placinte cu cartofi"};
        } else if (contineCeapa) {
            return new String[]{"Tocana moldoveneasca"};
        } else {
            return new String[]{"Nicio reteta moldoveneasca disponibila pentru ingredientele tale."};
        }
    }

    @Override
    public String[] getRecomandariPreferinte(String preferinta) {
        preferinta = preferinta.toLowerCase();

        if (preferinta.equals("sarat")) {
            return new String[]{"Mamaliga cu branza si smantana", "Tocana moldoveneasca"};
        } else if (preferinta.equals("dulce")) {
            return new String[]{"Coltunasi cu branza dulce", "Placinte cu dovleac"};
        } else if (preferinta.equals("iute")) {
            return new String[]{"Ciorba de burta", "Sarmale cu ardei iute"};
        } else {
            return new String[]{"Nicio reteta moldoveneasca disponibila pentru preferintele tale."};
        }
    }
}
