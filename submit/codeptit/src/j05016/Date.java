package j05016;

import java.text.SimpleDateFormat;

public class Date {
    private int day,month,year;

    public Date(String s) {
        String a[] = s.split("/");
        day = Integer.parseInt(a[0]);
        month = Integer.parseInt(a[1]);
        year = Integer.parseInt(a[2]);
    }
    public int toNumDays() {
        Date d = new Date;
        return 
    }
}
