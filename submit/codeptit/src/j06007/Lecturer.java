package j06007;

import java.util.HashMap;
import java.util.Map;

public class Lecturer {
    private String id, name;
    // private Course course;
    private double numHours;
    private static Map<String, Lecturer> lecturerMap = new HashMap<>();
    public Lecturer(String id, String name) {
        this.id = id;
        this.name = name;
        this.numHours = 0;
        lecturerMap.put(id, this);
    }

    public static Map<String, Lecturer> getLecturerMap() {
        return lecturerMap;
    }
    // public void setCourse(Course course) {
    //     this.course = course;
    // }
    public void setNumHours(double numHours) {
        this.numHours += numHours;
    }
    @Override
    public String toString(){
        return name + " " + String.format("%.02f", numHours);
    }
}
