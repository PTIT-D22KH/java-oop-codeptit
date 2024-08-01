package j05032;

import java.util.Date;

public class MyDate {
    private int day, month, year;
    public MyDate(String s) {
        String a[] = s.split("/");
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
    
}
