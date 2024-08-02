package j05072;

public class Time {
    private int hour, minutes;


    public Time(String s) {
        String a[] = s.split(":");
        this.hour = Integer.parseInt(a[0]);
        this.minutes = Integer.parseInt(a[1]);
    }

    public long timeToMinutes() {
        return hour * 60 + minutes;
    }
    
}
