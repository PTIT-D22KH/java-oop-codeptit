package J07060;

import java.util.*;

public class Course {
    private String id, name, testType;
    private static Map<String, Course> courseMap = new HashMap<>();

    public Course(String id, String name, String testType) {
        this.id = id;
        this.name = name;
        this.testType = testType;
        courseMap.put(id, this);
    }

    public String getName() {
        return name;
    }

    public static Map<String, Course> getCourseMap() {
        return courseMap;
    }
}