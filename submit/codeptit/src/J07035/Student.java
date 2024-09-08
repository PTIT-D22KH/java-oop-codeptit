package J07035;

import java.util.*;

public class Student {
    private String id, name, className, email;
    // private static Map<String, Student> studentMap = new HashMap<>();

    public Student() {
    }

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = formatName(name);
        this.className = className;
        this.email = email;
    }

    // public static Map<String, Student> getStudentMap() {
    //     return studentMap;
    // }

    public String getClassName() {
        return className;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private String formatName(String name) {
        String[] s = name.trim().split("\\s+");
        for (int i = 0; i < s.length; i++)
            s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase();
        return String.join(" ", s);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className;
    }
}