package J07035;

import java.util.*;

public class Course {
    private String id, name;
    private int numOfCredits;
    // private static Map<String, Course> courseMap = new HashMap<>();

    public Course() {
    }

    public Course(String id, String name, int numOfCredits) {
        this.id = id;
        this.name = name;
        this.numOfCredits = numOfCredits;
        // courseMap.put(id, this);
    }

    // public static Map<String, Course> getCourseMap() {
    //     return courseMap;
    // }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}