package j05055;

public class Time {
    private int hour, minutes, seconds;


    public Time(String s) {
        String a[] = s.split(":");
        this.hour = Integer.parseInt(a[0]);
        this.minutes = Integer.parseInt(a[1]);
        this.seconds = Integer.parseInt(a[2]);
    }

    public Time timeDiff(Time o) {
        return new Time("");
    }
    @Override
    public String toString() {
        return String.format("%02d:$02d:%02d", hour, minutes, seconds);
    }
}
