import java.util.ArrayList;

public class GeneradorDeNombresApellidos {

    private static String[] names = { "Carlos", "Oscar", "Jose", "Antonia", "Maria", "Jazmin", "Teodoro", "Raul",
            "Mario", "Julia" };

    private static String[] apellidos = { "Perez", "Gonzalez", "Sanchez", "Pereira", "Lozano", "Tinelli", "Raugth",
            "Johnson", "Gere", "Pitt" };

    /// Generate ArrayList of names and lastnames
    public static ArrayList<String> listaDeNombres = new ArrayList<String>();

    public static ArrayList<String> listaDeApellidos = new ArrayList<String>();

    public String generateRandomFullnames(int quantityOfNamesAndLastnamesToAdd) {
        if (quantityOfNamesAndLastnamesToAdd > 10) {
            return "Max quantity of fullnames to generate must be less than 10";
        } else {
            for (int i = 0; i <= quantityOfNamesAndLastnamesToAdd; i++) {
                int randomIntigerForName = (int) (Math.random() * 10);
                int randomIntigerForLastname = (int) (Math.random() * 10);

                listaDeNombres.add(names[randomIntigerForName]);
                listaDeApellidos.add(apellidos[randomIntigerForLastname]);
            }
            ;
            return "Success: Fullnames were generated";
        }

    }

    public ArrayList<String> getListaDeNombres() {
        return listaDeNombres;
    }

    public ArrayList<String> getListaDeApellidos() {
        return listaDeApellidos;
    }

}
