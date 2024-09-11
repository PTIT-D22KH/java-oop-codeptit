package J07071;
import java.util.*;
public class Name {
    private String fullName, lastName, firstName;
    private String shortName[];

    public Name(String s) {
        this.fullName = s.trim();
        String a[] = fullName.split("\\s+");
        // System.out.println(a.length);
        this.shortName = new String[a.length];
        // System.out.println(this.shortName.length);
        for(int i = 0; i < a.length; i++) {
            this.shortName[i] = String.valueOf(a[i].charAt(0));
            // System.out.println(this.shortName[i]);
        }
        // for (int i = 0; i < this.shortName.length; i++) {
        //     System.out.println(this.shortName[i]);
        // }

        this.firstName = a[a.length - 1];
        this.lastName = a[0];

        
    }

    public boolean isMatchedPattern(String s) {
        // System.out.println(s);
        String a[] = s.split("\\.");
        // System.out.println(a.length);
        // System.out.println(this.shortName.length);
        if (a.length != this.shortName.length) {
            
            return false;
        }
        
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("*")) {
                continue;
            }
            if (!a[i].equals(this.shortName[i])) {
                return false;
            }
        }
        return true;

    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return fullName;
    }

}
class CompareByName implements Comparator<Name> {
    @Override
    public int compare(Name a, Name b) {
        int cmpFirstName = a.getFirstName().compareTo(b.getFirstName());
        if (cmpFirstName == 0) {
            return a.getLastName().compareTo(b.getLastName());
        }
        return cmpFirstName;
    }
}