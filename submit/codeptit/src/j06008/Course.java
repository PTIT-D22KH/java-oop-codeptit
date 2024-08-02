package j06008;

import java.util.HashMap;
import java.util.Map;

public class Course {
    private String id, name;
    private double numHours;
    private static Map<String, Course> courseMap = new HashMap<>();
    public Course(String id, String name) {
        this.id = id;
        this.name = name;
        courseMap.put(id, this);
    }
    public static Map<String, Course> getCourseMap() {
        return courseMap;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getNumHours() {
        return numHours;
    }
    
}
