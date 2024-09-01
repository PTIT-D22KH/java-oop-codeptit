package J07033;
import java.util.*;
public class Student {
    private String id, name, className, email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = formatName(name);
        this.className = className;
        this.email = email;
    }

    private String formatName(String name) {
        String a[] = name.trim().toLowerCase().split("\\s+");
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1)).append(" ");
        }
        return s.toString().trim();

    }
    public String getId() {
        return id;
    }
    
    @Override
    public String toString(){ 
        return id + " " + name + " " + className + " " + email;
    }
}
class CompareById implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getId().compareTo(b.getId());
    }
}