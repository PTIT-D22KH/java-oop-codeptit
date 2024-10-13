package J05072;
import java.text.*;

import java.util.*;
public class Call implements Comparable<Call>{
    private String incomingCall;
    private Date startTime, endTime;
    private long mins;
    private long totalCost;
    private City city;
    private SimpleDateFormat sd = new SimpleDateFormat("HH:mm");

    public Call(String s) {
        String a[] = s.trim().split("\\s+");
        this.incomingCall = a[0];
        try {
            startTime = sd.parse(a[1]);
            endTime = sd.parse(a[2]);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        mins = (endTime.getTime() - startTime.getTime()) / (60 * 1000);
        this.totalCost = calTotalCost();
    }
    private long calTotalCost() {
        char c = incomingCall.charAt(0);
        if (c == '0') {
            String a[] = incomingCall.split("-");
            String cityId = a[0].substring(1);
            this.city = City.getCityMap().get(cityId);
            return this.city.getPrice() * mins;
        } else {
            this.city = new City("", "Noi mang", 800);
            double minsDivide = mins/3.0f;
            long newMins = Math.round(minsDivide);
            this.mins = newMins;
            return newMins * 800;
        }
    }
    @Override
    public String toString (){ 
        return incomingCall + " " + city + " " + mins + " " + totalCost;
    }
    @Override
    public int compareTo(Call other) {
        return Long.compare(other.totalCost, this.totalCost);
    }
}
