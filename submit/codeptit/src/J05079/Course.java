package J05079;
import java.util.*;
public class Course {
    private String id, name, group, lecturerName;
    private static Map <String, String> courseIdToNameMap = new HashMap<>();
    public Course(String id, String name, String group, String lecturerName) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.lecturerName = lecturerName;
        Course.courseIdToNameMap.put(id, name);
    }
    public String getId() {
        return id;
    }
    public static Map<String, String> getCourseIdToNameMap() {
        return courseIdToNameMap;
    }
    public String getGroup() {
        return group;
    }
    @Override
    public String toString(){ 
        return group + " " + lecturerName;
    }
    
}
class CompareByGroup implements Comparator<Course> {
    @Override
    public int compare(Course a, Course b) {
        return a.getGroup().compareTo(b.getGroup());
    }
}