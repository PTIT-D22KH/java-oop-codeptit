package j05015;

public class Time {
    private int hour, minutes;

    public Time(String s) {
        String a[] = s.split(":");
        this.hour  = Integer.parseInt(a[0]);
        this.minutes = Integer.parseInt(a[1]);
    }
    public Time() {

    }
    public int toTotalMinutes() {
        return this.hour * 60 + this.minutes;
    }

    public double toHourDecimal() {
        return 1.0 * this.toTotalMinutes() / 60.0;
    }

    public Time timeDiff(Time o) {
        Time res = new Time();
        int x = this.hour - o.hour;
        int y;
        if (x > 0) {
            y = this.minutes - o.minutes;
        } else {
            x = -1 * x;
            y = o.minutes - this.minutes;
        }
        if (y < 0) {
            x--;
            y += 60;
        }
        res.hour = x;
        res.minutes = y;
        return res;
    }
    @Override
    public String toString() {
        return hour + ":" + minutes;
    }
}
