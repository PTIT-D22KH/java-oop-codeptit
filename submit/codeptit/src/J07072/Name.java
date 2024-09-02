package J07072;

import java.util.Comparator;

public class Name {
    private String fullName, firstName, lastName, middleName;

    public Name(String fullName) {
        formatFullName(fullName);

    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    private void formatFullName(String fullName) {
        String a[] = fullName.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        StringBuilder middleName = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            StringBuilder temp = new StringBuilder();
            temp.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1));
            if (i == 0) {
                this.lastName = temp.toString();
            } else if (i == a.length - 1) {
                this.firstName = temp.toString();
            } else {
                middleName.append(temp);
            }
            res.append(temp).append(" ");
            
        }
        this.middleName = middleName.toString();
        this.fullName = res.toString().trim();
    }

    @Override
    public String toString() {
        return fullName;
    }
}
class CompareByName implements Comparator<Name> {
    @Override
    public int compare(Name a, Name b) {
        int compareFirstName = a.getFirstName().compareTo(b.getFirstName());
        if (compareFirstName == 0) {
            int compareLastName = a.getLastName().compareTo(b.getLastName());
            if (compareLastName == 0) {
                return a.getMiddleName().compareTo(b.getMiddleName());
            }
            return compareLastName;
        } 
        return compareFirstName;
    }
}