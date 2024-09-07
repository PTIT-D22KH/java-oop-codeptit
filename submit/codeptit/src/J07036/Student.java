package J07036;
import java.util.*;
public class Student {
    private String id, name, className, email;
    private static Map<String, Student> studentMap = new HashMap<>();
    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = formatName(name);
        this.className = className;
        this.email = email;
        studentMap.put(id, this);
    }
    public static Map<String, Student> getStudentMap() {
        return studentMap;
    }
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
        name = name.toLowerCase();
        String[] words = name.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    
}
