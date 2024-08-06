package j07028;

import java.util.HashMap;
import java.util.Map;

public class Course {
    private String id, name;
    private double numHours;
    private static Map<String, Course> courseMap = new HashMap<>();
    public Course(String id, String name) {
        this.id = id;
        this.name = name;
        this.numHours = 0;
        courseMap.put(id, this);
        
    }
    public static Map<String, Course> getCourseMap() {
        return courseMap;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumHours(double numHours) {
        this.numHours = numHours;
    }
    // public void setNumHoursInString(String numHoursInString) {
    //     this.numHoursInString = numHoursInString;
    // }
    public double getNumHours() {
        return numHours;
    }
    public String getName() {
        return name;
    }
    
    
}