package J07058;

import java.util.Comparator;

public class Course {
    private String id, name, testType;

    public Course(String id, String name, String testType) {
        this.id = id;
        this.name = name;
        this.testType = testType;
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + testType;
    }
    
}
class CompareById implements Comparator<Course> {
    @Override
    public int compare(Course a, Course b) {
        return a.getId().compareTo(b.getId());
    }
}
