package J07081;

import java.util.Comparator;

public class Student {
    private String id, name, phoneNumber, email, lastName, firstName, middleName;

    public Student(String id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        extractName();
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getId() {
        return id;
    }
    public String getMiddleName() {
        return middleName;
    }
    private void extractName() {
        String a[] = name.trim().split("\\s+");
        int n = a.length;
        this.lastName = a[0];
        this.firstName = a[n - 1];
        StringBuilder middleName = new StringBuilder();
        for (int i = 1; i < n - 1; i++) {
            middleName.append(a[i]).append(" ");
        }
        this.middleName = middleName.toString().trim();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phoneNumber + " " + email;
    }

}
class CompareByNameAndId implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        int cmpFirstName = a.getFirstName().compareTo(b.getFirstName());
        if (cmpFirstName == 0) {
            int cmpLastName = a.getLastName().compareTo(b.getLastName());
            if (cmpLastName == 0) {
                int cmpMiddleName = a.getMiddleName().compareTo(b.getMiddleName());
                if (cmpMiddleName == 0) {
                    return a.getId().compareTo(b.getId());
                }
                return cmpMiddleName;
            }
            return cmpLastName;
        }
        return cmpFirstName;
    }
}