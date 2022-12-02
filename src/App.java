import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        /// LISTA DE PERSONAS
        ArrayList<Persona> randomPeople = new ArrayList<>();

        /// COLOCAR CANTIDAD DE NOMBRES COMPLETOS A GENERAR DE FORMA ALEATORIA (q<=10)
        final int quantityOfFullNames = 5;

        /// genera un objeto GeneradorDeNombresApellidos que tendra acceso a listas de
        /// nombres y apellidos generados de forma aleatoria
        GeneradorDeNombresApellidos fullnamesGenerator = new GeneradorDeNombresApellidos();
        fullnamesGenerator.generateRandomFullnames(quantityOfFullNames);

        ArrayList<String> randomNamesList = fullnamesGenerator.getListaDeNombres();

        ArrayList<String> randomLasnamesList = fullnamesGenerator.getListaDeApellidos();

        /// completa randomPeople con la informacion generada por
        /// GeneradorDeNombresApellidos
        for (int i = 0; i < quantityOfFullNames; i++) {
            Persona randomPerson = new Persona(randomNamesList.get(i), randomLasnamesList.get(i));
            randomPeople.add(randomPerson);
            // System.out.println(randomPeople.get(i).getNombre() + " " +
            // randomPeople.get(i).getApellido());
        }

        /// Imprimir utilizando diferentes criterios basados en los metodos de
        /// PeopleSorter
        PeopleSorter sorter = new PeopleSorter(randomPeople);
        sorter.sortByNameAndPrint();
        sorter.sortByLastnameAndPrint();
        sorter.inverseSortByLastnameAndPrint();
    }
}
