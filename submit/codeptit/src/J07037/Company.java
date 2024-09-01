package J07037;

import java.util.Comparator;

public class Company {
    private String id, name;
    private int numStudents;
    public Company(String id, String name, int numStudents) {
        this.id = id;
        this.name = name;
        this.numStudents = numStudents;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + numStudents;
    }
}
class CompareById implements Comparator<Company> {
    @Override
    public int compare(Company a, Company b) {
        return a.getId().compareTo(b.getId());
    }
}