package J07047;
import java.text.SimpleDateFormat;
import java.util.*;
public class Customer {
    private String id, name, roomId;
    private HotelRoom room;
    private Date checkInDate, checkOutDate;
    private long numDays;
    private double basicCost, additionalCost, totalCost;
    private static int count = 0;
    public Customer(String name, String roomId, String checkInDate, String checkOutDate) {
        this.name = name;
        this.roomId = roomId;
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.checkInDate = sd.parse(checkInDate);
            this.checkOutDate = sd.parse(checkOutDate);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        this.room = HotelRoom.getHotelRoomMap().get(roomId.substring(2, 3));
        count++;
        this.id = String.format("KH%02d", count);
        this.numDays = (this.checkOutDate.getTime() - this.checkInDate.getTime()) / (1000 * 3600 * 24);
        calFee();
    }
    private void calFee(){ 
        double basicCost = room.getSinglePrice() * numDays;
        if (numDays == 0) {
            basicCost = room.getSinglePrice();
        }
        if (numDays > 30) {
            basicCost *= 0.94;
        } else if (numDays >= 20) {
            basicCost *= 0.96;
        } else if (numDays >= 10) {
            basicCost *= 0.98;
        }
        this.basicCost = basicCost;
        this.additionalCost = this.basicCost * room.getServiceFee();
        this.totalCost = this.basicCost + this.additionalCost;
    }
    public long getNumDays() {
        return numDays;
    }
    @Override 
    public String toString(){
        return id + " " + name + " " + roomId + " " + numDays + " " + String.format("%.2f", totalCost);
    }
    
}
class CompareByNumDays implements Comparator<Customer> {
    @Override
    public int compare(Customer a, Customer b) {
        return Long.compare(b.getNumDays(), a.getNumDays());
    }
}