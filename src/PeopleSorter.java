import java.util.ArrayList;

public class PeopleSorter {
    private ArrayList<Persona> randomPeopleToSort = new ArrayList<>();

    public PeopleSorter(ArrayList<Persona> randomPeopleToSort) {
        this.randomPeopleToSort = randomPeopleToSort;
    }

    public void sortByNameAndPrint() {
        /* Print process starting message */
        System.out.println("\u001B[41m" + "SORT PEOPLE BY NAME:");
        // 1) Sort randomPeopleToSort by name
        randomPeopleToSort.sort((personOne, personTwo) -> personOne.getNombre().compareTo(
                personTwo.getNombre()));
        // 2) Print randomPeopleToSort ArrayList items
        for (Persona persona : randomPeopleToSort) {
            System.out.println("\u001B[40m" + persona.getNombre() + " " + persona.getApellido());
        }
    }

    public void sortByLastnameAndPrint() {
        /* Print process starting message */
        System.out.println("\u001B[41m" + "SORT PEOPLE BY LASTNAME:");
        // 1) Sort randomPeopleToSort by lastname
        randomPeopleToSort.sort((personOne, personTwo) -> personOne.getApellido().compareTo(
                personTwo.getApellido()));
        // 2) Print randomPeopleToSort ArrayList items
        for (Persona persona : randomPeopleToSort) {
            System.out.println("\u001B[40m" + persona.getNombre() + " " + persona.getApellido());
        }
    }

    public void inverseSortByLastnameAndPrint() {
        /* Print process starting message */
        System.out.println("\u001B[41m" + "REVERSE SORT PEOPLE BY LASTNAME:");
        // 1) reverseSort randomPeopleToSort by lastname
        randomPeopleToSort.sort((personOne, personTwo) -> personTwo.getApellido().compareTo(
                personOne.getApellido()));
        // 2) Print randomPeopleToSort ArrayList items
        for (Persona persona : randomPeopleToSort) {
            System.out.println("\u001B[40m" + persona.getNombre() + " " + persona.getApellido());
        }
    }

}
