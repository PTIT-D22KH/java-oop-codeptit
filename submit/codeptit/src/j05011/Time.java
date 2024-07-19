package j05011;

public class Time {
    private int hour, minutes;

    public Time(String s) {
        String a[] = s.split(":");
        this.hour = Integer.parseInt(a[0]);
        this.minutes = Integer.parseInt(a[1]);
    }
    public Time() {

    }
    public Time timeDifference(Time o) {
        Time diff = new Time();
        int x = o.hour - this.hour;
        int y;
        if (x > 0) {
            y = o.minutes - this.minutes;
        } else {
            x = -1 * x;
            y = this.minutes - o.minutes;
        }
        if (y < 0) {
            x--;
            y = y + 60;
        }
        diff.hour = x;
        diff.minutes = y;
        return diff;
    }
    @Override
    public String toString() {
        return hour + " gio " + minutes + " phut";
    }

    public int getHour() {
        return hour;
    }
    public int getMinutes() {
        return minutes;
    }
}
