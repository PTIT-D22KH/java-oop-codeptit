package j05025;

import java.util.Comparator;

public class Lecturer {
    private String id, name, department;
    private static int count = 0;
    public Lecturer(String name, String department) {
        this.name = name;
        this.department = department;
        count++;
        this.id = String.format("GV%02d", count);
    }

    private String formatDepartment(String department) {
        String a[] = department.split(" ");
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res += Character.toUpperCase(a[i].charAt(0));
        }
        return res;
    }

    public String getFirstName() {
        String a[] = name.split(" ");
        return a[a.length - 1];
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + formatDepartment(department);
    }
}

class CompareByFirstNameAndId implements Comparator<Lecturer> {
    @Override
    public int compare(Lecturer a, Lecturer b) {
        if (a.getFirstName().compareTo(b.getFirstName()) == 0) {
            return a.getId().compareTo(b.getId());
        }
        return a.getFirstName().compareTo(b.getFirstName());
    }
}