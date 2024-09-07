package J07047;
import java.util.*;
public class HotelRoom {
    private String id, roomType;
    private long singlePrice;
    private double serviceFee;
    private static Map<String, HotelRoom> hotelRoomMap = new HashMap<>();
    public HotelRoom(String s) {
        String a[] = s.trim().split("\\s+");
        this.id = a[0];
        this.roomType = a[1];
        this.singlePrice = Long.parseLong(a[2]);
        this.serviceFee = Double.parseDouble(a[3]);
        hotelRoomMap.put(id, this);
    }
    public static Map<String, HotelRoom> getHotelRoomMap() {
        return hotelRoomMap;
    }
    public double getServiceFee() {
        return serviceFee;
    }
    public long getSinglePrice() {
        return singlePrice;
    }

}
