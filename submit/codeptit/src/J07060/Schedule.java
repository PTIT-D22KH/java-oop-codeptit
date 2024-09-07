package J07060;
import java.util.*;
public class Schedule {
    private String id, courseId, group;
    private int numStudents;
    private static Map<String, Schedule> scheduleMap = new HashMap<>();

    public Schedule(String s) {
        String a[] = s.trim().split("\\s+");
        this.id = a[0];
        this.courseId = a[1];
        this.group = a[2];
        this.numStudents = Integer.parseInt(a[3]);
        scheduleMap.put(id, this);
    }
    public static Map<String, Schedule> getScheduleMap() {
        return scheduleMap;
    }
    public String getCourseId() {
        return courseId;
    }
    public String getId() {
        return id;
    }
    public String getGroup() {
        return group;
    }
    public int getNumStudents() {
        return numStudents;
    }
    
}
