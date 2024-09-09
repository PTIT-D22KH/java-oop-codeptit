package j05021;

import java.util.Comparator;

public class Student {
    private String id, name, className, email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getClassName() {
        return className;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}
class CompareByClassNameAndId implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getId().compareTo(b.getId());
    }
}