package J07074;
import java.util.*;
public class Course {
    private String id, name;
    private int numOfCredits;
    private static Map<String, String> courseIdToName = new HashMap<>();
    public Course(String id, String name, int numOfCredits) {
        this.id = id;
        this.name = name;
        this.numOfCredits = numOfCredits;
        Course.courseIdToName.put(id, name);
    }
    public static Map<String, String> getCourseIdToName() {
        return courseIdToName;
    }
    

}
