package j06007;

import java.util.HashMap;
import java.util.Map;

public class Course {
    private String id, name;
    private static Map<String, Course> courseMap = new HashMap<>();
    public Course(String id, String name) {
        this.id = id;
        this.name = name;
        courseMap.put(id, this);
    }
    
    
}
