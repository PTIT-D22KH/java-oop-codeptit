package j06007;

// import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lecturer {
    private String id, name;
    private Set<String> courses = new HashSet<>();
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
    public void setCourses(String course) {
        this.courses.add(course);
    }
    public void setNumHours(double numHours) {
        this.numHours += numHours;
    }
    @Override
    public String toString(){
        return name + " " + String.format("%.02f", numHours);
    }
}
