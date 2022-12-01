import java.util.ArrayList;

public class PeopleSorter {
    private ArrayList<Persona> randomPeopleToSort = new ArrayList<>();

    public PeopleSorter(ArrayList<Persona> randomPeopleToSort) {
        this.randomPeopleToSort = randomPeopleToSort;
    }

    public void sortByNameAndPrint() {
        randomPeopleToSort.sort(null);
    }

    public void sortByLastnameAndPrint() {

    }

    public void inverseSortByLastnameAndPrint() {

    }

}
