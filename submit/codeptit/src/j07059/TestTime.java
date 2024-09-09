package j07059;

import java.util.Comparator;

public class TestTime {
    private String id, room;
    private Date date;
    private Time time;
    private static int count = 0;


    public TestTime(String day, String inputTime, String room) {
        this.date = new Date(day);
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
    public Date getDate() {
        return date;
    }
    @Override
    public String toString(){ 
        return id + " " + date + " " + time +  " " + room;
    }
}
class CompareByTimeAscIdAsc implements Comparator<TestTime> {
    @Override
    public int compare(TestTime a, TestTime b) {
        if (a.getDate().getYear() == b.getDate().getYear()) {
            if (a.getDate().getMonth() == b.getDate().getMonth()) {
                if (a.getDate().getDay() == b.getDate().getDay()) {
                    if (a.getTime().getHour() == b.getTime().getHour()) {
                        if (a.getTime().getMinutes() == b.getTime().getMinutes()) {
                            return a.getId().compareTo(b.getId());
                        }
                        return Integer.compare(a.getTime().getMinutes(), b.getTime().getMinutes());
                    } 
                    return Integer.compare(a.getTime().getHour(), b.getTime().getHour());
                }
                return Integer.compare(a.getDate().getDay(), b.getDate().getDay());
            }
            return Integer.compare(a.getDate().getMonth(), b.getDate().getMonth());
        }
        return Integer.compare(a.getDate().getYear(), b.getDate().getYear());
        
    }
}
