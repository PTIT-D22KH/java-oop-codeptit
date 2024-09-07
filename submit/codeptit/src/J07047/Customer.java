package J07047;
import java.text.SimpleDateFormat;
import java.util.*;
public class Customer {
    private String id, name, roomId;
    private HotelRoom room;
    private Date checkInDate, checkOutDate;

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
        
    }


    
}
