package j07059;

import java.util.Comparator;

public class TestTime {
    private String id, day, room;
    private Time time;
    private static int count = 0;


    public TestTime(String day, String inputTime, String room) {
        this.day = day;
        this.room = room;
        this.time = new Time(inputTime);
        count++;
        this.id = String.format("C%03d", count);
    }
    public Time getTime() {
        return time;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString(){ 
        return id + " " + day + " " + time +  " " + room;
    }
}
class CompareByTimeAscIdAsc implements Comparator<TestTime> {
    @Override
    public int compare(TestTime a, TestTime b) {
        if (a.getTime().getMinutes() == b.getTime().getMinutes()) {
            if (a.getTime().getHour() == b.getTime().getHour()) {
                return a.getId().compareTo(b.getId());
            }
            return Integer.compare(a.getTime().getHour(), b.getTime().getHour());
        } 
        return Integer.compare(a.getTime().getMinutes(), b.getTime().getHour());
    }
}
