package J07046;

import java.text.SimpleDateFormat;
import java.util.*;
public class Customer {
    private String id, name;
    private Room room;
    private Long duration;
    private static int count = 0;
    public Customer(String name, String roomId, String inTime, String outTime) {
        this.name = name;
        this.room = new Room(roomId);
        this.duration = calDuration(inTime, outTime);
        
        count++;
        this.id = String.format("KH%02d", count);
    }
    private Long calDuration(String inTime, String outTime) {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        long diff = 0;
        try {
            Date start = sd.parse(inTime);
            Date end = sd.parse(outTime);
            diff = (end.getTime() - start.getTime()) / (24 * 60 * 60 * 1000L);
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return diff;
    }

    public Long getDuration() {
        return duration;
    }

    @Override
    public String toString(){ 
        return id + " " + name + " " + room.getRoomId() + " " + duration;
    }
}
class CompareByDuration implements Comparator<Customer> {
    @Override
    public int compare(Customer a, Customer b) {
        return Long.compare(b.getDuration(), a.getDuration());
    }
}