package j05071;

import java.util.HashMap;
import java.util.Map;

public class Call {
    private String phone ;
    private Time start, end;
    private City city;
    private long time, price;
    private static Map<Integer, City> cityMap = new HashMap<>();
    public Call(String phone, String start, String end) {
        this.phone = phone;
        this.start = new Time(start);
        this.end = new Time(end);
        // this.city = city;
        this.time = this.end.timeToMinutes() - this.start.timeToMinutes();
        if (phone.contains("-")) {
            this.city = cityMap.get(Integer.valueOf(phone.substring(1, 3)));
        } else {
            if (this.time % 3 == 0) {
                this.time /= 3;
            } else {
                this.time = this.time / 3 + 1;
            }
            this.price = 800 * this.time;
        }
    }

    
}
