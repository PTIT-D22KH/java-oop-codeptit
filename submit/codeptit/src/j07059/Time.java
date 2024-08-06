package j07059;

public class Time {
    private int hour, minutes;

    public Time(String s) {
        String a[] = s.split(":");
        this.hour = Integer.parseInt(a[0]);
        this.minutes = Integer.parseInt(a[1]);
    }
    public int getHour() {
        return hour;
    }
    public int getMinutes() {
        return minutes;
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minutes);
    }
}
