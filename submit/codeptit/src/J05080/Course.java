package J05080;

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
    public String getLecturerName() {
        return lecturerName;
    }
    @Override
    public String toString(){ 
        return id + " " + name + " " + group;
    }
    
}
class CompareByIdAndGroup implements Comparator<Course> {
    @Override
    public int compare(Course a, Course b) {
        int cmpId = a.getId().compareTo(b.getId());
        if (cmpId == 0) {
            return a.getGroup().compareTo(b.getGroup());
        }
        return cmpId;
    }
}
