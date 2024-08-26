package j07059;

public class Date {
    private int day, month,year;
    private String original;
    public Date(String s) {
        this.original = s;
        String a[] = s.trim().split("/");
        this.day = Integer.parseInt(a[0]);
        this.month = Integer.parseInt(a[1]);
        this.year = Integer.parseInt(a[2]);
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return original;
    }
 }
